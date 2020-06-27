package model;

public class Usuario {
    private int id;
    private int idTipoUsuario;
    private String nombre;
    private String correo;
    private String usuario;
    private String direccion;
    private String telefono;
    private String password;

    public Usuario() { }

    public Usuario(int id) {
        this.id = id;
    }

    public Usuario(String usuario, String password) {
        this.usuario = usuario;
        this.password = password;
    }

    public Usuario(int idTipoUsuario, String nombre, String correo, String usuario, String direccion, String telefono, String password) {
        this.idTipoUsuario = idTipoUsuario;
        this.nombre = nombre;
        this.correo = correo;
        this.usuario = usuario;
        this.direccion = direccion;
        this.telefono = telefono;
        this.password = password;
    }

    public Usuario(int id, int idTipoUsuario, String nombre, String correo, String usuario, String direccion, String telefono, String password) {
        this.id = id;
        this.idTipoUsuario = idTipoUsuario;
        this.nombre = nombre;
        this.correo = correo;
        this.usuario = usuario;
        this.direccion = direccion;
        this.telefono = telefono;
        this.password = password;
    }

    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    public int getIdTipoUsuario() { return idTipoUsuario; }

    public void setIdTipoUsuario(int idTipoUsuario) { this.idTipoUsuario = idTipoUsuario; }

    public String getNombre() { return nombre; }

    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getCorreo() { return correo; }

    public void setCorreo(String correo) { this.correo = correo; }

    public String getUsuario() { return usuario; }

    public void setUsuario(String usuario) { this.usuario = usuario; }

    public String getDireccion() { return direccion; }

    public void setDireccion(String direccion) { this.direccion = direccion; }

    public String getTelefono() { return telefono; }

    public void setTelefono(String telefono) { this.telefono = telefono; }

    public String getPassword() { return password; }

    public void setPassword(String password) { this.password = password; }

}
