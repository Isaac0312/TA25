package com.example.demo.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="Departamentos")
public class Departamentos {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long  codigo;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "presupuesto")
	private int presupuesto;
	
	
	@OneToMany
	@JoinColumn(name="dni")
	private List<Empleados> empleados;

	
	public Departamentos() {
		
	}
	
	public Departamentos(String nombre,int presupuesto) {
		this.nombre=nombre;
		this.presupuesto=presupuesto;
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

	public int getPresupuesto() {
		return presupuesto;
	}

	public void setPresupuesto(int presupuesto) {
		this.presupuesto = presupuesto;
	}

	public List<Empleados> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(List<Empleados> empleados) {
		this.empleados = empleados;
	}

	@Override
	public String toString() {
		return "Departamentos [codigo=" + codigo + ", nombre=" + nombre + ", presupuesto=" + presupuesto
				+ ", empleados=" + empleados + "]";
	}
	

	
	
}
