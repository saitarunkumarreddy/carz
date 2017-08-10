<!DOCTYPE html>
<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <%@ include file="links.jsp" %>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
 <style>
  .carousel-innner > .item > img,
  .carousel-innner > .item > a > img {
  width: 40%;
  margin:auto;
  height:250px;
  }
  .carousel-control.left, .carousel-control.right {
  background-image: none;opacity=0.4;
  }
  body {
    background-color: black;
}
  </style>
</head>
<body>

<%@ include file="navbarbeforelogin.jsp" %>
<br>
<br>
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
     <img src="resources\images\users\Bugatti.jpg" alt="Los Angeles" style="width:40%; height:250px">
    </div>

    <div class="item" align="center">
      <img src="resources\images\users\hummer.jpg" alt="Chicago" style="width:40%; height:250px">
    </div>

    <div class="item" align="center">
      <img src="resources\images\users\car1.jpg" alt="New York" style="width:40%; height:250px">
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
<br>
<br>
<br>
<div class="col-sm-4">
<div class="zoomin">
<img src="resources\images\products\p1.jpg">
    </div>
    </div>

    <div class="col-sm-4">
    <div class="zoomin">
      <img src="resources\images\products\p2.jpg" alt="New York">
    </div>
    </div>
    <div class="col-sm-4">
    <div class="zoomin">
      <img src="resources\images\products\p3.jpg" alt="New York">
    </div>
    </div>s
</body>
</html>








