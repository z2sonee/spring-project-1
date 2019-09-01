<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<title>아이템 등록</title>
</head>
<body>
${itemRegReq.itemName}을 성공적으로 등록했습니다.<br/>

<p><a href="<c:url value='/itemList' />">Go to index</a></p>
</body>
</html>