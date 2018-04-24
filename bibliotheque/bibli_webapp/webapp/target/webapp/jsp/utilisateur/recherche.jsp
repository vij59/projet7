<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="/struts-tags" prefix="s" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<s:form action="rechercheProcess">  
<s:textfield name="titre" label="Titre"></s:textfield>  
<s:textfield name="nomAuteur" label="Nom Auteur"></s:textfield>  
<s:submit value="recherche"/>  
</s:form>  

</body>
</html>