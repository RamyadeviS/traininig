<%@page import="com.epassproject.epassform.model.EpassForm"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>List</title>
     <link rel="stylesheet" href="/CSS files/List.css">
 
</head>

<body>
 <ol> <a href="/jspfiles/AdminDashBoard.jsp"><em class="fa-solid fa-table-list"></em>&nbsp;Back</a></ol>              
<h1> &emsp;&emsp;&emsp;&emsp;E-Pass Approve List</h1> 
  <form action="/EpassApproveList" method="Get">
  
  <% HttpSession session2=request.getSession();
   List<EpassForm>listEpassForm=(List<EpassForm>)request.getAttribute("List_Approve");
   %>

   <table border="1"> 
    <caption>View</caption>
       <thead>
       <tr>
       <th>Application No</th>
       <th>Applicant Name </th>
       <th>Aadhar No </th>
       <th>Gender</th>
       <th>Reason</th>
       <th>From District</th>
       <th>To District</th>
       <th>State</th>
       <th>Travel Date</th>
       <th>Return Date</th>
       <th>Passengers</th>
       <th>Vehicle No</th>
       <th>Mobile No</th>
       <th>Vaccine Certificate</th>
       <th>Status</th>
       <th>Certificate Image </th>
       </tr>
       </thead>
       </tbody>
     <% for(EpassForm epass:listEpassForm) { %>
       <tr>
       <td><%=epass.getApplicationNo() %> </td>
       <td> <%=epass.getApplicantName() %> </td>
       <td> <%=epass.getAadharNo() %> </td>
       <td> <%=epass.getGender() %> </td>
       <td> <%=epass.getReason() %> </td>
       <td> <%=epass.getFromDistrict() %> </td>
       <td> <%=epass.getToDistrict() %> </td>
       <td> <%=epass.getState() %> </td>
       <td id="Date"> <%=epass.getTravelDate() %> </td>
       <td id="Date"> <%=epass.getReturnDate() %> </td>
       <td> <%=epass.getNoOfPassengers() %> </td>
       <td> <%=epass.getVehicleNo() %> </td>
       <td> <%=epass.getMobileNo() %> </td>
       <td> <%=epass.getVaccinationCertificate() %> </td>
       <td> <%=epass.getStatus() %> </td>
       <td> <img alt="image" src="data:image/jpg;base64,<%=epass.getImagePath() %>" style="width:200px; height:230px;"> </td>
      </tr>
      <% } %> 
      </tbody>
   </table>
   <br><br>
   
</form>
<script src="Java Script/DateFormat.js"></script>
</body>
</html>