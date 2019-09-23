<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>mysite</title>
<meta http-equiv="content-type" content="text/html; charset=utf-8">
</head>
<body>
	<div id="container">
		<div id="content">
			<div id="user">

				<form id="join-form" name="joinForm" method="post" action="${pageContext.servletContext.contextPath}/user/join"	>

					<label class="block-label" for="email">이메일</label>
					<input id="email" name="email" type="text" value="">
					<label class="block-label" for="age">나이</label>
					<input id="age" name="age" type="text" value="">					
					<input type="submit" value="가입하기">
					
				</form>
			</div>
		</div>
	</div>
</body>
</html>