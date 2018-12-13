package org.core.app.consumer.impl.dao;

import java.util.List;

import org.core.app.consumer.contract.LangueDao;
import org.core.app.consumer.impl.AbstractDaoImpl;
import org.core.app.consumer.impl.rowmapper.LangueRM;
import org.core.app.model.bean.Langue;
import org.core.app.model.bean.Ouvrage;
import org.springframework.jdbc.core.JdbcTemplate;

public class LangueDaoImpl extends AbstractDaoImpl implements LangueDao {

	@Override
	public List<Langue> listLangue() {
		// TODO Auto-generated method stub
		String vsql="SELECT * FROM public.langue";
		
		JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());
		LangueRM rowLangue = new LangueRM();
		
		List<Langue> listLangue = vJdbcTemplate.query(vsql, rowLangue);
		return listLangue;
	}

	@Override
	public Langue find(Integer id) {
		// TODO Auto-generated method stub
		String vsql="SELECT * FROM public.langue WHERE id=?";
		
		JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());
		LangueRM rowLangue = new LangueRM();
		
		Langue langue=(Langue)vJdbcTemplate.queryForObject(vsql, new Object[] { id }, rowLangue);
		
		return langue;
	}

	@Override
	public Langue searchByOuvrage(Ouvrage ouvrage) {
		// TODO Auto-generated method stub
		String vsql="SELECT * FROM public.langue WHERE id=?";
		
		JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());
		LangueRM rowLangue = new LangueRM();
		
		Langue langue=(Langue)vJdbcTemplate.queryForObject(vsql, new Object[] { ouvrage.getLangue().getId() }, rowLangue);
		return langue;
	}

	@Override
	public void addLangue(Langue langue) {
		// TODO Auto-generated method stub
		String vsql = "INSERT INTO public.langue (langue,code) VALUES (?,?)";
		
		JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());
		vJdbcTemplate.update(vsql,langue.getLangue(),langue.getCode());		
		
	}

	@Override
	public void updateLangue(Langue langue) {
		// TODO Auto-generated method stub
		String vSQL = "UPDATE public.langue SET langue =?, code=? WHERE id = ?";
		 
		JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());
		vJdbcTemplate.update(vSQL,langue.getLangue(),langue.getCode(),langue.getId());
		
	}

	@Override
	public void deleteLangue(Langue langue) {
		// TODO Auto-generated method stub
		String vsql="DELETE FROM public.langue WHERE id=?";
		JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());
		vJdbcTemplate.update(vsql,new Object[] { langue.getId() });
		
	}

}
