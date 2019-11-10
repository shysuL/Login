<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<% request.setCharacterEncoding("UTF-8"); %>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>loginSuccess</h1>
<hr>
<h3>${userid } 님, 로그인 되었습니다</h3>
<a href="/login/login"><button>메인화면</button></a>

</body>
</html>