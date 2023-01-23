<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Epass Apply Form</title>
</head>
<body>
<Style>
body{
background-color: orange;
}
</Style>
  <h1>Epass Form</h1>
    <form  id="form" name="myform1" action="EpassFormTest" method="get">
    
    Enter Application No  :<input type="text" name="ApplicationNo" id="ApplicationNo" placeholder="Application No"><br><br>
    Enter  Applicant Name:<input type="text" name=" ApplicantName" id=" ApplicantName" placeholder=" Applicant Name"><br><br>
    Enter Aadhar No      :<input type="text" name="AadharNo" id="AadharNo" placeholder="Aadhar No"><br><br>
    <div><label>
    Enter Gender         :</label>
              <Select name="Gender">
                  <option value="Female">Female</option>
                  <option value="Male">Male</option>
                  <option value="Transgender">Transgender</option>
              </Select>
              </div><br>  
        
        <div><label>
    Enter Reason        :</label>
              <Select name="Reason">
                  <option value="logistic Deliveries">logistic Deliveries</option>
                  <option value="Medical Supply">Medical Supply</option>
                  <option value="Essential Services">Essential Services</option>
                  <option value="Medical Emergency">Medical Emergency</option>
                  <option value="Ecommerce Delivery Boys">Ecommerce Delivery Boys</option>
              </Select>
              </div><br>  
   
    Enter Father Name   :<input type="text" name="FatherName" id="FatherName" placeholder="Father Name"><br><br>
    Enter Dob: <input type="date" name="begin" 
        placeholder="dd-mm-yyyy" value=""
        min="1930-01-01" max="2030-12-31"><br><br>  
   
    Enter From District  :<input type="text" name="FromDistrict" id="FromDistrict" placeholder="From District"><br><br>
    Enter To District    :<input type="text" name="ToDistrict" id="ToDistrict" placeholder="To District"><br><br>
    Enter State          :<input type="text" name="State" id="State" placeholder="State"><br><br>
    Enter Travel Date     :<input type="text" name="TravelDate" id="TravelDate" placeholder="Travel Date"><br><br>
    Enter Return Date     :<input type="text" name="ReturnDate" id="ReturnDate" placeholder="Return Date"><br><br>
    Enter No Of Passengers:<input type="text" name="NoOfPassengers" id="NoOfPassengers" placeholder="No Of Passengers"><br><br>
    Enter Vehicle No      :<input type="text" name="VehicleNo" id="VehicleNo" placeholder="Vehicle No"><br><br>
    Enter Mobile No       :<input type="text" name="MobileNo" id="MobileNo" placeholder="Mobile No"><br><br>    
 
  <div><label>
    Enter Vaccination Certificate:</label>
              <Select name="VaccinationCertificate">
                  <option value="Yes">Yes</option>
                   <option value="No">No</option>
              </Select>
              </div><br>
  <br>  <button type="Back">Back</button>&nbsp;&nbsp;
    <button type="submit">submit</button><br><br>
    
    </form>  
</body>
</html>



