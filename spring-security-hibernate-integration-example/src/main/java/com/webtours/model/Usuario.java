package com.webtours.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "USUARIOS")
public class Usuario {
  @Id
  @Column(name = "IDUSUARIO")
  private int idUsuario;
  
  @Column(name = "NOMBRE")
  private String nombre;

  @Column(name = "PASSWORD", nullable = false)
  private String password;

  @Column(name = "CORREO")
  private String correo;
  
  @Column(name = "TELEFONO")
  private String telefono;
  
  @Column(name = "ROLE")
  private String role;

public int getIdUsuario() {
	return idUsuario;
}

public void setIdUsuario(int idUsuario) {
	this.idUsuario = idUsuario;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public String getCorreo() {
	return correo;
}

public void setCorreo(String correo) {
	this.correo = correo;
}

public String getTelefono() {
	return telefono;
}

public void setTelefono(String telefono) {
	this.telefono = telefono;
}

public String getRole() {
	return role;
}

public void setRole(String role) {
	this.role = role;
}

//  @OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
//  private Set<Authorities> authorities = new HashSet<>();

 
}
