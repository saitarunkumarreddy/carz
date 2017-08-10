<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="xyz"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<%@ include file="links.jsp" %>
</head>
<body>
<%@ include file="adminNavBar.jsp" %>
<br><br><br>
<div class="container">
<div class="col-sm-4" style="background-color: yellow; border-radius: 20px; padding-bottom: 15px; padding-top: 5px">

<xyz:form commandName="prodsuppObject" action="reqAddProdSuppDataToDb">

Products 
<xyz:select path="productid">
<c:forEach var="prd" items="${products}">
<option value="${prd.productid}"> ${prd.productname}</option>
</c:forEach>
</xyz:select>
<br>
<br>
Supplier 
<xyz:select path="supplierid">
<c:forEach var="sup" items="${suppliers}">
<option value="${sup.supplierid}"> ${sup.suppliername}</option>
</c:forEach>
</xyz:select>
<br>
<br>
Price <xyz:input path="productsupplierprice" style="width:200px" />
<br>
<br>
Stock <xyz:input path="productsupplierstock" style="width:200px" />
 <br>

IsAvailable   
True <xyz:radiobutton path="isproductsupplieravailable" value="true" style="width:200px" />
<br>
<br> 
False <xyz:radiobutton path="isproductsupplieravailable" value="false" style="width:200px" />
<br>
<br>

<xyz:button>Add Record</xyz:button>
</xyz:form>
</div>
</div>
</body>
</html>