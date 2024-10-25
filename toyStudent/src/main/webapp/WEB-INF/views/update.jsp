<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<head>
<meta charset="UTF-8">
<title>${student.stdName}상세조회</title>
</head>
<body>
	<h1>${student.stdName}</h1>



 <form action="/studnet/update" method="post" id="updateForm">
	<table border="1">
	
	
	
	<thead>
	<input type="hidden" name ="number" value="${param.stdNo}">
		
		
		
		
		
	</thead>
		<tbody>
			<tr>
				<td>이름</td>
				<td>
			<input type="text" name="name" value="${student.stdName}">
 			</td>
 			<%--<td>${student.stdName}</td>    --%>
			</tr>
			<tr>
				<td>나이</td>
				<td>
				<input type="text" name="age" value="${student.stdAge}">
			</td>
			</tr>
		

			<tr>
				<td>학점</td>
				<td>
				<input type="text" name="score" value="${student.stdScore}">
				</td>
			</tr>

		</tbody>
	</table>
	

	<button>수정</button>
	
	</form>




	<script src="/resources/js/detail.js"></script>
</body>

</head>
</html>