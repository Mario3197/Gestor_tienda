package repository;

import model.Pedido;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PedidosRepository {
    private static final String SQL_SELECT = "SELECT * from pedidos";
    private static final String SQL_SELECT_BY_ID = "SELECT * FROM pedidos where id = ?";
    private static final String SQL_SUMA_PEDIDOS = "SELECT sum(total) as sumaTotal FROM pedidos where idUsuario = ?";
    private static final String SQL_INSERT = "INSERT INTO pedidos (idUsuario,total) VALUES (?,?)";
    private static final String SQL_UPDATE = "UPDATE pedidos SET total =? WHERE id = ?";
    private static final String SQL_DELETE = "DELETE FROM pedidos WHERE id = ?";

    public List<Pedido> getAll() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Pedido pedido = null;
        List<Pedido> Pedidos = new ArrayList<>();

        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                int idUsuario = rs.getInt("idUsuario");
                double total = rs.getDouble("total");
                Timestamp fecha = rs.getTimestamp("fecha");

                pedido = new Pedido(id,idUsuario,total,fecha);
                Pedidos.add(pedido);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return Pedidos;
    }

    public Pedido getById(Pedido pedido) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT_BY_ID, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            stmt.setInt(1, pedido.getId());
            rs = stmt.executeQuery();
            rs.absolute(1);

            int idUsuario = rs.getInt("idUsuario");
            double total = rs.getDouble("total");
            Timestamp fecha = rs.getTimestamp("fecha");

            pedido.setIdUsuario(idUsuario);
            pedido.setTotal(total);
            pedido.setFecha(fecha);

        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return pedido;
    }

    public double getSumaUsuario(int idUsuario) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        double total = 0;

        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT_BY_ID, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            stmt.setInt(1, idUsuario);
            rs = stmt.executeQuery();

            if (rs.next()) {
                total = rs.getDouble("sumaTotal");
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return total;
    }

    public int create(Pedido pedido) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;

        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setInt(1, pedido.getIdUsuario());
            stmt.setDouble(2, pedido.getTotal());

            rows = stmt.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return rows;
    }

    public int update(Pedido pedido) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;

        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_UPDATE);
            stmt.setDouble(1, pedido.getTotal());
            stmt.setInt(2, pedido.getId());

            rows = stmt.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return rows;
    }

    public int delete(Pedido pedido) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;

        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1, pedido.getId());

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
