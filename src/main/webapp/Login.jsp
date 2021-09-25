<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
<link
	href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<script
	src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script
	src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
	integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
	crossorigin="anonymous">

<!--Fontawesome CDN-->
<link rel="stylesheet"
	href="https://use.fontawesome.com/releases/v5.3.1/css/all.css"
	integrity="sha384-mzrmE5qonljUremFsqc01SB46JvROS7bZs3IO2EmfFsd15uHvIt+Y8vEf7N7fWAU"
	crossorigin="anonymous">

<!--Custom styles-->
<link rel="stylesheet" type="text/css" href="styles.css">

<link rel="stylesheet" href="/path/to/bootstrap.min.css">
<link href="/path/to/dist/bootstrap-image-checkbox.css" rel="stylesheet">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
	integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
	crossorigin="anonymous"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
	integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
	crossorigin="anonymous"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
	integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
	crossorigin="anonymous"></script>
</head>
<body background='student.jpg'
	style="background-size: cover; background-repeat: no-repeat; height: 100%; font-family: 'Numans', sans-serif;">
	<div class="container" style="height: 100%; align-content: center;">
		<div class="d-flex justify-content-center h-100">
			<div class="card"
				style="height: 450px; margin-top: 250px; margin-bottom: auto; width: 400px; background-color: rgba(0, 0, 0, 0.5) !important;">
				<div class="card-header" style="color: white;">
					<h3>Register</h3>

				</div>
				<div class="card-body">
					<form action="LoginServController">
						<div class="input-group form-group">
							<div class="input-group-prepend">
								<span class="input-group-text"
									style="width: 50px; color: black; border: 0 !important;"><i
									class="fas fa-user"></i></span>
							</div>
							<input type="text" class="form-control" name="txtUsername"
								placeholder="username">

						</div>
						

						<div class="input-group form-group">
							<div class="input-group-prepend">
								<span class="input-group-text"><i class="fas fa-key"></i></span>
							</div>
							<input type="password" class="form-control" name="pwdUserPwd"
								placeholder="password">
						</div>
						
						<div class="form-group">
							<input type="submit" value="Login"
								class="btn float-right login_btn"
								style="color: black; width: 100px; margin-left: 15px; margin-right: 5px;">
						</div>
					</form>
				</div>

			</div>
		</div>
	</div>
</body>
</html>
