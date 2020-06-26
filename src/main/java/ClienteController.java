import model.Usuario;
import repository.PedidosRepository;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/cliente")
public class ClienteController extends HttpServlet {
    private Usuario usuario = null;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String accion = request.getParameter("accion");
        System.out.println("Holi");
        if (accion != null) {
            switch (accion) {
                /*case "put":
                    jspActualizar(request, response);
                    break;
                case "delete":
                    deleteCliente(request, response);
                    break;*/
                default:
                    cargaInformacion(request, response);
            }
        } else {
            cargaInformacion(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String accion = request.getParameter("accion");
        int id = Integer.parseInt(request.getAttribute("id").toString());
        int idTipoUsuario = Integer.parseInt(request.getAttribute("id").toString());
        String nombre = request.getAttribute("nombre").toString();
        String correo = request.getAttribute("correo").toString();
        String usuario = request.getAttribute("usuario").toString();
        String direccion = request.getAttribute("direccion").toString();
        String telefono = request.getAttribute("telefono").toString();
        String password = request.getAttribute("password").toString();

        this.usuario = new Usuario(id,idTipoUsuario,nombre,correo,usuario,direccion,telefono,password);

        if (accion != null) {
            switch (accion) {
                /*case "put":
                    jspActualizar(request, response);
                    break;
                case "delete":
                    deleteCliente(request, response);
                    break;*/
                default:
                    cargaInformacion(request, response);
            }
        } else {
            cargaInformacion(request, response);
        }
    }

    private void cargaInformacion(HttpServletRequest request, HttpServletResponse response) throws IOException {
        HttpSession session = request.getSession();
        double totalPedidos = new PedidosRepository().getSumaUsuario(this.usuario.getId());
        session.setAttribute("usuario", this.usuario);
        session.setAttribute("totalPedidos", totalPedidos);
        response.sendRedirect("cliente.jsp");
    }
}
