<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <html>
    <body>


<div align="center">
  <h2><font color="darkgreen">Review Board</font></h2>
   <table border="1">
    <tr bgcolor="#CCCCCC">
      <td><b>Review ID</b></td>
      <td><b>Title</b></td>
      <td><b>Account ID</b></td>
    </tr>
    <c:forEach var="r" items="${reviews}">
      <tr bgcolor="#FFFF88">
        <td><b><a href="<c:url value='/ReviewBoard/' />${r.reviewId}">${r.reviewId}</a></td>
      <td>${r.reviewTitle}</td>
      <td>${r.account.userName}</b></td>
      </tr>
    </c:forEach>
    
  </table>
  <br/>
  
<!--   <div align="center"> -->
<!-- <table border="1"> -->
<!--    <tr> -->
<%--       <c:forEach var="i" items="${items }"> --%>
<!--       <td> -->
<%--          <a href="<c:url value='/items/' />${i.itemId}"> --%>
<%--          ${i.itemName}<br> --%>
<%--          ${i.itemPrice }<br> --%>
<!--          </a> -->
<!--       </td> -->
<%--       </c:forEach> --%>
<!--    </tr> -->
  
  <table>
  <tr>
  <td>
  <a href="<c:url value="/WriteReviewForm" />">[Write Review]</a> &nbsp;
  <a href="<c:url value='/index' />">[Go to index]</a>
  </td>
  </tr>
  </table>
  
</div>
</body>
</html>