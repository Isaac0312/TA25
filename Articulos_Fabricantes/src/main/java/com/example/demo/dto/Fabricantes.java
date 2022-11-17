package com.example.demo.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="Fabricantes")
public class Fabricantes {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long  codigo;
	
	@Column(name = "nombre")
	private String nombre;
	
	
	@OneToMany
	@JoinColumn(name="codigo")
	private List<Articulos> articulos;

	
	public Fabricantes() {
		
	}
	
	public Fabricantes(String nombre) {
		this.nombre=nombre;
	}

	public long getCodigo() {
		return codigo;
	}


	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Articulos")
	public List<Articulos> getArticulos() {
		return articulos;
	}


	public void setArticulos(List<Articulos> articulos) {
		this.articulos = articulos;
	}


	@Override
	public String toString() {
		return "Fabricantes [Codigo=" + codigo + ", nombre=" + nombre + ", articulos=" + articulos + "]";
	}
	
	
}
