<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <title>Team List</title>
</head>
<body>
<h1>Team List</h1>

<p>
    <a href="<c:url value='/team/form'/>">팀 등록</a>
</p>

<table border="1" cellpadding="8" cellspacing="0">
    <thead>
    <tr>
        <th>ID</th>
        <th>팀명</th>
        <th>설명</th>
        <th>생성일</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${teamList}" var="team">
        <tr>
            <td>${team.teamId}</td>
            <td>${team.teamName}</td>
            <td>${team.teamDesc}</td>
            <td>${team.createdAt}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
