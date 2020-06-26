import model.Usuario;
import repository.UsuarioRepository;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/login")
public class LoginController extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String accion = request.getParameter("accion");
        if (accion != null) {
            switch (accion) {
                case "registrar":
                    registrarUsuario(request, response);
                    break;
                case "ingresar":
                    iniciarSesion(request,response);
                    break;
                default:
                    response.sendRedirect("/");
            }
        } else {
            response.sendRedirect("/");
        }
    }

    private void iniciarSesion(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String usuario = request.getParameter("usuario");
        String pass = request.getParameter("password");
        Usuario user = new UsuarioRepository().validateUser(new Usuario(usuario,pass));
        request.setAttribute("id", user.getId());
        request.setAttribute("idTipoUsuario", user.getIdTipoUsuario());
        request.setAttribute("nombre", user.getNombre());
        request.setAttribute("correo", user.getCorreo());
        request.setAttribute("usuario", user.getUsuario());
        request.setAttribute("direccion", user.getDireccion());
        request.setAttribute("telefono", user.getTelefono());
        request.setAttribute("password", user.getPassword());

        switch(user.getIdTipoUsuario()) {
            case 1:
                break;
            case 2:
                request.getRequestDispatcher("cliente").forward(request,response);
                break;
            default:
                response.sendRedirect("/");
        }
    }

    private void registrarUsuario(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String nombre = request.getParameter("name");
        String telefono = request.getParameter("telefono");
        String correo = request.getParameter("correo");
        String direccion = request.getParameter("direccion");
        String usuario = request.getParameter("usuario");
        String pass = request.getParameter("pass");

        new UsuarioRepository().create(new Usuario(2, nombre,correo,usuario,direccion,telefono,pass));

        response.sendRedirect("/");
    }
}
