package org.apache.jsp.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
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
      out.write("<meta charset=\"utf-8\"/>\n");
      out.write("<title>登录到ChinaMobileMediaCloud</title>\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("<meta content=\"width=device-width, initial-scale=1.0\" name=\"viewport\"/>\n");
      out.write("<meta content=\"\" name=\"description\"/>\n");
      out.write("<meta content=\"\" name=\"author\"/>\n");
      out.write("<meta name=\"MobileOptimized\" content=\"320\">\n");
      out.write("<!-- BEGIN GLOBAL MANDATORY STYLES -->\n");
      out.write("<link href=\"../assets/plugins/font-awesome/css/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("<link href=\"../assets/plugins/bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("<link href=\"../assets/plugins/uniform/css/uniform.default.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("<!-- END GLOBAL MANDATORY STYLES -->\n");
      out.write("<!-- BEGIN PAGE LEVEL STYLES -->\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"../assets/plugins/select2/select2_metro.css\"/>\n");
      out.write("<!-- END PAGE LEVEL SCRIPTS -->\n");
      out.write("<!-- BEGIN THEME STYLES -->\n");
      out.write("<link href=\"../assets/css/style-metronic.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("<link href=\"../assets/css/style.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("<link href=\"../assets/css/style-responsive.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("<link href=\"../assets/css/plugins.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("<link href=\"../assets/css/themes/default.css\" rel=\"stylesheet\" type=\"text/css\" id=\"style_color\"/>\n");
      out.write("<link href=\"../assets/css/pages/login-soft.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("<link href=\"../assets/css/custom.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("<!-- END THEME STYLES -->\n");
      out.write("<link rel=\"shortcut icon\" href=\"../assets/app/img/favicon.ico\"/>\n");
      out.write("</head>\n");
      out.write("<!-- END HEAD -->\n");
      out.write("<!-- BEGIN BODY -->\n");
      out.write("<body class=\"login\">\n");
      out.write("<!-- BEGIN LOGO -->\n");
      out.write("<div class=\"logo\">\n");
      out.write("\t<img src=\"../assets/img/logo-big2.png\" alt=\"\"/>\n");
      out.write("</div>\n");
      out.write("<!-- END LOGO -->\n");
      out.write("<!-- BEGIN LOGIN -->\n");
      out.write("<div class=\"content\">\n");
      out.write("\t<!-- BEGIN LOGIN FORM -->\n");
      out.write("\t<form class=\"login-form\" action=\"../rest/user/login\" method=\"post\">\n");
      out.write("\t\t<h3 class=\"form-title\">用户登录</h3>\n");
      out.write("\t\t<div class=\"alert alert-danger display-hide\">\n");
      out.write("\t\t\t<button class=\"close\" data-close=\"alert\"></button>\n");
      out.write("\t\t\t<span>\n");
      out.write("\t\t\t\t 输入您的用户名和密码\n");
      out.write("\t\t\t</span>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t<!--ie8, ie9 does not support html5 placeholder, so we just show field title for that-->\n");
      out.write("\t\t\t<label class=\"control-label visible-ie8 visible-ie9\">用户名</label>\n");
      out.write("\t\t\t<div class=\"input-icon\">\n");
      out.write("\t\t\t\t<i class=\"fa fa-user\"></i>\n");
      out.write("\t\t\t\t<input name=\"name\" id=\"name\" size=\"25\" value=\"\" class=\"form-control placeholder-no-fix\" type=\"text\" autocomplete=\"off\" placeholder=\"用户名\" />\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t<label class=\"control-label visible-ie8 visible-ie9\">密码</label>\n");
      out.write("\t\t\t<div class=\"input-icon\">\n");
      out.write("\t\t\t\t<i class=\"fa fa-lock\"></i>\n");
      out.write("\t\t\t\t<input name=\"password\" id=\"password\" size=\"25\" value=\"\" class=\"form-control placeholder-no-fix\" type=\"password\" autocomplete=\"off\" placeholder=\"密码\" />\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t<input class=\"form-control placeholder-no-fix\" style=\"width:50%;display:inline-block\" name=\"authCode\" type=\"text\" placeholder=\"验证码\"> \n");
      out.write("\t\t\t<img style=\"vertical-align:middle;cursor:pointer;height:32px\" src=\"../rest/user/authImg\">\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"form-actions\">\n");
      out.write("<!-- \t\t\t<label class=\"checkbox\"> -->\n");
      out.write("<!-- \t\t\t<input type=\"checkbox\" name=\"remember\" value=\"1\"/> 记住我 </label> -->\n");
      out.write("\t\t\t<button id=\"loginBut\" type=\"submit\" class=\"btn blue pull-right\">\n");
      out.write("\t\t\t登录 <i class=\"m-icon-swapright m-icon-white\"></i>\n");
      out.write("\t\t\t</button>\n");
      out.write("\t\t</div>\n");
      out.write("<!-- \t\t<div class=\"forget-password\"> -->\n");
      out.write("<!-- \t\t\t<h4>忘记密码 ?</h4> -->\n");
      out.write("<!-- \t\t\t<p>点击 <a href=\"javascript:;\" id=\"forget-password\">这里</a> 重置您的密码. -->\n");
      out.write("<!-- \t\t\t</p> -->\n");
      out.write("<!-- \t\t</div> -->\n");
      out.write("<!-- \t\t<div class=\"create-account\"> -->\n");
      out.write("<!-- \t\t\t<p> -->\n");
      out.write("<!-- \t\t\t\t 还没有账号 ?&nbsp; <a href=\"javascript:;\" id=\"register-btn\">创建一个账号</a> -->\n");
      out.write("<!-- \t\t\t</p> -->\n");
      out.write("<!-- \t\t</div> -->\n");
      out.write("\t</form>\n");
      out.write("\t<!-- END LOGIN FORM -->\n");
      out.write("\t<!-- BEGIN FORGOT PASSWORD FORM -->\n");
      out.write("\t<form class=\"forget-form\" action=\"index.html\" method=\"post\">\n");
      out.write("\t\t<h3>忘记密码 ?</h3>\n");
      out.write("\t\t<p>\n");
      out.write("\t\t\t 请输入您的电子邮箱地址来重置您的密码.\n");
      out.write("\t\t</p>\n");
      out.write("\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t<div class=\"input-icon\">\n");
      out.write("\t\t\t\t<i class=\"fa fa-envelope\"></i>\n");
      out.write("\t\t\t\t<input class=\"form-control placeholder-no-fix\" type=\"text\" autocomplete=\"off\" placeholder=\"Email\" name=\"email\"/>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"form-actions\">\n");
      out.write("\t\t\t<button type=\"button\" id=\"back-btn\" class=\"btn\">\n");
      out.write("\t\t\t<i class=\"m-icon-swapleft\"></i> 返回 </button>\n");
      out.write("\t\t\t<button type=\"submit\" class=\"btn blue pull-right\">\n");
      out.write("\t\t\t提交 <i class=\"m-icon-swapright m-icon-white\"></i>\n");
      out.write("\t\t\t</button>\n");
      out.write("\t\t</div>\n");
      out.write("\t</form>\n");
      out.write("\t<!-- END FORGOT PASSWORD FORM -->\n");
      out.write("</div>\n");
      out.write("<!-- END LOGIN -->\n");
      out.write("<!-- BEGIN COPYRIGHT -->\n");
      out.write("<div class=\"copyright\">\n");
      out.write("\t <p>Copyright&copy;2016&nbsp;中移在线服务有限公司&nbsp;版权所有</p>\n");
      out.write("\t\t\t\t<p>备案许可证号：豫ICP备15016518号</p>\n");
      out.write("</div>\n");
      out.write("<!-- END COPYRIGHT -->\n");
      out.write("<!-- BEGIN JAVASCRIPTS(Load javascripts at bottom, this will reduce page load time) -->\n");
      out.write("<!-- BEGIN CORE PLUGINS -->\n");
      out.write("<!--[if lt IE 9]>\n");
      out.write("\t<script src=\"assets/plugins/respond.min.js\"></script>\n");
      out.write("\t<script src=\"assets/plugins/excanvas.min.js\"></script> \n");
      out.write("\t<![endif]-->\n");
      out.write("<script src=\"../assets/plugins/jquery-2.2.4.min.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"../assets/plugins/jquery-migrate-1.2.1.min.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"../assets/plugins/bootstrap/js/bootstrap.min.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"../assets/plugins/bootstrap-hover-dropdown/twitter-bootstrap-hover-dropdown.min.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"../assets/plugins/jquery-slimscroll/jquery.slimscroll.min.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"../assets/plugins/jquery.blockui.min.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"../assets/plugins/jquery.cokie.min.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"../assets/plugins/uniform/jquery.uniform.min.js\" type=\"text/javascript\"></script>\n");
      out.write("<!-- END CORE PLUGINS -->\n");
      out.write("<!-- BEGIN PAGE LEVEL PLUGINS -->\n");
      out.write("<script src=\"../assets/plugins/jquery-validation/dist/jquery.validate.min.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"../assets/plugins/backstretch/jquery.backstretch.min.js\" type=\"text/javascript\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"../assets/plugins/select2/select2.min.js\"></script>\n");
      out.write("<!-- END PAGE LEVEL PLUGINS -->\n");
      out.write("<!-- BEGIN PAGE LEVEL SCRIPTS -->\n");
      out.write("<script src=\"../assets/scripts/app.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"../assets/scripts/login-soft.js\" type=\"text/javascript\"></script>\n");
      out.write("\n");
      out.write("<script src=\"../app/lib/security/sha256.js\" type=\"text/javascript\"></script>\n");
      out.write("<!-- END PAGE LEVEL SCRIPTS -->\n");
      out.write("<script>\n");
      out.write("\t\tjQuery(document).ready(function() {     \n");
      out.write("\t\t  App.init();\n");
      out.write("\t\t  Login.init();\n");
      out.write("\t\t});\n");
      out.write("\t</script>\n");
      out.write("<!-- END JAVASCRIPTS -->\n");
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
