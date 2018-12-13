package org.core.app.consumer.impl.dao;

import java.util.Date;
import java.util.List;

import org.core.app.consumer.contract.PretDao;
import org.core.app.consumer.impl.AbstractDaoImpl;
import org.core.app.consumer.impl.rowmapper.PretRM;
import org.core.app.model.bean.Ouvrage;
import org.core.app.model.bean.Pret;
import org.core.app.model.bean.Utilisateur;
import org.springframework.jdbc.core.JdbcTemplate;

public class PretDaoImpl extends AbstractDaoImpl implements PretDao {

	@Override
	public List<Pret> listPret() {
		// TODO Auto-generated method stub
		String vsql="SELECT * FROM public.pret";
		
		JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());
		PretRM rowPret = new PretRM();
		
		List<Pret> listPret = vJdbcTemplate.query(vsql, rowPret);
		return listPret;
	}

	@Override
	public Pret find(Integer id) {
		// TODO Auto-generated method stub
		String vsql="SELECT * FROM public.pret WHERE id=?";
		
		JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());
		PretRM rowPret = new PretRM();
		
		Pret pret = (Pret)vJdbcTemplate.queryForObject(vsql, new Object[] { id }, rowPret);
		return pret;
	}

	@Override
	public List<Pret> searchPretByUtilisateur(Utilisateur user) {
		// TODO Auto-generated method stub
		String vsql="SELECT * FROM public.pret WHERE utilisateur_id=?";
		
		JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());
		PretRM rowPret = new PretRM();
		
		List<Pret> listPret = vJdbcTemplate.query(vsql, new Object[] { user.getId() },rowPret);
		
		return listPret;
	}
	
	@Override
	public List<Pret> searchPretByOuvrage(Ouvrage ouvrage) {
		// TODO Auto-generated method stub
		String vsql="SELECT * FROM public.pret WHERE ouvrage_id=?";
		
		JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());
		PretRM rowPret = new PretRM();
		
		List<Pret> listPret = vJdbcTemplate.query(vsql, new Object[] { ouvrage.getId() },rowPret);
		
		return listPret;
	}

	@Override
	public void addPret(Pret pret) {
		// TODO Auto-generated method stub
		String vsql = "INSERT INTO public.pret (utilisateur_id,ouvrage_id,status_id,date_debut,date_fin,prolongation) VALUES (?,?,?,?,?,?)";
		
		JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());
		vJdbcTemplate.update(vsql,pret.getUtilisateur().getId(),pret.getOuvrage().getId(),pret.getStatus().getId(),pret.getDate_debut(),pret.getDate_fin(),pret.isProlongation());
	}

	@Override
	public void updatePret(Pret pret) {
		// TODO Auto-generated method stub
		String vSQL = "UPDATE public.pret SET utilisateur_id =?, ouvrage_id=?, status_id=?, date_debut=?, date_fin=?, prolongation=? WHERE id = ?";
		JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());
		vJdbcTemplate.update(vSQL,pret.getUtilisateur().getId(),pret.getOuvrage().getId(),pret.getStatus().getId(),pret.getDate_debut(),pret.getDate_fin(),pret.isProlongation(),pret.getId());
	}

	@Override
	public void deletePret(Pret pret) {
		// TODO Auto-generated method stub
		String vsql="DELETE FROM public.pret WHERE id=?";
		JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());
		vJdbcTemplate.update(vsql,new Object[] { pret.getId() });
		
	}

	@Override
	public List<Pret> listPretNonRendu(Date date) {
		// TODO Auto-generated method stub
		String vsql="SELECT * FROM public.pret WHERE status_id=1 AND date_fin<?";
		
		JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());
		PretRM rowPret = new PretRM();
		
		List<Pret> listPret = vJdbcTemplate.query(vsql,new Object[] { date } ,rowPret);
		return listPret;
	}

	@Override
	public List<Pret> listPretNonRenduByUser(Utilisateur user,Date date) {
		// TODO Auto-generated method stub
		String vsql="SELECT * FROM public.pret WHERE status_id=1 AND date_fin<? AND utilisateur_id=?";
		
		JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());
		PretRM rowPret = new PretRM();
		
		List<Pret> listPret = vJdbcTemplate.query(vsql,new Object[] { date,user.getId() } ,rowPret);
		return listPret;
	}

	

}
