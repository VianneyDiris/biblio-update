package org.core.app.consumer.impl.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.core.app.consumer.impl.dao.OuvrageDaoImpl;
import org.core.app.consumer.impl.dao.StatusDaoImpl;
import org.core.app.consumer.impl.dao.UtilisateurDaoImpl;
import org.core.app.model.bean.Pret;
import org.springframework.jdbc.core.RowMapper;

public class PretRM implements RowMapper<Pret>{

	@Override
	public Pret mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Pret pret = new Pret();
		
		pret.setId(rs.getInt("id"));
		pret.setDate_debut(rs.getDate("date_debut"));
		pret.setDate_fin(rs.getDate("date_fin"));
		pret.setProlongation(rs.getBoolean("prolongation"));
		
		UtilisateurDaoImpl userDao = new UtilisateurDaoImpl();
		pret.setUtilisateur(userDao.find(rs.getInt("utilisateur_id")));
		
		OuvrageDaoImpl ouvrageDao = new OuvrageDaoImpl();
		pret.setOuvrage(ouvrageDao.find(rs.getInt("ouvrage_id")));
		
		StatusDaoImpl statusDao = new StatusDaoImpl();
		pret.setStatus(statusDao.find(rs.getInt("status_id")));
		
		return pret;
	}

}
