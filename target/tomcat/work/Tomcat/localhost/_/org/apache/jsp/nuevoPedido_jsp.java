/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2020-06-26 09:40:28 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class nuevoPedido_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <title>Nuevo pedido</title>\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css\" integrity=\"sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk\" crossorigin=\"anonymous\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.7.0/css/all.css\" integrity=\"sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ\" crossorigin=\"anonymous\">\r\n");
      out.write("</head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <div class=\"row h-100 justify-content-center align-items-center\">\r\n");
      out.write("            <div class=\"col-6 align-self-center\">\r\n");
      out.write("                <div class=\"card\">\r\n");
      out.write("                    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "WEB-INF/componentesGenerales/accionesGenerales.jsp", out, false);
      out.write("\r\n");
      out.write("                    <div class=\"card-body\">\r\n");
      out.write("                        <div class=\"container\">\r\n");
      out.write("                            <div class=\"row\">\r\n");
      out.write("                                <div class=\"col align-self-center\">\r\n");
      out.write("                                    <h1 style=\"text-align: center\">\r\n");
      out.write("                                        <i class=\"fas fa-truck-loading\"></i> PEDIDO NUEVO\r\n");
      out.write("                                    </h1>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                         <form action=\"ServletControlador?accion=put&idCliente=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cliente.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" method=\"POST\" class=\"was-validated\">\r\n");
      out.write("                            <div class=\"row justify-content-end\" style=\"margin-top: 2%\">\r\n");
      out.write("                                <div class=\"col-4\">\r\n");
      out.write("                                    Cantidad\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"col-4\">\r\n");
      out.write("                                    Costo\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            ");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                            <div class=\"row justify-content-end\" style=\"margin-top: 2%\">\r\n");
      out.write("                                <div class=\"col-5\" style=\"text-align: right\">\r\n");
      out.write("                                    <h4>Total</h4>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"col-5\">\r\n");
      out.write("                                    <div class=\"input-group mb-3\">\r\n");
      out.write("                                        <div class=\"input-group-prepend\">\r\n");
      out.write("                                            <span class=\"input-group-text\" id=\"basic-addon3\">$</span>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <input type=\"number\" class=\"form-control\" id=\"total\" name=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${producto.nombre}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("Total\"  disabled required/>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                            <script>\r\n");
      out.write("                                function multiplicaCantidad (nombreProducto, precioPKilo) {\r\n");
      out.write("                                    var cantidad = document.getElementById(nombreProducto + 'Cantidad').value;\r\n");
      out.write("                                    document.getElementById(nombreProducto + 'Total').value = Math.round(precioPKilo * cantidad);\r\n");
      out.write("                                    document.getElementById('total').value =\r\n");
      out.write("                                        +document.getElementById('ArrozTotal').value +\r\n");
      out.write("                                        +document.getElementById('FrijolTotal').value +\r\n");
      out.write("                                        +document.getElementById('MaízTotal').value;\r\n");
      out.write("                                }\r\n");
      out.write("\r\n");
      out.write("                                function limpiar() {\r\n");
      out.write("                                    document.getElementById('ArrozTotal').value = '';\r\n");
      out.write("                                    document.getElementById('FrijolTotal').value = '';\r\n");
      out.write("                                    document.getElementById('MaízTotal').value = '';\r\n");
      out.write("                                    document.getElementById('ArrozCantidad').value = '';\r\n");
      out.write("                                    document.getElementById('FrijolCantidad').value = '';\r\n");
      out.write("                                    document.getElementById('MaízCantidad').value = '';\r\n");
      out.write("                                    document.getElementById('total').value = '';\r\n");
      out.write("                                }\r\n");
      out.write("                            </script>\r\n");
      out.write("                             <div class=\"d-flex justify-content-between\">\r\n");
      out.write("                                 <button type=\"submit\" class=\"btn btn-primary\">\r\n");
      out.write("                                     <i class=\"fas fa-paper-plane\"></i> Enviar\r\n");
      out.write("                                 </button>\r\n");
      out.write("                                 <button onclick=\"limpiar()\" class=\"btn btn-danger\">\r\n");
      out.write("                                     <i class=\"fas fa-times\"></i> Limpiar\r\n");
      out.write("                                 </button>\r\n");
      out.write("                             </div>\r\n");
      out.write("                         </form>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.5.1.slim.min.js\" integrity=\"sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js\" integrity=\"sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js\" integrity=\"sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /nuevoPedido.jsp(34,28) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/nuevoPedido.jsp(34,28) '${productos}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${productos}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /nuevoPedido.jsp(34,28) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("producto");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                <div class=\"row\" style=\"margin-top: 2%\">\r\n");
          out.write("                                    <div class=\"col-2\">\r\n");
          out.write("                                       <h4> ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${producto.nombre}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</h4>\r\n");
          out.write("                                    </div>\r\n");
          out.write("                                    <div class=\"col\">\r\n");
          out.write("                                        <div class=\"form-group\">\r\n");
          out.write("                                            <div class=\"input-group mb-3\">\r\n");
          out.write("                                                <input type=\"number\" class=\"form-control\" id=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${producto.nombre}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("Cantidad\"\r\n");
          out.write("                                                       onkeyup=\"multiplicaCantidad('");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${producto.nombre}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write('\'');
          out.write(',');
          out.write(' ');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${producto.precioPKilo}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write(")\"\r\n");
          out.write("                                                       name=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${producto.nombre}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("Cantidad\" autocomplete=\"off\" step=\"0.01\" required/>\r\n");
          out.write("                                                <div class=\"input-group-append\">\r\n");
          out.write("                                                    <span class=\"input-group-text\" id=\"basic-addon1\">Kg</span>\r\n");
          out.write("                                                </div>\r\n");
          out.write("                                            </div>\r\n");
          out.write("                                        </div>\r\n");
          out.write("                                    </div>\r\n");
          out.write("                                    <div class=\"col\">\r\n");
          out.write("                                        <div class=\"form-group\">\r\n");
          out.write("                                            <div class=\"input-group mb-3\">\r\n");
          out.write("                                                <div class=\"input-group-prepend\">\r\n");
          out.write("                                                    <span class=\"input-group-text\" id=\"basic-addon2\">$</span>\r\n");
          out.write("                                                </div>\r\n");
          out.write("                                                <input type=\"number\" class=\"form-control\" id=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${producto.nombre}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("Total\"\r\n");
          out.write("                                                       name=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${producto.nombre}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("Total\" disabled required/>\r\n");
          out.write("                                            </div>\r\n");
          out.write("                                        </div>\r\n");
          out.write("                                    </div>\r\n");
          out.write("                                </div>\r\n");
          out.write("                            ");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }
}
