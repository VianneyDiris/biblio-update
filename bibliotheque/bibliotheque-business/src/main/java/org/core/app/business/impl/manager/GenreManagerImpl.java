package org.core.app.business.impl.manager;

import java.util.List;

import org.core.app.business.contract.manager.GenreManager;
import org.core.app.business.impl.AbstractManagerImpl;
import org.core.app.model.bean.Genre;
import org.core.app.model.exception.NotFoundException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class GenreManagerImpl extends AbstractManagerImpl implements GenreManager {
	static final Log logger = LogFactory.getLog(GenreManagerImpl.class);

	@Override
	public List<Genre> listGenre() throws NotFoundException {
		// TODO Auto-generated method stub
		logger.info("méthode listGenre()");
		return getDaoFactory().getGenreDao().listGenre();
	}

	@Override
	public Genre find(Integer id) throws NotFoundException {
		// TODO Auto-generated method stub
		logger.info("méthode find(Integer id) avec id="+id);
		return getDaoFactory().getGenreDao().find(id);
	}

	@Override
	public List<Genre> searchGenreByOuvrageId(Integer id) throws NotFoundException {
		// TODO Auto-generated method stub
		logger.info("méthode searchGenreByOuvrageId(Integer id) avec id="+id);
		return getDaoFactory().getGenreDao().searchGenreByOuvrageId(id);
	}

	@Override
	public void addGenre(Genre genre) {
		// TODO Auto-generated method stub
		logger.info("méthode addGenre(Genre genre)");
		getDaoFactory().getGenreDao().addGenre(genre);
		
	}

	@Override
	public void updateGenre(Genre genre) {
		// TODO Auto-generated method stub
		logger.info("méthode updateGenre(Genre genre)");
		getDaoFactory().getGenreDao().updateGenre(genre);
		
	}

	@Override
	public void deleteGenre(Genre genre) {
		// TODO Auto-generated method stub
		logger.info("méthode deleteGenre(Genre genre)");
		getDaoFactory().getGenreDao().deleteGenre(genre);
		
	}

}
