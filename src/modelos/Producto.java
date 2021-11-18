package modelos;

public class Producto {

    private int id;
    private Creador creador;
    private String nombre;
    private int anio;
    private double rating;

    public Producto(int id, Creador creador, String nombre, int anio, double rating) {
        this.id = id;
        this.creador = creador;
        this.nombre = nombre;
        this.anio = anio;
        this.rating = rating;
    }

    public int getId() {
        return id;
    }

    public Creador getCreador() {
        return creador;
    }

    public String getNombre() {
        return nombre;
    }

    public int getAnio() {
        return anio;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
}
