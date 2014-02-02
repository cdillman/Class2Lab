<%-- 
    Document   : PageGenerator2
    Created on : Jan 30, 2014, 12:07:55 PM
    Author     : Corbin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        
        <h1>hello </h1>
            <table>
                
            <% for(int i = 1; i < 4; i++){ 
            
               out.println("<tr>");
             for(int j = 1; j < 4; j++){ 
               out.println("<td>");
               out.println("r" + i + " c" + j);
               out.println("</td>");
             }
            out.println("</tr>");
            } %>
            
            <% for(int f = 1; f < 15; f++){ %>
            <tr> 
                <% for (int t = 1; t < 15; t++) { %>
                <td>
                    <% out.println("||Row: " + f + " Col: "+ t + "||"); %>
                </td>
                <% } %>
            </tr>
            <% } %>
            
    </body>
</html>
