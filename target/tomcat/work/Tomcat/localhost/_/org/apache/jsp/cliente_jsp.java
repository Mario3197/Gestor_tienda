/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2020-06-26 02:57:03 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class cliente_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ffmt_005fsetLocale_0026_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ffmt_005fformatNumber_0026_005fvalue_005ftype_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005ffmt_005fsetLocale_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ffmt_005fformatNumber_0026_005fvalue_005ftype_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005ffmt_005fsetLocale_0026_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005ffmt_005fformatNumber_0026_005fvalue_005ftype_005fnobody.release();
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
      if (_jspx_meth_fmt_005fsetLocale_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <title>Menú principal</title>\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css\" integrity=\"sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk\" crossorigin=\"anonymous\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.7.0/css/all.css\" integrity=\"sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ\" crossorigin=\"anonymous\">\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <div class=\"row h-100 justify-content-center align-items-center\">\r\n");
      out.write("            <div class=\"col-6 align-self-center\">\r\n");
      out.write("                <div class=\"card\">\r\n");
      out.write("                    <div class=\"card-header text-white text-center\" style=\"background-color: #1178D6;\">\r\n");
      out.write("                       <h1> INICIO </h1>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"d-flex justify-content-end\">\r\n");
      out.write("                        <a href=\"/\" style=\"text-decoration:none; margin-right: 2%; color: inherit;\">\r\n");
      out.write("                            <h4><i class=\"fas fa-sign-out-alt\"></i> Cerrar sesión</h4>\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"card-body\">\r\n");
      out.write("                        <div class=\"container\">\r\n");
      out.write("                            <div class=\"row justify-content-between\">\r\n");
      out.write("                                <div class=\"col-4\">\r\n");
      out.write("                                    <h1 style=\"font-size: 100px; margin-left: 40%\"><i class=\"fas fa-user\"></i></h1>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"col-6\">\r\n");
      out.write("                                    <h2 style=\"text-align: right;\">Número de usuario: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${usuario.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</h2>\r\n");
      out.write("                                    <div class =\"d-flex justify-content-between\" style=\"margin-top: 10%;\">\r\n");
      out.write("                                        <a href=\"#\" class=\"btn btn-primary\" data-toggle=\"modal\" data-target=\"#agregarClienteModal\">\r\n");
      out.write("                                            <i class=\"fas fa-pen\"></i> Editar\r\n");
      out.write("                                        </a>\r\n");
      out.write("                                        <a href=\"#\" class=\"btn btn-primary\" data-toggle=\"modal\" data-target=\"#agregarClienteModal\">\r\n");
      out.write("                                            <i class=\"fas fa-eye\"></i> Ver pedidos\r\n");
      out.write("                                        </a>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"row\" style=\"margin-top: 2%\">\r\n");
      out.write("                                <div class=\"col-6\">\r\n");
      out.write("                                    <h4> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${usuario.nombre}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(" </h4>\r\n");
      out.write("                                    <h4> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${usuario.correo}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(" </h4>\r\n");
      out.write("                                    <h4> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${usuario.direccion}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(" </h4>\r\n");
      out.write("                                    <h4> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${usuario.usuario}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(" </h4>\r\n");
      out.write("                                    <h4> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${usuario.password}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(" </h4>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"col-6\" style=\"margin-top: 8%\">\r\n");
      out.write("                                    <div class=\"card text-center text-white bg-success mb-3\">\r\n");
      out.write("                                        <div class=\"card-body\">\r\n");
      out.write("                                            <h3 class=\"card-title\">Monto a pagar</h3>\r\n");
      out.write("                                            <h4> ");
      if (_jspx_meth_fmt_005fformatNumber_005f0(_jspx_page_context))
        return;
      out.write("</h4>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"row\" style=\"margin-top: 5%\">\r\n");
      out.write("                                <div class=\"col-12\">\r\n");
      out.write("                                    <a href=\"pedido?idUsuario=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${usuario.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" class=\"btn btn-primary\">\r\n");
      out.write("                                        <h4><i class=\"fas fa-truck-loading\"></i> Nuevo pedido</h4>\r\n");
      out.write("                                    </a>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
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

  private boolean _jspx_meth_fmt_005fsetLocale_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  fmt:setLocale
    org.apache.taglibs.standard.tag.rt.fmt.SetLocaleTag _jspx_th_fmt_005fsetLocale_005f0 = (org.apache.taglibs.standard.tag.rt.fmt.SetLocaleTag) _005fjspx_005ftagPool_005ffmt_005fsetLocale_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.SetLocaleTag.class);
    _jspx_th_fmt_005fsetLocale_005f0.setPageContext(_jspx_page_context);
    _jspx_th_fmt_005fsetLocale_005f0.setParent(null);
    // /cliente.jsp(4,0) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fsetLocale_005f0.setValue("es_MX");
    int _jspx_eval_fmt_005fsetLocale_005f0 = _jspx_th_fmt_005fsetLocale_005f0.doStartTag();
    if (_jspx_th_fmt_005fsetLocale_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ffmt_005fsetLocale_0026_005fvalue_005fnobody.reuse(_jspx_th_fmt_005fsetLocale_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005ffmt_005fsetLocale_0026_005fvalue_005fnobody.reuse(_jspx_th_fmt_005fsetLocale_005f0);
    return false;
  }

  private boolean _jspx_meth_fmt_005fformatNumber_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatNumber
    org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag _jspx_th_fmt_005fformatNumber_005f0 = (org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag) _005fjspx_005ftagPool_005ffmt_005fformatNumber_0026_005fvalue_005ftype_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag.class);
    _jspx_th_fmt_005fformatNumber_005f0.setPageContext(_jspx_page_context);
    _jspx_th_fmt_005fformatNumber_005f0.setParent(null);
    // /cliente.jsp(55,49) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fformatNumber_005f0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${totalPedidos}", java.lang.Object.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
    // /cliente.jsp(55,49) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fformatNumber_005f0.setType("currency");
    int _jspx_eval_fmt_005fformatNumber_005f0 = _jspx_th_fmt_005fformatNumber_005f0.doStartTag();
    if (_jspx_th_fmt_005fformatNumber_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ffmt_005fformatNumber_0026_005fvalue_005ftype_005fnobody.reuse(_jspx_th_fmt_005fformatNumber_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005ffmt_005fformatNumber_0026_005fvalue_005ftype_005fnobody.reuse(_jspx_th_fmt_005fformatNumber_005f0);
    return false;
  }
}