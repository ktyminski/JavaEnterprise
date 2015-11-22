<%-- 
    Document   : ManagerEditPost
    Created on : 2015-11-17, 03:17:37
    Author     : karoltyminski
--%>

<%@page import="dao.DataAccess"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            
            String idWlasciciel = request.getParameter("idWlasciciel");
            String imie = request.getParameter("imie");
            String nazwisko = request.getParameter("nazwisko");
            String pesel = request.getParameter("pesel");
           
           
            
            DataAccess da = new DataAccess();
            da.edit(idWlasciciel,imie,nazwisko,pesel);
            
            response.sendRedirect("/BazaMieszkan/AllPost");
        %>
    </body>
</html>
