package org.core.app.consumer.impl.dao;

import java.util.ArrayList;
import java.util.List;

import org.core.app.consumer.contract.AuteurDao;
import org.core.app.consumer.impl.AbstractDaoImpl;
import org.core.app.consumer.impl.rowmapper.AuteurRM;
import org.core.app.model.bean.Auteur;
import org.springframework.jdbc.core.JdbcTemplate;

public class AuteurDaoImpl extends AbstractDaoImpl implements AuteurDao {

	@Override
	public List<Auteur> listAuteur() {
		// TODO Auto-generated method stub
		String vsql="SELECT * FROM public.auteur";
		
		JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());
		AuteurRM rowAuteur = new AuteurRM();
		
		List<Auteur> listAuteur = vJdbcTemplate.query(vsql, rowAuteur);
		
		return listAuteur;
	}

	@Override
	public Auteur find(Integer id) {
		// TODO Auto-generated method stub
		String vsql="SELECT * FROM public.auteur WHERE id=?";
		
		JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());
		AuteurRM rowAuteur = new AuteurRM();
		
		Auteur auteur=(Auteur)vJdbcTemplate.queryForObject(vsql, new Object[] { id }, rowAuteur);
		
		return auteur;
	}

	@Override
	public List<Auteur> searchAuteurByOuvrageId(Integer id) {
		// TODO Auto-generated method stub
		String vsql ="SELECT auteur_id FROM public.ouvrage_auteur WHERE ouvrage_id=?";
		
		JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());
		
		List<Integer> listInt = vJdbcTemplate.queryForList(vsql, new Object[] { id },Integer.class);	
		List<Auteur> listAuteur = new ArrayList<Auteur>();
		
		for(int i = 0;i<listInt.size();i++) {
			listAuteur.add(find(listInt.get(i)));
		}
				
		return listAuteur;
	}

	@Override
	public void addAuteur(Auteur auteur) {
		// TODO Auto-generated method stub
		String vsql = "INSERT INTO public.auteur (prenom,nom) VALUES (?,?)";
		
		JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());
		vJdbcTemplate.update(vsql,auteur.getPrenom(),auteur.getNom());
		
	}

	@Override
	public void updateAuteur(Auteur auteur) {
		// TODO Auto-generated method stub
		String vSQL = "UPDATE public.auteur SET prenom =?, nom=? WHERE id = ?";
		 
		JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());
		vJdbcTemplate.update(vSQL,auteur.getPrenom(),auteur.getNom(),auteur.getId());
		
	}

	@Override
	public void deleteAuteur(Auteur auteur) {
		// TODO Auto-generated method stub
		String vsql="DELETE FROM public.auteur WHERE id=?";
		JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());
		vJdbcTemplate.update(vsql,new Object[] { auteur.getId() });
		
	}

}
