<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en" dir="ltr">
  <head>
    
    <meta charset="UTF-8">
    <link rel="stylesheet" href="/CSS files/EpaasForm.css">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Epass Form Apply</title>  
    <link rel ="stylesheet" href="/CSS files/Dashboard.css"> 
<%
   HttpSession session1 =request.getSession();
   String name=(String)session1.getAttribute("UserName");
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
        
          <ol> <a href="/jspfiles/EpassForm.jsp"><em class="fa-sharp fa-solid fa-car-side"></em>&nbsp;E-Pass Form</a></ol>
          <ol><a href="/jspfiles/TravelEpassForm.jsp"><em class="fa-solid fa-plane"></em>&nbsp;Travel Pass Form</a></ol>        
          <ol><a href="/jspfiles/ApplicationNo.jsp"><em class="fa-brands fa-wpforms"></em>&nbsp;Epass Status View</a></ol>
          <ol><a href="/jspfiles/ApplicationStatus.jsp"><em class="fa-brands fa-wpforms"></em>&nbsp;Travel Pass Status View</a></ol>        
          <ol><a href="/jspfiles/Dashboard.jsp"><em class="fa-solid fa-right-from-bracket"></em>&nbsp;Logout</a> </ol>
          
            </ul>
            
        </div>
    
        <br><br> <h1>E-Pass Apply Form</h1>
  <header>
  <div class="container">
  <div class="left">
    <form  id="form1" name="myform1" onsubmit="validateForm1()" action="/EpassForm" method="post" enctype="multipart/form-data">
   
     Applicant Name
     <input type="text" name="ApplicantName" id="ApplicantName" value=<%=name%> placeholder="Applicant Name">
     
       <br><br>
     Aadhar No <br>
     <input type="number" name="AadharNo" id="AadharNo" value=<%=aNo%> placeholder="Aadhar No" required >
       
     <div id="zip">
     <label>       
    <br> Gender <br>
     <Select name="Gender">
     <option value="Female">Female</option>
     <option value="Male">Male</option>
     <option value="Transgender">Transgender</option>
   </Select>
    </label>
   </div>
   <div>
   <label>
   <br>Reason <br>
  <Select name="Reason">
   <option value="logistic Deliveries">logistic Deliveries</option>
   <option value="Medical Supply">Medical Supply</option>
   <option value="Essential Services">Essential Services</option>
   <option value="Medical Emergency">Medical Emergency</option>
   <option value="Government Duty">Government Duty</option>
   <option value="Death Cause">Death Cause</option>
   <option value="Wedding Function">Wedding Function</option>
     </Select>
           </label>
           </div>     

  <br>  FatherName
    <input type="text" name="FatherName" id="FatherName" placeholder="Father Name"  onkeyup="fatherNameValid()">
    <span id="fathername-error"></span>

  <br><br> Date Of Birth
    <input type="date" name="dob" placeholder="DOB" id="dob" min="1950-01-01" max="2023-12-31">  
    <br>
   <br> From District
    <input type="text" name="FromDistrict" id="FromDistrict" placeholder="From District" onkeyup="fromDistrictValid()">
    <span id="fromDistrict-error"></span>
    <br>
 </div>
 
 &emsp; &emsp; &emsp; &emsp;
  <div class="right">
      <br> <br>
 To District   <br>            
    <input type="text" name="ToDistrict" id="ToDistrict" placeholder="To District" onkeyup="toDistrictValid()" >
    <span id="toDistrict-error"></span>  
     <br>  <br>
 
Travel Date 
 <input type="date" name="TravelDate" placeholder="TravelDate" id="TravelDate">
     <br>  <br> 
  Return Date
  <input type="date" name="ReturnDate" placeholder="ReturnDate" id="ReturnDate"> 
  <br><br>
  No Of Passengers<br>
   <input type="number" name="NoOfPassengers" id="NoOfPassengers" placeholder="No Of Passengers"  onkeyup="passengersValidation()">
   <span id="passengers-error"></span>
   <br> <br>
  Vehicle No <br>
   <input type="text" name="VehicleNo" id="VehicleNo" placeholder="Vehicle No"  onkeyup="vehicleNoValidation()">
        <span id="vehicleNo-error"></span>
        <br> <br>
   Mobile No <br>
     <input type="number" name="MobileNo" id="MobileNo" placeholder="**********"   onkeyup="mobileNoValidation()">
     <span id="mobileNo-error"></span>
     
   <br><br>
  Vaccination Certificate &nbsp;(2 Dose)<br>
  <input type="text" name="VaccinationCertificate" id="VaccinationCertificate" placeholder="VaccinationCertificate" onkeyup="vaccinationCertificateValid()">
     <span id="vaccinationCertificate-error"></span>
     <br> <br> 
  
<br> 
  <label>
    Upload Image &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 
 <input type="file" id="image" name="image" ><br>
 <br>&emsp;&emsp; <input type="Submit" value="Go back!" onclick="history.back()"> &nbsp;&nbsp;&nbsp;
 <button type="submit">&nbsp;Submit</button>
   </label>
   </div> 

</div>
 </header>
</form>
<script>
            var dateInput = document.getElementById("TravelDate");
            var today = new Date();
            var minDate = today.toISOString().split('T')[0];
            dateInput.setAttribute("min", minDate);
            var oneMonthLater = new Date(today.getFullYear(),
                    today.getMonth() + 8 , today.getDate() + 31);
            var maxDate = oneMonthLater.toISOString().split('T')[0];
            dateInput.setAttribute("max", maxDate);
        </script>

<script>
            var dateInput = document.getElementById("ReturnDate");
            var today = new Date();
            var minDate = today.toISOString().split('T')[0];
            dateInput.setAttribute("min", minDate);
            var oneMonthLater = new Date(today.getFullYear(),
                    today.getMonth() + 8, today.getDate() + 31);
            var maxDate = oneMonthLater.toISOString().split('T')[0];
            dateInput.setAttribute("max", maxDate);
        </script>
        
<script type="text/javascript" src="/Java Script/ScriptValidation.js"></script>  
</body>
</html>