package org.core.app.consumer.impl.dao;

import java.util.List;

import org.core.app.consumer.contract.EditeurDao;
import org.core.app.consumer.impl.AbstractDaoImpl;
import org.core.app.consumer.impl.rowmapper.EditeurRM;
import org.core.app.model.bean.Editeur;
import org.core.app.model.bean.Ouvrage;
import org.springframework.jdbc.core.JdbcTemplate;

public class EditeurDaoImpl extends AbstractDaoImpl implements EditeurDao {

	@Override
	public List<Editeur> listEditeur() {
		// TODO Auto-generated method stub
		String vsql="SELECT * FROM public.editeur";
		
		JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());
		EditeurRM rowEditeur = new EditeurRM();
		
		List<Editeur> listEditeur = vJdbcTemplate.query(vsql, rowEditeur);
		return listEditeur;
	}

	@Override
	public Editeur find(Integer id) {
		// TODO Auto-generated method stub
		String vsql="SELECT * FROM public.editeur WHERE id=?";
		
		JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());
		EditeurRM rowEditeur = new EditeurRM();
		
		Editeur editeur = (Editeur)vJdbcTemplate.queryForObject(vsql, new Object[] { id }, rowEditeur);
		
		return editeur;
	}

	@Override
	public Editeur searchByOuvrage(Ouvrage ouvrage) {
		// TODO Auto-generated method stub
		String vsql="SELECT * FROM public.editeur WHERE id=?";
		
		JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());
		EditeurRM rowEditeur = new EditeurRM();
		
		Editeur editeur = (Editeur)vJdbcTemplate.queryForObject(vsql, new Object[] { ouvrage.getEditeur().getId() }, rowEditeur);
		
		return editeur;
	}

	@Override
	public void addEditeur(Editeur editeur) {
		// TODO Auto-generated method stub
		String vsql = "INSERT INTO public.editeur (nom) VALUES (?)";
		
		JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());
		vJdbcTemplate.update(vsql,editeur.getNom());
		
	}

	@Override
	public void updateEditeur(Editeur editeur) {
		// TODO Auto-generated method stub
		String vSQL = "UPDATE public.editeur SET nom =? WHERE id = ?";
		 
		JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());
		vJdbcTemplate.update(vSQL,editeur.getNom(),editeur.getId());
		
	}

	@Override
	public void deleteEditeur(Editeur editeur) {
		// TODO Auto-generated method stub
		String vsql="DELETE FROM public.editeur WHERE id=?";
		JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());
		vJdbcTemplate.update(vsql,new Object[] { editeur.getId() });
		
	}

}
