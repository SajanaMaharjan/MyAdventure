<%-- 
    Document   : addAdventure
    Created on : May 5, 2015, 11:35:48 PM
    Author     : sajana
--%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:url var="actionUrl" value="save" />
<form:form id="adventureForm" commandName="adventure" method="post"
           action="${actionUrl }" class="pure-form pure-form-aligned">

    <fieldset>
        <legend></legend>

        <div class="pure-control-group">
            <label for="adventure">Destination</label>
            <form:input path="adventureName" placeholder="Adventure Name" />
        </div>
         <div class="pure-control-group">
            <label for="description">Description</label>
            <form:input path="adventureDescription" placeholder="Descrition" />
        </div>
      
             <input type="submit"/>
    </fieldset>
</form:form>
