<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register Form </title>
</head>
<body>
<Style>
body{
background-color: pink;
}
</Style>
<h1>Register Form</h1>
    <form  id="form" name="myform1" onsubmit="validateForm()" action="RegisterServlet" method="get">
    
    Enter Aadhar No:<input type="text" name="AadharNo" id="aadharNo" placeholder="Aadhar No"><br><br>
    Enter User Name:<input type="text" name="UserName" id="userName" placeholder="User Name"><br><br>
    Enter Mail Id:<input type="text" name="MailId" id="mailId" placeholder="Mail Id"><br><br>
    Enter Password:<input type="text" name="Password" id="password" placeholder="Password"><br><br>
    Enter Mobile No:<input type="text" name="MobileNo" id="mobileNo" placeholder="Mobile No"><br><br>
    
    <button type="Back">Back</button>
    <button type="submit">submit</button><br><br>
    
    </form>  
    
  <script>
    function validateForm() {
      event.preventDefault(); //to prevent the default behaviour of navigation
      let aadharNo = document.querySelector("#aadharNo").value;
      let userName = document.querySelector("#userName").value;
      let mailId = document.querySelector("#mailId").value;
      let password = document.querySelector("#password").value;
      let mobileNo = document.querySelector("#mobileNo").value;

      try {
        if (aadharNo == null || aadharNo.trim() == "") {

          throw new Error("aadharNo cannot be empty");
        }
        else if (aadharNo.length < 12 ||aadharNo.length >12 ) {
          throw new Error("aadharNo must be contain 12 digits");

        } else if (userName == null || userName.trim() == "") {
          throw new Error("Username cannot be empty");
        }

        else if (mailId == null || mailId.trim() == "") {
          throw new Error("mailId cannot be empty");
        }
        else if (password.length< 8) {
          throw new Error("password length should not be less than 8 characters");
        }

        else if (mobileNo ==null || mobileNo.trim() == "") {

          throw new Error("mobileNo cannot be empty");
        }
        else if (mobileNo.length< 10 ||mobileNo.length> 10) {
          throw new Error("mobileNo must be contain 10 digits");
        }
        else{
        	alert("Hello"+userName);
        }
        let form=document.querySelector("#form");
        form.submit();
      }
      //catch(Exception err) => err.getMessage()
      catch (err) {
        console.error(err);
        console.log("Validation Failed:" + err.message);
        alert("Error:" + err.message);
      }
    }
    
  </script>   
</body>
</html>