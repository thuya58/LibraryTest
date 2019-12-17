<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="/WEB-INF/views/common/commonTag.jsp" %>
    <%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Book Return</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
<script>
$(document).ready(function(){
	
	$("#customerdto").change(function(){
		var customersId = this.value;
		$.get("http://localhost:8080/LibraryTest/getBookRentListByCustomerId/"+customersId,function(data,status){
		$("#bookrent").empty();
		$.each(data,function(value,k){
			$("#bookrent").append("<option value="+ k.id+">"+k.bookrentName+"</option>");
		});
			});
		});
});
		

</script>


</head>
<body>
	<div class="">
	<form:form action="save_bookreturn.htm" method="POST" modelAttribute="bookreturndto">
		<label>Customer name </label>
		<form:select path="customerdto" items="${customerlist }" itemLabel="name" itemValue="id" class="form-control">
		</form:select>
		<label>BookRent ID</label>
		<form:select path="bookrent"  class="from-control"></form:select> <br>
		<th>BookRent Date</th>
		<form:input type="date" path="returndate" />
		
		<input type="submit" value="save" />
	</form:form>
	</div>
	
	
	
</body>
</html>
<%-- 
form:select path="customerdto" items="${customerlist }" itemLabel="name" itemValue="id"
path ka data save chin ta' location' --%>