<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
  <title>JPetStore</title>
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
  <meta http-equiv="Cache-Control" content="max-age=0">
  <meta http-equiv="Cache-Control" content="no-cache">
  <meta http-equiv="expires" content="0">
  <meta http-equiv="Expires" content="Tue, 01 Jan 1980 1:00:00 GMT">
  <meta http-equiv="Pragma" content="no-cache">
  <link rel="stylesheet" href="../style/petstore.css" type="text/css" />
</head>

<body bgcolor="white">
<table class="top">
  <tr>
    <td>
      <a href="<c:url value="/index"/>">
        <img border="0" src="images/logo-topbar.gif" /></a>
    </td>
    <td style="text-align:right">
        <img border="0" name="img_cart" src="images/cart.gif" />
      <img border="0" src="images/separator.gif" />
    </td>
     
    <td style="text-align:left">
      <form action="<c:url value="/itemList/keyword"/>" method="post">
       <input type="hidden" name="search" value="true"/>
        <input type="text" name="keyword" size="14" />&nbsp;
        <input src="images/search.gif" type="image"/>
      </form>
    </td>
    <td style="text-align:left">
     <a href="<c:url value="/signon"/>"> [ Log In ]</a>
     <a href="<c:url value="/signon/logout"/>"> [ Log Out ] </a>
<%--    <c:if test="${!empty session}" > --%>
<%--         <a href="<c:url value="/signon"/>">Log In</a> --%>
<%--           <c:url value="/signon/logout"/>Log Out</a> --%>
<%--           </c:if> --%>
     <a href="<c:url value="/join"/>"> [ Join Us ] </a>
    </td>
  </tr>
</table>
