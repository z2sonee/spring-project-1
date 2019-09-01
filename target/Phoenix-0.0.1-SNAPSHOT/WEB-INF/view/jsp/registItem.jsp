<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<html>
<head>
<meta charset="EUC-KR">
<title>registItem</title>
</head>
<body>
<div align="center">
<h2><font color="darkgreen">아이템 등록</font></h2>
<form:form commandName="itemRegReq" method="post" enctype="multipart/form-data">

1. 첨부할 물품 이미지 : 
<input type="file" name="itemPic"><br/>

2. 물품 이름 :  
<form:input path="itemName" />
<form:errors path="itemName" /> <br/>

3. 가격 : 
<form:input path="itemPrice" />
<form:errors path="itemPrice" /> <br/>

4. 입찰 마감 시간 : ex)2019-01-01
<form:input path="itemBidEndTime" />
<form:errors path="itemBidEndTime" /> <br/>

5. 상세 설명: <br>
<form:textarea path="itemInfo" rows="5" cols="50" />
<form:errors path="itemInfo"/>

<br>
<input type="submit" value="등록"/>
<input type="reset" value="취소"/>
</form:form>
<a href="<c:url value="/itemList" />">[Back to the Item Board]</a>
</div>
</body>
</html>


<%-- 2. 물품 이름 : <c:if test="${itemForm.newItem}"> 
<form:input path="item.username" />
<B><form:errors path="item.username" /></B>
</c:if> 
<c:if test="${!itemForm.newItem}">
<c:out value="${ItemForm.item.username}" />
</c:if>


3. 가격 : 
<form:input path="item.itemPrice" />
<form:errors path="item.itemPrice" /> <br/>

4. 입찰 마감 시간 : ex)09-20 14:22
<form:input path="item.itemBidEndTime" />
<form:errors path="item.itemBidEndTime" /> <br/>

5. 상세 설명: <br>
<form:textarea path="item.itemInfo" rows="5" cols="50" />
<form:errors path="item.itemInfo"/> --%>


