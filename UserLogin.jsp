<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="/CSS files/Login.css">
 <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.3.0/css/all.min.css">
 
</head>
<body>
  <form  id="form" name="myform1" action="/login" method="post" align="center">

<div class="container">
<h1> Login Form</h1>
  <div class="para">
  User Name:
    <input type="text" name="UserName" id="userName" placeholder="User Name" required onkeyup="nameValid()">
        
        <br><br>
   
  Password :
    <input type="password" name="Password" id="password" placeholder="Password" required onkeyup="passwordValidation()">
       
  <br><br>
    <button type="Submit">Submit</button><br><br>
    
    </div>
    
    <a href="/jspfiles/ForgetPassword.jsp">Forgot Password?</a> <br> 
    &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
    
    <div class="Sign Up"> &emsp;&emsp;&emsp;
   Don't have an account?<a href="/jspfiles/Register.jsp">&nbsp;SIGN UP </a>&nbsp;Here <br><br>
    </div>
   &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
    <a href="/jspfiles/Admin.jsp">Login Credentials</a> 
    
    </div>
    </form>  
    <div class="column1">
  <img alt="" src="\Images\SignIn.png" id="signin">
  </div>
</body>
</html>