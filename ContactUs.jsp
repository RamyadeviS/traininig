<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel ="stylesheet" href="/CSS files/Contact.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.3.0/css/all.min.css">

</head>

<body>
<ul class="active"><a href="/jspfiles/Dashboard.jsp"><em class="fa-solid fa-house-circle-exclamation"></em></a>
 </ul>
<div class="container">
<div class="row">
  <div class="column1">
 <br> <h3>Send us a message</h3><br><br>
  <p>Name</p><br>
  <input type="text" name="Name" id="Name" placeholder="Name" required ><br><br>
   
  <p>Email</p><br>
    <input type="text" name="Email" id="Email" placeholder="Email" required><br><br>
   
  <P>Message</P><br>
  <input type="Message" name="Message" id="Message" placeholder="Message" required><br><br>
   <br><input type="Submit" value="Send Message" onclick="history.back()"> &nbsp;&nbsp;&nbsp;
   </div>
  
  <div class="column2">
  <br><h3>&emsp;&emsp;Contact us</h3><br>
  <p>&emsp; We're open for any suggestion or just to<br>&emsp; have a chat</p>
   <br><br>
   <p>&emsp;&emsp;&emsp;&emsp;<em class="fa-solid fa-location-dot">&emsp;</em>Address&nbsp;:&nbsp;198 west 21 th<br>&emsp;&emsp; &emsp;&emsp;&emsp;&emsp;&emsp;&nbsp;&nbsp;&nbsp;&emsp;&emsp; Street,Suite
  <br>&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&nbsp;721 New York NY 10016</p>
   <br><br>
   
    <p>&emsp;&emsp;&emsp;&emsp;<em class="fa-solid fa-phone"></em>&emsp;Phone&nbsp;&nbsp;:&nbsp;+ 1235 2355 98<br></p>
 <br><br>
  <p>&emsp;&emsp;&emsp;&emsp;<em class="fa-solid fa-envelope"></em>&emsp;Email&emsp;&nbsp;:&nbsp;
    +abcd@gmail.com<br></p>
 <br><br>
  <p>&emsp;&emsp;&emsp;&emsp;<em class="fa-brands fa-firefox"></em>&emsp;Website&nbsp;:&nbsp;
   yoursite.com<br></p>
 <br>
 
  </div>
 </div>
</body>
</html>