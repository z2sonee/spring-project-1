<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<title>리뷰 등록</title>
</head>
<body>
<b>
고객님의 소중한 리뷰, <font color="darkgreen">"${reviewRegReq.reviewTitle}"</font>을 성공적으로 등록했습니다^^!</b><br/>

<p><a href="<c:url value='/ReviewBoard' />">Go to ReviewBoard</a></p>
</body>
</html>