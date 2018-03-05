package com.webtours.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.webtours.model.Usuario;


@Repository
public class UsuarioDaoImp implements UsuarioDao {

  @Autowired
  private SessionFactory sessionFactory;

  @Override
  public Usuario findUsuarioByNombre(String nombre) {
	  return sessionFactory.getCurrentSession().get(Usuario.class, nombre);
  }

@Override
public void add(Usuario usuario) {
	sessionFactory.getCurrentSession().save(usuario);
	
}

@Override
public Usuario getUsuario(int idUsuario) {
	// TODO Auto-generated method stub
	return (Usuario)sessionFactory.getCurrentSession().get(Usuario.class, idUsuario);
}


  
  
//  public void addUsuario(Usuario u) {
//		Session session = this.sessionFactory.getCurrentSession();
//		session.persist(u);
//		//logger.info("Usuario guardado exitosamente, Detalles del usuario="+u);
//	}
  
}
