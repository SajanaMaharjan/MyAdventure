<%-- 
    Document   : addLocation
    Created on : May 5, 2015, 8:42:32 PM
    Author     : sajana
--%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:url var="actionUrl" value="save" />
<form:form id="locationForm" commandName="location" method="post"
           action="${actionUrl }" class="pure-form pure-form-aligned">

    <fieldset>
        <legend></legend>

        <div class="pure-control-group">
            <label for="location">Destination</label>
            <form:input path="locationName" placeholder="Destination Name" />
        </div>
         <div class="pure-control-group">
            <label for="description">Description</label>
            <form:input path="locationDescription" placeholder="Descrition" />
        </div>
      
             <input type="submit"/>
    </fieldset>
</form:form>