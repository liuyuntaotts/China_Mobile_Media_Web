<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE html>
<html>
    <head>
        <base href="<%=basePath%>">
        <meta charset="UTF-8">
        <title></title>
        <link rel="stylesheet" type="text/css" href="assets/plugins/bootstrap/css/bootstrap.css"/>
    </head>
    <body>

        <script src="assets/plugins/jquery/jquery-2.2.4.js" type="text/javascript" charset="utf-8"></script>
        <script src="assets/plugins/bootstrap/js/bootstrap.js" type="text/javascript" charset="utf-8"></script>
        <script src="" type="text/javascript" charset="utf-8"></script>
    </body>
</html>