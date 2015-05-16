<%-- 
    Document   : addDestination
    Created on : May 5, 2015, 8:42:32 PM
    Author     : sajana
--%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page contentType="text/html" pageEncoding="UTF-8"%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add Destination</title>
        <%@include file="../templates/header.jsp"%>
    </head>
    <body>

        <section>
            <div class="dataList">
                <table>
                    <tr>
                        <td>${selectedRegion.regionName}</td>
                    </tr>
                    <tr>
                        <td>${selectedRegion.regionDescription}</td>
                    </tr>
                </table>
            </div>
        </section>

        <c:url var="actionUrl" value="save/${selectedRegion.id}" />
        <form:form id="destinationForm" commandName="destinationAdventureDTO" method="post"
                   action="${actionUrl }" class="pure-form pure-form-aligned">

            <fieldset>
                <legend></legend>

                <div class="pure-control-group">
                    <label for="destination">Destination</label>
                    <form:input path="destinationName" placeholder="Destination Name" />
                </div>
                <div class="pure-control-group">
                    <label for="description">Description</label>
                    <form:input path="destinationDescription" placeholder="Descrition" />
                </div>
                <input type="submit"/>
            </fieldset>
        </form:form>
        <%@include file="../templates/footer.jsp"%>
    </body>
</html>