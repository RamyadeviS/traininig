<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Status View</title>
<link rel="stylesheet" href="/CSS files/ApplicationNo.css">


</head>

<body>
 <ol> <a href="/jspfiles/UserDashBoard.jsp"><em class="fa-solid fa-table-list"></em>&nbsp;Back</a></ol>              

<div class="Pic">
  <img alt="" src="/Images/StatusView1.jpg">
  </div>
          
<div class="container">
<h1>Status Check</h1>
<form name="form" action="/userView" method="post" align="center">
<br><br><br><br>
<div class="details">
 Application No:<br><br>
 <input type="number" name="search" id="ApplicationNo" placeholder="ApplicationNo"><br><br>
 
  <input type="button" value="Cancel">
   <button type="Submit">Submit</button>

 </div>
 </form>
 <h2>Epass Status View</h2> 
 <div class="Status">
<% HttpSession session2=request.getSession();
//List<EpassForm>listEpassForm=//(List<EpassForm>)request.getAttribute("List_Users");
 String status =(String) session2.getAttribute("EpassStatus_List");
 %>
 
   <table border="1">
   <caption>view</caption>
       <thead>
       <tr>
      <th>Status</th>
       </tr>
      </thead>
      <tbody>
       <tr>
      <br><br>   <td> <%=status%> </td>
      </tr>
         </tbody>
         </table>
        </div> 
       
 </div>
</body>
</html>