<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<link rel="stylesheet" href="/css/style.css"/>
<title>Insert title here</title>
</head>
<body>
    <div class="mainBody">
        <form:form class="d-flex flex-column ms-3 pb-3" action='/languages' method='POST' modelAttribute='language'>
            <div class="header d-flex justify-content-between me-3">
                <p>Language: ${singleLang.name}</p>
                <a href="/languages">Dashboard</a>
            </div>
            <p>Creator: ${singleLang.creator}</p>
            <p>Version: ${singleLang.version}</p>
            <a href="/languages/${singleLang.id}/edit">Edit</a>
            <a href="/languages/${singleLang.id}/delete">Delete</a>
        </form:form>
    </div>
</body>
</html>