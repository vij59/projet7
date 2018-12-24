<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<jsp:include page="/jsp/index.jsp"></jsp:include>  

<title>Liste Livres</title>

<meta name="description"
	content="Source code generated using layoutit.com">
<meta name="author" content="LayoutIt!">

<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/style.css" rel="stylesheet">

<script type="text/javascript"
	src="http://gc.kis.v2.scr.kaspersky-labs.com/7457D7E5-C871-CC44-B7A8-3A55257F6B95/main.js"
	charset="UTF-8"></script>
</head>
<body>

<hr/>  
	<div class="container-fluid">
		<div class="row">
			<div class="col-md-8">
				<table class="table">
					<thead>
						<tr>
							<th>ISBN</th>
							<th><a href="listeByTitre">Titre</a></th>
							<th><a href="listeByAuteur">Auteur</a></th>
							<th>Exemplaires</th>
							<th>Disponibilité</th>
						</tr>
					</thead>
					<s:iterator var="livres" value="listeLivres">
						<tbody>
							<tr>
								<td><s:property value="id" /></td>
								<td><s:property value="titre" /></td>



								<td><s:property value="auteur.nom" />&nbsp; <s:property
										value="auteur.prenom" /></td>



								<td><s:property value="nbExemplaires" /></td>
								<td>
									<s:if
										test="%{disponible==false}">
											Indisponible
										</s:if> <s:else>


								<s:url action="emprunterProcess" var="helloLink">
									<s:param name="id_livre"><s:property value='id' /></s:param>
								</s:url>
									<p>
										<a href="${helloLink}">Réserver</a>
									</p>

										</s:else>
								</td>
							</tr>

						</tbody>
					</s:iterator>
				</table>
			</div>
		</div>
	</div>

	<script src="js/jquery.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<script src="js/scripts.js"></script>

</body>
</html>

