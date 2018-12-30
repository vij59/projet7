<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

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
                    <th>Titre</th>
                    <th>Auteur</th>
                    <th>Exemplaires</th>
                    <th>Disponibilité</th>
                    <th>Reservations</th>
                    <th>Prochain retour</th>
                </tr>
                </thead>
                <s:iterator var="livres" value="listeLivres">
                    <tbody>
                    <tr>
                        <td><s:property value="id"/></td>
                        <td><s:property value="titre"/></td>


                        <td><s:property value="livre.auteur.nom"/> &nbsp; <s:property
                                value="auteur.prenom"/></td>


                        <td><s:property value="nbExemplaires"/></td>
                        <s:if test="#session.userMail == null">
                            <td>
                                <s:if test="%{empruntable==true}">
                                    Disponible à l'emprunt
                                </s:if>
                                <s:else>
                                    <s:if test="%{reservable==true}">
                                        Disponible à la réservation
                                    </s:if>
                                    <s:elseif test="%{reservable==false}">
                                        Pas réservable
                                    </s:elseif>
                                </s:else>

                            </td>
                            <td>
                                <s:if test="%{nbReservations<2}">
                                    <s:property value="nbReservations"/>&nbsp; réservation
                                </s:if>
                                <s:else>
                                    <s:property value="nbReservations"/>&nbsp; réservations
                                </s:else>
                            </td>
                        </s:if>
                        <s:else>
                            <td>
                                <s:if
                                        test="%{livreEmprunteByUserId==true}">
                                    Déjà emprunté

                                </s:if>
                                <s:elseif test="%{livreReserveByUserId==true}">
                                    <s:url action="deleteReservationFromList" var="helloLink">
                                        <s:param name="id_livre"><s:property value='id'/></s:param>
                                    </s:url>
                                    <p>
                                        <a href="${helloLink}">Annuler la réservation</a>
                                    </p>
                                </s:elseif>
                                <s:elseif test="%{empruntable==true && livreEmprunteByUserId==false
                                && livreReserveByUserId==false}">
                                    <s:url action="emprunterProcess" var="helloLink">
                                        <s:param name="id_livre"><s:property value='id'/></s:param>
                                    </s:url>
                                    <p>
                                        <a href="${helloLink}">Emprunter</a>
                                    </p>
                                </s:elseif>
                                <s:elseif test="%{empruntable==false && reservable==true &&
                                livreEmprunteByUserId==false && livreReserveByUserId==false}">
                                    <s:url action="emprunterProcess" var="helloLink">
                                        <s:param name="id_livre"><s:property value='id'/></s:param>
                                    </s:url>
                                    <p>
                                        <a href="${helloLink}">Réserver</a>
                                    </p>
                                </s:elseif>

                                <s:elseif test="%{reservable==false && empruntable==false}">
                                    Indisponible
                                </s:elseif>

                                <s:else>
                                    Pas d'information sur la disponibilité
                                </s:else>

                            </td>
                            <td>
                                <s:if test="%{nbReservations==1}">
                                    Reservation <s:property value="placeDansReservations"/> sur
                                    <s:property value="nbReservations"/>
                                </s:if>
                                <s:elseif test="%{nbReservations>1}">
                                    Reservation <s:property value="placeDansReservations"/> sur
                                    <s:property value="nbReservations"/>
                                </s:elseif>
                                <s:else>
                                    Pas de réservation
                                </s:else>
                            </td>
                        </s:else>
                        <td>
                           Retour le  <s:property value="nbReservations"/>
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

