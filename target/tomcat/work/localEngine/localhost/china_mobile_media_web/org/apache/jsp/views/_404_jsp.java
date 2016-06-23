package org.apache.jsp.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class _404_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\n');

String path = request.getContextPath();
String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<!-- \n");
      out.write("Template Name: Metronic - Responsive Admin Dashboard Template build with Twitter Bootstrap 3.0.3\n");
      out.write("Version: 1.5.5\n");
      out.write("Author: KeenThemes\n");
      out.write("Website: http://www.keenthemes.com/\n");
      out.write("Purchase: http://themeforest.net/item/metronic-responsive-admin-dashboard-template/4021469?ref=keenthemes\n");
      out.write("-->\n");
      out.write("<!--[if IE 8]> <html lang=\"en\" class=\"ie8 no-js\"> <![endif]-->\n");
      out.write("<!--[if IE 9]> <html lang=\"en\" class=\"ie9 no-js\"> <![endif]-->\n");
      out.write("<!--[if !IE]><!-->\n");
      out.write("<html lang=\"en\" class=\"no-js\">\n");
      out.write("<!--<![endif]-->\n");
      out.write("<!-- BEGIN HEAD -->\n");
      out.write("<head>\n");
      out.write("<base href=\"");
      out.print(basePath);
      out.write("\">\n");
      out.write("<meta charset=\"utf-8\" />\n");
      out.write("<title>404 错误</title>\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("<meta content=\"width=device-width, initial-scale=1.0\" name=\"viewport\" />\n");
      out.write("<meta content=\"\" name=\"description\" />\n");
      out.write("<meta content=\"\" name=\"author\" />\n");
      out.write("<meta name=\"MobileOptimized\" content=\"320\">\n");
      out.write("<!-- BEGIN GLOBAL MANDATORY STYLES -->\n");
      out.write("<link href=\"assets/plugins/font-awesome/css/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("<link href=\"assets/plugins/bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("<link href=\"assets/plugins/uniform/css/uniform.default.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("<!-- END GLOBAL MANDATORY STYLES -->\n");
      out.write("<!-- BEGIN THEME STYLES -->\n");
      out.write("<link href=\"assets/css/style-metronic.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("<link href=\"assets/css/style.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("<link href=\"assets/css/style-responsive.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("<link href=\"assets/css/plugins.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("<link href=\"assets/css/themes/default.css\" rel=\"stylesheet\" type=\"text/css\" id=\"style_color\" />\n");
      out.write("<link href=\"assets/css/pages/error.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("<link href=\"assets/css/custom.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("<!-- END THEME STYLES -->\n");
      out.write("<link rel=\"shortcut icon\" href=\"favicon.ico\" />\n");
      out.write("</head>\n");
      out.write("<!-- END HEAD -->\n");
      out.write("<!-- BEGIN BODY -->\n");
      out.write("<body class=\"page-404-full-page\">\n");
      out.write("    <div class=\"row\">\n");
      out.write("        <div class=\"col-md-12 page-404\">\n");
      out.write("            <div class=\"number\">404</div>\n");
      out.write("            <div class=\"details\">\n");
      out.write("                <h3>找不到当前页面</h3>\n");
      out.write("                <p>\n");
      out.write("                   \t找不到当前页面\n");
      out.write("                </p>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <!-- BEGIN JAVASCRIPTS(Load javascripts at bottom, this will reduce page load time) -->\n");
      out.write("    <!-- BEGIN CORE PLUGINS -->\n");
      out.write("    <!--[if lt IE 9]>\n");
      out.write("<script src=\"assets/plugins/respond.min.js\"></script>\n");
      out.write("<script src=\"assets/plugins/excanvas.min.js\"></script> \n");
      out.write("<![endif]-->\n");
      out.write("    <script src=\"assets/plugins/jquery-2.2.4.min.js\" type=\"text/javascript\"></script>\n");
      out.write("    <script src=\"assets/plugins/jquery-migrate-1.2.1.min.js\" type=\"text/javascript\"></script>\n");
      out.write("    <script src=\"assets/plugins/bootstrap/js/bootstrap.min.js\" type=\"text/javascript\"></script>\n");
      out.write("    <script src=\"assets/plugins/bootstrap-hover-dropdown/twitter-bootstrap-hover-dropdown.min.js\" type=\"text/javascript\"></script>\n");
      out.write("    <script src=\"assets/plugins/jquery-slimscroll/jquery.slimscroll.min.js\" type=\"text/javascript\"></script>\n");
      out.write("    <script src=\"assets/plugins/jquery.blockui.min.js\" type=\"text/javascript\"></script>\n");
      out.write("    <script src=\"assets/plugins/jquery.cokie.min.js\" type=\"text/javascript\"></script>\n");
      out.write("    <script src=\"assets/plugins/uniform/jquery.uniform.min.js\" type=\"text/javascript\"></script>\n");
      out.write("    <!-- END CORE PLUGINS -->\n");
      out.write("    <script src=\"assets/scripts/app.js\"></script>\n");
      out.write("    <script>\n");
      out.write("                    jQuery(document).ready(function() {\n");
      out.write("                        App.init();\n");
      out.write("                    });\n");
      out.write("                </script>\n");
      out.write("    <!-- END JAVASCRIPTS -->\n");
      out.write("</body>\n");
      out.write("<!-- END BODY -->\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
