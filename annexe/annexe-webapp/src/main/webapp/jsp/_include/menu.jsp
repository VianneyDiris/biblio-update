<nav class="navbar navbar-default">
		<!-- Brand and toggle get grouped for better mobile display -->
		<div class="navbar-header">
			<button type="button" data-target="#navbarCollapse"
				data-toggle="collapse" class="navbar-toggle">
				<span class="sr-only">Toggle navigation</span> <span
					class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
			<s:a action="index" class="navbar-brand">Biblio</s:a>
	</div>

	<div id="navbarCollapse" class="collapse navbar-collapse">
		<ul class="nav navbar-nav">
			<li class="active"><s:a action="index">Accueil</s:a></li>
			<s:if test="#session.user">
					<li><s:a action="ouvrage">Ouvrage</s:a></li>
					<li><s:a action="pret">Pret</s:a></li>
			</s:if>
			<s:else>
			<li><s:a action="login">Connexion</s:a></li>
			<li><s:a action="inscription">Inscription</s:a></li>				
			</s:else>
					
						
		</ul>
		<ul class="nav navbar-nav navbar-right">
				<s:if test="#session.user">
					<li><s:a>
							<s:property value="#session.user.nom" />
						</s:a></li>
					<li><s:a action="logout">Déconnexion</s:a></li>
				</s:if>
			</ul>
		</div>
	</nav>