<%-- 
    Document   : successregistration
    Created on : 14-Dec-2017, 13:09:42
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="<c:url value="/resources/css/bootstrap.css" />" rel="stylesheet">
    </head>
    <body>
        <jsp:include page="head.jsp"/> 
        <div class="container">
            <h1>Registrasi berhasil</h1>
            ${data.firstName} ${data.lastName}
            <p>
                <a class="btn btn-primary" href="${pageContext.request.contextPath}/login">Please Login</a>
            </p>
        </div>
    </body>
</html>
