package org.core.app.consumer.impl.dao;

import java.util.List;

import org.core.app.consumer.contract.StatusDao;
import org.core.app.consumer.impl.AbstractDaoImpl;
import org.core.app.consumer.impl.rowmapper.StatusRM;
import org.core.app.model.bean.Pret;
import org.core.app.model.bean.Status;
import org.springframework.jdbc.core.JdbcTemplate;

public class StatusDaoImpl extends AbstractDaoImpl implements StatusDao {

	@Override
	public List<Status> listStatus() {
		// TODO Auto-generated method stub
		String vsql="SELECT * FROM public.status";
		
		JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());
		StatusRM rowStatus = new StatusRM();
		
		List<Status> listStatus = vJdbcTemplate.query(vsql, rowStatus);
		return listStatus;
	}

	@Override
	public Status find(Integer id) {
		// TODO Auto-generated method stub
		String vsql="SELECT * FROM public.status WHERE id=?";
		
		JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());
		StatusRM rowStatus = new StatusRM();
		
		Status status = (Status)vJdbcTemplate.queryForObject(vsql, new Object[] { id }, rowStatus);
		return status;
	}

	@Override
	public Status searchByPret(Pret pret) {
		// TODO Auto-generated method stub
		String vsql="SELECT * FROM public.status WHERE id=?";
		
		JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());
		StatusRM rowStatus = new StatusRM();
		
		Status status = (Status)vJdbcTemplate.queryForObject(vsql, new Object[] { pret.getStatus().getId() }, rowStatus);
		return status;
	}

	@Override
	public void addStatus(Status status) {
		// TODO Auto-generated method stub
		String vsql = "INSERT INTO public.status (status) VALUES (?)";
		
		JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());
		vJdbcTemplate.update(vsql,status.getStatus());
		
	}

	@Override
	public void updateStatus(Status status) {
		// TODO Auto-generated method stub
		String vSQL = "UPDATE public.status SET status=? WHERE id = ?";
		JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());
		vJdbcTemplate.update(vSQL,status.getStatus(),status.getId());
		
	}

	@Override
	public void deleteStatus(Status status) {
		// TODO Auto-generated method stub
		String vsql="DELETE FROM public.status WHERE id=?";
		JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());
		vJdbcTemplate.update(vsql,new Object[] { status.getId() });
	}

}
