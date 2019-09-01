<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<table id="modify_review">
  <tr>
    <td><a href='<c:url value="/review/ReviewDetail.do"/>'><b>
       <font color="black" size="2">&lt;&lt; Review Detail</font></b></a>
    </td>
  </tr>
</table>

<div align="center">
  <h2><font color="darkgreen"><c:out value="Modify Review" />Modify Review</font></h2>
</div>

<div align="center" style="border : 2px solid green">


1. Review Title : 
<input type="text" name="review.review_title" id="review.review_title" />
<br/>

2. Item Name : 
<input type="text" name="review.review_item_name" id="review.review_item_name" />
<br/>

3. Item Price : 
<input type="text" name="review.review_item_price" id="review.review_item_price" />
<br/>

4. Review Detail : <br/>
<textarea name = "review.review_content" rows="7" cols="60"></textarea>

<br/>

5. Review Photo : 
<p>
<img src="${review.review_pic}">
</p>
<form enctype="multipart/form-data">
<input type = "file" accept = "image/jpg, image/gif" name="review.review_pic" id="review.review_pic"/>
</form>
<br/>
</div>
<br/>
<div align="center">
<input type="button" value="Modify Review" />
<input type="button" value="Back to Review Detail" />
 

  
</div>

