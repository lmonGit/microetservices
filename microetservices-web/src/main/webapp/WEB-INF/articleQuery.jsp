<%@ page import="java.io.*,java.util.*,java.sql.*"%>
<%@ page import="javax.servlet.http.*,javax.servlet.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>

<html>
<head>
<title>Articles</title>
</head>
<body>
 
<%--<sql:setDataSource var="snapshot" driver="com.mysql.jdbc.Driver"
     url="jdbc:mysql://localhost/microetservices"
     user="root"  password="aB2kprX007"/>

<sql:query dataSource="${snapshot}" var="result">
SELECT * from article where produit_fk=5;
</sql:query>--%>
 
<table border="1">
    <!-- column headers -->
    <tr>
        <c:forEach var="article" items="${articles}">
            <th><c:out value="${columnName}"/></th>
        </c:forEach>
    </tr>
    <!-- column data -->
    <c:forEach var="row" items="${result.rowsByIndex}">
        <tr>
            <c:forEach var="column" items="${row}">
                <td><c:out value="${column}"/></td>
            </c:forEach>
        </tr>
    </c:forEach>
</table>
<div id="resultQuery" border="1">
    
</div>

</body>
</html>