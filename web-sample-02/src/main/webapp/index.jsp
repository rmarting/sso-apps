<%@ page language="java" session="false" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
	<title>Version 2: Web Sample</title>
	<link rel="stylesheet" type="text/css" href="css/style.css" />
</head>
<body>
	<table border="1">
	 <tr>
	   <td><img src="img/rh.jpg"/></td>
	 </tr>
	</table>
	
	<h1>Version: Web Sample App</h1>

	<p>@include</p>
	<%@include file="includes/banner.jsp"%>
	
	<p>jsp:include</p>
	<jsp:include  page="includes/banner.jsp"/>

	<p>c:import</p>
	<c:import url="includes/banner.jsp"/>

	<br />
	<br />
	<a href="version">Click Here to check Servlet Version</a><br/>
	<br />
	<br />
  <a href="secure-version">Click Here to check Secure Servlet Version</a><br/>
  <br />
  <br />
	Server timestamp: <%= new java.util.Date() %>.
</body>
</html>
