<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Hoofdpagina</title>
         <spring:url value="/css/style.css" var="urlCss"/>
       <link rel="stylesheet" href="${urlCss}" type="text/css" />
    </head>
    <body>
        <div class="lc-block">
            <h1>
                Welkom <b><c:out value="${pageContext.request.remoteUser}"></c:out></b>
                </h1>
            <c:url var="logoutUrl" value="/logout"/>
            <form action="${logoutUrl}" method="post">
                <input type="submit" class="button red big" value="Sign Out" /> <input
                    type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
            </form>
        </div>
        <div class="lc-block">
            <h1>Peerassessment</h1>
            <form action="assessementIndienden" method="post">
            <label>Enthousiasme en participatie</label>
            <input id="1" name="participatie"  type="text" /> <br>
            <label>Ideeën aanbrengen</label>
            <input id="2" name="Ideeen"  type="text"  /><br>
            <label>Inhouden correct en duidelijk kunnen uitleggen</label>
            <input id="3" name="InhoudUitleggen" type="text" /><br>
            <label>groep organiseren en sturen</label>
            <input id="4" name="Organiseren" type="text"  /><br>
            <label>Precisie en nauwkeurigheid</label>
            <input  id="5" name="Precisie" type="text" /><br>
            <label>Afspraken respecteren</label>
            <input  id="6" name="Afspraken" type="text" /><br>
            <input id="Assessment" name="submit" type="submit" value="Login" />
            </form>
            
        </div>

    </body>
</html>
