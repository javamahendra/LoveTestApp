<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<meta charset='utf-8'>

<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>



<title>Love Testing</title>
<link rel="stylesheet" href="../css/style.css">
</head>
<body>

	<div class="title">
		<h1>Love Testing</h1>
	</div>
	<div class="container">
		<div class="left"></div>
		<div class="right">
			<div class="formBox">
				<form action="lovecal" method="get">
					<p>Your Name</p>
					<input type="text" size="10" name="txtuname"
						placeholder="Enter Your Name" autofouse />
					<p>Your Partner Name</p>
					<input type="text" size="10" name="txtpname"
						placeholder="Enter Your Partner Name" autofouse /> <input
						type="submit" value="Check Your Love" />

					<div></div>
				</form>
			</div>
		</div>
	</div>
</body>
</html>