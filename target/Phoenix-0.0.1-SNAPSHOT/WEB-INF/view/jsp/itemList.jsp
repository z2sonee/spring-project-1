<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<html>
<head>
<style>
table {
	border-collapse:collapse;
	
}
table, td, th {
	border:solid 1px #cccccc;
}
</style>
<meta charset="EUC-KR">
<title>아이템 목록</title>
</head>
<body>
<br>

<form action="<c:url value="/itemList/keyword" />" method="post" style="text-align:right">
        <input type="text" name="keyword" size="14" />&nbsp;
        <input src="images/search.gif" type="image"/>
        <a href="<c:url value="/registItem" />">REGISTER ITEM</a>
</form>

<!-- <div align="right">
	<input type="button" value="입찰 마감 임박순">
	<input type="button" value="낮은 가격순">
	<input type="button" value="높은 가격순">
</div> -->

<div align="center">
<h2><font color="darkgreen">Item Board</font></h2>
<table border="1">
	<tr bgcolor="#CCCCCC">
		<td><b>Item Id</b></td>
      <td><b>Item Pic</b></td>
      <td><b>Item</b></td>
      <td><b>Price</b></td>
      <td><b>Info</b></td>
    </tr>
	<c:forEach var="i" items="${items }">
	<tr bgcolor="#FFFF88">
		<td>${i.itemId }</td>
		<td><img border="0" src="tomcatImage/${i.itemPic}" /><br></td>
		<td><b><a href="<c:url value='/itemList/' />${i.itemId}">${i.itemName}</a></b></td>
		<td>${i.itemPrice }</td>
		<td>${i.itemInfo }</td>
	</tr>
	</c:forEach>
</table>

<p><a href="<c:url value='/index' />">[Go to index]</a></p>
</div>

</body>
</html>