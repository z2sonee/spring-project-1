<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>아이템 검색</title>
</head>
<body>
<div align="center">
<h2><font color="darkgreen">Search Item</font></h2>
<table border="1">
	<tr bgcolor="#CCCCCC">
      <td><b>Item Pic</b></td>
      <td><b>Item</b></td>
      <td><b>Price</b></td>
      <td><b>Info</b></td>
    </tr>
	<c:forEach var="s" items="${searchItem}">
		<tr bgcolor="#FFFF88">
			<td><img border="0" src="<c:url value='/upload/' />${s.itemPic}" /><br></td>
			<td><a href="<c:url value='/itemList/' />${s.itemId}">${s.itemName}<br></a></td>
			<td>${s.itemPrice }<br></td>
			<td>${s.itemInfo }<br></td>
		</tr>
	</c:forEach>
</table>
<p><a href="<c:url value='/itemList' />">Go to index</a></p>
</div>
</body>
</html>