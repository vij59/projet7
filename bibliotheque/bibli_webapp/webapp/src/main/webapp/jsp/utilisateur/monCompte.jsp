<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<jsp:include page="/jsp/index.jsp"></jsp:include> 

<title>Mon compte</title>
</head>
<body>

	<hr/>  

	<div class="container-fluid">
		<div class="row">
			<div class="col-md-8">
				<table class="table">
					<thead>
						<tr>
							<th>id emprunt</th>
							<th>titre</th>
							<th>date emprunt</th>
							<th>date retour</th>
							<th>état</th>
							<th>repoussé ?</th>
						</tr>
					</thead>

					<s:iterator var="emprunts" value="mesEmprunts">


						<tbody>
							<tr>
								<td><s:property value="id" /></td>

								<td><s:property value="livre.titre" /></td>

								<td><s:date name="dateDebut.toGregorianCalendar()"
										format="dd/MM/yyyy" /></td>

								<td><s:date name="dateFin.toGregorianCalendar()"
										format="dd/MM/yyyy" />&nbsp;
								</td>

									<%--
                                    <s:if test="%{enCours==true && repoussable==true}">
                                        <td>En cours&nbsp;</td>
                                    </s:if>
                                    <s:else>
                                        <td>Terminé&nbsp;</td>
                                    </s:else>
                                    --%>
								<td><s:property value="statut" /></td>

                                    <%-- <td><s:property value="enCours" />&nbsp;</td> --%>

								<s:if test="%{dejaRepousse==false && repoussable==true}">
									<td><s:url action="repousseProcess" var="helloLink">
									<s:param name="id_emprunt"><s:property value='id' /></s:param>
								</s:url>
								<p>
									<a href="${helloLink}">Repousser</a>
								</p></td>
								</s:if>
								<s:else>
									<td>Déjà repoussé&nbsp;</td>
								</s:else>

								<%-- <td><s:property value="dejaRepousse" />&nbsp;</td> --%>
							</tr>

						</tbody>

					</s:iterator>
				</table>
			</div>
		</div>
	</div>



</body>
</html>