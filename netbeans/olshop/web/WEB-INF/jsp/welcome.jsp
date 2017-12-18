<%-- 
    Document   : welcome
    Created on : 14-Dec-2017, 13:12:24
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        <title>welcome Page</title>
        
    </head>
    <body>
        <jsp:include page="head.jsp"/>    
        <div class="container">
<!--            <h1>${msg}</h1> -->
            <h1>Kategori</h1>
            <div class="w3-row-padding w3-padding-16 w3-center" id="main">
                <div class="w3-quarter">
                    <img src="<c:url value="resources/img/kemeja.jfif"/>" alt="kemeja" style="width:50%">
                    <a href="${pageContext.request.contextPath}/product/cat/FP"><h3>Fashion Pria</h3></a>

                </div>
                <div class="w3-quarter">
                    <img src="<c:url value="resources/img/kewanita.jfif"/>" alt="wanita" style="width:50%">
                    <a href="${pageContext.request.contextPath}/product/cat/FW"><h3>Fashion Wanita</h3></a>
                </div>
                <div class="w3-quarter">
                    <img src="<c:url value="resources/img/otomo.jpg"/>" alt="otomotif" style="width:50%">
                    <a href="${pageContext.request.contextPath}/product/cat/KENDARAAN"><h3>Otomotif</h3></a>

                </div>
                <div class="w3-quarter">
                    <img src="<c:url value="resources/img/laptop.png"/>" alt="laptop" style="width:50%">
                    <a href="${pageContext.request.contextPath}/product/cat/LAPTOP"><h3>Laptop</h3></a>
                </div>
              
            </div>
             <!-- Second Photo Grid-->
             <div class="w3-row-padding w3-padding-16 w3-center">
                 <div class="w3-quarter">
                     <img src="<c:url value="resources/img/buku.jpg"/>" alt="buku" style="width:50%">
                     <a href="${pageContext.request.contextPath}/product/cat/BUKU"><h3>Buku dan Novel</h3></a>
                 </div>
                 <div class="w3-quarter">
                     <img src="<c:url value="resources/img/hp.jpg"/>" alt="hp" style="width:50%">
                     <a href="${pageContext.request.contextPath}/product/cat/HANDPHONE"><h3>Handphone</h3></a>
                 </div>
                 <div class="w3-quarter">
                     <img src="<c:url value="resources/img/komp.jpg"/>" alt="komp" style="width:50%">
                     <a href="${pageContext.request.contextPath}/product/cat/KOMPUTER"><h3>Komputer</h3></a>
                 </div>
                 <div class="w3-quarter">
                     <a href="${pageContext.request.contextPath}/product/cat/FB">
                         <img src="<c:url value="resources/img/bayi.jpg"/>" style="width:50%">
                     <h3>Fashion Bayi</h3></a>
                 </div>
             </div>
            

        </div>
    </body>
</html>
