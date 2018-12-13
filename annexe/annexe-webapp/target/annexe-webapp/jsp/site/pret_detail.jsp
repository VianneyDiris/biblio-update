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
			<legend class="text-center">Prêt</legend>
			<div class="row justify-content-lg-center">
				<div class="produit col-lg-8 col-lg-offset-2">
					<div class="panel panel-default">
						<div class="panel-heading">
							<s:property value="pret.ouvrage.titre" />
						</div>
						<div class="panel-body">
							<div class="col-lg-6">
								<img alt="img"
									src="http://localhost:8080/bibliotheque-webapp/images/<s:property value="pret.ouvrage.photos"/>">
							</div>

							<div class="col-lg-6">
								<p> Résumé : 
									<s:property value="pret.ouvrage.resume"/>
								</p>
								<p class="resume">
									Date de réservation:
									<s:date name="dateReservation" format="dd/MM/yyyy"/>						
								</p>
								<p class="langue">
									Date de fin:
									<s:date name="dateFinReservation" format="dd/MM/yyyy"/>
								</p>
								<s:if test="pret.prolongation">
									<p>prolongation déjà effectué</p>
								</s:if>
								<s:else>
									<s:a action="prolongation"><s:param value="pret.id" name="id"/><button class="btn btn-default">prolonger l'emprunt</button></s:a>
								</s:else>

								<p></p>
								<s:a action="endPret"><s:param value="pret.id" name="id"/><button class="btn btn-default">Rendre cet ouvrage</button></s:a>
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