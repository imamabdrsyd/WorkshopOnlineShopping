<%-- 
    Document   : registration
    Created on : 14-Dec-2017, 13:07:03
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>regis Page</title>
        <link href="<c:url value="/resources/css/bootstrap.css" />" rel="stylesheet">
        <link href="<c:url value="/resources/css/login.css" />" rel="stylesheet">
    </head>
    <body>
          <jsp:include page="head.jsp"/> 
        <div class="card card-container">
            <div class="form form-signin">
                <div class="panel-heading" align="center">
                    Registration Form
                </div>
                <div class="panel-body">
                    <form:form action="register/save" modelAttribute="registerBean" method="POST" >
                        <form:input path="firstName" class="form-control" placeholder="First Name"/>
                        <form:input path="lastName" class="form-control" placeholder="Last Name"/>
                        <form:input path="tlp" class="form-control" placeholder="No.Tlp"/>
                        <form:input path="email" class="form-control" placeholder="E-Mail"/>
                        <form:input path="username" class="form-control" placeholder="User Name"/>
                        <form:password path="password" class="form-control" placeholder="Password"/>
                        <form:button class="btn btn-primary" name="submitButton" value="Submit">Submit</form:button>         

                    </form:form>
                </div>
            </div>
        </div>
    </body>
</html>
