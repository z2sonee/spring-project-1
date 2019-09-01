<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>경매 물품 상세 페이지</title>
</head>
<body>

<div align="center">
<h2><font color="darkgreen">Item Detail</font></h2>
<table border="1">
<tr bgcolor="#CCCCCC">
      <td><b>1.물품 이름: </b></td>
      <td><b>2. 입찰 최소 가격: </b></td>
      <td><b>3. 사진: </b></td>
      <td><b>4. 물품 설명: </b></td>
</tr>
<tr>
	<td>${item.itemName }</td>
	<td>${item.itemPrice }원</td>
	<td>${item.itemPic }</td>
	<td>${item.itemInfo }</td>
</tr>
</table>

</div>

<div align="center">
  <h2><font color="darkgreen">Bid List</font></h2>
   <table border="1">
    <tr bgcolor="#CCCCCC">
      <td><b>bidId</b></td>
      <td><b>bidTime</b></td>
      <td><b>bidPrice</b></td>
    </tr>
<c:forEach var="b" items="${bidList}">
      <tr bgcolor="#FFFF88">
        <td>${b.bidId}"</td>
      <td>${b.bidTime}</td>
      <td>${b.bidPrice}</td>
      </tr>
</c:forEach>
</table>


 <a href="<c:url value="/itemList" />">확인</a>
 <a href="<c:url value='/bidForm/' />${item.itemId }">입찰</a>
 <a href="<c:url value='/deleteItem/' />${item.itemId }">삭제</a>
 
</div>


</body>
</html>