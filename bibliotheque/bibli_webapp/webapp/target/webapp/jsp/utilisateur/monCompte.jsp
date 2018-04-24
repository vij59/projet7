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
							<th>idLivre</th>
							<th>date emprunt</th>
							<th>date retour</th>
						</tr>
					</thead>
					<s:iterator var="emprunts" value="mesEmprunts">
						<tbody>
							<tr>
								<td><s:property value="id" /></td>
								<td><s:property value="dateDebut" /></td>



								<td><s:property value="dateFin" />&nbsp; </td>

							</tr>

						</tbody>
					</s:iterator>
				</table>
			</div>
		</div>
	</div>


</body>
</html>