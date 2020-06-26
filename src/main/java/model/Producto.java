package model;

public class Producto {
    private int id;
    private String nombre;
    private double precioPKilo;

    public Producto() {}

    public Producto(int id, String nombre, double precioPKilo) {
        this.id = id;
        this.nombre = nombre;
        this.precioPKilo = precioPKilo;
    }

    public Producto(String nombre, double precioPKilo) {
        this.nombre = nombre;
        this.precioPKilo = precioPKilo;
    }

    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    public String getNombre() { return nombre; }

    public void setNombre(String nombre) { this.nombre = nombre; }

    public double getPrecioPKilo() { return precioPKilo; }

    public void setPrecioPKilo(double precioPKilo) { this.precioPKilo = precioPKilo; }
}
