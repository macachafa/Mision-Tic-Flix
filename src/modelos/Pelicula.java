package modelos;

public class Pelicula extends Producto {

    private int duracion;
    private String resumen;

    public Pelicula(int duracion, String resumen, int id, Creador creador, String nombre, int anio, double rating) {
        super(id, creador, nombre, anio, rating);
        this.duracion = duracion;
        this.resumen = resumen;
    }

    public int getDuracion() {
        return duracion;
    }

    public String getResumen() {
        return resumen;
    }

}
