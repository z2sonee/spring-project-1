<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<form:form commandName = "comodReq">
<div align="center">
  <h2><font color="darkgreen"><c:out value="Modify Comment" />Modify Comment</font></h2>
</div>

<div align="center" style="border : 2px solid green">
Comment : 
<input type="text" name="commContent" id="commContent" size="45" value="${comodReq.commContent}"/> 
<form:errors path="commContent"/><br/>
<br/>
<br/>
</div>
<br/>

<div align="center">
<input type="submit" value="Modify Comment" />
<a href="<c:url value="/CommentDetail/" />${comodReq.commentId}">[Back to the Comment Detail]</a>

</div>
</form:form>