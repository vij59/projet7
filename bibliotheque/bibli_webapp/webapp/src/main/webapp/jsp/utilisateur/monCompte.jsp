<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

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
                        <td><s:property value="id"/></td>

                        <td><s:property value="livre.titre"/></td>

                        <td><s:date name="dateDebut.toGregorianCalendar()"
                                    format="dd/MM/yyyy"/></td>

                        <td><s:date name="dateFin.toGregorianCalendar()"
                                    format="dd/MM/yyyy"/>&nbsp;
                        </td>

                            <%--
                            <s:if test="%{enCours==true && repoussable==true}">
                                <td>En cours&nbsp;</td>
                            </s:if>
                            <s:else>
                                <td>Terminé&nbsp;</td>
                            </s:else>
                            --%>
                        <td><s:property value="statut"/></td>

                            <%-- <td><s:property value="enCours" />&nbsp;</td> --%>

                        <s:if test="%{dejaRepousse==false && repoussable==true}">
                            <td><s:url action="repousseProcess" var="helloLink">
                                <s:param name="id_emprunt"><s:property value='id'/></s:param>
                            </s:url>
                                <p>
                                    <a href="${helloLink}">Repousser</a>
                                </p></td>
                        </s:if>
                        <s:elseif test="%{dejaRepousse==true}">
                            <td>Déjà repoussé&nbsp;</td>
                        </s:elseif>
                        <s:else>
                            <td>Non repoussable</td>
                        </s:else>


                        <s:if test="%{enCours==false && recupere==false}">
                            <td><s:url action="recupererLivre" var="helloLink">
                                <s:param name="idLivreRecupere"><s:property value='id'/></s:param>
                            </s:url>
                                <p>
                                    <a href="${helloLink}">Recuperer Livre</a>
                                </p></td>
                        </s:if>

                        <s:if test="%{statut=='rendu'}">
                        </s:if>
                        <s:else>
                            <s:if test="%{enCours==true}">
                                <td><s:url action="rendreLivre" var="helloLink">
                                    <s:param name="idLivreRecupere"><s:property value='id'/></s:param>
                                </s:url>
                                    <p>
                                        <a href="${helloLink}">Rendre Livre</a>
                                    </p></td>
                            </s:if>
                        </s:else>

                            <%-- <td><s:property value="dejaRepousse" />&nbsp;</td> --%>
                    </tr>

                    </tbody>

                </s:iterator>


            </table>

            <table class="table">
                <thead>
                <tr>
                    <th>Réservations</th>
                    <th>Titre</th>
                    <th>Date Réservation</th>
                    <th>Place dans réservations</th>
                    <th>Prochain retour</th>

                </tr>
                </thead>

                <s:iterator var="reservations" value="mesReservations">


                    <tbody>
                    <tr>
                        <td><s:property value="livre.id"/></td>

                        <td><s:property value="livre.titre"/></td>

                        <td><s:date name="dateReservation.toGregorianCalendar()"
                                    format="dd/MM/yyyy"/></td>
                        <td>
                            <s:property value="placeDansReservations"/>
                            /
                            <s:property value="livre.nbReservations"/>

                        </td>
                        <td>
                            <s:date name="dateRetourProche.toGregorianCalendar()"
                                    format="dd/MM/yyyy"/>
                        </td>
                        <td>
                        <s:url action="deleteReservationFromAccount" var="helloLink">
                            <s:param name="id_livre"><s:property value='livre.id'/></s:param>
                        </s:url>
                        <p>
                            <a href="${helloLink}">Annuler la réservation</a>
                        </p>
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