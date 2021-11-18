package modelos;

public class Serie extends Producto {

    private int temporadas;
    private int episodios;

    public Serie(int temporadas, int episodios, int id, Creador creador, String nombre, int anio, double rating) {
        super(id, creador, nombre, anio, rating);
        this.temporadas = temporadas;
        this.episodios = episodios;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public int getEpisodios() {
        return episodios;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }
}
