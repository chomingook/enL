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
				<a class="navbar-brand" href="/indexlogin">Home</a>
			</div>
			<div class="navbar-collapse collapse" id="navbar-collapse-1">
				<ul class="nav navbar-nav">
					<li class="dropdown"><a href="#" class="dropdown-toggle"
						data-toggle="dropdown" role="button" aria-expanded="false">도서관관리
							<span class="caret"></span>
					</a>
						<ul class="dropdown-menu" role="menu">
							<li><a href="/member/libAdd">지점등록</a></li>
							<li class="divider"></li>
							<li><a href="/member/memberAdd">회원가입신청</a></li>
							<li class="divider"></li>
							<li><a href="/member/management">회원관리</a></li>
						</ul></li>
				</ul>
				<ul class="nav navbar-nav">
					<li class="dropdown"><a href="#" class="dropdown-toggle"
						data-toggle="dropdown" role="button" aria-expanded="false">도서관리
							<span class="caret"></span>
					</a>
						<ul class="dropdown-menu" role="menu">
							<li><a href="/Lbooks/booksAdd">도서등록</a></li>
							<li class="divider"></li>
							<li><a href="/Lbooks/deletebooks">도서폐기</a></li>
						</ul></li>
				</ul>
				<ul class="nav navbar-nav">
					<li class="dropdown"><a href="#" class="dropdown-toggle"
						data-toggle="dropdown" role="button" aria-expanded="false">도서대여/반납
							<span class="caret"></span>
					</a>
						<ul class="dropdown-menu" role="menu">
							<li><a href="/Lbooks/bookrental">도서대여</a></li>
							<li class="divider"></li>
								<li><a href="/Lbooks/bookreturn">도서반납</a></li>
						</ul></li>
				</ul>
				<ul class="nav navbar-nav navbar-right">
					<li><a href="#"><span class="glyphicon glyphicon-log-in"></span>${ADMIN_ID}로그아웃</a></li>
				</ul>
			</div>
		</div>
	</nav>

	<div class="container-fluid text-center">
		<div class="row content">
			<div class="col-sm-2 sidenav"></div>
			<div class="col-sm-8 text-left"></div>
			<div class="container">
				<br>
				<br>
				<h4 align="center">도서등록</h4>
				<br>
			<form class="form-inline" action="<c:url value = '/Lbooks/booksAdd'/>" method="post">
					<div>
					<label>도서관코드 : </label> <input type="text" class="form-control"
							name="LIB_CODE" style="width: 20%">
					</div>
					<br>
					
					<div>
					<label>도서명 : </label> <input type="text" class="form-control"
							name="BOOK_NAME" style="width: 20%">
					</div>
					<br>
					<div>
						<label>저자 : </label> <input type="text" class="form-control"
							name="BOOK_WRITER" style="width: 20%">
					</div>
					<br>
					<div>
						<label>출판사 : </label> <input type="text" class="form-control"
							name="BOOK_PUBLISHER" style="width: 20%">
					</div>
					<br>
					<div>
						<label>분류명 : </label> <input type="text" class="form-control"
							name="BOOK_CATEGORY" style="width: 20%">
					</div>
					<br>
					<div>
						<label>장르 : </label> <input type="text" class="form-control"
							name="BOOK_GENRE" style="width: 20%">
					</div>
					<br>
					<div>
						<label>도서위치 : </label> <input type="text" class="form-control"
							name="BOOK_LOCATION" style="width: 20%">
					</div>
					<br>
					
					<div>
						<label>최초대여일 : </label> <input type="date" class="form-control"
							name="BOOK_FIRSTRENTALDAY" style="width: 20%">
					</div>
					<br>
					<div>
						<button type="submit" class="btn btn-default">등록하기</button>
						<button type="reset" class="btn btn-default">초기화</button>
					</div>
				</form>
			</div>


			<footer class="container-fluid text-center">
				<p>영어 도서관 관리시스템</p>
			</footer>
		</div>
	</div>
</body>
</html>