<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form name="form"  action="/register" method="post"> 

   Enter User Name:<input type="text" name="name" required> <br><br>
   Enter password:<input type="text" name="password" required> <br> <br>
   Enter User Id:<input type="number" name="id" required> <br><br>
   Enter Mobile No:<input type="number" name="mobile_no" required> <br><br>
   Enter Mail Id:<input type="text" name="mail_id" required> <br><br>
   
   Enter Role:<input type="text" name="role" required>  <br><br><br>
   
    <button type="Back">Back</button>&nbsp;&nbsp;&nbsp;&nbsp;
    <button type="Submit">Submit</button>
   </form>
</body>
</html>

