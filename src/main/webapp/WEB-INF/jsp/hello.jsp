<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Hoofdpagina</title>
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
            <label>Enthousiasme en participatie</label>
            <input id="input" name="participatie"  type="text" /> <br>
            <label>Ideeën aanbrengen</label>
            <input id="input" name="Ideeen"  type="text"  /><br>
            <label>Inhouden correct en duidelijk kunnen uitleggen</label>
            <input id="input" name="InhoudUitleggen" type="text" /><br>
            <label>groep organiseren en sturen</label>
            <input id="input" name="Organiseren" type="text"  /><br>
            <label>Precisie en nauwkeurigheid</label>
            <input  id="input" name="Precisie" type="text" /><br>
            <label>Afspraken respecteren</label>
            <input  id="input" name="Afspraken" type="text" /><br>
            <input id="Assessment" name="submit" type="submit" value="Login" />
        </div>

    </body>
</html>