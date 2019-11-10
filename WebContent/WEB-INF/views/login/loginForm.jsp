<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
h1{
	color: #5cf;
}
</style>
</head>
<body>
<h1>+ + 로그인 + + </h1>
<hr>
<c:choose>
<c:when test="${not empty login }" >
	<h3>${sessionScope.userid }</h3>
	<button onclick="location.href='/login/logout' ">로그아웃</button>
</c:when> 
<c:otherwise>
<!-- <form action="/login/login" method="post"> -->
<form action="<%=response.encodeUrl("/login/login") %>" method="post">
<!-- <form action="/login/login;jsessionid=<%=session.getId() %>" method="post"> -->
<fieldset style="width: 280px;">
			<legend> 로그인하기 </legend>
      <table>
         <tr>
            <td><label for="userid">아이디</label></td>
            <td><input type="text" id="userid" name="userid" size="20"
               placeholder="아이디 입력" /></td>
         </tr>

         <tr>
            <td><label for="userpw">비밀번호</label></td>
            <td><input type="password" id="userpw" name="userpw"
               size="20" placeholder="비밀번호 입력" /></td>
         </tr>

         <tr>

            <td><a href="login/loginForm"><button>로그인</button></a></td>
         </tr>
      </table>
      </fieldset>
   </form>
   


</c:otherwise>


</c:choose>



</body>
</html>