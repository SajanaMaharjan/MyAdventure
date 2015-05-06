<%-- 
    Document   : adventure
    Created on : May 5, 2015, 11:35:34 PM
    Author     : sajana
--%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>

        <%@include file="templates/header.jsp"%>

        Adventures
        <section>
            <div class="dataList">
                <table>
                    <c:forEach var="adventure" items="${adventures}">
                        <tr>
                            <td> the title</td>
                            <td>${adventure.adventureName}</td>
                            <td>${adventure.adventureDescription}</td>
                            <td></td>
                        </tr>
                    </c:forEach>
                </table>
            </div>
        </section>
        
         <%@include file="templates/footer.jsp"%>
    </body>
</html>