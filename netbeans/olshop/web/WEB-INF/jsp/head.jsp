<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link href="<c:url value="/resources/css/bootstrap.css" />" rel="stylesheet">
<link rel="stylesheet" href=<c:url value="/resources/css/nav.css"/>>
<div>
        <!-- Sidebar (hidden by default) -->
<nav class="w3-sidebar w3-bar-block w3-card w3-top w3-xlarge w3-animate-left" style="display:none;z-index:2;width:40%;min-width:300px" id="mySidebar">
  <a href="javascript:void(0)" onclick="w3_close()"
  class="w3-bar-item w3-button">Close</a>
  <a href="${pageContext.request.contextPath}/welcome" onclick="w3_close()" class="w3-bar-item w3-button">Home</a>
  <c:if test="${empty sessionScope.user}">
  <a href="${pageContext.request.contextPath}/login" onclick="w3_close()" class="w3-bar-item w3-button">Login</a>
   </c:if>
    <c:if test="${not empty sessionScope.user}">
    <a href="${pageContext.request.contextPath}/product/keluar" onclick="w3_close()" class=" w3-bar-item w3-button">Logout ${user.username}</a>
    </c:if>
</nav>

<!-- Top menu -->
<div class="w3-top" >
  <div class="w3-green  w3-xlarge" style="max-width:1200px;margin:auto" >
      
    
     <c:if test="${not empty sessionScope.user}">
         <a style="float: right" href="/olshop/product/cart" class="w3-right w3-padding-16"><img src="${pageContext.request.contextPath}/resources/img/keranjang3.png" width="5%"/>: ${cart.cartList.size()}</a>
    </c:if>
    <div class="w3-button w3-padding-16 w3-left" onclick="w3_open()">=</div>
        <div class="w3-center w3-padding-16 " ><a href="${pageContext.request.contextPath}/welcome">Toko Online Serba Ada</a></div>
        
    

    
  </div>
</div>
</div> <br/> <br/><br/>  
<script>
// Script to open and close sidebar
function w3_open() {
    document.getElementById("mySidebar").style.display = "block";
}
 
function w3_close() {
    document.getElementById("mySidebar").style.display = "none";
}
</script>