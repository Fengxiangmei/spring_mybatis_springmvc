<%--
  Created by IntelliJ IDEA.
  User: niexiaoyi
  Date: 2019-09-02
  Time: 20:55
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
jjjjjj
${username}
<c:forEach items="${student}" var="s">
    <c:out value="${s.sname}"/>


</c:forEach>
</body>
</html>
