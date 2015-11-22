<%-- 
    Document   : EditPost
    Created on : 2015-11-17, 03:13:53
    Author     : karoltyminski
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit</title>
    </head>
    
    <body background="obrazek.jpg">
    <center>
        <h1>Modyfikuj wlasciciela</h1>
        <div style="width: 900px; margin-left: auto; margin-right: auto">
            <c:forEach items="${getWlascicielByidWlasciciel}" var="p">
                <form action="JSP/ManagerEditPost.jsp" method="post">
                
                         <input type="hidden" name="idWlasciciel" value="${p.idWlasciciel}"> 
            
                                Imie:<br>
                                <input type="text"  value="${p.imie}" name="imie" style="width: 200px"><br>
                                Nazwisko:<br>
                                 <input type="text"  value="${p.nazwisko}" name="nazwisko" style="width: 200px"><br>
                                  Pesel:<br>
                                 <input type="text"  value="${p.pesel}" name="pesel" style="width: 200px"><br>
           
            <input type="submit" value="Dodaj">
                </form>
            </c:forEach>
        </div>
    </center>
        
    </body>
</html>
