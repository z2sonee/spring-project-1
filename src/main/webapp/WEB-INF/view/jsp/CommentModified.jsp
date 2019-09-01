<%@ page contentType="text/html; charset=utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<title>댓글 수정 완료</title>
</head>
<body>
<b>
고객님의 소중한 댓글, <font color="darkgreen">"${comodReq.commContent}"</font>가 성공적으로 수정되었습니다^^!</b><br/>

<p><a href="<c:url value='/CommentBoard' />">Go to index</a></p>
</body>
</html>