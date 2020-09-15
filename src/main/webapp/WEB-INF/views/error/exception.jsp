<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>에러페이지</title>
</head>
<body>

    <h1>데이터를 처리하는 과정에서 문제가 발생하였습니다.</h1>
    <h1>관리자에게 문의하여 주십시오.</h1>

    <h3><c:out value="${exception.getMessage()}"></c:out></h3>

    <ul>
        <c:forEach items="${exception.getStackTrace()}" var="stack">
            <%--<li><c:out value="${stack}"></c:out></li>--%>
            <li>${stack.toString()}</li>
        </c:forEach>
    </ul>
</body>
</html>
