package com.webtours.dao;



import com.webtours.model.Usuario;

public interface UsuarioDao {
  Usuario findUsuarioByNombre(String nombre);
  public void add(Usuario usuario);
  public Usuario getUsuario(int idUsuario);




}
