<%-- 
    Document   : login
    Created on : 14-Dec-2017, 13:03:00
    Author     : user
--%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
        <link href="<c:url value="/resources/css/bootstrap.css" />" rel="stylesheet">
        <link href="<c:url value="/resources/css/login.css" />" rel="stylesheet">
    </head>
    <body>
        <jsp:include page="head.jsp"/> 
        <div class="container">

            <b>${errMsg}</b>
            <div class="card card-container">
                <img id="profile-img" class="profile-img-card" src="${pageContext.request.contextPath}/resources/img/user.png" />
                <p id="profile-name" class="profile-name-card"></p>
                <div class="form-signin">
      
                
                <div class="panel-body">
                    <form:form action="${pageContext.request.contextPath}/login/check" modelAttribute="loginBean" method="POST" >
                    
                            
                               <form:input path="username" class="form-control" placeholder="User name" />
                           
                               <form:password path="password" class="form-control" placeholder="Password" />
                           <form:button class="btn btn-lg btn-primary btn-block btn-signin" name="submitButton" value="Submit">Sign in</form:button>
                                    <a class="btn btn-lg btn-primary btn-block btn-signin" href="${pageContext.request.contextPath}/register">Sign up</a> 
                               
                    </form:form>
                </div>
            </div>

        </div>
    </body>
</html>
