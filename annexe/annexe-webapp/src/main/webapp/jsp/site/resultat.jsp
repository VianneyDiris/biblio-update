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
		<s:if test="%{listOuvrage==null}">
			<fieldset>
			<legend class="text-center grossissement">Aucun ouvrage n'a été trouvé</legend>
	</fieldset>
		</s:if>
			<s:else>
		  <fieldset>
		        <legend class="text-center grossissement">Ouvrage</legend>
		        <div class="row justify-content-lg-center">
		
					<s:iterator value="listOuvrage">
				<div class="list">
					<div class="produit col-lg-3">
						<div class="panel panel-default">
							<div class="panel-heading">
								<s:property value="titre" />
							</div>
							<div class="panel-body">
								<img alt="img" class="img_list" src="resource_image/<s:property value="photos"/>">

								<p></p>
								<s:a action="ouvrage_detail"><s:param name="id" value="id" /><button class="btn btn-default">Voir cet ouvrage</button></s:a>
							</div>
						</div>
					</div>
				</div>
				</s:iterator>
		  
		
		     </div>
		   </fieldset>
	</s:else>
	</div>




	<%@include file="../_include/footer.jsp"%>
</body>
</html>