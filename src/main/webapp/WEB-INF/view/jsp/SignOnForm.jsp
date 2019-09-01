 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<html>
<head>
<title>로그인창</title>
</head>
<body>

<div align="center" style="border : 2px solid green">
  <form action='<c:url value="/signon"/>' method="POST">
    <table>
      <tr bgcolor="#CCCCCC">
        <td colspan="2"><h2><font color="darkgreen">Please enter your login ID and Password!</font></h2> <br />&nbsp;
        </td>
      </tr>
      <tr>
        <td>UserName:</td>
        <td><input type="text" name="loginId" size="20" /></td>
      </tr>
      <tr>
        <td>Password:</td>
        <td><input type="password" name="password" size="20"/></td>
      </tr>
      <tr>
        <td>&nbsp;</td>
        <td><input type="submit" value="로그인"></td>
      </tr>
    </table>
  </form>
</div>

</body>
</html>