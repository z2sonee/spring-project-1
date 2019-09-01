<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <html>
    <body>


<div align="center">
  <h2><font color="darkgreen">My Point</font></h2>
  <h4>총 포인트: <c:out value="${account.point}" /> P</h4>
   <table border="1">
    <tr bgcolor="#CCCCCC">
      <td><b>Point Num</b></td>
      <td><b>Point Info</b></td>
    </tr>
    <c:forEach var="point" items="${pointList}">
      <tr bgcolor="#FFFF88">
        <td>${point.pointNum}</td>
      <td>${point.pointInfo}</td>
      </tr>
    </c:forEach>
  </table>
  <br/>
<p><a href="<c:url value='/index' />">Go to index</a></p>
  
</div>
</body>
</html>