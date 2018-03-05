package com.webtours.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.webtours.model.Usuario;

public interface UsuarioService {

	 public void add(Usuario usuario);
	  public Usuario getUsuario(int idUsuario);
	UserDetails loadUsuarioByNombre(String nombre) throws UsernameNotFoundException;
}
