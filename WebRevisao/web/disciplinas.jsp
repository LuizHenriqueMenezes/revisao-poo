<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
</head>
<body>
    <%@include file="WEB-INF/jspf/header.jspf" %>
    <h1>Disciplinas Cursadas</h1>
    <table border="1">
        <tr>
            <th>Disciplina</th>
        </tr>
        <%
            // Lê o arquivo JSON
            String jsonFilePath = "${pageContext.request.contextPath}/disciplinas.json"; 
            String jsonContent = new java.util.Scanner(new java.io.File(jsonFilePath)).useDelimiter("\\A").next();
            
            // Faz o parse do JSON
            org.json.JSONObject jsonObject = new org.json.JSONObject(jsonContent);
            org.json.JSONArray disciplinas = jsonObject.getJSONArray("disciplinas");
            
            // Itera sobre as disciplinas e as exibe na tabela
            for (int i = 0; i < disciplinas.length(); i++) {
                String disciplina = disciplinas.getString(i);
        %>
        <tr>
            <td><%= disciplina %></td>
        </tr>
        <%
            }
        %>
    </table>
</body>
</html>
