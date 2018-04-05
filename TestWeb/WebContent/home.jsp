<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Add two numbers</title>
</head>
<body>
	<div align="center">
		<form name="add" method="post" action="home">
			ПЕРВОЕ ЧИСЛО<input type="text" name="number1">
			ВТОРОЕ ЧИСЛО<input type="text" name="number2">
			<input type="submit" value="Сложить">
		</form>
	</div>
	<br>
	<h3>Summa</h3>
	<h3>${summa}</h3>
	
</body>
</html>