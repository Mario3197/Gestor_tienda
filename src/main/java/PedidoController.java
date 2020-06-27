import model.Pedido;
import model.Producto;
import model.ProductoPedido;
import repository.PedidosRepository;
import repository.ProductoPedidoRepository;
import repository.ProductoRepository;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/pedido")
public class PedidoController extends HttpServlet {
    private int idUsuario;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String accion = request.getParameter("accion");
        this.idUsuario = Integer.parseInt(request.getParameter("idUsuario"));

        if (accion != null) {
            switch (accion) {
                /*case "put":
                    jspActualizar(request, response);
                    break;
                case "delete":
                    deleteCliente(request, response);
                    break;*/
                default:
                    System.out.println("Holi");
                    cargaInformacion(request, response);
            }
        } else {
            cargaInformacion(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String accion = request.getParameter("accion");

        if (accion != null) {
            switch (accion) {
                /*case "put":
                    jspActualizar(request, response);
                    break;
                case "delete":
                    deleteCliente(request, response);
                    break;*/
                case "crear":
                    guardarPedido(request, response);
                    break;
                default:
                    System.out.println("Holi");
                    //cargaInformacion(request, response);
            }
        } else {
            System.out.println(":v");
            //cargaInformacion(request, response);
        }
    }

    private void cargaInformacion(HttpServletRequest request, HttpServletResponse response) throws IOException {
        HttpSession session = request.getSession();
        List<Producto> productos = new ProductoRepository().getAll();
        session.setAttribute("productos", productos);
        response.sendRedirect("nuevoPedido.jsp");
    }

    private void guardarPedido(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        List<ProductoPedido> pedidos = new ArrayList<>();
        int cantidadArroz = Integer.parseInt(request.getParameter("ArrozCantidad"));
        int cantidadFrijol = Integer.parseInt(request.getParameter("FrijolCantidad"));
        int cantidadMaiz = Integer.parseInt(request.getParameter("MaizCantidad"));
        double sumaTotal = Double.parseDouble(request.getParameter("sumaTotal"));
        String direccion = request.getParameter("direccion");

        if (sumaTotal > 0) {
            int idPedido= new PedidosRepository().create(new Pedido(this.idUsuario, sumaTotal, direccion));
            if (cantidadArroz > 0) {
                pedidos.add(new ProductoPedido(1,idPedido,cantidadArroz));
            }
            if (cantidadFrijol > 0) {
                pedidos.add(new ProductoPedido(2,idPedido,cantidadFrijol));
            }
            if (cantidadMaiz > 0) {
                pedidos.add(new ProductoPedido(3,idPedido,cantidadMaiz));
            }
            new ProductoPedidoRepository().create(pedidos);
//            request.setAttribute("idUsuario", this.idUsuario);
            request.setAttribute("accion", "producto-agregado");
            request.getRequestDispatcher("cliente").forward(request,response);
        } else {
            response.sendRedirect("cliente.jsp");
        }
    }

}
