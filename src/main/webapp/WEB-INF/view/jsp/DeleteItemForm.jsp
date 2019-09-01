<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>아이템 삭제 폼</title>
</head>
<body>

<%-- <div align="center">
<form:form commandName="dif" method="post">
<p>
<label for="currentPassword">1. 비밀번호 : </label>
<form:password path="currentPassword" />
<form:errors path="currentPassword" /> </p><br/>

<p>
<label>
2. 정말 삭제하시겠습니까? : 
	<form:checkbox path="agreement" />
</label> </p><br/>
<input type="submit" value="삭제" />
<input type="reset" value="취소"/>

</form:form> --%>

<div align="center">
<form:form commandName="deleteRegReq" method="post">
<p>
<label for="currentPassword">1. 비밀번호 : </label>
<form:password path="currentPassword" />
<form:errors path="currentPassword" /> </p><br/>

<p>
<label>
2. 정말 삭제하시겠습니까? : 
	<form:checkbox path="agreement" />
</label> </p><br/>
<input type="submit" value="삭제" />
<input type="reset" value="취소"/>

</form:form>
</div>
</body>
</html>