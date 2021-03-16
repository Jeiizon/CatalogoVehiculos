package com.catalogo.vehiculos.entidades;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="vehiculos")	
public class Vehiculo {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="descripcion", nullable = false, length = 30)
	private String descripcion;
	
	@Column(name="marca", nullable = false, length = 20)
	private String marca;
	
	@Column(name="modelo", nullable = false, length = 4)
	private byte modelo;
	
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public byte getModelo() {
		return modelo;
	}
	public void setModelo(byte modelo) {
		this.modelo = modelo;
	}
	
	
}
