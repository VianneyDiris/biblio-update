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
		<s:form action="inscription" class="col-lg-6 col-lg-offset-3">
			<fieldset class="scheduler-border">
				<legend class="scheduler-border">Création du compte</legend>
				<s:actionmessage/>
				<div class="form-inline">
					<s:label for="userName" class="espace">Nom</s:label>
					<s:textfield name="nom" class="form-control" placeholder="nom" label="Nom"/>
					
					<s:label for="userSurname" class="espace" >Prenom</s:label>
					<s:textfield name="prenom" class="form-control" placeholder="prénom"/>
				</div>
				<div class="form-group">
					<s:label for="mail">Mail</s:label>
					<s:textfield name="mail" class="form-control" placeholder="mail"/>
				</div>
				<div class="form-group">
					<s:label for="password">Mot de passe</s:label>
					<s:password name="password" class="form-control" placeholder=""/>
				</div>
				<div class="form-group">
					<s:label for="password">Confirmer le mot de passe</s:label>
					<s:password name="passwordConfirm" class="form-control" placeholder=""/>
				</div>
				<s:submit value="Valider" class="btn btn-primary center-block"/>
				
			</fieldset>
		</s:form>
	</div>



	<%@include file="../_include/footer.jsp"%>
</body>
</html>