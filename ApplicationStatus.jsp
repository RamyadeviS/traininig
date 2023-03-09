<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="/CSS files/StatusView.css">

</head>

<body>
<ol> <a href="/jspfiles/UserDashBoard.jsp"><em class="fa-solid fa-table-list"></em>&nbsp;Back</a></ol>              

<div class="Pic">
  <img alt="" src="/Images/images m.jpg">
  </div>
          
<div class="container">
<h1>Status Check</h1>
<form name="form" action="/travelView" method="post" align="center">

<div class="details">
 <br><br><br>Application No:<br><br>
 <input type="number" name="search" id="ApplicationNo" placeholder="ApplicationNo"><br><br>
 
   <button type="Submit">Submit</button>
</div>
</form>
<br><br>
<h2>Travel Pass Status View</h2> 
<div class="Status">

<% HttpSession session2=request.getSession();
//List<EpassForm>listEpassForm=//(List<EpassForm>)request.getAttribute("List_Users");
 String status =(String) session2.getAttribute("TravelStatus_List");
 %>
   <br>
   <table border="1">
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

</div>

</body>
</html>