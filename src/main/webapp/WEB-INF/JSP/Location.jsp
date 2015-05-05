<%-- 
    Document   : Location
    Created on : May 5, 2015, 12:55:35 AM
    Author     : sajana
--%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <section>
            <div class="dataList">
                <table>
                    <c:forEach var="location" items="${locations}">
                        <tr>
                            <td>${location.locationName}</td>
                            <td></td>
                        </tr>
                    </c:forEach>
                </table>
            </div>
        </section>
    </body>
</html>
