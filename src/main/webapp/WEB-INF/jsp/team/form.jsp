<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <title>Team Form</title>
</head>
<body>
<h1>팀 등록</h1>

<form action="<c:url value='/team/save'/>" method="post">
    <div>
        <label for="teamName">팀명</label>
        <input type="text" id="teamName" name="teamName" value="${team.teamName}">
    </div>

    <div>
        <label for="teamDesc">설명</label>
        <textarea id="teamDesc" name="teamDesc">${team.teamDesc}</textarea>
    </div>

    <button type="submit">저장</button>
</form>

<p>
    <a href="<c:url value='/team/list'/>">목록으로</a>
</p>
</body>
</html>
