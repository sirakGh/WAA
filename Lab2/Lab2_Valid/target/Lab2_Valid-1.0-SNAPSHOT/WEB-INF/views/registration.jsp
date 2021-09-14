<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>




<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration</title>
</head>
<body>

<h1>Registration Form</h1><br />


<form:form modelAttribute="student" action="registration" method="post">
    <fieldset>
        <legend>Add student</legend>
        <p>
            <form:errors path="*" cssStyle="color : blue;" />
        </p>
        <label for="id">ID: </label>
        <form:input path="id" id="id" />
        <div style="text-align: center;">
            <form:errors path="id" cssStyle="color : blue;" />
        </div>

            <label for="firstName">First Name: </label>
                <form:input path="firstName" id="firstName" />
        <div style="text-align: center;">
            <form:errors path="firstName" cssStyle="color : blue;" />
        </div>
        <label for="lastName">Last Name: </label>
        <form:input path="lastName" id="lastName" />
        <div style="text-align: center;">
            <form:errors path="lastName" cssStyle="color : blue;" />
        </div>

        <label for="email">Email: </label>
        <form:input path="email" id="email" />
        <div style="text-align: center;">
            <form:errors path="email" cssStyle="color : blue;" />
        </div>
        <label for="gender">Gender: </label>
        <form:select path="gender" id="gender">
            <form:option value="Male"/>
            <form:option value="Female"/>
        </form:select>
        <div style="text-align: center;">
            <form:errors path="gender" cssStyle="color : blue;" />
        </div>

        <label for="birthday">birthday: </label>
        <form:input path="birthday" id="birthday" />
        <div style="text-align: center;">
            <form:errors path="birthday" cssStyle="color : blue;" />
        </div>

        <label for="phonearea">Phone: </label>
        <form:input path="phone.area" id="phonearea" />-
        <form:input path="phone.prefix" id="phoneprefix" />-
        <form:input path="phone.number" id="phonenumber" />
        <div style="text-align: center;">
            <form:errors path="phone.area" cssStyle="color : blue;" /></br>
            <form:errors path="phone.prefix" cssStyle="color : blue;" /></br>
            <form:errors path="phone.number" cssStyle="color : blue;" />
        </div>

        <p id="buttons">
            <input id="reset" type="reset" tabindex="4">
            <input id="submit" type="submit" tabindex="5" value="Add Employee">
        </p>
    </fieldset>
    </form:form>
    </body>
</html>