package repository;

import model.Producto;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductoRepository {
    private static final String SQL_SELECT = "SELECT * from productos";
    private static final String SQL_SELECT_BY_ID = "SELECT * FROM productos where id = ?";
    private static final String SQL_INSERT = "INSERT INTO productos (nombre,precioPKilo) VALUES (?,?)";
    private static final String SQL_UPDATE = "UPDATE productos SET nombre = ?, precioPKilo = ? WHERE id = ?";
    private static final String SQL_DELETE = "DELETE FROM productos WHERE id = ?";

    public List<Producto> getAll() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Producto producto = null;
        List<Producto> productos = new ArrayList<>();

        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String nombre = rs.getString("nombre");
                double precioPKilo = rs.getDouble("precioPKilo");

                producto = new Producto(id,nombre,precioPKilo);
                productos.add(producto);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return productos;
    }

    public Producto getById(Producto producto) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT_BY_ID, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            stmt.setInt(1, producto.getId());
            rs = stmt.executeQuery();
            rs.absolute(1);

            String nombre = rs.getString("nombre");
            double precioPKilo = rs.getDouble("precioPKilo");

            producto.setNombre(nombre);
            producto.setPrecioPKilo(precioPKilo);

        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return producto;
    }

    public int create(Producto producto) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;

        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1, producto.getNombre());
            stmt.setDouble(2, producto.getPrecioPKilo());

            rows = stmt.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return rows;
    }

    public int update(Producto producto) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;

        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_UPDATE);
            stmt.setString(1, producto.getNombre());
            stmt.setDouble(2, producto.getPrecioPKilo());
            stmt.setInt(3, producto.getId());

            rows = stmt.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return rows;
    }

    public int delete(Producto Producto) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;

        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1, Producto.getId());

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
