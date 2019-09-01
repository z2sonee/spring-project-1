<%@ page contentType="text/html; charset=utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>BidConfirm</title>
</head>
<body>
<b>
고객님의 소중한 입찰, <font color="red">${bidRegReq.bidPrice}원</font>에 성공적으로 입찰이 등록 됐습니다^^!</b><br/>

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
<p><a href="<c:url value='/itemList/' />${itemId}">item Detail List</a></p>
</div>

</body>
</html>