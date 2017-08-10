<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@ include file="links.jsp" %>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script>

$(document).ready(function(){
	var searchCondition='${searchCondition}';
	$('.table').DataTable({
		"lengthMenu" : [[5,10,15,-1],[5,10,15,"All"]],
		"oSearch":{"sSearch":searchCondition}		
	})	
});

</script>
</head>
<body>
<%@ include file="adminNavBar.jsp" %>
<br><br><br>
<div class="container">
<table class="table table-stripped fixed_headers" style="font-weight:bold">

<thead>
<tr >
<th>Supplier Id</th>
<th>Image</th>
<th>Supplier Name</th>
<th>Supplier Description</th>
<th>Is Available</th>
<th>Options</th>
</tr>
</thead>
<tbody>
<c:forEach var="s" items="${allsupplier}">

<tr>
<td>${s.supplierid}</td>
<td><img src="resources/images/supplier/${s.supplierid}.jpg" height="100px" width="130px" /> </td>
<td>${s.suppliername}</td>
<td>${s.supplierdesc}</td>
<td>${s.issupplieravailable}</td>
<td><a href="reqEditSupplierAdmin?sid=${s.supplierid}">Edit</a>/<a href="reqDeleteSupplierAdmin?sid=${s.supplierid}">delete</a></td>

</tr>

</c:forEach>
</tbody>
</table>
</div>
</body>
</html>