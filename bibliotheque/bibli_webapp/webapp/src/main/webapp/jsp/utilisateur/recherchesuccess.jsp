<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<jsp:include page="/jsp/others/banner.jsp"></jsp:include>  

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
									 <s:property value="disponible" /></td>  <s:if
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