<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ include file="/WEB-INF/views/common/commonTag.jsp" %>
    <%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Book RentList</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
  
</head>
<body>

<div class="container">
<h1>Book Rent List</h1>
<div class="table-responsive"> 
	<table class="table">
	<thead>
		<tr class="success">
			<th>Id</th><th>Book Name</th><th>Quantity</th><th>BookRent Date</th>
			<th>Customer name</th><th>Customer ID</th><th>Book Category</th><th>Due Date By Category</th>
			<th>Book Return Status</th><th>Action</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items ="${brent_list}" var="bRent" varStatus="rent">
		<tr>
			<td>${rent.count }</td>
			<td>${bRent.books.name }</td>
			<td>${bRent.rentqty  }</td>
			<td>${bRent.rentdate }</td>
			<td>${bRent.customers.name }</td>
			<td>${bRent.customers.id }</td>
			<td>${bRent.books.category.type }</td>
			<td>${bRent.books.category.due_date }</td>
			<td>${bRent.bookreturn_status }</td>
			<td><a href="delete.htm/${bRent.id }">Delete</a> &nbsp; &nbsp;
			<a href="update.htm/${bookRent.id }">Update</a></td>
		</tr>
		</c:forEach>
		
	</tbody>
	</table>
</div>	
</div>

</body>
</html>