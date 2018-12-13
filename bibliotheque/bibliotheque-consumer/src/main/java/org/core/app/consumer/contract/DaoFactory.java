package org.core.app.consumer.contract;

public interface DaoFactory {
	
	AuteurDao       getAuteurDao();
	EditeurDao      getEditeurDao();
	GenreDao        getGenreDao();
	LangueDao       getLangueDao();
	OuvrageDao      getOuvrageDao();
	PretDao         getPretDao();
	StatusDao       getStatusDao();
	UtilisateurDao  getUtilisateurDao();

}
