<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <html>
    <body>
<form:form commandName = "commRegReq" method = "post">
<div align="center" style="border : 2px solid green">
<h2><font color="darkgreen">Comment Board</font></h2><br/>

<br/>

   <table border="1">
    <tr bgcolor="#CCCCCC">
      <td><b>Comment ID</b></td>
      <td><b>Comment</b></td>
      <td><b>Account ID</b></td>
      <td><b>Date</b></td>
    </tr>
    <c:forEach var="c" items="${comments}">
      <tr bgcolor="#FFFF88">
        <td><b><a href="<c:url value='/CommentDetail/'/>${c.commentId}">${c.commentId}</a></td>
      <td>${c.commContent}</td>
      <td>USER_Id</td>
      <td>Time</b></td>
      </tr>
    </c:forEach>
    
  </table>
  <br/>


<a href="<c:url value="/WriteCommentForm" />">[Write Comment]</a>
<a href="<c:url value="/ReviewBoard/" />${modReq.reviewId}">[Back to the Review Detail]</a>
  </div>
</form:form>
</body>
</html>