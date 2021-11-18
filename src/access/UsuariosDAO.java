package access;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import modelos.Usuario;
import utils.ConnectionDB;

public class UsuariosDAO {

    //metodos de CRUD
    // consultar
    public static Usuario consultarUsuarios(int documento) {
        String sql = "select * from usuario where documento = ?;";
        try {
            // no funciona
//            Statement statement = ConnectionDB.getConnection().createStatement();
//            statement.setInt(1, documento.getDocumento());
//            ResultSet result = statement.executeQuery(sql); 
            //funciona
            PreparedStatement statement = ConnectionDB.getConnection().prepareStatement(sql);
            statement.setInt(1, documento);
            ResultSet result = statement.executeQuery();
            //sacar los resultados
            while (result.next()) {
                //crear objeto - tipo usuario
                Usuario nuevoUsuario = new Usuario(result.getString(1), result.getString(2), result.getString(3), result.getString(4), result.getInt(5), result.getString(6));
                System.out.println("Se consultó el usuario");
                return nuevoUsuario;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    // crear
    public static Usuario crearUsuario(Usuario alias) {
        String sql = "insert into usuario(alias, contrasenia, nombre, apellido, documento, tipo_de_documento) values (?,?,?,?,?,?);";
        try {
            PreparedStatement statement = ConnectionDB.getConnection().prepareStatement(sql);
            statement.setString(1, alias.getAlias());
            statement.setString(2, alias.getContrasenia());
            statement.setString(3, alias.getNombre());
            statement.setString(4, alias.getApellido());
            statement.setInt(5, alias.getDocumento());
            statement.setString(6, alias.getTipo_de_documento());
            //ejecuta el query
            int rowsInserted = statement.executeUpdate();
            //validar
            if (rowsInserted > 0) {
                System.out.println("Se creó el usuario");
                return alias;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    //actualizar
    public static Usuario actualizarUsuario(Usuario documento) {
        String sql = "update usuario set contrasenia=?, nombre=?, apellido=?, tipo_de_documento=?, alias = ? where documento = ?;";
        try {
            PreparedStatement statement = ConnectionDB.getConnection().prepareStatement(sql);
            statement.setString(1, documento.getContrasenia());
            statement.setString(2, documento.getNombre());
            statement.setString(3, documento.getApellido());
            statement.setString(4, documento.getTipo_de_documento());
            statement.setString(5, documento.getAlias());
            statement.setInt(6, documento.getDocumento());

            int rowsUpdated = statement.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("actualizado exitosamente");
                return documento;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    //eliminar
    public boolean eliminarUsuario(int documento) {
        String sql = "delete from usuario where documento=?;";
        try {
            PreparedStatement statement = ConnectionDB.getConnection().prepareStatement(sql);
            statement.setInt(1, documento);

            int rowsDeleted = statement.executeUpdate();
            if (rowsDeleted > 0) {
                System.out.println("borrado exitosamente");
                return true;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }
}
