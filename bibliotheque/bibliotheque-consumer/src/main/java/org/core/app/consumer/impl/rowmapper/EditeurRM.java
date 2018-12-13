package org.core.app.consumer.impl.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.core.app.model.bean.Editeur;
import org.springframework.jdbc.core.RowMapper;

public class EditeurRM implements RowMapper<Editeur>{

	@Override
	public Editeur mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Editeur editeur = new Editeur();
		
		editeur.setId(rs.getInt("id"));
		editeur.setNom(rs.getString("nom"));
		
		return editeur;
	}

}
