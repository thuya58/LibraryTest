<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="/WEB-INF/views/common/commonTag.jsp" %>
    <%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add new Clinic</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
  
 <style>
  .formpad{
  padding:15px;
  background-color:lightgreen;
  }
  </style>
  

</head>
<body>
<br>
<div class="container formpad">
<h2>New Book</h2>

<form:form action="save_books.htm" method="POST" modelAttribute="books">
  <label>Book Name: </label>
  <form:input path="name"/> <br>

   <label>Quantity: </label>
   <form:input path="qty"/><br>
   
	<form:select path="category.id" items="${catlist }" itemLabel="type" itemValue="id">
<form:option value="NONE">--Select Category--</form:option>
</form:select><br>

<input type="submit" value="Submit" />
</form:form>


</div>

</body>
</html>