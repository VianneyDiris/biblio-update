<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <%@include file="../_include/head.jsp"%>
</head>
<body>
<%@include file="../_include/menu.jsp"%>


<!-- Page Content -->
<div class="container content">
    <fieldset>
        <legend class="text-center">Réservation</legend>
        <div class="row justify-content-lg-center">
            <div class="produit col-lg-8 col-lg-offset-2">
                <div class="panel panel-default">
                    <div class="panel-heading">
                        <s:property value="reservation.ouvrage.titre" />
                    </div>
                    <div class="panel-body">
                        <div class="col-lg-6">
                            <img alt="img"
                                 src="http://localhost:8080/bibliotheque-webapp/images/<s:property value="reservation.ouvrage.photos"/>">
                        </div>

                        <div class="col-lg-6">
                            <p> Résumé :
                                <s:property value="reservation.ouvrage.resume"/>
                            </p>
                            <p class="resume">
                                Date de réservation:
                                <s:date name="dateFinReservation" format="dd/MM/yyyy"/>
                            </p>
                            <p class="langue">
                                Position sur la liste d'attente:
                                <s:property value="position"/>
                            </p>
                            <p></p>
                            <s:a action="endReservation"><s:param value="reservation.id" name="id"/><button class="btn btn-default">Annuler la réservation</button></s:a>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </fieldset>

</div>
<%@include file="../_include/footer.jsp"%>
</body>
</html>