<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<div align="center">
  <h2><font color="darkgreen">Comment Detail</font></h2>
  </div>
  
  
<div align="center" style="border : 2px solid green">

Review Content : ${comment.commContent}
<br/>
<br/>
</div>
<br />

<div align="center">

<form>
  <a href="<c:url value="/ModifyCommentForm/" />${comment.commentId}">[Modify Comment]</a>
  <a href="<c:url value="/CommentBoard" />">[Back to the Comment Board]</a>
  </form>
</div>
  

  
  

