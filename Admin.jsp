<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.3.0/css/all.min.css">
 
<link rel="stylesheet" href="/CSS files/AdminLogincss.css">
</head>
<body>
  <form   action="/AdminLogin" method="post" >
<br><br><br><br><br>
  <ul class="active"><a href="/jspfiles/Dashboard.jsp"><em class="fa-solid fa-house-circle-exclamation"></em></a>
  </ul>
    <div class="container">
   <h1>  &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;Admin Login</h1>
     <div class="left"><br><br><br><br><br><br><br>
                     
  <img alt="" src="\Images\CovidStop.gif" id="Signin">
      </div>
        <div class="right">
                    <div class="formBox">
                        <form>
   <p>Mail Id</p>
    <input type="text" placeholder="Enter Mail Id" name="Mail Id" required>
<br>
<p>Password</p>
    <input type="Password" placeholder="Enter Password" name="Password" required>
<br>
  
   <input type="Submit" name="" value="Sign In ">
  
    </div>
    </form><br><br>
    </div>
   </div>
 </div>
</body>
</html>