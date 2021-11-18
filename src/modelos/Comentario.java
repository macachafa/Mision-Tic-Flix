package modelos;

public class Comentario {

    private int id;
    private Usuario usuario;
    private int productoId;
    private String opinion;

    public Comentario(int id, String usuarioAlias, int productoId, String opinion) {
        this.id = id;
        this.usuario = usuario;
        this.productoId = productoId;
        this.opinion = opinion;
    }

    public int getId() {
        return id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public int getProductoId() {
        return productoId;
    }

    public void setProductoId(int productoId) {
        this.productoId = productoId;
    }

    public String getOpinion() {
        return opinion;
    }

    public void setOpinion(String opinion) {
        this.opinion = opinion;
    }
}
