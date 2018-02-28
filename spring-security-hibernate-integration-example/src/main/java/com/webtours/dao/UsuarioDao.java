package com.webtours.dao;

import com.webtours.model.Usuario;

public interface UsuarioDao {
  Usuario findUserByUsername(String nombre);
}
