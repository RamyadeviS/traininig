<%@page import="com.epassproject.epassform.model.TravelEpassForm"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<style>
header{
 background:url(/Images/images m.jpg);
background-position: center;
background-size: cover;
width:100%;
height:700px;
margin-left: 10px;
background-repeat: no-repeat;
}
th{
color:black;
}
.container{
 background-color:white;
  width: 400px;
  height:300px;
  padding: 1.9rem 2.9rem;
  padding-center: -110px;
  margin-left: 370px;
  margin-top: 120px; 
  font-size: 19px;
  align-content: right;
  margin-right:100px;
}

</style>
<body>
<ol> <a href="/jspfiles/UserDashBoard.jsp"><em class="fa-solid fa-table-list"></em>&nbsp;Back</a></ol>              

<div class="container">
<form action="Approve" method="post">
<h1>&emsp;&emsp;&emsp;Travel Pass Status View</h1> 
<% HttpSession session2=request.getSession();
 String status =(String) session2.getAttribute("TravelStatus_List");
 %>
   <br><br>
   <table>
    <caption>view</caption>
       <thead>
       <tr>
       <th>status</th>
       </tr>
      </thead>
      <tbody>
     
       <tr>
       <td> <%=status%> </td>
      </tr>
         </tbody>
         </table>
         </div>
</body>
</html>