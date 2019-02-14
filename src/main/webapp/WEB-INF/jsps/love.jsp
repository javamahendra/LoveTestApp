<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Love Testing</title>
<meta charset='utf-8'>

<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>Love Testing</title>
<link rel='stylesheet' href='../css/style.css'>
<style>

#whatsapp {
	border-radius: 8px;
}
</style>
<body>
	<div class='title'>
		<h1>Love Testing</h1>
	</div>
	<div class='container'>
		<div class='left'></div>
		<div class='right'>
			<div class=formBox'>
				<p>Your Name</p>
				<p>
				<h1>${txtuname}</h1>
				</p>
				<p>Your Partner Name</p>
				<p>
				<h1>${txtpname}</h1>
				</p>
				<div class='heart'>
					<div class='contn'>
						<img src='../imgs/lv1.png' alt='Norway' width='175' height='150'>
						<div class='centered'>
							<h2>Love${percentage}%</h2>
						</div>
					</div>
				</div>
			</div>
			<br> <b>${msg1} your love is true don't leave ${msg2}</b>
			<div id="fb-root"></div>
			<script>
				(function(d, s, id) {
					var js, fjs = d.getElementsByTagName(s)[0];
					if (d.getElementById(id))
						return;
					js = d.createElement(s);
					js.id = id;
					js.src = 'https://connect.facebook.net/en_GB/sdk.js#xfbml=1&version=v2.12';
					fjs.parentNode.insertBefore(js, fjs);
				}(document, 'script', 'facebook-jssdk'));
			</script>
			<br/>
			<br/>
			<div class="fb-share-button"
				data-href="http://loveapp.mj.milesweb.cloud/Mahendra_Gadiparthi/mvc/loveurl?txtuname=${msg1}&txtpname=${msg2}"
				data-layout="button_count" data-size="large"
				data-mobile-iframe="false">
				<a class="fb-xfbml-parse-ignore" target="_blank"
					href="https://www.facebook.com/sharer/sharer.php?u=http%3A%2F%2Floveapp.mj.milesweb.cloud%2FMahendra_Gadiparthi%2Fmvc%2Floveurl%3Ftxtuname%3D%2524%257Bmsg1%257D%26txtpname%3D%2524%257Bmsg2%257D&amp;src=sdkpreparse">Share</a>
			</div>
			<br/>
			<div id="mobile-share">
				<a
					href="whatsapp://send?text=http://loveapp.mj.milesweb.cloud/Mahendra_Gadiparthi/mvc/loveurl?txtuname=${msg1}&txtpname=${msg2}"
					data-action="share/whatsapp/share"><img id="whatsapp"
					src="../imgs/whatsapp.png" width="95" height="30" /></a>
			</div>

			<a href='/'> <br> <br> <img border='0'
				alt='loveyou.html' src='../imgs/try.jpeg' width='200' height='50'></a>
			<div></div>
			</form>
		</div>
	</div>
	</div>

</body>