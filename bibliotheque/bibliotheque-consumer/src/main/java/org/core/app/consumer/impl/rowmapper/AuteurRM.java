package org.core.app.consumer.impl.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.core.app.model.bean.Auteur;
import org.springframework.jdbc.core.RowMapper;

public class AuteurRM implements RowMapper<Auteur> {

	@Override
	public Auteur mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Auteur auteur = new Auteur();
		
		auteur.setId(rs.getInt("id"));
		auteur.setPrenom(rs.getString("prenom"));
		auteur.setNom(rs.getString("nom"));
		
		return auteur;
	}

}
