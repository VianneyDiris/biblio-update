package org.core.app.consumer.impl.dao;

import java.util.List;

import org.core.app.consumer.contract.UtilisateurDao;
import org.core.app.consumer.impl.AbstractDaoImpl;
import org.core.app.consumer.impl.rowmapper.UtilisateurRM;
import org.core.app.model.bean.Pret;
import org.core.app.model.bean.Utilisateur;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.security.crypto.bcrypt.BCrypt;

public class UtilisateurDaoImpl extends AbstractDaoImpl implements UtilisateurDao {

	@Override
	public List<Utilisateur> listUtilisateur() {
		// TODO Auto-generated method stub
		String vsql="SELECT * FROM public.utilisateur";
		
		JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());
		UtilisateurRM rowUser = new UtilisateurRM();
		
		List<Utilisateur> listUser = vJdbcTemplate.query(vsql, rowUser);
		return listUser;
	}

	@Override
	public Utilisateur find(Integer id) {
		// TODO Auto-generated method stub
		String vsql="SELECT * FROM public.utilisateur WHERE id=?";
		
		JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());
		UtilisateurRM rowUser = new UtilisateurRM();
		
		Utilisateur user = (Utilisateur)vJdbcTemplate.queryForObject(vsql, new Object[] { id }, rowUser);
		return user;
	}

	@Override
	public Utilisateur search(String mail, String password) {
		// TODO Auto-generated method stub
		String vsql="SELECT * FROM public.utilisateur WHERE mail=?";
		JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());
		UtilisateurRM rowUser = new UtilisateurRM();
		
		Utilisateur user = (Utilisateur)vJdbcTemplate.queryForObject(vsql, new Object[] { mail }, rowUser);

		
		
		if(BCrypt.checkpw(password, user.getPassword())) {
            System.out.println("Correct login credentials");
            return user;
            }
		else {
			return null;
		}
    
	}

	@Override
	public Utilisateur searchUserByPret(Pret pret) {
		// TODO Auto-generated method stub
		String vsql="SELECT * FROM public.utilisateur WHERE id=?";
		
		JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());
		UtilisateurRM rowUser = new UtilisateurRM();
		
		Utilisateur user = (Utilisateur)vJdbcTemplate.queryForObject(vsql, new Object[] { pret.getUtilisateur().getId() }, rowUser);
		return user;
	}

	@Override
	public void addUtilisateur(Utilisateur user) {
		// TODO Auto-generated method stub
		String vsql = "INSERT INTO public.utilisateur (nom,prenom,mail,password) VALUES (?,?,?,?)";
		String hashed = BCrypt.hashpw(user.getPassword(), BCrypt.gensalt());
		
		JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());
		vJdbcTemplate.update(vsql,user.getNom(),user.getPrenom(),user.getMail(),hashed);
		
	}

	@Override
	public void updateUtilisateur(Utilisateur user) {
		// TODO Auto-generated method stub
		String vSQL = "UPDATE public.utilisateur SET nom=?, prenom=?, mail=?, password=? WHERE id = ?";
		JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());
		vJdbcTemplate.update(vSQL,user.getNom(),user.getPrenom(),user.getMail(),user.getPassword(),user.getId());
		
	}

	@Override
	public void deleteUtilisateur(Utilisateur user) {
		// TODO Auto-generated method stub
		String vsql="DELETE FROM public.utilisateur WHERE id=?";
		JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());
		vJdbcTemplate.update(vsql,new Object[] { user.getId() });
		
	}

}
