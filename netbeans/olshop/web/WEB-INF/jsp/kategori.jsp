<%-- 
    Document   : kategori
    Created on : 15-Dec-2017, 09:59:41
    Author     : user
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Kategori Page</title>
    </head>
    <body>

       <jsp:include page="head.jsp"/>
       
       <c:forEach var="p" items="${kateg}" > 
          <div class="w3-row-padding w3-padding-16 w3-center" id="main">
                <div class="w3-quarter">
                    <div><img src="${pageContext.request.contextPath}/<c:url value="resources/img/${p.imagepath}"/>" style="width:50%"></div>
                    <a href="${pageContext.request.contextPath}/product/${p.productId}"><h3>${p.description}</h3></a>
                    <p>${p.cost}</p>
                    <p>${p.kategori}</p>
                    <c:if test="${not empty sessionScope.user}">
                    <a href="${pageContext.request.contextPath}/product/addcart/${p.productId}" class="btn btn-primary">tambah ke keranjang</a>
                    </c:if>
                    </div>  
          </div>
            </c:forEach>
          
    </body>
</html>
