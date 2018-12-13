package org.core.app.consumer.impl.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.core.app.model.bean.Status;
import org.springframework.jdbc.core.RowMapper;

public class StatusRM implements RowMapper<Status> {

	@Override
	public Status mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Status status = new Status();
		
		status.setId(rs.getInt("id"));
		status.setStatus(rs.getString("status"));
		return status;
	}

}
