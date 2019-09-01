<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<div align="center">
  <h2><font color="darkgreen">Write Comment</font></h2>
  </div>

<form:form commandName = "commRegReq" method = "post">
<div align="center" style="border : 2px solid green">

Comment : 
<form:input path="commContent" size="35" />
<form:errors path="commContent" />
<input type="submit" value="Write" />
<br/>
</div>
</form:form>