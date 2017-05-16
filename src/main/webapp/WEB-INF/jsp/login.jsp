<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Login Page</title>
        <spring:url value="/css/style.css" var="urlCss"/>
       <link rel="stylesheet" href="${urlCss}" type="text/css" />
    </head>
    
    <body id="body" onload='document.loginForm.username.focus();'>
        <div id="logo">
            <h1 id="logotext">Give A Day</h1>
        </div>
        <div id="login-box">           
           
            <h3>Login</h3>
            <c:if test="${not empty error}">
                <div class="error">${error}</div>
            </c:if>  
            <c:if test="${not empty msg}">
                <div class="msg">${msg}</div>
            </c:if>
           
           <form name='loginForm' action="<c:url value='/login' />" method='POST'>
                 <table id="logintable">
                    <tr>
                        <td colspan='2'><input id="input" placeholder="Gebruikersnaam" type='text' name='username'></td>
                    </tr>
                    <tr>
                        <td colspan='2'><input id="input" placeholder="Wachtwoord" type='password' name='password' /></td>
                    </tr>
                    <tr>
                        <td colspan='2'><input id="loginbutton" name="submit" type="submit"
                                               value="Login" /></td>
                    </tr>
                </table>

                <input type="hidden" name="${_csrf.parameterName}"
                       value="${_csrf.token}" />

            </form>
        </div>

    </body>
</html>
