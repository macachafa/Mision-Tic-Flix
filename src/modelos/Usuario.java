package modelos;

public class Usuario {

    private String alias;
    private String contrasenia;
    private String nombre;
    private String apellido;
    private int documento;
    private String tipo_de_documento;

    public Usuario(String alias, String contraseña, String nombre, String apellido, int documento, String tipoDocumento) {
        this.alias = alias;
        this.contrasenia = contraseña;
        this.nombre = nombre;
        this.apellido = apellido;
        this.documento = documento;
        this.tipo_de_documento = tipoDocumento;
    }
// encapsular porque como son privados toda hacerlo para poder acceder y modificar los campos

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contraseña) {
        this.contrasenia = contraseña;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public String getTipo_de_documento() {
        return tipo_de_documento;
    }

    public void setTipo_de_documento(String tipoDocumento) {
        this.tipo_de_documento = tipoDocumento;
    }
}
