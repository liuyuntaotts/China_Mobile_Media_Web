package org.apache.jsp.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class categoryList_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>栏目列表</title>\r\n");
      out.write("\r\n");
      out.write("<link href=\"../assets/css/style.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<link href=\"../assets/css/themes/light.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<link href=\"../assets/css/style-responsive.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<link href=\"../assets/css/colorbox.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("<link href=\"../assets/css/jquery-ui.css\" rel=\"stylesheet\" type=\"text/css\" >\r\n");
      out.write("<link href=\"../assets/css/metro/blue/jtable.css\" rel=\"stylesheet\" type=\"text/css\" >\r\n");
      out.write("<link href=\"../assets/plugins/bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<link rel=\"stylesheet\" href=\"../assets/css/columLists.css\" type=\"text/css\"/>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"../assets/css/main.css\" type=\"text/css\"/>\r\n");
      out.write("\r\n");
      out.write("<script src=\"../assets/plugins/jquery-2.2.4.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"../assets/plugins/bootstrap/js/bootstrap.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"../assets/plugins/jquery.cokie.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"../assets/scripts/app.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"../app/js/index.js\"></script>\r\n");
      out.write("<script src=\"../assets/plugins/jquery-ui.js\"></script>\r\n");
      out.write("<script src=\"../assets/plugins/jquery.jtable.js\"></script>\r\n");
      out.write("<script src=\"../assets/plugins/jquery.jtable.zh-CN.js\"></script>\r\n");
      out.write("<script src=\"../assets/plugins/url.min.js\"></script>\r\n");
      out.write("<script src=\"../assets/plugins/jquery.colorbox.js\"></script>\r\n");
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
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<div class=\"content\">\t\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"cui-menu\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<button class=\"btn-create btn\" type=\"button\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t添加栏目\r\n");
      out.write("\t\t\t\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<div id=\"TableContainer\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t\t\t\t\t\t\t$(document).ready(\r\n");
      out.write("\t\t\t\t\t\t\t\t\tfunction() {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tvar parent = (url('?parent') != null) ? url('?parent') : '';\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tvar level = (url('?level') != null) ? '' : 1; \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tvar navarr = []; \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t$.get('../front/admin/category!execute?uid=a0006&parent='+parent,function(r) {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tif(r.status =='success') {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tfor ( var i = 0, l = r.data.length; i < l; i++ ) {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t    var navhtml = ' &gt; <a href=\"../views/categoryList.jsp?parent='+ r.data[i].id +'&level='+r.data[i].level +'\">'+ r.data[i].name +'</a>';\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tnavarr.push(navhtml);\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t}).done(function(){\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t$('#TableContainer')\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t.jtable(\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\ttitle : '<a href=\"../views/categoryList.jsp\">栏目管理</a> '+ navarr.join(''),\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tmessages : zhCN, //Lozalize\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tpaging : true, //Enable paging\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tpageSize : 10, //Set page size (default: 10)\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tpageSizes : [ 10, 20, 30, 40, 50 ],\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tsorting : true, //Enable sorting\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tdefaultSorting : 'scode ASC', //Set default sorting\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tdialogShowEffect : 'drop',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\taddRecordButton : $('.btn-create'),\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tactions : {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tlistAction : '../front/admin/category!execute?uid=a0001&parent='+ parent +'&level='+level,\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tupdateAction : '../front/admin/category!execute?uid=a0004',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tdeleteAction :'../rest/category/remove',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tcreateAction : '../rest/category/add?parent='+ parent\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tfields : {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tid : {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\ttitle : '',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tkey : true,\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\twidth:'0%',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tlist:false\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tscode : {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\ttitle : '序号',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tedit: false,\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t                    create: false,\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\twidth:'5%'\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tname : {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\ttitle : '栏目名称',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\twidth: '8%',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\toptionsSorting : 'value'\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tstatus: {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\ttitle: '状态',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\toptions : {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'normal' : '正常',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'stopped' : '停用'\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tdefaultValue : 'normal'\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\taddviewchild: {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t                    title: '操作',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t                    width: '10%',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t                    sorting: false,\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t                    edit: false,\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t                    create: false,\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t                    display: function (data) {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tvar html ='<a href=\"../views/categoryList.jsp?parent=' + data.record.id+'&level='+data.record.level +'\">管理下级栏目</a>';\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\treturn html;\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tcolumnResizable : false,\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tdeleteConfirmation: function(data) {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t  data.deleteConfirmMessage = '确定要停用个栏目?';\r\n");
      out.write("// \t\t\t\t\t\t\t\t\t\t\t\t\t\t\t  $('#DeleteDialogButton').html('停用');\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tformClosed : function(event,data) {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\trecordsLoaded :function (data) {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t//删除按钮改成停用\r\n");
      out.write("// \t\t\t\t\t\t\t\t\t\t\t\t\t\t\t    $('#'+data.target.id).find('.jtable-delete-command-button').each(function(){\r\n");
      out.write("// \t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t$(this).attr('title','停用');\r\n");
      out.write("// \t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t$(this).find('span').text('停用');\r\n");
      out.write("// \t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t})  \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t$('#TableContainer').jtable('load');\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t\t\t\t})\r\n");
      out.write("\t\t\t\t</script>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\r\n");
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
