<%-- 
    Document   : AllPost
    Created on : 2015-11-16, 04:14:40
    Author     : ktyminski
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Wlasciciele mieszkan</title>
    </head>
    <body background="obrazek.jpg">
    <center>
        <h1>Wlasciciele mieszkan</h1>
        <div style="width: 1200px; margin-left: auto; margin-right: auto;">
            <table cellpadding="10">
                <tr>
                    <th>IdWlasciciel</th>
                    <th>Imie</th>
                    <th>Nazwisko</th>
                    <th>Pesel</th>
                    <th>
                        <a href="AddNew.html">DODAJ</a>
                        
                    </th>
                    
                </tr>
                <c:forEach items="${AllPost}" var="p">
                    <tr>
                        <td>${p.idWlasciciel}</td>
                        <td>${p.imie}</td>
                        <td>${p.nazwisko}</td>
                        <td>${p.pesel}</td>
                        <td>
                            <a href="edit?idWlasciciel=${p.idWlasciciel}">Edytuj</a>
                            <a href="delete?idWlasciciel=${p.idWlasciciel}">Usun</a>
                        </td>
                    </tr>
                    
                </c:forEach>
            </table>
        </div>
    </center>
    </body>
</html>
