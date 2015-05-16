<%-- 
    Document   : Destination
    Created on : May 5, 2015, 12:55:35 AM
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
        Destinations
        <section>
            <div class="dataList">
                <table>
                    <tr>
                        <td>Name: </td>
                        <td>${selectedDestination.destinationName}</td>
                    </tr>
                    <tr>
                        <td>Description: </td>
                        <td>${selectedDestination.destinationDescription}</td>
                    </tr>
                </table>
            </div>
        </section>
        <%@include file="templates/footer.jsp"%>
    </body>
</html>
