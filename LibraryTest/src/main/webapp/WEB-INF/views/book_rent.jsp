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
<h2>New Book Rent</h2>

		<form:form action="save_bookRent.htm" method="POST"
			modelAttribute="bookRent">
			<form:select path="customer_id" items="${customerList }"
				itemLabel="name" itemValue="id">
				
			</form:select>
			<br>
			<form:select path="book_id" items="${bookList }" itemLabel="name"
				itemValue="id">
				
			</form:select>
			<br>
			<label>Book Quantity: </label>
			<form:input path="rentQty" />
			<br>

			<label>Rent Date </label>
			<form:input type="date" path="rentDate" />
			<br>
			

			



			<input type="submit" value="Submit" />
		</form:form>


	</div>

</body>
</html>