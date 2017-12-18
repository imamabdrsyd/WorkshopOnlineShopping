<%-- 
    Document   : product
    Created on : 15-Dec-2017, 09:18:15
    Author     : user
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Product Page</title>
    </head>
    <body>
       <jsp:include page="head.jsp"/>  
      
       <h1>Product</h1>
       <div class="w3-row-padding w3-padding-16 w3-center" id="main">
        <table border="1">
            <tr>    
                <td>No</td>
                <td>Product Name</td>
                <td>Cost</td>
                <td>Kategori</td>
            </tr>
            <c:forEach var="p" items="${products}" varStatus="i">
            <tr>    
                <td>${i.count}</td>
                <td>${p.description}</td>
                <td>${p.cost}</td>
                <td>${p.kategori}</td>
            </tr>
            </c:forEach>
        </table>
       </div>
    </body>
</html>
