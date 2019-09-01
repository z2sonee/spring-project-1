<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<table id="delete_comment">
  <tr>
    <td><a href='<c:url value="/review/ReviewDetail.do"/>'><b>
       <font color="black" size="2">&lt;&lt; Review Detail</font></b></a>
    </td>
  </tr>
</table>

<div align="center">
  <h2><font color="darkgreen"><c:out value="Delete Comment" />Delete Comment</font></h2>
</div>

<div align="center" style="border : 2px solid green">
Please Enter your password : 
<input type="password" name="review.comment.account.password" id="review.comment.account.password" />
<br/>
<br/>
</div>
<br/>

<div align="center">
<input type="button" value="Delete Comment" />
<input type="button" value="Back to Review Detail" />



</div>