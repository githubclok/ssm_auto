<!-- 这是什么 -->
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>SSM@SGG</title>
        <%
            pageContext.setAttribute("APP_PATH", request.getContextPath());
        %>
        <!-- 引入样式 -->
        <!-- jQuery (Bootstrap 的所有 JavaScript 插件都依赖 jQuery，所以必须放在前边) -->
        <script type="text/javascript" src="${APP_PATH}/static/js/jquery-1.12.4.min.js"></script>
        <!-- Bootstrap -->
        <link href="${APP_PATH}/static/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
        <!-- 加载 Bootstrap 的所有 JavaScript 插件。你也可以根据需要只加载单个插件。 -->
        <script src="${APP_PATH}/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
    </head>
    <body>
<%--        <h1>Hello World!</h1>--%>
<%--        <h1>SSM框架搭建 @ 尚硅谷</h1>--%>
    <button>按钮</button>
    </body>
</html>
