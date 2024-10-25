<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>


<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>학생명단</title>

<%-- css 파일 연결 (webapp 폴더 기준으로 경로 작성)--%>
<link rel="stylesheet" href="/resources/css/main.css">
</head>
<body>
	<h1>학생 상세조회</h1>
	<!--todoList 길이  -->
	<h3>${student.stdName}학생</h3>

	<hr>

	<hr>

	<table id="studentList" border="1">
		<thead>
			<tr>
				<th>학생 번호</th>
				<th>학생 이름</th>
				<th>학생 나이</th>
				<th>학생 성별</th>
				<th>등록 성적</th>
			</tr>
		</thead>

		<tbody>
			<tr>
				<th>${student.stdNo}</th>
				<th>${student.stdName}</th>
				<th>${student.stdAge}</th>
				<th>${student.stdGender}</th>
				<th>${student.stdScore}</th>
			</tr>

		</tbody>
	</table>




	<button id="goMain">목록으로</button>
	<button id="updateBtn">수정</button>
	<button id="deleteBtn">삭제</button>





	<%-- session 범위에 message가 있을 경우  --%>
	<c:if test="${not empty sessionScope.message }">
		<script>
			alert("${message}");
	
		</script>
		<%-- message를 한번만 출력하고 제거  --%>
		<c:remove var="message" scope="session" />
	</c:if>


	<%-- JS 연결 --%>
	<script src="/resources/js/detail.js"></script>
</body>
</html>