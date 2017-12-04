<%@ page pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ include file="/WEB-INF/menu.jsp"%>
<html>
<head>
<title>Bienvenue</title>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="${pageContext.request.contextPath}/resources/Css/style.css" rel="stylesheet" > 

</head>
<body>

	<h1>MICRO ET SERVICES</h1>

	<br />
	<c:if test="${ !empty form.resultat }"><p><c:out value="${ form.resultat }" /></p></c:if> 
	
	<form method="post" action="login">
	<p>
		<label for="login">Login : </label>
		<input type = "text"  name="login" id = "login" />
	
		<label for="pass">Mot de passe : </label>
		<input type = "password"  name="pass" id = "pass" />
	</p>
	<input type = "submit" value=" Envoyer " />
	</form>


	<p>
	
	<p>
<!-- 		tant que le fichier n'est pas sur le serveur il faut donner le chemein absolu -->
		<img src="C:\Users\Merle\microetservicesWorkspace\microetservices6\src\main\webapp\resources\Images\docpc.jpg" alt="Micro et services" />
	</p>



	<p>Mentions légales Micro et services</p>
	<p>Micro et services - 120 Avenue Marceau Hamecher - 82000
		Montauban</p>
	<p>Tel. 05 63 66 61 16 - 05 81 04 17 20</p>

</body>
</html>
