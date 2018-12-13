package org.core.app.consumer.impl.dao;

import java.util.List;

import org.core.app.consumer.contract.OuvrageDao;
import org.core.app.consumer.impl.AbstractDaoImpl;
import org.core.app.consumer.impl.rowmapper.OuvrageRM;
import org.core.app.model.bean.Ouvrage;
import org.springframework.jdbc.core.JdbcTemplate;

public class OuvrageDaoImpl extends AbstractDaoImpl implements OuvrageDao {

	@Override
	public List<Ouvrage> listOuvrage() {
		// TODO Auto-generated method stub
		String vsql="SELECT * FROM public.ouvrage";
		
		JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());
		OuvrageRM rowOuvrage = new OuvrageRM();
		
		List<Ouvrage> listOuvrage = vJdbcTemplate.query(vsql, rowOuvrage);
		return listOuvrage;
	}

	@Override
	public Ouvrage find(Integer id) {
		// TODO Auto-generated method stub
		String vsql="SELECT * FROM public.ouvrage WHERE id=?";
		
		JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());
		OuvrageRM rowOuvrage = new OuvrageRM();
		
		Ouvrage ouvrage =(Ouvrage)vJdbcTemplate.queryForObject(vsql, new Object[] { id }, rowOuvrage);
		return ouvrage;
	}

	@Override
	public void addOuvrage(Ouvrage ouvrage) {
		// TODO Auto-generated method stub
		String vsql = "INSERT INTO public.ouvrage (titre,photos,resume,langue_id,editeur_id,isbn,exemplaire) VALUES (?,?,?,?,?,?,?)";
		
		JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());
		vJdbcTemplate.update(vsql,ouvrage.getTitre(),ouvrage.getPhotos(),ouvrage.getResume(),ouvrage.getLangue().getId(),ouvrage.getEditeur().getId(),ouvrage.getISBN(),ouvrage.getExemplaire());	
		
	}

	@Override
	public void updateOuvrage(Ouvrage ouvrage) {
		// TODO Auto-generated method stub
		String vSQL = "UPDATE public.ouvrage SET titre =?, photos=?, resume=?, langue_id=?, editeur_id=?, isbn=?, exemplaire=? WHERE id = ?";
		 
		JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());
		vJdbcTemplate.update(vSQL,ouvrage.getTitre(),ouvrage.getPhotos(),ouvrage.getResume(),ouvrage.getLangue().getId(),ouvrage.getEditeur().getId(),ouvrage.getISBN(),ouvrage.getExemplaire(),ouvrage.getId());
		
	}

	@Override
	public void deleteOuvrage(Ouvrage ouvrage) {
		// TODO Auto-generated method stub
		String vsql="DELETE FROM public.ouvrage WHERE id=?";
		JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());
		vJdbcTemplate.update(vsql,new Object[] { ouvrage.getId() });
		
	}

}
