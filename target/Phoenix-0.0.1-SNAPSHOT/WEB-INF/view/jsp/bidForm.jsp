<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*, java.text.*, java.io.File" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">

<title>BidForm</title>
</head>

<body>
<div align="center">
  <h2><font color="darkgreen">Register Bid</font></h2>
  </div>
  
<div align="center" style="border : 2px solid green">
<form:form commandName = "bidRegReq" method = "post">
   

1. Bid Price : 
<form:input path="bidPrice" size="35" />
<form:errors path="bidPrice" /> <br/>

<br/>

<input type="submit" value="Register Bid" />
<a href="<c:url value="/bidConfirm" />">[Back to the BidList]</a>


</form:form>
</div>

</body>
</html>