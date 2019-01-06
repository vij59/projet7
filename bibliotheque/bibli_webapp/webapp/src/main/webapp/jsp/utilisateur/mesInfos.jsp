<%--
  Created by IntelliJ IDEA.
  User: Vij
  Date: 02/01/2019
  Time: 22:12
  To change this template use File | Settings | File Templates.
--%>

<%@ taglib uri="/struts-tags" prefix="s" %>
<jsp:include page="/jsp/index.jsp"></jsp:include>

<title>Mes infos</title>
</head>
<body>
<hr/>

<s:if test="%{utilisateur.rappelActif==true}">
    Rappel Actif 5 jours avant la date de retour --
    <s:url action="desactiverRappel" var="helloLink">
        <s:param name="idUser"><s:property value='id'/></s:param>
    </s:url>
    <p>
        <a href="${helloLink}">Désactiver</a>
    </p>

</s:if>
<s:else>

    Rappel Inactif 5 jours avant la date de retour --
    <s:url action="activerRappel" var="helloLink2">
        <s:param name="idUser"><s:property value='id'/></s:param>
    </s:url>
    <p>
        <a href="${helloLink2}">Activer</a>
    </p>
</s:else>

</body>
</html>