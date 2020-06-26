package repository;

import model.Usuario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UsuarioRepository {
    private static final String SQL_SELECT = "SELECT * from usuario";
    private static final String SQL_SELECT_BY_ID = "SELECT * FROM usuario where id = ?";
    private static final String SQL_VALIDACION_CREDENCIALES = "SELECT * FROM usuario where usuario = ? and password = ?";
    private static final String SQL_INSERT = "INSERT INTO usuario (idTipoUsuario,nombre, correo, usuario, direccion, telefono, password) VALUES (?,?,?,?,?,?,?)";
    private static final String SQL_UPDATE = "UPDATE usuario SET nombre = ?, correo = ?, usuario = ?, direccion = ?,telefono = ?, password =? WHERE id = ?";
    private static final String SQL_DELETE = "DELETE FROM usuario WHERE id = ?";

    public List<Usuario> getAll() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Usuario Usuario = null;
        List<Usuario> Usuarios = new ArrayList<>();

        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();

            while (rs.next()) {
                int idUsuario = rs.getInt("id");
                int idTipoUsuario = rs.getInt("idTipoUsuario");
                String nombre = rs.getString("nombre");
                String correo = rs.getString("correo");
                String usuario = rs.getString("usuario");
                String direccion = rs.getString("direccion");
                String telefono = rs.getString("telefono");
                String password = rs.getString("password");

                Usuario = new Usuario(idUsuario,idTipoUsuario,nombre,correo,usuario,direccion,telefono,password);
                Usuarios.add(Usuario);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return Usuarios;
    }

    public Usuario getById(Usuario usuario) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT_BY_ID, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            stmt.setInt(1, usuario.getId());
            rs = stmt.executeQuery();
            rs.absolute(1);

            int idTipoUsuario = rs.getInt("idTipoUsuario");
            String nombre = rs.getString("nombre");
            String correo = rs.getString("correo");
            String user = rs.getString("usuario");
            String direccion = rs.getString("direccion");
            String telefono = rs.getString("telefono");
            String password = rs.getString("password");

            usuario.setIdTipoUsuario(idTipoUsuario);
            usuario.setNombre(nombre);
            usuario.setCorreo(correo);
            usuario.setUsuario(user);
            usuario.setDireccion(direccion);
            usuario.setTelefono(telefono);
            usuario.setPassword(password);

        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return usuario;
    }

    public Usuario validateUser(Usuario usuario) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_VALIDACION_CREDENCIALES, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            stmt.setString(1, usuario.getUsuario());
            stmt.setString(2, usuario.getPassword());
            rs = stmt.executeQuery();

            if (rs.next()) {
                rs.absolute(1);
                usuario.setId(rs.getInt("id"));
                usuario.setIdTipoUsuario(rs.getInt("idTipoUsuario"));
                usuario.setNombre(rs.getString("nombre"));
                usuario.setCorreo(rs.getString("correo"));
                usuario.setUsuario(rs.getString("usuario"));
                usuario.setDireccion(rs.getString("direccion"));
                usuario.setTelefono(rs.getString("telefono"));
                usuario.setPassword(rs.getString("password"));

            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return usuario;
    }

    public int create(Usuario usuario) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;

        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setInt(1, usuario.getIdTipoUsuario());
            stmt.setString(2, usuario.getNombre());
            stmt.setString(3, usuario.getCorreo());
            stmt.setString(4, usuario.getUsuario());
            stmt.setString(5, usuario.getDireccion());
            stmt.setString(6, usuario.getTelefono());
            stmt.setString(7, usuario.getPassword());

            rows = stmt.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return rows;
    }

    public int update(Usuario usuario) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;

        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_UPDATE);
            stmt.setString(1, usuario.getNombre());
            stmt.setString(2, usuario.getCorreo());
            stmt.setString(3, usuario.getUsuario());
            stmt.setString(4, usuario.getDireccion());
            stmt.setString(5, usuario.getTelefono());
            stmt.setString(6, usuario.getPassword());
            stmt.setInt(7, usuario.getId());

            rows = stmt.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return rows;
    }

    public int delete(Usuario usuario) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;

        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1, usuario.getId());

            rows = stmt.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return rows;
    }
}
