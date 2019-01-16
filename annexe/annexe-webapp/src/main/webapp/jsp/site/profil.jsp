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
<div class="container content center">
    <s:form action="update_user" class="col-lg-6 col-lg-offset-3">
        <s:hidden name="id" value="%{user.id}"/>
        <fieldset class="scheduler-border">
            <legend class="scheduler-border">Profil utilisateur</legend>

            <div class="form-group">
                <div class="form-group">
                    <s:label for="nom" class="espace">Nom</s:label>
                    <s:textfield name="nom" class="form-control" value="%{user.nom}"/>
                </div>

                <div class="form-group">
                    <s:label for="prenom" class="espace">Prénom</s:label>
                    <s:textfield name="prenom" class="form-control" value="%{user.prenom}"/>
                </div>

                <div class="form-group">
                    <s:label for="mail" class="espace">Mail</s:label>
                    <s:textfield name="mail" class="form-control" value="%{user.mail}"/>
                </div>

                <div class="form-group">
                    <s:label for="password" class="espace">Password</s:label>
                    <s:password name="password" class="form-control"/>
                </div>

                <div class="form-group">
                    <s:label for="notification" class="">Notification: </s:label>
                    <s:radio name="notification" list="#{'true':'Oui','false':'Non'}" />
                </div>



            </div>

            <s:submit value="Sauver modification" class="btn btn-primary center-block"/>

        </fieldset>
    </s:form>
</div>
<div class="space"></div>
<%@include file="../_include/footer.jsp"%>
</body>
</html>
