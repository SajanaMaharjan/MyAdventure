<%-- 
    Document   : addRegion
    Created on : May 11, 2015, 10:20:16 PM
    Author     : sajana
--%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page contentType="text/html" pageEncoding="UTF-8"%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add Region</title>
        <%@include file="../templates/header.jsp"%>
    </head>
    <body>
         Regions
        <section>
            <div class="dataList">
                <table>
                    <c:forEach var="regions" items="${regions}">
                        <tr>
                            <td>${regions.regionName}</td>
                            <td>${regions.regionDescription}</td>
                            <td><a href="addDestination/${regions.id}">Add Destination</a></td>
                            </br>
                        </tr>
                    </c:forEach>
                </table>
            </div>
        </section>
        
         Add New Region
        <c:url var="actionUrl" value="save" />
        <form:form id="regionForm" commandName="region" method="post"
                   action="${actionUrl }" class="pure-form pure-form-aligned">

            <fieldset>
                <legend></legend>

                <div class="pure-control-group">
                    <label for="region">Region</label>
                    <form:input path="regionName" placeholder="Region Name" />
                </div>
                <div class="pure-control-group">
                    <label for="description">Description</label>
                    <form:input path="regionDescription" placeholder="Descrition" />
                </div>
                <input type="submit" value="Add Region"/>
            </fieldset>
        </form:form>
        <%@include file="../templates/footer.jsp"%>
    </body>
</html>