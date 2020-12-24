<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>
<!DOCTYPE html>
<html>
    <head>
        <meta name="layout" content="main" />
        <g:set var="entityName" value="${message(code: 'author.label', default: 'Author')}" />
        <title><g:message code="default.list.label" args="[entityName]" /></title>
    </head>
    <body>
        <a href="#list-author" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
        <div class="nav" role="navigation">
            <ul>
                <li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
                <li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
            </ul>
        </div>
        <div id="list-author" class="content scaffold-list" role="main">
            <h1><g:message code="default.list.label" args="[entityName]" /></h1>
            
            <g:unescape>
	            <display:table id="authorList" name="authorList" defaultsort="1" pagesize="5" sort="list" 
								requestURI="index"
	            	 			decorator="de.koo.DisplaytagWrapper">
					<display:column property="authorLink" title="ID" sortable="true" />						
					<display:column property="lastname" title="Lastame" sortable="true"/>						
					<display:column property="firstname" title="Firstame" sortable="true"/>						
					<display:column property="authorBooks" title="Books" />						
				</display:table>
			</g:unescape>
            
            <g:if test="${flash.message}">
                <div class="message" role="status">${flash.message}</div>
            </g:if>
        </div>
    </body>
</html>