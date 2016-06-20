package org.apache.jsp.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class commodityList_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>商品列表</title>\r\n");
      out.write("\r\n");
      out.write("<link href=\"../assets/css/style.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<link href=\"../assets/css/themes/light.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<link href=\"../assets/css/style-responsive.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<link href=\"../assets/css/colorbox.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("<link href=\"../assets/css/jquery-ui.css\" rel=\"stylesheet\" type=\"text/css\" >\r\n");
      out.write("<link href=\"../assets/plugins/bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<link rel=\"stylesheet\" href=\"../assets/css/ui-dialog.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"../assets/css/searchbox.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"../assets/css/main.css\" type=\"text/css\"/>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"../assets/css/simplePagination.css\" type=\"text/css\"/>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"../assets/css/columLists.css\" type=\"text/css\"/>\r\n");
      out.write("\r\n");
      out.write("<script src=\"../assets/plugins/jquery-2.2.4.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"../assets/plugins/bootstrap/js/bootstrap.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"../assets/plugins/jquery.cokie.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"../assets/scripts/app.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"../app/js/index.js\"></script>\r\n");
      out.write("<script src=\"../assets/plugins/jquery-ui.js\"></script>\r\n");
      out.write("<script src=\"../assets/plugins/url.min.js\"></script>\r\n");
      out.write("<script src=\"../assets/plugins/jquery.colorbox.js\"></script>\r\n");
      out.write("<script src=\"../assets/plugins/dialog-min.js\"></script>\r\n");
      out.write("<script src=\"../assets/plugins/jquery.simplePagination.js\"></script>\r\n");
      out.write("<script src=\"../assets/plugins/jsrender.min.js\"></script>\r\n");
      out.write("<script src=\"../assets/plugins/underscore-min.js\"></script>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("button.btn{ margin-top:24px;}\r\n");
      out.write(".btn{ border:none;}\r\n");
      out.write(".content{ padding-bottom:100px;}\r\n");
      out.write(".content p.title{ color:#428bca; font-size:15px;font-weight:bold;margin:10px 0px;}\r\n");
      out.write("hr{border-top:2px solid #adb5bb;margin:10px 0px;}\r\n");
      out.write(".statusbar{ margin-top:20px;font-weight:bolder;}\r\n");
      out.write(".statusbar a.filterStatus{ display:inline-block; margin:0px; padding:10px 15px;color:#9c9c9c; cursor:pointer; border:1px solid #ccc;border-radius:3px;}\r\n");
      out.write(".statusbar a.light{ background:#ff6525; color:#f0f0f0;}\r\n");
      out.write("td{vertical-align:middle !important;}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script id=\"queboxTpl\" type=\"text/template\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"auto\"><img src=\"../{{:coverURL}}\" style=\"max-width:90%;max-height:200px;\"></td>\r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"auto\">{{:name}}</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"auto\">{{:originalPrice}}</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"auto\">{{:price}}</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"auto\">{{:creator}}</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"auto\">{{:createtimeCN}}</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"320px\">\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"../views/commodityEdit.jsp?id={{:id}}\" data-fancybox-type=\"iframe\" class=\"btn btn-primary btn-edit\" style=\"margin-top:0;\">编辑</a>\r\n");
      out.write("\t\t\t\t\t\t\t<button onclick=\"changeStatus(this)\" data-id=\"{{:id}}\" data-url=\"../rest/commodity/remove?id={{:id}}\" class=\"btn btn-primary\" style=\"margin-top:0;\">删除</button>\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("</script>\r\n");
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
      out.write("                   \r\n");
      out.write("                    <!-- END STYLE CUSTOMIZER -->\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<!--content-->\r\n");
      out.write("\t\t\t\t\t\t<div class=\"content\">\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<p class=\"title\">商品管理</p>\r\n");
      out.write("\t\t\t\t\t\t\t<hr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<a class=\"btn-create btn\" href=\"../views/commodityAdd.jsp\" style=\"margin-top:0px;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t添加商品\r\n");
      out.write("\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<!--搜索框-->\r\n");
      out.write("\t\t\t\t\t\t\t<div id=\"searchbox\" class=\"searchbox\" style=\"right:50px;top:100px\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<form class=\"search search_form\" id=\"searchForm\" action=\"#\" method=\"POST\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<fieldset>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<label for=\"searchheader\" class=\"placeholder overlabel\">商品名称</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input autocomplete=\"off\" id=\"searchheader\" value=\"\" type=\"text\" name=\"q\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"hidden\" name=\"\" value=\"\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"show_dropdown\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"dropdown\" style=\"display: block;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<li><label for=\"type_name\">按商品名称</label><input type=\"radio\" id=\"type_name\" name=\"stype\" value=\"name\" checked=\"checked\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"bl\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"br\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<button type=\"submit\" id=\"searchBtn\" class=\"search-button\"><i class=\"glyphicon glyphicon-search icon-white\"></i></button>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</fieldset>\r\n");
      out.write("\t\t\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("<!-- \t\t\t\t\t\t\t<div class=\"statusbar\"> -->\r\n");
      out.write("<!-- \t\t\t\t\t\t\t\t<a class=\"filterStatus light\">未审核 (<span id=\"status_unchecked\" name=\"unchecked\">0</span>)</a> -->\r\n");
      out.write("<!-- \t\t\t\t\t\t\t\t<a class=\"filterStatus\">已审核 (<span id=\"status_checked\" name=\"checked\">0</span>)</a> -->\r\n");
      out.write("<!-- \t\t\t\t\t\t\t\t<a class=\"filterStatus\">处理中 (<span id=\"status_transcoding\" name=\"transcoding\">0</span>)</a> -->\r\n");
      out.write("<!-- \t\t\t\t\t\t\t\t<a class=\"filterStatus\">处理失败 (<span id=\"status_failed\" name=\"failed\">0</span>)</a> -->\r\n");
      out.write("<!-- \t\t\t\t\t\t\t\t<a class=\"filterStatus\">已删除 (<span id=\"status_deleted\" name=\"deleted\">0</span>)</a> -->\r\n");
      out.write("<!-- \t\t\t\t\t\t\t\t<input type=\"hidden\" id=\"statusChecked\" value=\"unchecked\"> -->\r\n");
      out.write("<!-- \t\t\t\t\t\t\t</div> -->\r\n");
      out.write("\t\t\t\t\t\t\t<div id=\"\" class=\"list-item\" style=\"font-size:16px\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"list-item-hd\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<table class=\"table table-bordered\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<thead>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td width=\"15%\"><span class=\"text-primary\">封面</span></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td width=\"25%\"><span class=\"text-primary\">商品名称</span></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td width=\"10%\"><span class=\"text-primary\">原价</span></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td width=\"10%\"><span class=\"text-primary\">销售价格</span></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td width=\"10%\"><span class=\"text-primary\">创建人</span></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td width=\"10%\"><span class=\"text-primary\">创建时间</span></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td width=\"20%\"><span class=\"text-primary\">操作</span></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</thead>\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tbody id=\"queboxCnt\"></tbody>\r\n");
      out.write("<!-- \t\t\t\t\t\t\t\t\t<div id=\"queboxCnt\"></div> -->\r\n");
      out.write("\t\t\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"pull-right pagination  compact-theme\" id=\"pagnationPaper\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t\t\tvar pagenum = '1';\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\tfunction changeStatus(t) {\r\n");
      out.write("\t\t\t\t\tvar obj = $(t),cUrl = obj.attr('data-url');\r\n");
      out.write("\t\t\t\t\t$.getJSON(cUrl, function(ret) {\r\n");
      out.write("\t\t\t\t\t\tif (ret.status == 'success') {\r\n");
      out.write("\t\t\t\t\t\t\tgetList();\r\n");
      out.write("\t\t\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t\t\talert('失败,' + ret.message);\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t})\r\n");
      out.write("\t\t\t\t\treturn false;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t$('#searchForm').submit(function(){\r\n");
      out.write("\t\t\t\t\tvar key = $('input[name=\"stype\"]:checked').val(),obj = {};\r\n");
      out.write("\t\t\t\t\tobj[key] = $('#searchheader').val();\r\n");
      out.write("\t\t\t\t\tvar str = '&'+key+'='+obj[key];\r\n");
      out.write("\t\t\t\t\tgetList(str);\r\n");
      out.write("\t\t\t\t\treturn false;\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t//加载列表\r\n");
      out.write("\t\t\t\tfunction getList(params) {\r\n");
      out.write("\t\t\t\t\tif (params == undefined){\r\n");
      out.write("\t\t\t\t\t\tparams = '';\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\tvar page = (typeof pagenum == 'undefined') ? 1 : pagenum;\r\n");
      out.write("\t\t\t\t\tvar d = dialog({\r\n");
      out.write("\t\t\t\t\t    title: '系统提示',\r\n");
      out.write("\t\t\t\t\t\twidth : 320,\r\n");
      out.write("\t\t\t\t\t    content: '加载中...'\r\n");
      out.write("\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\td.showModal();\r\n");
      out.write("// \t\t\t\t\t$.getJSON('../rest/videoinfo/statusList',function(r) {\r\n");
      out.write("// \t\t\t\t\t\tif(r.status == 'success') {\r\n");
      out.write("// \t\t\t\t\t\t\t$('#status_checked').html(r.data.checked);\r\n");
      out.write("// \t\t\t\t\t\t\t$('#status_unchecked').html(r.data.unchecked);\r\n");
      out.write("// \t\t\t\t\t\t\t$('#status_deleted').html(r.data.deleted);\r\n");
      out.write("// \t\t\t\t\t\t\t$('#status_failed').html(r.data.failed);\r\n");
      out.write("// \t\t\t\t\t\t\t$('#status_transcoding').html(r.data.transcoding);\r\n");
      out.write("// \t\t\t\t\t\t}\r\n");
      out.write("// \t\t\t\t\t});\r\n");
      out.write("// \t\t\t\t\tvar filterStatus= $(\"#statusChecked\").val();\r\n");
      out.write("\t\t\t\t\t$.getJSON('../rest/commodity/all?pagesize=10&sorts=createtime desc'+params+'&pagenum='+page, function(r) {\r\n");
      out.write("\t\t\t\t\t\tr.totalPageCount && $('.quepager').html('<span style=\"font-weight:normal\">'+ r.pageNum +'</span>/'+ r.totalPageCount);\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\tif(r.status == 'success' && r.data.length > 0) {\r\n");
      out.write("\t\t\t\t\t\t    var template = $.templates('#queboxTpl');\r\n");
      out.write("\t\t\t\t\t\t    var html = template.render(r.data);\r\n");
      out.write("\t\t\t\t\t\t    $('#queboxCnt').html(html);\r\n");
      out.write("\t\t\t\t\t\t    \r\n");
      out.write("\t\t\t\t\t\t    $(\".btn-edit\").colorbox({\r\n");
      out.write("\t\t\t\t\t\t\t\tiframe : true,\r\n");
      out.write("\t\t\t\t\t\t\t\twidth : \"860px\",\r\n");
      out.write("\t\t\t\t\t\t\t\theight : \"700px\",\r\n");
      out.write("\t\t\t\t\t\t\t\topacity : '0.5',\r\n");
      out.write("\t\t\t\t\t\t\t\toverlayClose : false,\r\n");
      out.write("\t\t\t\t\t\t\t\tescKey : true\r\n");
      out.write("\t\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t\t    \r\n");
      out.write("\t\t\t\t\t\t} else if (r.status == 'success' && r.data.length == 0) {\r\n");
      out.write("\t\t\t\t\t\t\t$('#pagnationPaper').html('');\r\n");
      out.write("\t\t\t\t\t\t\t$('#queboxCnt').html('<div class=\"no_data\">无搜索结果</div>');\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t$(\".main\").animate({scrollTop: 0}, 1e3);\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\td.close().remove();\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t}).done(function(r){//分页\r\n");
      out.write("\t\t\t\t\t\t$('#pagnationPaper').pagination({\r\n");
      out.write("\t\t\t\t\t\t\tcurrentPage : r.pageNum,\r\n");
      out.write("\t\t\t\t\t        items: r.totalResultCount,\r\n");
      out.write("\t\t\t\t\t\t\tedges: 3,\r\n");
      out.write("\t\t\t\t\t        itemsOnPage : r.pageSize,\r\n");
      out.write("\t\t\t\t\t        \r\n");
      out.write("\t\t\t\t\t\t\tonPageClick : function(pageNumber,event) {\r\n");
      out.write("\t\t\t\t\t\t\t\tpagenum = pageNumber;\r\n");
      out.write("\t\t\t\t\t\t\t\tgetList();\r\n");
      out.write("\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t    });\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t$(function(){\r\n");
      out.write("\t\t\t\t\tfunction init() {\r\n");
      out.write("\t\t\t\t\t\tgetList();\r\n");
      out.write("\t\t\t\t\t};\r\n");
      out.write("\t\t\t\t\tinit();\r\n");
      out.write("\t\t\t\t\t$(\".statusbar a\").click(function(){\r\n");
      out.write("\t\t\t\t\t\t$(this).addClass(\"light\").siblings().removeClass(\"light\");\r\n");
      out.write("\t\t\t\t\t\t$(\"#statusChecked\").val($(this).find(\"span\").attr(\"name\"));\r\n");
      out.write("\t\t\t\t\t\tpagenum = '1';\r\n");
      out.write("\t\t\t\t\t\tsetTimeout(\"getList()\",100);\r\n");
      out.write("\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t})\r\n");
      out.write("\t\t\t\t</script>\r\n");
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
      out.write("\t</div>\r\n");
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
