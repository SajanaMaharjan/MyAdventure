<%-- 
    Document   : addAdventure
    Created on : May 5, 2015, 11:35:48 PM
    Author     : sajana
--%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add Adventure</title>
    </head>
    <body>
        <%@include file="../templates/header.jsp"%>
        <section>
            <c:url var="actionUrl" value="save" />
            <form:form id="adventureForm" commandName="adventure" method="post"
                       action="${actionUrl }" class="pure-form pure-form-aligned">

                <fieldset>
                    <legend></legend>

                    <div class="pure-control-group">
                        <label for="adventure">Adventure Name</label>
                        <form:input path="adventureName" placeholder="Adventure Name" />
                    </div>
                    <div class="pure-control-group">
                        <label for="description">Description</label>
                        <form:input path="adventureDescription" placeholder="Descrition" />
                    </div>

                    <input type="submit"/>
                </fieldset>
            </form:form>
        </section>
        <%@include file="../templates/footer.jsp"%>
        </
    </body>
</html>