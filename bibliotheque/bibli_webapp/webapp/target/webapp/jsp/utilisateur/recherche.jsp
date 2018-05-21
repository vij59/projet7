<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="/struts-tags" prefix="s" %>  
<jsp:include page="/jsp/index.jsp"></jsp:include> 

<title>Recherche</title>
</head>
<body>
<hr/>  
<s:form action="rechercheProcess">  
<s:textfield name="titre" label="Titre"></s:textfield>  
<s:textfield name="nomAuteur" label="Nom Auteur"></s:textfield>  
<s:submit value="recherche"/>  
</s:form>  

</body>
</html>