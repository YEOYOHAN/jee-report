<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>성적관리</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
</head>
<body>
	<h1>학생가입</h1>
	<form id="join" action="<%=request.getContextPath() %>/student.do">
	이름 <input type="text" name="name"/><br />
	주민번호 <input type="text" name="ssn"/><br />
	국어 <input type="text" name="kor"/><br />
	수학 <input type="text" name="math"/><br />
	영어 <input type="text" name="eng"/><br />
	사회 <input type="text" name="society"/><br />
	<input type="submit" value="정보전송"/>
	</form>
<script>
$('#join').submit(function() {
	alert('가입성공');
});
</script>	
</body>
</html>