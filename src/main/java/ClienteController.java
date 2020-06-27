import model.Usuario;
import repository.PedidosRepository;
import repository.UsuarioRepository;

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
        if (accion != null) {
            switch (accion) {
                case "actualizar-usuario":
                    updateUser(request, response);
                    break;
                default:
                    cargaInformacion(request, response);
            }
        } else {
            cargaInformacion(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Object accion = request.getAttribute("accion");

        if (accion != null) {
            String nombreAccion = accion.toString();
            switch (nombreAccion) {
                case "producto-agregado":
                    cargaInformacion(request, response);
                    break;
                 case "update-cliente":
//                    deleteCliente(request, response);
                    break;
                default:
                    crearObjetoUsuario(request,response);
                    cargaInformacion(request, response);
            }
        } else {
            String accionParametro = request.getParameter("accion");
            if (accionParametro != null && accionParametro.equals("actualizar")) {
                String nombre = request.getParameter("name");
                String correo = request.getParameter("correo");
                String usuario = request.getParameter("usuario");
                String direccion = request.getParameter("direccion");
                String telefono = request.getParameter("telefono");
                String password = request.getParameter("pass");
                Usuario user = new Usuario(this.usuario.getId(), this.usuario.getIdTipoUsuario(), nombre,
                        correo, usuario,direccion,telefono,password);

                new UsuarioRepository().update(user);
                this.usuario = user;
            }else {
                crearObjetoUsuario(request,response);
            }
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

    private void crearObjetoUsuario(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getAttribute("id").toString());
        int idTipoUsuario = Integer.parseInt(request.getAttribute("id").toString());
        String nombre = request.getAttribute("nombre").toString();
        String correo = request.getAttribute("correo").toString();
        String usuario = request.getAttribute("usuario").toString();
        String direccion = request.getAttribute("direccion").toString();
        String telefono = request.getAttribute("telefono").toString();
        String password = request.getAttribute("password").toString();

        this.usuario = new Usuario(id,idTipoUsuario,nombre,correo,usuario,direccion,telefono,password);
    }

    private void updateUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("usuario", usuario);
        request.getRequestDispatcher("/actualizarUsuario.jsp").forward(request,response);
    }
}
