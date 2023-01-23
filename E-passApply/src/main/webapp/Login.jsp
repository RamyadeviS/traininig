<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Form</title>
</head>
<body>
<Style>
body{
background-color: skyblue;
}
</Style>
 <form id="form1" name="myform" action="LoginServlet" method="get">
    
    Enter Aadhar No:<input type="text" name="AadharNo" placeholder="Aadhar No"><br><br>
    Enter Password  :<input type="text" name="Password" placeholder="Password"><br><br>
    
     <button type="Cancel">Cancel</button>
     <button type="Login">Login</button><br><br>
   
        <a href="ForgetPassword.jsp">Forget Password</a> 
       
</form>
</body>
</html>