# Biblio-Update

Avant de lancer le programme, il faut savoir qu'il est conçu pour fonctionner sous JAVA 8, PostgreSQL 9 et Tomcat 9.


Pour la base de données, vous trouverez ce qu'il vous faut dans le dossier script:
* D'abord lancer le script create-user.sql pour créer le propriétaire de la bdd.
* créer une nouvelle database, la nommer "db-biblio" et mettre "adm-biblio" en tant que propriétaire.
* Ensuite lancer le script schema.sql pour créer le schéma de la bdd.
* Enfin exécuter le script data.sql pour insérer les données.

Dans le dossier script, vous trouverez aussi les fichiers bibliotheque-webapp.war et annexe-webapp.war. Il faut copier/coller ces fichier dans le dossier webapp du server Tomcat.
Pour l'annexe, vous pouvez modifier certains paramètres avec le fichier "pret.properties":
* la valeur  duree.emprunt, c'est la durée d'un emprunt exprimé en semaines.
* la valeur duree.prolongation, c'est la durée lié aux prolongement d'un prêt, lui aussi exprimé en semaine.

Vous trouverez aussi un dossier "scheduler", dedans vous devez modifier le fichier "batch.properties": 
* la valeur batch.mail avec votre adresse mail google  
* la valeur de batch.password avec le mot de passe associé à votre compte. 
* la valeur du batch.cron car par défaut le batch se lance toutes les minutes.

Il se peut que l'envoie de mail ne s'effectue pas, la cause probable est que votre compte google n'autorise pas les applications moins sécurisées par défaut. Pour modifier ceci, il suffit de l'activer en cliquant [ici](https://myaccount.google.com/lesssecureapps).

Enfin pour exécuter le jar du scheduler, il faut ouvrir l'invite de commandes et entrez 
"java -jar scheduler-0.0.1-SNAPSHOT.jar".

De même pour les dossiers "notification" et "expiration" , dedans vous devez modifier le fichier "batch.properties": 
* la valeur batch.mail avec votre adresse mail google  
* la valeur de batch.password avec le mot de passe associé à votre compte. 
* la valeur du batch.cron car par défaut le batch se lance toutes les minutes.

Enfin pour exécuter le jar de notification et de expiration, il faut ouvrir l'invite de commandes et entrez 
- "java -jar notification-1.0-SNAPSHOT.jar"  
- "java -jar expiration-1.0-SNAPSHOT.jar".