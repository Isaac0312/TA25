package com.example.demo.dto;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="cajas")
public class Cajas {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String num_referencia;
	
	@Column(name = "contenido")
	private String contenido;
	
	@Column(name = "valor")
	private int valor;
	
	@ManyToOne
	@JoinColumn(name="almacen_id")
	private Almacenes almacen;

	
	public Cajas() {
		
	}
	
	public Cajas(String num_referencia,String contenido, int valor, Almacenes almacen) {
		this.num_referencia=num_referencia;
		this.contenido=contenido;
		this.valor=valor;
		this.almacen=almacen;
	}

	public String getNum_referencia() {
		return num_referencia;
	}

	public void setNum_referencia(String num_referencia) {
		this.num_referencia = num_referencia;
	}

	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public Almacenes getAlmacen() {
		return almacen;
	}

	public void setAlmacen(Almacenes almacen) {
		this.almacen = almacen;
	}

	@Override
	public String toString() {
		return "Cajas [num_referencia=" + num_referencia + ", contenido=" + contenido + ", valor=" + valor
				+ ", almacen=" + almacen + "]";
	}
	
}
