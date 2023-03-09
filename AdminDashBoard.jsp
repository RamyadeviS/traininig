<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Counter</title>

<link rel ="stylesheet" href="/CSS files/Dashboard.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.3.0/css/all.min.css">

</head>

<style>
body{
background:url(/Images/admin.jpg);
background-position: center;
background-size: cover;
width:100%;
height:1200px;
margin-left: 10px;
background-repeat: no-repeat;
}
    .container{
	height: 200px;
	width: 290px;
	background-color:#0000ff;
	border-radius: 10px;
	margin-top:140px;
	margin-left: 20px;
	align-content: center;
	align-text: bottom;
	align-content: center;
	margin-left:100px;
}
.container1{
	height: 200px;
	width: 290px;
	background-color: teal;
	border-radius: 10px;
	margin-top: -200px;
	margin-left: 30px;
	align-content: center;
	align-text: bottom;
    margin-left:520px;
}

.container2{
	height: 200px;
	width: 290px;
	background-color: #ff80c0;
	border-radius: 10px;
	margin-top: -200px;
	align-content: center;
	align-text: bottom;
	margin-left:900px;	
}
.container3{
	height: 200px;
	width: 300px;
	background-color: #00ff80;
	border-radius: 10px;
	margin-top: 50px;
	margin-left: 100px;
	align-content: center;
	
}
.container4{
	height: 200px;
	width: 300px;
	background-color:#ff0000;
	border-radius: 10px;
	margin-top: 50px;
	margin-left: 100px;
	align-content: center;

	
}

.container5{
	height: 190px;
	width: 300px;
	background-color:#ffff00 ;
	border-radius: 10px;
	margin-top: 50px;
	margin-left: 100px;
}

.container6{
	height: 200px;
	width: 300px;
	background-color: #00ff80;
	border-radius: 10px;
	margin-top: -690px;
	margin-left: 520px;
	align-content: center;
	
}
.container7{
	height: 200px;
	width: 300px;
	background-color:#ff0000;
	border-radius: 10px;
	margin-top: 50px;
	margin-left: 520px;
	align-content: center;

	
}

.container8{
	height: 190px;
	width: 300px;
	background-color:#ffff00 ;
	border-radius: 10px;
	margin-top: 50px;
	margin-left: 520px;
}
</style>

<body>
<div class="menu-bar">
        <ul>
        
        <ol> <a href="/listEpassForm"><em class="fa-solid fa-table-list"></em>&nbsp;Epass Form List View</a></ol>        
         <ol> <a href="/listTravelPass"><em class="fa-solid fa-table-list"></em>&nbsp;Travel Pass Form List View</a></ol>        
    <ol> <a href="/jspfiles/Dashboard.jsp"><em class="fa-solid fa-right-from-bracket"></em>&nbsp;Logout</a></ol>
     
       </ul>
       </div>
        <div class="container">
     <br><br><br><br>  <h2 class="topic-heading">Epass Apply Count</h2>
            <p><strong><a href="/listEpassForm">${Epass_count}</strong></p></a>
</div>
        
          <div class="container1">
       <br><br><br><br>  <h2 class="topic-heading">Travel Pass Apply Count</h2>
            <p><strong><a href="/listTravelPass">${TravelPass_count}</strong></p></a>
</div>

         <div class="container2">
      <br><br><br><br>   <h2 class="topic-heading">Total User Count</h2>
            <p><strong>${TotalUser_count}</strong></p>
</div>
  <div class="container3">
      <br><br><br><br>   <h2 class="topic-heading">Epass Approve</h2>
            <p><strong><a href="/EpassApproveList">${TotalApprove_count}</strong></p></a>
            </div>
            
  <div class="container4">
      <br><br><br><br>   <h2 class="topic-heading">Epass Reject</h2>
      <p><strong><a href="/EpassRejectList">${TotalReject_count}</strong></p></a>
    </div>
    
  <div class="container5">
      <br><br><br><br>   <h2 class="topic-heading">Epass Pending</h2>
      <p><strong><a href="/EpassPendingList">${TotalPending_count}</strong></p></a>
    </div>
    
    <div class="container6">
      <br><br><br><br>   <h2 class="topic-heading">Travel Pass Approve</h2>
            <p><strong><a href="/TravelPassApprove">${TotalApprove_count1}</strong></p></a>
            </div>
            
  <div class="container7">
      <br><br><br><br><h2 class="topic-heading">Travel Pass Reject</h2>
      <p><strong><a href="/TravelPassReject">${TotalReject_count1}</strong></p></a>
    </div>
    
  <div class="container8">
      <br><br><br><br>   <h2 class="topic-heading">Travel Pass Pending</h2>
      <p><strong><a href="/TravelPassPending">${TotalPending_count1}</strong></p></a>
    </div>
          
        <body style="text-align:center">
   
    <div id="counter">
        <!-- counts -->
    </div>

</body>
</html>