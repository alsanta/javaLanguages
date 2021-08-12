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
        <form:form class="d-flex flex-column ms-3 pb-3" action='/languages/${language.id}' method='POST' modelAttribute='language'>
        <a href="/languages/${single.id}/delete">Delete</a><a href="/languages">Dashboard</a>
                <div class="name inputBox mt-3">
                    <form:label path='name'>Name:</form:label>
                    <form:errors path='name'/>
                    <form:input path='name'/>
                </div>
                <div class="creator inputBox">
                    <form:label path='creator'>Creator:</form:label>
                    <form:errors path='creator'/>
                    <form:input path='creator'/>
                </div>
                <div class="version inputBox">
                    <form:label path='version'>Version:</form:label>
                    <form:errors path='version'/>
                    <form:input path='version'/>
                </div>
                <input class="subBtn" type="submit" value="Submit">
        </form:form>
    </div>
</body>
</html>