package com.example.demo.service;
import java.util.List;

import com.example.demo.dto.Empleados;

public interface IEmpleadosService {
	public List<Empleados> listarEmpleados();
	
	public Empleados guardarEmpleado(Empleados Empleado);
	
	public Empleados empleado_x_id(String DNI);
	
	public Empleados actualizarEmpleado(Empleados empleado);
	
	public void eliminarEmpleado(String DNI);
}