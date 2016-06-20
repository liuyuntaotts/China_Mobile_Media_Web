package org.apache.jsp.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class left_005fadmin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<script type=\"text/javascript\">\n");
      out.write("function gotoUrl(url){\n");
      out.write("\twindow.location.href=url;\n");
      out.write("}\n");
      out.write("$(function() {\n");
      out.write("\tvar html = '';\n");
      out.write("\t$.getJSON('../rest/left/list', function(r) {\n");
      out.write("\t\tif(r.status == \"success\"){\n");
      out.write("\t\t\t$.each(r.data,function(i,v){\n");
      out.write("\t\t\t\thtml += '<li><a class=\"\" href=\"javascript:;\" onclick=\"\">'+v.name+'</a><ul class=\"sub-menu\">'\n");
      out.write("\t\t\t\t$.each(r.data[i].child,function(n,vv){\n");
      out.write("\t\t\t\t\thtml += '<li><a href=\"javascript:;\" onclick=\"gotoUrl(\\'../views/videoPublishList.jsp?parent='+vv.id+'\\');\">'+vv.name+'</a>'\n");
      out.write("\t\t\t\t})\n");
      out.write("\t\t\t\thtml += '</ul></li>';\n");
      out.write("\t\t\t})\n");
      out.write("\t\t\t\n");
      out.write("\t\t}\n");
      out.write("\t}).done(function(){\n");
      out.write("\t\t$('.categoryList').html(\"\");\n");
      out.write("\t\t$('.categoryList').html(html);\n");
      out.write("\t})\n");
      out.write("\t\n");
      out.write("})\n");
      out.write("</script>\n");
      out.write("            <!-- BEGIN SIDEBAR -->\n");
      out.write("            <div class=\"page-sidebar-wrapper\">\n");
      out.write("                <div class=\"page-sidebar navbar-collapse collapse\">\n");
      out.write("                    <!-- BEGIN SIDEBAR MENU -->\n");
      out.write("                    <ul class=\"page-sidebar-menu nav\" id=\"page-sidebar-menu\">\n");
      out.write("                        <li class=\"sidebar-toggler-wrapper\">\n");
      out.write("                            <!-- BEGIN SIDEBAR TOGGLER BUTTON -->\n");
      out.write("                            <div class=\"sidebar-toggler hidden-phone\"></div>\n");
      out.write("                            <!-- BEGIN SIDEBAR TOGGLER BUTTON -->\n");
      out.write("                        </li>\n");
      out.write("\n");
      out.write("                        <li class=\"leftli\">\n");
      out.write("                            <a href=\"javascript:;\">\n");
      out.write("                                <i class=\"fa fa-gears icon-home icon-black\"></i><span class=\"title\"> 资源管理 </span>\n");
      out.write("                                <!-- <span class=\"arrow \"> </span> -->\n");
      out.write("                            </a>\n");
      out.write("                            <ul class=\"sub-menu\">\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"javascript:\" onclick=\"gotoUrl('../views/categoryList.jsp');\">\n");
      out.write("                                        栏目管理\n");
      out.write("                                    </a>\n");
      out.write("                                </li>\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"javascript:\" onclick=\"gotoUrl('../views/videoList.jsp');\">\n");
      out.write("                                        视频管理\n");
      out.write("                                    </a>\n");
      out.write("                                </li>\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"javascript:;\" onclick=\"gotoUrl('../views/commodityList.jsp');\">\n");
      out.write("                                        商品管理\n");
      out.write("                                    </a>\n");
      out.write("                                </li>\n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<li class=\"leftli\">\n");
      out.write("                            <a href=\"javascript:;\">\n");
      out.write("                                <i class=\"fa fa-user icon-home icon-black\"></i><span class=\"title\"> 发布管理 </span>\n");
      out.write("                                <!-- <span class=\"arrow \"> </span> -->\n");
      out.write("                            </a>\n");
      out.write("                            <ul class=\"sub-menu categoryList\">\n");
      out.write("                                <li><a href=\"javascript:;\" onclick=\"gotoUrl('../views/videoPublishList.jsp?parent=062b6a49-5332-430a-a91d-1faf040a1c07');\">新品发布</a></li>\n");
      out.write("     \n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("\n");
      out.write("                        <li class=\"leftli\">\n");
      out.write("                            <a href=\"javascript:;\">\n");
      out.write("                                <i class=\"fa fa-user icon-home icon-black\"></i><span class=\"title\"> 个人中心 </span>\n");
      out.write("                                <!-- <span class=\"arrow \"> </span> -->\n");
      out.write("                            </a>\n");
      out.write("                            <ul class=\"sub-menu\">\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"javascript:;\">\n");
      out.write("                                        信息修改\n");
      out.write("                                    </a>\n");
      out.write("                                </li>\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"javascript:;\">\n");
      out.write("                                        密码修改\n");
      out.write("                                    </a>\n");
      out.write("                                </li>\n");
      out.write("                                \n");
      out.write("     \n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("\n");
      out.write("                    </ul>\n");
      out.write("                    <!-- END SIDEBAR MENU -->\n");
      out.write("                </div>\n");
      out.write("            </div>");
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
