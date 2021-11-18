package modelos;

public class Creador {
    
    private int id; 
    private String nombre; 
    private String nacionalidad;
    private int edad;

    public Creador(int id, String nombre, String nacionalidad, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.edad = edad;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @return the nacionalidad
     */
    public String getNacionalidad() {
        return nacionalidad;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }
    
}
