package org.core.app.consumer.impl.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.core.app.model.bean.Utilisateur;
import org.springframework.jdbc.core.RowMapper;

public class UtilisateurRM implements RowMapper<Utilisateur> {

	@Override
	public Utilisateur mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Utilisateur user = new Utilisateur();
		
		user.setId(rs.getInt("id"));
		user.setNom(rs.getString("nom"));
		user.setPrenom(rs.getString("prenom"));
		user.setMail(rs.getString("mail"));
		user.setPassword(rs.getString("password"));
		
		return user;
	}

}
