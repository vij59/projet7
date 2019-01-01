<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

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
                    <th>Reservations</th>
                    <th>Place</th>
                    <th>Retour</th>
                </tr>
                </thead>
                <s:iterator var="livres" value="listeLivres">
                    <tbody>
                    <tr>
                        <td><s:property value="id"/></td>
                        <td><s:property value="titre"/></td>


                        <td><s:property value="auteur.nom"/> &nbsp; <s:property
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
                                    <s:if test="%{nbReservations==1}">
                                        1 Reservation
                                    </s:if>
                                    <s:elseif test="%{nbReservations>1}">
                                        <s:property value="nbReservations"/> Reservations
                                    </s:elseif>
                            </td>
                            <td></td>
                            <td>
                                <s:date name="dateRetourProche.toGregorianCalendar()"
                                        format="dd/MM/yyyy"/>
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
                                        1 Reservation
                                    </s:if>
                                    <s:elseif test="%{nbReservations>1}">
                                        <s:property value="nbReservations"/> Reservations
                                    </s:elseif>
                                    <s:else>
                                        Pas de réservation
                                    </s:else>
                            </td>
                            <td>
                                <s:iterator var="resa" value="mesReservations">

                                    <s:if test="%{idLivre == id}">
                                        <s:if test="%{nbReservations==1}">
                                            <s:property value="placeDansReservations"/>

                                        </s:if>
                                        <s:elseif test="%{nbReservations>1}">
                                            <s:property value="placeDansReservations"/>

                                        </s:elseif>

                                    </s:if>

                                </s:iterator>
                            </td>
                            <td>
                                <s:date name="dateRetourProche.toGregorianCalendar()"
                                        format="dd/MM/yyyy"/>
                            </td>
                        </s:else>
                    </tr>

                    </tbody>
                </s:iterator>
            </table>
        </div>
    </div>
</div>

</body>
</html>