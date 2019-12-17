<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ include file="/WEB-INF/views/common/commonTag.jsp"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<a href ="<c:url value='save_category.htm' />" > Add New Category</a>
<a href ="<c:url value='save_books.htm' />" > Add New Books</a>
<a href ="<c:url value='save_customers.htm' />" > Add New Customers</a>
<a href ="<c:url value='save_bookRent.htm' />" > Add New BookRent</a>
<a href ="<c:url value='bookrent_list.htm' />"> Show BookRent List</a>
<a href ="<c:url value='list_bookreturn.htm' />"> Show BookReturn List</a>
<a href ="<c:url value='save_bookreturn.htm' />">Add BookReturn List</a>


</body>
</html>