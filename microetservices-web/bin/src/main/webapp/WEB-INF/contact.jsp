<%@ page pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ include file="menu.jsp"%>
<html>
<head>
<link href="${pageContext.request.contextPath}/resources/Css/style.css" rel="stylesheet" >
<title>Contact</title>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
		<!-- Elément Google Maps indiquant que la carte doit être affiché en plein écran et
		qu'elle ne peut pas être redimensionnée par l'utilisateur -->
		<meta name="viewport" content="initial-scale=1.0, user-scalable=no" />
		<!-- Inclusion de l'API Google MAPS -->
		<!-- Le paramètre "sensor" indique si cette application utilise détecteur pour déterminer la position de l'utilisateur -->
<script type="text/javascript" src="http://maps.google.com/maps/api/js?sensor=false"></script>
		<script type="text/javascript">
			function initialiser() {
				var latlng = new google.maps.LatLng(44.011852, 1.345835);
				//objet contenant des propriétés avec des identificateurs prédéfinis dans Google Maps permettant
				//de définir des options d'affichage de notre carte
				var options = {
					center: latlng,
					zoom: 19,
					mapTypeId: google.maps.MapTypeId.ROADMAP
				};
				
				//constructeur de la carte qui prend en paramêtre le conteneur HTML
				//dans lequel la carte doit s'afficher et les options
				var carte = new google.maps.Map(document.getElementById("carte"), options);
			}
		</script>
</head>

<body onload="initialiser()">

	<h1>MICRO ET SERVICES</h1>
	<p>NOUS CONTACTER</p>
	
	<c:if test="${ !empty form.resultat }"><p><c:out value="${ form.resultat }" /></p></c:if> 
	<c:if test="${ !empty form.resultat2 }"><p><c:out value="${ form.resultat2 }" /></p></c:if> 
	
	<form method="post" action="contact">
		<table>
			<tr>
				<td><label for="nom">Nom * </label></td>
				<td><input type="text" id="nom" name="nom" /></td>
			</tr>
			<tr>
				<td><label for="telephone">Téléphone </label></td>
				<td><input type="tel" id="telephone" name="telephone" /></td>
			</tr>
			<tr>
				<td><label for="mail">Mail * </label></td>
				<td><input type="email" id="mail" name="mail" /></td>
			</tr>

		</table>

		<p>
			<label for="sujet"> Sujet</label> <br />

			<textarea name="sujet" id="sujet" rows="10" cols="50">
      	Sujet
       </textarea>
		</p>


		<input type="submit" value=" Envoyer " />
		<p>* champs obligatoires</p>
	</form>
	
	<h2>Le plan d'accés</h2>

<div id="carte" style="width:100%; height:100%"></div>
	<p></p>
	<p></p>

	<p>Mentions légales Micro et services</p>
	<p>Micro et services - 120 Avenue Marceau Hamecher - 82000
		Montauban</p>
	<p>Tel. 05 63 66 61 16 - 05 81 04 17 20</p>
</body>
</html>




