package repository;

import model.ProductoPedido;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductoPedidoRepository {
    private static final String SQL_SELECT = "SELECT * from productos_pedidos";
    private static final String SQL_SELECT_BY_ID = "SELECT * FROM productos_pedidos where id = ?";
    private static final String SQL_INSERT = "INSERT INTO productos_pedidos (idProducto,idPedido,cantidad) VALUES (?,?,?)";
    private static final String SQL_UPDATE = "UPDATE productos_pedidos SET nombre = ?, precioPKilo = ? WHERE id = ?";
    private static final String SQL_DELETE = "DELETE FROM productos_pedidos WHERE id = ?";

    public List<ProductoPedido> getAll() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        ProductoPedido producto = null;
        List<ProductoPedido> productos = new ArrayList<>();

        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                int idProducto = rs.getInt("idProducto");
                int idPedido = rs.getInt("idPedido");
                int cantidad = rs.getInt("cantidad");

                producto = new ProductoPedido(id,idProducto,idPedido, cantidad);
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

/*    public ProductoPedido getById(ProductoPedido producto) {
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
    }*/

    public int create(List<ProductoPedido> productoPedidos) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;

        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);

            for (ProductoPedido productoPedido : productoPedidos) {
                stmt.setInt(1, productoPedido.getIdProducto());
                stmt.setInt(2, productoPedido.getIdPedido());
                stmt.setInt(3, productoPedido.getCantidad());
            }

            rows = stmt.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return rows;
    }

    /*public int update(Producto producto) {
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
    }*/

    public int delete(ProductoPedido Producto) {
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
