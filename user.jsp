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
<ul class="active"><a href="/jspfiles/Dashboard.jsp">&emsp;&emsp;<em class="fa-solid fa-house-circle-exclamation"></em></a>
 </ul>
  <form   action="/userLogin" method="post" align="center">

<br><br><br><br><br>
   <div class="title"><h1>Login Here</h1></div>
    <div class="container">
     <div class="left"><br><br>
                     
  <img alt="" src="/Images/SignIn.png" id="Signin">
  
      </div>
        <div class="right">
                    <div class="formBox">
                        <form>
         <p>User Name</p>
 <input type="text" name="User Name" id="User Name" placeholder="User Name">
       <p>Password</p>
        <input type="Password" name="Password" placeholder="Password">
   <input type="Submit" name="" value="Sign In ">
       <a href="/jspfiles/ForgetPassword.jsp">Forgot Password?</a> <br><br> 
  
     &emsp; &emsp; &emsp;  Don't have an account?<a href="/jspfiles/Register.jsp"><br>SIGN UP</a> &nbsp;Here <br><br>
      <a href="/jspfiles/Admin.jsp">Login credential</a> <br> 
  
    </div>
    </form>
    <br> <br><br><br><br>
    </div>
   </div>
 </div>
</body>
</html>