<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Employee Home</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
    <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
<head>
<link rel="stylesheet" type="text/css" href="header.css">
</head>

<body>
<div id="header">
</div>

<div id="nav">
<ul>
  <li><a href="index.jsp"><span class="glyphicon glyphicon-home"></span> Home</a></li>  
<<<<<<< HEAD
  <li><a href="CustomerCenter.jsp">Customers</a></li>
  <li><a href="PublicationCenter.jsp">Publications</a></li>
  <li><a href="Printing.jsp">Printing</a></li>
  <ul style="float:right;list-style-type:none;">
  <li><a class="active" href="EmployeeHome.jsp"><span class="glyphicon glyphicon-user"></span> Profile</a></li>
=======
  <li><a class="active" href="CustomerCenter.jsp">Customers</a></li>
  <li><a href="PublicationCenter.jsp">Publications</a></li>
  <li><a href="Printing.jsp">Printing</a></li>
  <ul style="float:right;list-style-type:none;">
  <li><a href="EmployeeHome.jsp"><span class="glyphicon glyphicon-user"></span> Profile</a></li>
>>>>>>> a6dcfcfcbca8a4c07535ca5f7ef92de01fa8f224
  <li><a href="Login.jsp"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
</ul>
</div>

<<<<<<< HEAD

<div id="bckgrnd">
<div id="section">
=======
<div id="bckgrnd">

>>>>>>> a6dcfcfcbca8a4c07535ca5f7ef92de01fa8f224
<div><h2>Edit Customer Name</h2>
<span id="error">${errorMsg}</span>
<form action="CustEditSubSrvlt" method="post">
	 
	<input type="text" name="fn" value="${firstName}"/><br><sup>First Name</sup><br><br>
    <input type="text" name="ln" value="${lastName}"/><br><sup>Last Name</sup><br><br>
    <input type="text" name="address" value="${address}"/><br><sup>Address</sup><br><br>
    <input type="text" name="city" value="${city}"/><br><sup>City</sup><br><br>
    <input type="text" name="state" value="${state}"/><br><sup>State</sup><br><br>
    <input type="text" name="zip" value="${zip}"/><br><sup>Zip</sup><br><br>
    <input type="text" name="phone" value="${phone}"/><br><sup>Phone</sup><br><br>
    <input type="submit" value="Submit Name Edit" name="sub">  <input type="submit" value="Cancel" name="sub">  
</form>
</div>
<<<<<<< HEAD

</div>
=======
>>>>>>> a6dcfcfcbca8a4c07535ca5f7ef92de01fa8f224
</div>
<div id="footer">
Copyright © Team One - CSC 481
</div>

</body>
</html>

