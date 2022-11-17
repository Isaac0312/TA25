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
@Table(name="Almacenes")
public class Almacenes {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long  codigo;
	
	@Column(name = "lugar")
	private String lugar;
	
	@Column(name = "capacidad")
	private int capacidad;
	
	
	@OneToMany
	@JoinColumn(name="num_referencia")
	private List<Cajas> caja;

	
	public Almacenes() {
		
	}
	
	public Almacenes(String lugar,int capacidad) {
		this.lugar=lugar;
		this.capacidad=capacidad;
	}

	public long getCodigo() {
		return codigo;
	}

	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}
	
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cajas")
	public List<Cajas> getCaja() {
		return caja;
	}

	public void setCaja(List<Cajas> caja) {
		this.caja = caja;
	}

	
}
