<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="abc" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Student Data Spring Form

<br>
<abc:form commandName="student" action="reqStudentResultSpring">
Student Roll No. : <abc:input path="strno"/>
<br>
Student Name : <abc:input path="stname"/>
<br>
Marks : 
<abc:input path="marks[0]"/>
<abc:input path="marks[1]"/>
<abc:input path="marks[2]"/>
<abc:input path="marks[3]"/>
<abc:input path="marks[4]"/>

<br>
<abc:button>Get Result</abc:button>
</abc:form>
</body>
</html>