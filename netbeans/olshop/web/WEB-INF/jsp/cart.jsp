<%-- 
    Document   : cart
    Created on : 16-Dec-2017, 15:17:30
    Author     : user
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cart Page</title>
    </head>
    <body>
        <jsp:include page="head.jsp"/>
        <c:forEach var="c" items="${cart.cartList.values()}">
                   <div class="w3-row-padding w3-padding-16 w3-center" id="main"> 
                    <div class="w3-quarter">
                        <div><img src="${pageContext.request.contextPath}/<c:url value="resources/img/${c.imagepath}"/>" style="width:50%"></div>
                       <label>Product Name: ${c.description}</label></br>
                    <label>Harga: ${c.cost}</label></br>
                    
                    <div><a href="${pageContext.request.contextPath}/product/remove/${c.productId}}" class="btn btn-primary">Hapus dari keranjang</a></div>
                   </div>
                   </div>
                   
        </c:forEach>
    </body>
</html>
