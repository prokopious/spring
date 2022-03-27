<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Products List</title>
</head>
<body>

	<h1>Add Animal</h1> 
    <form action="#" th:action="@{/greeting}" th:object="${greeting}" method="post">
    	<p id="animal">Animal: <input type="text" th:field="*{animal}" /></p>
        <p>Description: <input type="text" th:field="*{description}" /></p>
        <p><input type="submit" value="Submit" /> <input type="reset" value="Reset" /></p>
    </form>

</body>
</html>