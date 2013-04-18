<%-- 
    Document   : adminVerwerk
    Created on : Apr 18, 2013, 10:29:02 AM
    Author     : Sven
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
if (request.getParameter("toevoegen") != null){
    response.sendRedirect("admin.jsp");
    
}
if (request.getParameter("wijzigen")!= null){
    %> u wil wijzigen <%
    
}
if (request.getParameter("verwijderen")!=null){
 %> u wil verwijdern <%
  
}
        %>
    </body>
</html>
