package org.core.app.consumer.contract;

import java.util.List;

import org.core.app.model.bean.Genre;

public interface GenreDao {
	
	List<Genre> listGenre();
	
	Genre find(Integer id);
	
	List<Genre> searchGenreByOuvrageId(Integer id);
	
	void addGenre(Genre genre);
	
	void updateGenre(Genre genre);
	
	void deleteGenre(Genre genre);

}
