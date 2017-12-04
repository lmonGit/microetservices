<%@ page pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ include file="/WEB-INF/menu.jsp"%>
<html>
<head>
<title>Accueil</title>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="${pageContext.request.contextPath}/resources/Css/style.css" rel="stylesheet" >

</head>
<body>

	<h1>MICRO ET SERVICES</h1>

	<br />
	<c:if test="${ !empty form.resultat }"><p><c:out value="${ form.resultat }" /></p></c:if> 
	
	<form method="post" action="accueil">
	<p>
		<label for="login">Login : </label>
		<input type = "text"  name="login" id = "login" />
	
		<label for="pass">Mot de passe : </label>
		<input type = "password"  name="pass" id = "pass" />
	</p>
	<input type = "submit" value=" Envoyer " />
	</form>
	<p> Liste des entrées de javaee <p>
	
	<ul>
        <c:forEach var="utilisateur" items="${ utilisateurs }">
            <li><c:out value="${ utilisateur.prenom }" /> <c:out value="${ utilisateur.nom }" /></li>
        </c:forEach>
    </ul> 

	<h2>Bienvenue sur le site de Micro et services</h2>
	
	
	

	<p>Dépannage informatique Micro et service est spécialisé dans le
		dépannage informatique, l’installation tous matériels, logiciels,
		ainsi que le conseil high-tech (PC, tablette, Antivirus, outils
		bureautiques, etc...). Nous intervenons sur site et à domicile et
		prenons en charge tous vos équipements informatiques : PC fixes ou
		portables, Mac, tablettes.</p>

	<h2>Nos domaines d’expertise</h2>

	<p>Installation de serveur et d’ordinateur. Installation de
		matériels et périphériques Configuration de votre réseau (WIFI,
		Ethernet, CPL...) Configuration de votre accès internet : SFRBox,
		LiveBox, FreeBox, BBox, Darty Box, Numéricable … Élimination de virus,
		spywares, adwares, logiciels publicitaires, pourriels, blocage des
		spams Maintenance informatique sur site et installation de tous vos
		périphériques Optimisation de votre ordinateur</p>

	<p>Notre zone d’intervention</p>

	<p>Nous sommes basés à Montauban et intervenons dans tout le
		département du tarn et Garonne.</p>



	<p>Mentions légales Micro et services</p>
	<p>Micro et services - 120 Avenue Marceau Hamecher - 82000
		Montauban</p>
	<p>Tel. 05 63 66 61 16 - 05 81 04 17 20</p>

</body>
</html>
