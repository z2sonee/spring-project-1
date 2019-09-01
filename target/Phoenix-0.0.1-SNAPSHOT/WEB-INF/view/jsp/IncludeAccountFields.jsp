<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<h3>
  <font color="darkgreen">Account Information</font>
</h3>

<table class="n13">
  <tr>
    <td>UserName:</td>
    <td><form:input path="userName" />
      <form:errors path="userName"/></td>
  </tr>
  <tr>
    <td>Email:</td>
    <td><form:input path="email" />
      <form:errors path="email"/></td>
  </tr>
  <tr>
    <td>Phone:</td>
    <td><form:input path="phone" /> 
      <form:errors path="phone"/></td>
  </tr>
  <tr>
    <td>Address:</td>
    <td><form:input path="address" />
      <form:errors path="address"/></td>
  </tr>
</table>