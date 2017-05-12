<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Hello Page</title>
    </head>
    <body>
        <div class="lc-block">
            <h1>
                Hello <b><c:out value="${pageContext.request.remoteUser}"></c:out></b>
                </h1>
            <c:url var="logoutUrl" value="/logout"/>
            <form action="${logoutUrl}" method="post">
                <input type="submit" class="button red big" value="Sign Out" /> <input
                    type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
            </form>
        </div>

    </body>
</html>