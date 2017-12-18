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
          <style>
           .header{background-color: #4CAF50;
    color: white;}
            tr, td {
    padding: 15px;
    text-align: left;
}   
        #cart {
    font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;
    border-collapse: collapse;
    width: 100%;
}

#cart td, #cart th {
    border: 1px solid #ddd;
    padding: 8px;
}

#cart tr:nth-child(even){background-color: #f2f2f2;}

#cart tr:hover {background-color: #ddd;}

#cart th {
    padding-top: 12px;
    padding-bottom: 12px;
    text-align: left;
    background-color: #4CAF50;
    color: white;
}
body{
    margin: 70px;
}
        </style>
    </head>
    <body>x
        <jsp:include page="head.jsp"/></br>
        <h2>Cart summary</h2>
  <table border="1" id="cart">
            <tr class="header">
                <td>NO</td><td>Nama Product</td><td>Harga</td><td>Edit</td>
            </tr> 
            <c:forEach var="c" items="${cart.cartList}" varStatus="x">
             <tr>        
                <td>${x.count}</td> 
                <td>${c.value.description}</td>
                <td>Rp.${c.value.cost}</td>
                <td><a href="${pageContext.request.contextPath}/product/remove/${c.key}" class="btn btn-primary">Hapus dari keranjang</a></td>          
        </c:forEach>
  </table>
         <p><h3>total:Rp.${hargaTotal}</h3></p></br> 
    <a href="${pageContext.request.contextPath}/product/checkout" class="btn btn-primary"> Beli Sekarang</a>
    </body>
</html>
