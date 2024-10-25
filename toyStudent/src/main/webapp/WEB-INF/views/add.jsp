<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>학생 추가</title>
    
    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    <!-- Custom CSS -->
    <link href="${pageContext.request.contextPath}/resources/css/add.css" rel="stylesheet">
</head>
<body>
    <div class="container">
        <div class="form-container">
            <h1 class="page-title">학생 추가</h1>
            
            <form action="${pageContext.request.contextPath}/student/add" method="post">
                <div class="input-group">
                    <label for="name">이름</label>
                    <input type="text" id="name" name="stdName" required 
                           placeholder="이름을 입력하세요">
                </div>

                <div class="input-group">
                    <label for="age">나이</label>
                    <input type="number" id="age" name="stdAge" required 
                           placeholder="나이를 입력하세요">
                </div>

                <div class="input-group">
                    <label for="gender">성별</label>
                    <select id="gender" name="stdGender">
                        <option value="">성별을 선택하세요</option>
                        <option value="M">남자</option>
                        <option value="F">여자</option>
                    </select>
                </div>

                <div class="input-group">
                    <label for="grade">학점</label>
                    <input type="text" id="grade" name="stdScore" required 
                           placeholder="학점을 입력하세요">
                </div>

                <div class="button-group">
                    <button type="submit" class="submit-btn">학생 추가</button>
                    <button type="button" class="cancel-btn" 
                            onclick="location.href='${pageContext.request.contextPath}/'">
                        취소
                    </button>
                </div>
            </form>
        </div>
    </div>

    <!-- Bootstrap JS -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>