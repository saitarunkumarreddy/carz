<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="links.jsp" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
  body {
    background-color: black;
}
</style>
</head>
<body>
<%@ include file="navbarbeforelogin.jsp" %>
<c:if test="${errormsg!=null}">
<div class="container">



<div class="container">
<div col-sm-3></div>
<div col-sm-6>
<div clas="alert alert-dangerbalert-dismissable fade in">
<a href="#" class="close" data-dismiss="alert ria-label="close">x</a>
${errormsg} 
</div>
</div>
</div>
</c:if>

<c:if test="${signupmsg!=null}">
<div class="container">
<div col-sm-6>
<div col-sm-3>
<div class="alert alert-sucess alert-dismissabale fade in">
<a href="#" class="close" data-dismiss="alert" aria-label="close">x</a>
${signupmsg}
</div>
</div>
</div>
</div>
</c:if>

	<div class="container">
		<div class="col-sm-4" style="background-color: yellow; border-radius: 20px; padding-bottom: 15px; padding-top: 5px">
		
		<form name="loginForm" action="<c:url value="/j_spring_security_check"></c:url>" method="POST">

	<div class="form-group">
	<b> User ID </b> <br><input type="text" name="j_username" /> <br> </div>

	<div class="form-group">
	<b>Password</b> <br><input type="password" name="j_password" /> <br> </div>

	Forgot Password?<a href=""> Click Here</a>
	<div align="right">
		<input type="submit" value="Login" />
	</div>
</form>
		
		</div>
		<div class="col-sm-8">
		<div id="myCarousel" class="carousel slide" data-ride="carousel">
  <!-- Indicators -->
  <ol class="carousel-indicators">
    <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
    <li data-target="#myCarousel" data-slide-to="1"></li>
    <li data-target="#myCarousel" data-slide-to="2"></li>
  </ol>

  <!-- Wrapper for slides -->
  <div class="carousel-inner">
    <div class="item active" align="center">
     <img src="resources\images\users\fortuner.jpg" alt="Los Angeles" style="width:50%; height:250px">
    </div>

    <div class="item" align="center">
      <img src="resources\images\users\skoda.jpg" alt="Chicago" style="width:50%; height:250px">
    </div>

    <div class="item" align="center">
      <img src="resources\images\users\lambhorghini.jpg" alt="New York" style="width:50%; height:250px">
    </div>
  </div>

  <!-- Left and right controls -->
  <a class="left carousel-control" href="#myCarousel" data-slide="prev">
    <span class="glyphicon glyphicon-chevron-left"></span>
    <span class="sr-only">Previous</span>
  </a>
  <a class="right carousel-control" href="#myCarousel" data-slide="next">
    <span class="glyphicon glyphicon-chevron-right"></span>
    <span class="sr-only">Next</span>
  </a>
</div>
</div>
<div class="col-sm-12">



<div class="col-sm-4">
      <img src="resources\images\products\p1.jpg">
    </div>

    <div class="col-sm-4">
      <img src="resources\images\products\p2.jpg" alt="New York">
    </div>
    <div class="col-sm-4">
      <img src="resources\images\products\p3.jpg" alt="New York">
    </div>
		
		</div>
	</div>

</body>
</html>