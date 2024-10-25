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
	<h1>메인화면</h1>
	<h3>전체 학생 수 : ${fn:length(studentList)}</h3>

	<hr>
	
	<hr>

	<%-- 할 일 목록 출력 --%>
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
			<c:forEach items="${studentList}" varStatus="vs" var="std">
					<th>${std.stdNo}</th>
					<th>
						<a href="/student/detail?stdNo=${std.stdNo}">${std.stdName}</th>
					<th>${std.stdAge}</th>
					<th>${std.stdGender}</th>
					<th>${std.stdScore}</th>
					<%-- 등록일 --%>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	
	<form action="/student/addView" method="get">
        <input type="submit" value="학생추가"> 
    </form>
	

	
	<%-- session 범위에 message가 있을 경우  --%>
	<c:if test="${not empty sessionScope.message }">
		<script> alert("${message}");</script>
		
	 <%-- message를 한번만 출력하고 제거  --%>
	 <c:remove var="message" scope="session"/>
	</c:if>


	
	<script src=""></script>
</body>
</html>