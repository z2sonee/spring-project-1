<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<div align="center">
  <h2><font color="darkgreen">Write Review</font></h2>
  </div>
  
<div align="center" style="border : 2px solid green">
<form:form commandName = "reviewRegReq" method = "post">
   

1. Review Title : 
<form:input path="reviewTitle" size="35" />
<form:errors path="reviewTitle" /> <br/>

2. Item Name : 
<form:input path="reviewItemName" size="35"/>
<form:errors path="reviewItemName" /> <br/>

3. Item Price : 
<form:input path="reviewItemPrice" />
<form:errors path="reviewItemPrice" /> <br/>

4. Review Detail :<br/>
<textarea id = "reviewContent" name = "reviewContent" rows="7" cols="60"></textarea>

<br/>

5. Review Photo :
<input type = "file" accept = "image/jpg, image/gif" name="review.review_pic" id="review.review_pic"/>

<br/>


<br/>

<input type="submit" value="Register Review" />
<a href="<c:url value="/ReviewBoard" />">[Back to the Review Board]</a>


</form:form>
</div>