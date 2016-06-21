package org.apache.jsp.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class videoAdd_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=UTF-8");
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>上传视频</title>\r\n");
      out.write("<link href=\"../assets/plugins/bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<link href=\"../assets/css/style.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<link href=\"../assets/css/themes/light.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<link href=\"../assets/css/style-responsive.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<link href=\"../assets/css/colorbox.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("<link href=\"../assets/css/jquery-ui.css\" rel=\"stylesheet\" type=\"text/css\" >\r\n");
      out.write("<link rel=\"stylesheet\" href=\"../assets/css/uploadfile.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"../assets/css/bootstrap2.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"../assets/css/main.css\" type=\"text/css\"/>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"../assets/css/columLists.css\" type=\"text/css\"/>\r\n");
      out.write("\r\n");
      out.write("<script src=\"../assets/plugins/jquery-2.2.4.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"../assets/plugins/bootstrap/js/bootstrap.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"../assets/plugins/jquery.cokie.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"../assets/scripts/app.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"../app/js/index.js\"></script>\r\n");
      out.write("<script src=\"../assets/plugins/jquery-ui.js\"></script>\r\n");
      out.write("<script src=\"../assets/plugins/url.min.js\"></script>\r\n");
      out.write("<script src=\"../assets/plugins/jquery.uploadfile.video.js\"></script>\r\n");
      out.write("<script src=\"../assets/plugins/layer-v2.2/layer/layer.js\" type=\"text/javascript\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<!--head-->\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\r\n");
      out.write("\t\t<!--head end-->\r\n");
      out.write("\t\t<div class=\"clearfix\"></div>\r\n");
      out.write("\t\t<!--left-->\r\n");
      out.write("\t\t\t<div class=\"page-container\">\r\n");
      out.write("            <!-- BEGIN SIDEBAR -->\r\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "left_admin.jsp", out, false);
      out.write("\r\n");
      out.write("            <!-- END SIDEBAR -->\r\n");
      out.write("            <!-- BEGIN CONTENT -->\r\n");
      out.write("            <div class=\"page-content-wrapper\">\r\n");
      out.write("                <div class=\"page-content\">\r\n");
      out.write("                    <!-- BEGIN SAMPLE PORTLET CONFIGURATION MODAL FORM-->\r\n");
      out.write("                    <div class=\"modal fade\" id=\"portlet-config\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"myModalLabel\" aria-hidden=\"true\">\r\n");
      out.write("                        <div class=\"modal-dialog\">\r\n");
      out.write("                            <div class=\"modal-content\">\r\n");
      out.write("                                <div class=\"modal-header\">\r\n");
      out.write("                                    <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-hidden=\"true\"></button>\r\n");
      out.write("                                    <h4 class=\"modal-title\">Modal title</h4>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"modal-body\">\r\n");
      out.write("                                    Widget settings form goes here\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"modal-footer\">\r\n");
      out.write("                                    <button type=\"button\" class=\"btn blue\">\r\n");
      out.write("                                        Save changes\r\n");
      out.write("                                    </button>\r\n");
      out.write("                                    <button type=\"button\" class=\"btn default\" data-dismiss=\"modal\">\r\n");
      out.write("                                        Close\r\n");
      out.write("                                    </button>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <!-- /.modal-content -->\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <!-- /.modal-dialog -->\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <!-- /.modal -->\r\n");
      out.write("                    <!-- END SAMPLE PORTLET CONFIGURATION MODAL FORM-->\r\n");
      out.write("                    <!-- BEGIN STYLE CUSTOMIZER -->\r\n");
      out.write("                    \r\n");
      out.write("                    <!-- END STYLE CUSTOMIZER -->\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<!--content-->\r\n");
      out.write("\t\t\t\t\t\t<div class=\"content\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"ifrcnt container\" style=\"width:100%\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"bd\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t <div class=\"alert alert-danger\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tstyle=\"display: none; margin: 0 15px 15px;\"></div> \r\n");
      out.write("\t\t\t\t\t\t\t\t\t<form id=\"formsubmit\" class=\"form-horizontal\" role=\"form\" action=\"#\" method=\"post\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"clearfix\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div id=\"HtmlTpl\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"control-group\" id=\"uploadcon\" style=\"border:2px dotted #A5A5C7\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"controls\"style=\"text-align:center;margin-left: 0px\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div id=\"resourceId\"><span>&nbsp;上传视频&nbsp;&nbsp;</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<span id=\"i1\"></span><span id=\"i2\" style=\"padding-left:20%;padding-right:20%\"></span><span id=\"i3\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div id=\"resourceAdd\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"control-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<label class=\"control-label\" for=\"\">标题</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"controls\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" id=\"\" name=\"title\" value=\"\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"control-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<label class=\"control-label\" for=\"\">标签</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"controls\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" id=\"\" name=\"tag\" value=\"\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"control-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<label class=\"control-label\" for=\"\">描述</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"controls\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<textarea id=\"\" name=\"context\" rows=\"3\"></textarea>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"control-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<label class=\"control-label\" for=\"\">来源</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"controls\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" id=\"\" name=\"source\" value=\"\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"control-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<label class=\"control-label\" for=\"\">版权方</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"controls\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" id=\"\" name=\"copyright\" value=\"\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"control-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<label class=\"control-label\" for=\"\">作者</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"controls\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" id=\"\" name=\"author\" value=\"\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"row actionbar\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"offset7\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<button class=\"btn btn-single\" type=\"submit\" onclick=\"buttonType=0\">确定</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<button id=\"colorboxcancel\" onclick=\"backToList();\" class=\"btn btn-default\" type=\"button\">返回</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<button class=\"btn btn-single\" type=\"submit\" onclick=\"buttonType=1\">继续添加</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<script>\r\n");
      out.write("\t\t\t\t\t\t\tvar buttonType;\r\n");
      out.write("\t\t\t\t\t\t\tfunction backToList(){\r\n");
      out.write("\t\t\t\t\t\t\t\twindow.location.href=\"../views/videoList.jsp\";\r\n");
      out.write("\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t$(function() {\r\n");
      out.write("\t\t\t\t\t\t\t\t$('#formsubmit').submit(function() {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t$('.btn-single').attr(\"disabled\",true);\r\n");
      out.write("\t\t\t\t\t\t\t\t\tvar str = $(this).serialize();\r\n");
      out.write("\t\t\t\t\t\t\t\t\t$.post('../rest/videoinfo/add?' + str, function(data) {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tif (data.status == \"success\") {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tif(buttonType==1){\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\twindow.top.location.reload(true);\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tlayer.msg(\"添加成功！\");\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\twindow.location.href=\"../views/videoList.jsp\";\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tlayer.msg(\"添加成功！\");\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t$('.alert-danger').html(data.message).show();\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t$('.btn-single').attr(\"disabled\",false);\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t})\r\n");
      out.write("\t\t\t\t\t\t\t\t\treturn false;\r\n");
      out.write("\t\t\t\t\t\t\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t//项目类型 helper 函数\r\n");
      out.write("\t\t\t\t\t\t\t\t$(document).on(\"click\", function(e) {\r\n");
      out.write("\t\t\t\t\t\t\t\t\tif (!$(e.target).parents().is('.ufc')) {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t$('.uul').hide();\r\n");
      out.write("\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\tif(!$(e.target).parent().is('#bido') && !$(e.target).is('#clId') && !$(e.target).parent().is('.listnode')){\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t$('#clListBox').hide();\r\n");
      out.write("\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t$(\"#resourceId\").uploadFile({\r\n");
      out.write("\t\t\t\t\t\t\t\turl:\"../front/admin/resource!execute?uid=b0001\",\r\n");
      out.write("\t\t\t\t\t\t\t\tallowedTypes:\"mp4,avi,mov,3gp,flv,wmv,rmvb,zip\",\r\n");
      out.write("\t\t\t\t\t\t\t\tmaxFileSize:1024*1024*1024*10,\r\n");
      out.write("\t\t\t\t\t\t\t\tfileName:\"video\",\r\n");
      out.write("\t\t\t\t\t\t\t\tmaxFileCount : 1,\r\n");
      out.write("\t\t\t\t\t\t\t\tdragDropStr: \"\",\r\n");
      out.write("\t\t\t\t\t\t\t\textErrorStr:\"文件格式不正确，请以下类型的视频文件：\",\r\n");
      out.write("\t\t\t\t\t\t\t\tshowStatusAfterSuccess:false,\r\n");
      out.write("\t\t\t\t\t\t\t\tshowDelete : false,\r\n");
      out.write("\t\t\t\t\t\t\t\tshowProgress: true,\r\n");
      out.write("\t\t\t\t\t\t\t\tdeletelStr : '删除',\r\n");
      out.write("\t\t\t\t\t\t\t\tshowAbort:false,\r\n");
      out.write("\t\t\t\t\t\t\t\tonSuccess:function(files,data,xhr)\r\n");
      out.write("\t\t\t\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\t\t\t\tif(data.status == 'success'){\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tif($('input[name=\"id\"]').length > 0) {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t$('input[name=\"id\"]').val(data.data.id);\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t}else {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t$(\"#resourceAdd\").append('<input type=\"hidden\" name=\"originalVideo\" value=\"' + data.data.id + '\">');\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tlayer.msg(\"上传成功！\");\r\n");
      out.write("\t\t\t\t\t\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t$('.alert-danger').html(data.message).show();\r\n");
      out.write("\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t\t\t</script>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<!--content end-->\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- END CONTENT -->\r\n");
      out.write("        </div>\r\n");
      out.write("\t\t<!--left end-->\r\n");
      out.write("\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
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
