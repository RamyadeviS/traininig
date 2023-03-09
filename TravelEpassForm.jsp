<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en" dir="ltr">
  <head>
   
    <meta charset="UTF-8">
    <link rel="stylesheet" href="/CSS files/TravelPass.css">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Travel Pass Apply Form</title>
        <link rel ="stylesheet" href="/CSS files/Dashboard.css"> 
    
     
<%
   HttpSession session1 =request.getSession();
   String name=session.getAttribute("UserName").toString();
  %>
   <%
   HttpSession session2 =request.getSession();
   Long aNo=(Long)session2.getAttribute("AadharNo");
%>
</head>
<body>
 <ol> <a href="/jspfiles/UserDashBoard.jsp"><em class="fa-solid fa-table-list"></em>&nbsp;Back</a></ol>              

<div class="menu-bar">
        <ul>
        
          <ol><a href="/jspfiles/EpassForm.jsp"><em class="fa-sharp fa-solid fa-car-side"></em>&nbsp;E-Pass Form</a></ol>
         <ol><a href="/jspfiles/TravelEpassForm.jsp"><em class="fa-solid fa-plane"></em>&nbsp;Travel E-Pass Form</a></ol>        
         <ol><a href="/jspfiles/ApplicationNo.jsp"><em class="fa-brands fa-wpforms"></em>&nbsp;Epass Status View</a></ol>
         <ol><a href="/jspfiles/ApplicationStatus.jsp"><em class="fa-brands fa-wpforms"></em>&nbsp;Travel Pass Status View</a></ol>      
        <ol><a href="/jspfiles/Dashboard.jsp"><em class="fa-solid fa-right-from-bracket"></em>&nbsp;Logout</a></ol>
            </ul>
        </div>
<br><br>  <h1>Travel Pass Form</h1>    
  <header>
 
  <div class="container">
  <div class="left">
  <form id="form" name="myform1" onsubmit="validateForm()" action="/TravelForm" method="post" enctype="multipart/form-data" align="center">
    <br>
     Applicant Name
     <input type="text" name="ApplicantName" id="ApplicantName" value=<%=name %> placeholder="Applicant Name" >
     
       
    <div id="zip">
     <label>       
     Gender <br>
     <Select name="Gender">
     <option value="Female">Female</option>
     <option value="Male">Male</option>
     <option value="Transgender">Transgender</option>
   </Select>
    </label>
   </div>
        
    <br>  FatherName
    <input type="text" name="FatherName" id="FatherName" placeholder="Father Name"  onkeyup="fatherNameValid()">
    <span id="fathername-error"></span>

     <br><br>
  Ticket No
   <input type="text" name="TicketNo" id="TicketNo" placeholder="Ticket No"  onkeyup="ticketNoValidation()">
        <span id="ticketNo-error"></span>
        <br>
    
  <br> Date Of Birth
    <input type="date" name="dob" placeholder="dob" id="dob" min="1950-01-01" max="2023-01-31">  
    <br>   
    <br>
  Aadhar No <br>
     <input type="number" name="AadharNo" id="AadharNo"value=<%=aNo%> placeholder="Aadhar No" required >

  <br><br>
   Mobile No
     <input type="number" name="MobileNo" id="MobileNo" placeholder="**********"   onkeyup="mobileNoValidation()">
     <span id="mobileNo-error"></span>
     <br><br>
        Source<br>
    <input type="text" name="Source" id="Source" placeholder="Source" onkeyup="sourceValid()">
    <span id="source-error"></span>
    <br><br>    
  </div>

 &emsp;&emsp;&emsp; <div class="right">
   &emsp;&emsp;<br>  &emsp;&emsp; Destination<br>
    <input type="text" name="Destination" id="Destination" placeholder="Destination" onkeyup="destinationValid()">
    <span id="destination-error"></span>
    <br><br>  
 
    Travel Date 
 <input type="date" name="TravelDate" placeholder="TravelDate" id="TravelDate">
     <br><br>
   Return Date
  <input type="date" name="ReturnDate" placeholder="ReturnDate" id="ReturnDate"> 
  <br>  
  
   <div>
   <label>
   <br>&emsp;&emsp;Reason <br>
  <Select name="Reason">
   <option value="logistic Deliveries">logistic Deliveries</option>
   <option value="Medical Supply">Medical Supply</option>
   <option value="Essential Services">Essential Services</option>
   <option value="Medical Emergency">Medical Emergency</option>
   <option value="Death Cause">Death Cause</option>
   <option value="Wedding Function">Wedding Function</option>
     </Select>
           </label>
           </div>     
     <br>     
 &emsp;&emsp;No Of Passengers <br>
   <input type="number" name="NoOfPassengers" id="NoOfPassengers" placeholder="No Of Passengers"  onkeyup="passengersValidation()">
   <span id="passengers-error"></span>
  <br>
  <br>
  &emsp;&emsp;Vaccination Certificate &nbsp;(2 Dose)<br>
  <input type="text" name="VaccinationCertificate" id="VaccinationCertificate" placeholder="VaccinationCertificate" onkeyup="vaccinationCertificateValid()">
     <span id="vaccinationCertificate-error"></span>
     <br> <br> 
<br> 
  <label>
   &emsp;&emsp; Upload Image &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<br><br>  <input type="file" id="image" name="image" &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;><br>
 <br>&emsp;&emsp;&emsp; <input type="Submit" value="Go back!" onclick="history.back()"> &nbsp;&nbsp;&nbsp;&nbsp;
 &emsp;&emsp; <button type="submit">&nbsp;Submit</button>
   </label>
   
</div>
</div>
<div class="column3">
<h4>All people entering TamilNadu from other 
countries should Apply in the E-pass.</h4>

<img alt="" src="\Images\Travel1.jpg" id="travel">
   </div>
   </div>  

</form>

<script>
            var dateInput = document.getElementById("TravelDate");
            var today = new Date();
            var minDate = today.toISOString().split('T')[0];
            dateInput.setAttribute("min", minDate);
            var oneMonthLater = new Date(today.getFullYear(),
                    today.getMonth() +8 , today.getDate() + 31);
            var maxDate = oneMonthLater.toISOString().split('T')[0];
            dateInput.setAttribute("max", maxDate);
        </script>

<script>
            var dateInput = document.getElementById("ReturnDate");
            var today = new Date();
            var minDate = today.toISOString().split('T')[0];
            dateInput.setAttribute("min", minDate);
            var oneMonthLater = new Date(today.getFullYear(),
                    today.getMonth() +8 , today.getDate() + 31);
            var maxDate = oneMonthLater.toISOString().split('T')[0];
            dateInput.setAttribute("max", maxDate);
        </script>
        

<script type="text/javascript" src="/Java Script/ScriptValidation.js"></script>  

</body>
</html>