<%-- 
    Document   : ManagerAddNew
    Created on : 2015-11-16, 03:39:20
    Author     : cendr
--%>

<%@page import="dao.DataAccess"%>
<%@page import="model.Wlasciciel"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Pracownicy Agro</title>
    </head>
    <body>
        <%
            String idWlasciciel = request.getParameter("idWlasciciel");
            String imie = request.getParameter("imie");
            String nazwisko = request.getParameter("nazwisko");
            String pesel = request.getParameter("pesel");
            
            Wlasciciel n = new Wlasciciel(idWlasciciel, imie, nazwisko, pesel);
            DataAccess da = new DataAccess();
            da.addNew(n);
            
            response.sendRedirect("/BazaMieszkan/AllPost");
        %>
    </body>
</html>
