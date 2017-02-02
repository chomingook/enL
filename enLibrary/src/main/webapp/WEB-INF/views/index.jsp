<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<title>Bootstrap Example</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="http://www.w3schools.com/lib/w3.css">
<link rel="stylesheet"
	href="http://fonts.googleapis.com/css?family=Raleway">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style>
body, h1 {
	font-family: "Montserrat", sans-serif
}

img {
	margin-bottom: -7px
}

.w3-row-padding img {
	margin-bottom: 12px
}

.navbar {
	margin-bottom: 0;
	border-radius: 0;
}

/* 아래 높낮이 */
.row.content {
	height: 750px
}

/* 2번색깔 */
.sidenav {
	padding-top: 20px;
	background-color: #f1f1f1;
	height: 100%;
}

/* 3번색깔 */
footer {
	background-color: #555;
	color: white;
	padding: 15px;
}

@media screen and (max-width: 767px) {
	.sidenav {
		height: auto;
		padding: 15px;
	}
	.row.content {
		height: auto;
	}
}
</style>
</head>
<body>

	<!-- !PAGE CONTENT! -->
	<div class="w3-content" style="max-width: 1500px">

		<!-- Header -->
		<header
			class="w3-container w3-padding-32 w3-center w3-opacity w3-margin-bottom">
			<img src="/resources/yes24.png" width="200" height=150 alt="yes24"></img>


		</header>
	</div>
	<nav class="navbar navbar-inverse">
		<div class="container-fluid">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target="#myNavbar">
					<span class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="./index.html">Home</a>
			</div>
			<div class="navbar-collapse collapse" id="navbar-collapse-1">
				<ul class="nav navbar-nav">
					<li class="dropdown"><a href="#" class="dropdown-toggle"
						data-toggle="dropdown" role="button" aria-expanded="false">도서관관리
							<span class="caret"></span>
					</a>
						<ul class="dropdown-menu" role="menu">
							<li><a href="./branch.html">지점등록</a></li>
							<li class="divider"></li>
							<li><a href="./member.html">회원가입신청</a></li>
							<li class="divider"></li>
							<li><a href="./management.html">회원관리</a></li>
						</ul></li>
				</ul>
				<ul class="nav navbar-nav">
					<li class="dropdown"><a href="#" class="dropdown-toggle"
						data-toggle="dropdown" role="button" aria-expanded="false">도서관리
							<span class="caret"></span>
					</a>
						<ul class="dropdown-menu" role="menu">
							<li><a href="./books.html">도서등록</a></li>
							<li class="divider"></li>
							<li><a href="./deletebooks.html">도서폐기</a></li>
						</ul></li>
				</ul>
				<ul class="nav navbar-nav">
					<li class="dropdown"><a href="#" class="dropdown-toggle"
						data-toggle="dropdown" role="button" aria-expanded="false">도서대여/반납
							<span class="caret"></span>
					</a>
						<ul class="dropdown-menu" role="menu">
							<li><a href="./bookrental.html">도서대여</a></li>
							<li class="divider"></li>
								<li><a href="./bookreturn.html">도서반납</a></li>
						</ul></li>
				</ul>

				<ul class="nav navbar-nav navbar-right">
					<li><a href="./login.html"><span class="glyphicon glyphicon-log-in"></span>
							로그인</a></li>
				</ul>
			</div>
		</div>
	</nav>

	<div class="container-fluid text-center">
		<div class="row content">
			<div class="col-sm-2 sidenav"></div>
			<div class="col-sm-8 text-left">
				<img alt="slly" src="/resources/slly.PNG" height="60px">
			</div>
			<div class="container">
				<br>
				<div class="row">
					<div class="col-md-4">
						<div class="thumbnail">
							<img src="/resources/youname.PNG" alt="youname" style="width: 50%">
							<div class="caption">
								<p>너의 이름은</p>
							</div>

						</div>
					</div>

					<div class="col-md-4">
						<div class="thumbnail">
							<img src="/resources/gong.PNG" alt="gong" style="width: 50%">
							<div class="caption">
								<p>완 공 : 완벽한 공부법</p>
							</div>
						</div>
					</div>

					<div class="col-md-4">
						<div class="thumbnail">
							<img src="/resources/min.PNG" alt="min" style="width: 50%">
							<div class="caption">
								<p>설민석의 조선왕조실록</p>
							</div>

						</div>
					</div>
				</div>
			</div>


			<footer class="container-fluid text-center">
				<p>영어 도서관 관리시스템</p>
			</footer>
		</div>
	</div>
</body>
</html>
