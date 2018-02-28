package com.webtours.dao;

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
  public Usuario findUserByUsername(String nombre) {
	  return sessionFactory.getCurrentSession().get(Usuario.class, nombre);
  }
}
