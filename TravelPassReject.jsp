<%@page import="com.epassproject.epassform.model.TravelEpassForm"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
   <link rel="stylesheet" href="/CSS files/TravelList.css">
</head>

<body>
 <ol> <a href="/jspfiles/AdminDashBoard.jsp"><em class="fa-solid fa-table-list"></em>&nbsp;Back</a></ol>              
<h1>&emsp;&emsp;&emsp;&emsp;Travel Pass Reject List</h1>
<form action="/TravelPassReject" method="Get">

<% HttpSession seesion=request.getSession();
 List<TravelEpassForm>listTravelPass=(List<TravelEpassForm>)request.getAttribute("Travel_Reject");
 %>
 
   <table border="2">
    <caption>view</caption>
       <thead>
       <tr>
       <th>Application No</th>
       <th>Applicant Name </th>
       <th>Gender</th>
       <th>Ticket No</th>
       <th>Aadhar No </th>
       <th>Mobile No</th>
       <th>Source</th>
       <th>Destination </th>
       <th id="Date">Travel Date</th>
       <th  id="Date">Return Date</th>
       <th>Reason</th>
       <th>Passengers</th>
       <th>Vaccine Certificate</th>
       <th>Status</th>
       <th>Certificate Image </th>
       </tr>
       </thead> 
       </tbody>
       <% for(TravelEpassForm TravelPass:listTravelPass) { %>
       <tr>
       
         <td><%=TravelPass.getApplicationNumber() %></td>
         </form>
         
       <td> <%=TravelPass.getApplicantName1() %> </td>
       <td> <%=TravelPass.getGender1() %> </td>
       <td> <%=TravelPass.getTicketNo()%> </td>
       <td> <%=TravelPass.getAadharNumber() %> </td>
       <td> <%=TravelPass.getPhoneNumber() %> </td>
       <td> <%=TravelPass.getSource()%> </td>
       <td> <%=TravelPass.getDestination()%> </td>
       <td id="TraveDate"> <%=TravelPass.getFromDate() %> </td>
       <td id="TraveDate"> <%=TravelPass.getToDate() %> </td>
       <td> <%=TravelPass.getReasons() %> </td>
       <td> <%=TravelPass.getPassengers() %> </td>
       <td> <%=TravelPass.getCovidCertificate() %> </td>
       <td><%=TravelPass.getAction() %> </td>
        <td> <img alt="image" src="data:image/jpg;base64,<%=TravelPass.getImagePath1() %>" style="width:230px; height:199;"></td>
       </tr>
       <% } %> 
      </tbody>
   </table>
   <script src="Java Script/FormatDate.js"></script>
       </body>
</html>