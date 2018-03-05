package com.webtours.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User.UserBuilder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.webtours.dao.UsuarioDao;
import com.webtours.model.Usuario;

@Service
//@Service("userDetailsService")
public class UsuarioServiceImp implements UsuarioService{

  @Autowired
  private UsuarioDao usuarioDao;
  
	@Transactional
	public void add(Usuario usuario) {
		usuarioDao.add(usuario);
		
	}

	@Transactional
	public Usuario getUsuario(int idUsuario) {
		// TODO Auto-generated method stub
		return usuarioDao.getUsuario(idUsuario);
	}
//implements UserDetailsService {


//  
// 
//  
//  public void setUsuarioDao(UsuarioDao usuarioDAO) {
//		this.usuarioDao = usuarioDao;
//	}

  @Transactional(readOnly = true)
  @Override
  public UserDetails loadUsuarioByNombre(String nombre) throws UsernameNotFoundException {

    Usuario usuario = usuarioDao.findUsuarioByNombre(nombre);
    UserBuilder builder = null;
    if (usuario != null) {
      
      builder = org.springframework.security.core.userdetails.User.withUsername(nombre);
//      builder.disabled(!usuario.isEnabled());
      builder.password(usuario.getPassword());
//      String[] authorities = user.getAuthorities()
//          .stream().map(a -> a.getAuthority()).toArray(String[]::new);

//      builder.authorities(authorities);
    } else {
      throw new UsernameNotFoundException("User not found.");
    }
    return builder.build();
 }

  


}
