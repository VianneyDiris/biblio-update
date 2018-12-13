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
			<legend class="text-center">Prêts en cours</legend>
			<div class="row">

				<s:iterator value="listPret">
				<s:if test="%{status.status == 'en cours'}">
					<div class="col-lg-3">
						<div class="panel panel-default">
							<div class="panel-heading">
								<s:property value="ouvrage.titre" />
							</div>
							<div class="panel-body">
								<div class="row">
									<div class="col-lg-2"></div>
									<div class="col-lg-8">
										<img alt="img" class="img_list"	src="http://localhost:8080/bibliotheque-webapp/images/<s:property value="ouvrage.photos"/>">
									</div>
									<div class="col-lg-2"></div>
								</div>
								<div>
									<p></p>
									<s:a action="pret_detail">
										<s:param name="id" value="id" />
										<button class="btn btn-default">Voir ce prêt</button>
									</s:a>
								</div>

							</div>
						</div>
					</div>
					</s:if>
				</s:iterator>
			</div>
		</fieldset>
		
		
		<fieldset>
			<legend class="text-center">Prêts fini</legend>
			<div class="row">

				<s:iterator value="listPret">
				<s:if test="%{status.status == 'fini'}">
					<div class="col-lg-3">
						<div class="panel panel-default">
							<div class="panel-heading">
								<s:property value="ouvrage.titre" />
							</div>
							<div class="panel-body">
								<div class="row">
									<div class="col-lg-2"></div>
									<div class="col-lg-8">
										<img alt="img" class="img_list"	src="http://localhost:8080/bibliotheque-webapp/images/<s:property value="ouvrage.photos"/>">
									</div>
									<div class="col-lg-2"></div>
								</div>
								<div>
									
								</div>

							</div>
						</div>
					</div>
					</s:if>
				</s:iterator>
			</div>
		</fieldset>

	</div>
		<div class="space"></div>
	<%@include file="../_include/footer.jsp"%>
</body>
</html>