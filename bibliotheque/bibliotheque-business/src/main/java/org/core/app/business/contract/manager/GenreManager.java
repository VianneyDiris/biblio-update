package org.core.app.business.contract.manager;

import java.util.List;

import org.core.app.model.bean.Genre;
import org.core.app.model.exception.NotFoundException;

public interface GenreManager {

	List<Genre> listGenre()throws NotFoundException;
	
	Genre find(Integer id)throws NotFoundException;
	
	List<Genre> searchGenreByOuvrageId(Integer id)throws NotFoundException;
	
	void addGenre(Genre genre);
	
	void updateGenre(Genre genre);
	
	void deleteGenre(Genre genre);

}
