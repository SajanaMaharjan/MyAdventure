<%-- 
    Document   : addAdventureCategory
    Created on : May 11, 2015, 10:20:05 PM
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
        
          Adventure Categories
        <section>
            <div class="dataList">
                <table>
                    <c:forEach var="adventureCategories" items="${adventureCategories}">
                        <tr>
                            <td>${adventureCategories.adventureCatName}</td>
                            <td>${adventureCategories.adventureCatDescription}</td>
                            <!--<td><a href="view/${adventureCategories.id}">view</a></td>-->
                            </br>
                        </tr>
                    </c:forEach>
                </table>
            </div>
        </section>
        
        <section>
            <c:url var="actionUrl" value="save" />
            <form:form id="adventCatForm" commandName="adventureCategory" method="post"
                       action="${actionUrl }" class="pure-form pure-form-aligned">

                <fieldset>
                    <legend></legend>

                    <div class="pure-control-group">
                        <label for="adventureCat">Adventure Category</label>
                        <form:input path="adventureCatName" placeholder="Adventure Category" />
                    </div>
                    <div class="pure-control-group">
                        <label for="catDescription">Description</label>
                        <form:input path="adventureCatDescription" placeholder="Descrition" />
                    </div>

                    <input type="submit"/>
                </fieldset>
            </form:form>
        </section>
        <%@include file="../templates/footer.jsp"%>
        </
    </body>
</html>
