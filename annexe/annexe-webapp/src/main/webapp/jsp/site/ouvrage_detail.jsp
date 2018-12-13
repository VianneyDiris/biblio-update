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
			<legend class="text-center grossissement">Ouvrage</legend>
			<div class="row justify-content-lg-center">
				<div class="produit col-lg-8 col-lg-offset-2">
					<div class="panel panel-default">
						<div class="panel-heading">
							<s:property value="ouvrage.titre" />
						</div>
						<div class="panel-body">
							<div class="col-lg-6">
								<img alt="img"
									src="http://localhost:8080/bibliotheque-webapp/images/<s:property value="ouvrage.photos"/>">
							</div>

							<div class="col-lg-6">
								<p class="resume">
									Résumé:
									<s:property value="ouvrage.resume" />
								</p>
								<p class="langue">
									Langue:
									<s:property value="ouvrage.langue.langue" />
								</p>
								<p class="editeur">
									Éditeur:
									<s:property value="ouvrage.editeur.nom" />
								</p>
								<p class="ISBN">
									ISBN:
									<s:property value="ouvrage.isbn" />
								</p>
								<s:iterator value="ouvrage.listAuteur">
									<p class="auteur">
										Auteur:
										<s:property value="nom" />
										<s:property value="prenom" />
									</p>
								</s:iterator>
								<s:iterator value="ouvrage.listGenre">
									<p class="auteur">
										Genre:
										<s:property value="genre" />
									</p>
								</s:iterator>

								<p></p>
								<s:a action="addPret"><s:param value="ouvrage.id" name="id"/><button class="btn btn-default">Emprunter cet ouvrage</button></s:a>
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