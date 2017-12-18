<%-- 
    Document   : successlogin
    Created on : 14-Dec-2017, 13:08:38
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login sukses Page</title>
         <link href="<c:url value="/resources/css/bootstrap.css" />" rel="stylesheet">
    </head>
    <body>
         <jsp:include page="head.jsp"/> 
        <div class="container">
            <h1>${user.username}, Anda berhasil Login</h1>
            <a class="btn btn-primary" href="${pageContext.request.contextPath}/welcome">Lanjutan Berbelanja</a> 
        </div>
    </body>
</html>
