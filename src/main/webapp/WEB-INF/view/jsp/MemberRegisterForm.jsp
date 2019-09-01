<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<title>회원 가입</title>
</head>
<body>
   
<div align="center">
<form:form commandName="accountRegReq" method = "post">
  <table>
      <tr>
        <td colspan="2">Welcome for Join ^^!<br />&nbsp;
        </td>
      </tr>
      <tr>
        <td>Login Id :</td>
        <td><form:input path="loginId" size="35" /></td>
      </tr>
      <tr>
        <td>User Name :</td>
        <td><form:input path="userName" size="35" /></td>
      </tr>
      <tr>
        <td>Password:</td>
        <td><form:input path="password" size="35" /></td>
      </tr>
      <tr>
        <td>Email :</td>
        <td><form:input path="email" size="35" /></td>
      </tr>
      <tr>
        <td>Address :</td>
        <td><form:input path="address" size="35" /></td>
      </tr>
      <tr>
        <td>Phone :</td>
        <td><form:input path="phone" size="35" /></td>
      </tr>
      <tr>
        <td>&nbsp;</td>
        <td><input type="submit" value="회원가입"></td>
      </tr>
    </table>
</form:form>
</div>

</body>
</html>