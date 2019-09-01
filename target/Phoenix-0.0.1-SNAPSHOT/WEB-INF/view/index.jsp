<%@ include file="IncludeTop.jsp" %>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>index</title>
    </head>
    <body>
<!--       <ul> -->
<%--             <li><a href="<c:url value="/itemList" />"> --%>
<!--             <img border="0" src="images/dogs_icon.gif" /></a></li> -->
<%--             <li><a href="<c:url value="/ReviewBoard" />"> --%>
<!--             리뷰 게시판</a></li> -->
          
<!--        </ul> -->



   <aside id="left">
        <h4>Category</h4>
        <ul>
            <li><a href="<c:url value="/itemList" />"> Item Board </a></li>
            <li><a href="<c:url value="/ReviewBoard" />"> Review Board </a></li>
            <li><a href="<c:url value="/ViewPoint" />"> My Page </a></li>
        </ul>
    </aside>
 

   <img border="0" src="images/2.png" />
   </body>
</html>