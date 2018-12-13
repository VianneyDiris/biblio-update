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
    <s:form action="login" class="col-lg-7 col-lg-offset-3">
      <fieldset class="scheduler-border">
        <legend class="scheduler-border">Se connecter</legend>
 
  <div class="form-inline" id="space-top">
  	<s:label for="mail" class="espace">Mail</s:label>
	<s:textfield name="mail" class="form-control" placeholder="mail"/>
   
   	<s:label for="password"  class="espace">Mot de passe</s:label>
	<s:password name="password" class="form-control" placeholder="*********"/>
  </div>
  

	<s:submit validate="true" value="Connecter" id="connecter" class="btn btn-primary center-block"/>
 
</fieldset>
</s:form>

<s:actionerror/>
<s:actionmessage/>
    </div>



	<%@include file="../_include/footer.jsp"%>
</body>
</html>