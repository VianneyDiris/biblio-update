package org.core.app.consumer.impl.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.core.app.model.bean.Genre;
import org.springframework.jdbc.core.RowMapper;

public class GenreRM implements RowMapper<Genre> {

	@Override
	public Genre mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Genre genre = new Genre();
		
		genre.setId(rs.getInt("id"));
		genre.setGenre(rs.getString("genre"));
		
		return genre;
	}

}
