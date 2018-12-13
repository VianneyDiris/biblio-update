package org.core.app.consumer.impl.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.core.app.model.bean.Langue;
import org.springframework.jdbc.core.RowMapper;

public class LangueRM implements RowMapper<Langue> {

	@Override
	public Langue mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Langue langue = new Langue();
		
		langue.setId(rs.getInt("id"));
		langue.setLangue(rs.getString("langue"));
		langue.setCode(rs.getString("code"));
		
		return langue;
	}

}
