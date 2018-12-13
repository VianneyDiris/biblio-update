package org.core.app.consumer.impl.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.core.app.consumer.impl.dao.AuteurDaoImpl;
import org.core.app.consumer.impl.dao.EditeurDaoImpl;
import org.core.app.consumer.impl.dao.GenreDaoImpl;
import org.core.app.consumer.impl.dao.LangueDaoImpl;
import org.core.app.model.bean.Ouvrage;
import org.springframework.jdbc.core.RowMapper;

public class OuvrageRM implements RowMapper<Ouvrage> {

	@Override
	public Ouvrage mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Ouvrage ouvrage = new Ouvrage();
		
		ouvrage.setId(rs.getInt("id"));
		ouvrage.setTitre(rs.getString("titre"));
		ouvrage.setPhotos(rs.getString("photos"));
		ouvrage.setResume(rs.getString("resume"));
		ouvrage.setISBN(rs.getLong("isbn"));
		ouvrage.setExemplaire(rs.getInt("exemplaire"));
		
		LangueDaoImpl langueDao = new LangueDaoImpl();
		ouvrage.setLangue(langueDao.find(rs.getInt("langue_id")));
		
		EditeurDaoImpl editeurDao = new EditeurDaoImpl();
		ouvrage.setEditeur(editeurDao.find(rs.getInt("editeur_id")));
		
		AuteurDaoImpl auteurDao = new AuteurDaoImpl();
		ouvrage.setListAuteur(auteurDao.searchAuteurByOuvrageId(rs.getInt("id")));
		
		GenreDaoImpl genreDao = new GenreDaoImpl();
		ouvrage.setListGenre(genreDao.searchGenreByOuvrageId(rs.getInt("id")));
		
		return ouvrage;
	}

}
