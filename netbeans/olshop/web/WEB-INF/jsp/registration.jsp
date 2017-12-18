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
    </head>
    <body>
          <jsp:include page="head.jsp"/> 
        <div class="container">
            <div class="panel panel-info">
                <div class="panel-heading">
                    Registration Form
                </div>
                <div class="panel-body">
                    <form:form action="register/save" modelAttribute="registerBean" method="POST" >
                        <form:label path="firstName">First Name</form:label>
                                <form:input path="firstName" class="form-control"/>
                            <form:label path="lastName">Last Name</form:label>
                                    <form:input path="lastName" class="form-control"/>
                            <form:label path="tlp">No. Telpon</form:label>
                                <form:input path="tlp" class="form-control"/>
                       <form:label path="email">E-mail</form:label>
                             <form:input path="email" class="form-control"/>
                          <form:label path="username">Username</form:label>
                               <form:input path="username" class="form-control"/>
                           <form:label path="password">Password</form:label>
                              <form:password path="password" class="form-control"/>
                          <form:button class="btn btn-primary" name="submitButton" value="Submit">Submit</form:button>         
                                      
                    </form:form>
                </div>
            </div>
        </div>
    </body>
</html>
