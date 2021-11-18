package controladores;

import access.UsuariosDAO;
import modelos.Usuario;

public class ControladorUsuario {
// puente para conectar dao con el controlador que comunica con la interfaz
    //crear usuario

    public static Usuario crearUsuario(String alias, String contrasenia, String nombre, String apellido, int documento, String tipoDocumento) {
        //metodo
        UsuariosDAO access = new UsuariosDAO(); //instanciar el dao
        Usuario nuevoUsuario = new Usuario(alias, contrasenia, nombre, apellido, documento, tipoDocumento);
        return access.crearUsuario(nuevoUsuario);//aca entra en la base de datos
    }

    //eliminar usuario
    public static boolean eliminarUsuario(int documento) {
        UsuariosDAO access = new UsuariosDAO();
        return access.eliminarUsuario(documento);
    }

    // actualizar
    public static Usuario actualizarUsuario(String alias, String contrasenia, String nombre, String apellido, int documento, String tipoDocumento) {
        UsuariosDAO access = new UsuariosDAO();
        Usuario actualizaUsuario = new Usuario(alias, contrasenia, nombre, apellido, documento, tipoDocumento);
        return access.actualizarUsuario(actualizaUsuario);
    }

    // consultar
    public static Usuario consultarUsuario(int documento) {
        UsuariosDAO access = new UsuariosDAO();
        return access.consultarUsuarios(documento);
    }
}
