package model;

import java.sql.Timestamp;

public class Pedido {
    private int id;
    private int idUsuario;
    private double total;
    private String direccion;
    private Timestamp fecha;

    public Pedido() {}

    public Pedido(int id) {
        this.id =id;
    }

    public Pedido(int id, int idUsuario,double total, Timestamp fecha) {
        this.id = id;
        this.idUsuario = idUsuario;
        this.total = total;
        this.fecha = fecha;
    }

    public Pedido(int idUsuario,double total, String direccion, Timestamp fecha){
        this.idUsuario = idUsuario;
        this.total = total;
        this.fecha = fecha;
    }

    public Pedido(int idUsuario,double total, String direccion){
        this.idUsuario = idUsuario;
        this.total = total;
        this.direccion = direccion;
    }


    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    public double getTotal() { return total; }

    public void setTotal(double total) { this.total = total; }

    public Timestamp getFecha() { return fecha; }

    public void setFecha(Timestamp fecha) { this.fecha = fecha; }

    public String getDireccion() { return direccion; }

    public void setDireccion(String direccion) { this.direccion = direccion; }

    public int getIdUsuario() { return idUsuario; }

    public void setIdUsuario(int idUsuario) { this.idUsuario = idUsuario; }

}
