package org.core.app.business.contract;

import org.core.app.business.contract.manager.*;

public interface ManagerFactory {
	AuteurManager       getAuteurManager();
	EditeurManager      getEditeurManager();
	GenreManager        getGenreManager();
	LangueManager       getLangueManager();
	OuvrageManager      getOuvrageManager();
	PretManager         getPretManager();
	StatusManager       getStatusManager();
	UtilisateurManager  getUtilisateurManager();

}
