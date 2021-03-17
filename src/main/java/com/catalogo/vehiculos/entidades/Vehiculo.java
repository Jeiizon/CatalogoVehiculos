package com.catalogo.vehiculos.entidades;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "vehiculos")
public class Vehiculo {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "marca", nullable = false, length = 20)
	private String marca;

	@Column(name = "descripcion", nullable = false, length = 30)
	private String descripcion;

	@Column(name = "tipo", nullable = false, length = 20)
	private String tipo;

	@Column(name = "modelo", nullable = false, length = 200)
	private int modelo;

	@Column(name = "altura", nullable = false, length = 200)
	private int altura;

	@Column(name = "peso", nullable = false, length = 200)
	private int peso;

	@Column(name = "combustible", nullable = false, length = 50)
	private String combustible;

	@Column(name = "velocidad", nullable = false, length = 200)
	private int velocidad;

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

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getModelo() {
		return modelo;
	}

	public void setModelo(int modelo) {
		this.modelo = modelo;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public String getCombustible() {
		return combustible;
	}

	public void setCombustible(String combustible) {
		this.combustible = combustible;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

}
