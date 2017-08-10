<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ include file="adminNavBar.jsp" %>
<br><br><br>
<div class="container">
<table class="table table-stripped fixed_headers" style="font-weight:bold">

<thead>
<tr >
<th>xmap Id</th>
<th>Image</th>
<th>productsupplier price<th>
<th>productsupplier stock</th>
<th>Is Available</th>
<th>Options</th>
</tr>
</thead>
<tbody>
<c:forEach var="ps" items="${allxmap}">

<tr>
<td>${ps.psid}</td>
<td><img src="resources/images/supplier/${ps.Psid}.jpg" height="100px" width="130px" /> </td>
<td>${ps.productsupplierprice}</td>
<td>${ps.productsupplierstoc}</td>
<td>${ps.productsupplieravailable}</td>
<td><a href="reqEditProductAdminEdit?sid=${ps.psid}">Edit</a>/<a href="reqDeleteSupplierAdmin?sid=${ps.psid}">delete</a></td>

</tr>

</c:forEach>
</tbody>
</table>
</div>
</body>
</html>