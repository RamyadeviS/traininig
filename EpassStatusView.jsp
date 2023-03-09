<%@page import="com.epassproject.epassform.model.EpassForm"%>
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
body{
 background-color:aqua;
 display: flex;
 }

th{
color:black;
}
.container{
 background-color:white;
  width: 400px;
  height:300px;
  padding: 0.9rem 1.5rem;
  padding-center: -110px;
  margin-left: 370px;
  margin-top: 90px; 
  font-size: 21px;
  align-content: right;
  margin-right:100px;
}

</style>

<body>
<ol> <a href="/jspfiles/userDashBoard.jsp"><em class="fa-solid fa-table-list"></em>&nbsp;Back</a></ol>              

<br>
<div class="container">
<h1>Epass Status View</h1> 
<% HttpSession session2=request.getSession();
//List<EpassForm>listEpassForm=//(List<EpassForm>)request.getAttribute("List_Users");
 String status =(String) session2.getAttribute("EpassStatus_List");
 %>
 
   <table border="1">
   <caption>view</caption>
       <thead>
       <tr>
      <th>status</th>
       </tr>
      </thead>
      <tbody>
       <tr>
      <br><br>   <td> <%=status%> </td>
      </tr>
         </tbody>
         </table>
        </div> 
</body>
</html>