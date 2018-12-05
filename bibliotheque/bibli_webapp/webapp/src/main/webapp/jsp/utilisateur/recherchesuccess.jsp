<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>

<jsp:include page="/jsp/utilisateur/recherche.jsp"></jsp:include>

<title>Recherche réussie</title>
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
							<th>Titre</th>
							<th>Auteur</th>
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
										    Disponible
										</s:else>
								</td>
							</tr>

						</tbody>
					</s:iterator>
				</table>
			</div>
		</div>
	</div>

</body>
</html>