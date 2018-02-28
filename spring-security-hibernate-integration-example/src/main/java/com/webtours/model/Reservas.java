package com.webtours.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "RESERVAS")
public class Reservas {
  @Id
  @Column(name = "IDRESERVA")
  private int idReserva;
  
  @Column(name = "IDUSUARIO")
  private int idUsuario;
  
  @Column(name = "NOMBRE")
  private String nombreReserva;
  
  @Column(name = "DESCRIPCION")
  private String descripcion;
  
  @Column(name = "FECHAINICIO")
  private String fechaInicio;
  
  @Column(name = "FECHAFINAL")
  private String fechaFinal;
  
  @Column(name = "PRECIO")
  private float precio;
  
  @Column(name = "FOTO")
  private String foto;

public int getIdReserva() {
	return idReserva;
}

public void setIdReserva(int idReserva) {
	this.idReserva = idReserva;
}

public int getIdUsuario() {
	return idUsuario;
}

public void setIdUsuario(int idUsuario) {
	this.idUsuario = idUsuario;
}

public String getNombreReserva() {
	return nombreReserva;
}

public void setNombreReserva(String nombreReserva) {
	this.nombreReserva = nombreReserva;
}

public String getDescripcion() {
	return descripcion;
}

public void setDescripcion(String descripcion) {
	this.descripcion = descripcion;
}

public String getFechaInicio() {
	return fechaInicio;
}

public void setFechaInicio(String fechaInicio) {
	this.fechaInicio = fechaInicio;
}

public String getFechaFinal() {
	return fechaFinal;
}

public void setFechaFinal(String fechaFinal) {
	this.fechaFinal = fechaFinal;
}

public float getPrecio() {
	return precio;
}

public void setPrecio(float precio) {
	this.precio = precio;
}

public String getFoto() {
	return foto;
}

public void setFoto(String foto) {
	this.foto = foto;
}

//  @ManyToOne
//  @JoinColumn(name = "USERNAME")
//  private Usuario user;

 

}
