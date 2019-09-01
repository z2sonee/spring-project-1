<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>회원 가입</title>
</head>
<body>

<div align="center">
<form:form commandName="accountForm" method="post">
  <table id="account">
    <tr>
      <td>
        <h3><font color="darkgreen">User Information</font></h3>
        <table class="n13">
          <tr>
            <td>User ID:</td>
            <td>
              <form:input path="loginId" />
              <B><form:errors path="loginId"/></B>
            </td>
          </tr>
          <tr>
            <td>New password:</td>
            <td>
              <form:password path="password" /> 
              <B><form:errors path="password"/></B></td>
          </tr>
        </table> 
        
        <%@ include file="IncludeAccountFields.jsp"%>

      </td>
    </tr>
    <tr>
    	<td>
    		<input type="submit" value="가입"/>
    		<input type="reset" value="취소"/>
    	</td>
    </tr>
  </table>
</form:form>
</div>

</body>
</html>