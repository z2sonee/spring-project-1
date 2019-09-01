<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<div align="center">
  <h2><font color="darkgreen">Review Detail</font></h2>
  </div>
  
  
<div align="center" style="border : 2px solid green">
<!-- Review Photo :  -->
<!-- <p> -->
<%-- <img src="${review.reviewPic}"> --%>
<!-- </p> -->

1. Review Title : ${review.reviewTitle}
<br/>
2. Item Name : ${review.reviewItemName}
<br/>
3. Item Price: ${review.reviewItemPrice}
<br/>
4. Review Detail : ${review.reviewContent}
<br/>
<br/>
<br/>
</div>
<br />

<div align="center">

<form>
  <a href="<c:url value="/ModifyReviewForm/" />${review.reviewId}">[Modify Review]</a>
  <a href="<c:url value="/DeleteReviewForm/" />${review.reviewId}">[Delete Review]</a>
  <a href="<c:url value="/ReviewBoard" />">[Back to the Review List]</a>
  </form>
</div>

<div align="center">
  <h3><font color="darkgreen">Comment</font></h3>
  <a href="<c:url value="/CommentBoard" />">[Go to Comment Board]</a>
  </div>
 