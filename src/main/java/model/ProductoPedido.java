package model;

public class ProductoPedido {
    private int id;
    private int idProducto;
    private int idPedido;
    private int cantidad;

    public ProductoPedido() {}

    public ProductoPedido(int id, int idProducto, int idPedido, int cantidad) {
        this.id = id;
        this.idProducto = idProducto;
        this.idPedido = idPedido;
        this.cantidad = cantidad;
    }

    public ProductoPedido(int idProducto, int idPedido, int cantidad) {
        this.idProducto = idProducto;
        this.idPedido = idPedido;
        this.cantidad = cantidad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public int getCantidad() { return cantidad; }

    public void setCantidad(int cantidad) { this.cantidad = cantidad; }

}
