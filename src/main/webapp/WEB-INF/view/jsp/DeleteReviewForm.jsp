<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<form:form commandName = "reviewDelReq">
<div align="center">
  <h2><font color="darkgreen"><c:out value="Delete Review" />Delete Review</font></h2>
</div>

<div align="center" style="border : 2px solid green">
<p>
본인 인증을 위해 비밀번호를 입력해주세요 : 
<form:password path="password" value="${reviewDelReq.password}"/>
</p><br/>

<br/>
<br/>
</div>
<br/>

<div align="center">
<input type="submit" value="리뷰 삭제" />
<a href="<c:url value="/ReviewBoard/" />${reviewDelReq.reviewId}">[Back to the Review Detail]</a>

</div>
</form:form>