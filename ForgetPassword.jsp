<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="/CSS files/ForgotPassword.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.3.0/css/all.min.css">
 
</head>
<body>
<ul class="active"><a href="/jspfiles/Dashboard.jsp"><em class="fa-solid fa-house-circle-exclamation"></em></a>
 </ul>
	<form id="forgot" onsubmit="equal()" action="/forgot" method="post">
		<div class="container">
			<tr>
				<br>
				<td>&emsp;&emsp;&emsp;&emsp;&emsp;Mail Id <br>
				</td>
				<td>&emsp;&emsp;&nbsp;<input type="text" name="MailId" id="mailId"
					placeholder="Mail Id" required onkeyup="mailIdValidation()">

				</td>
			</tr>

			<br>
			<br>
			<tr>
				<td>&emsp;&emsp;&emsp;Create New Password <br>
				</td>
				<td>&emsp;&emsp;<input type="password" name="Password" id="Password"
					placeholder="Password" required onkeyup="passwordValidation()">

				</td>
			</tr>

			<br>
			<br>
			<tr>
				<td>&emsp;&emsp;&emsp;Confirm Password <br>
				</td>
				<td>&emsp;&emsp;<input type="Password" name="Password" id="password"
					placeholder="Password" required onkeyup="passwordValidation()">
				</td>
			</tr>
			<div>
				<br>
				<br>
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				<button value="cancel">Cancel</button>
				&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;
				<button type="submit">Submit</button>
			</div>
		</div>
	</form>
</body>
</html>