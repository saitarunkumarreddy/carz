<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://www.springframework.org/tags/form" prefix="xyz"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@ include file="links.jsp" %>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
body {
    background-color: black;
    }
</style>
</head>
<body>
<%@ include file="adminNavBar.jsp" %>

<br>
<br>
<br>
<div class="container">
<div class="col-sm-6" style="background-color:yellow; border-radius:20px; padding-bottom:15px; padding-top:5px">
<div align="center" >
<b>supplier data</b>
</div>
<xyz:form commandName="supplierobject" action="reqaddsupplier" enctype="multipart/form-data">

<div class="form-group">
<label for="sup">suppliername:</label>
<br> <xyz:input class="form-control" placeholder="enter suppliername" path="suppliername" style="width:400px"/>
</div>

<div class="form-group">
<label for="no.">supplierdesc.:</label>
<br> <xyz:input class="form-control" placeholder="enter supplier desc" path="supplierdesc"  style="width:400px"/>
</div>

<div class="form-group">
<br>Browse Image <xyz:input type="file" path="supplierImage"/>
</div>
<br><xyz:button class="btn btn-primary">addsupplier</xyz:button>
</xyz:form>
</div>
</div>
</body>
</html>