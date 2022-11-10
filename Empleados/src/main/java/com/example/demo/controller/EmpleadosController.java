package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.dto.Empleados;
import com.example.demo.service.EmpleadosServiceImpl;

@RestController
@RequestMapping("/api")
public class EmpleadosController {
	
	@Autowired
	EmpleadosServiceImpl empleadosServiceImpl;
	
	@GetMapping("/empleados")
	public List<Empleados> listarEmpleados(){
		return empleadosServiceImpl.listarEmpleados();
	}
	
	@PostMapping("/empleados")
	public Empleados salvarEmpleado(@RequestBody Empleados empleado) {
		
		return empleadosServiceImpl.guardarEmpleado(empleado);
	}
	
	@GetMapping("/empleados/{DNI}")
	public Empleados empleados_x_ID(@PathVariable(name="DNI") String DNI) {
		
		Empleados empleado_x_id= new Empleados();
		
		empleado_x_id=empleadosServiceImpl.empleado_x_id(DNI);
		
		System.out.println("Empleados XID: "+empleado_x_id);
		
		return empleado_x_id;
	}
	
	@PutMapping("/empleados/{DNI}")
	public Empleados actualizarEmpleado(@PathVariable(name="DNI") String DNI,@RequestBody Empleados empleado) {
		
		Empleados empleado_seleccionado= new Empleados();
		Empleados empleado_actualizado= new Empleados();
		
		empleado_seleccionado= empleadosServiceImpl.empleado_x_id(DNI);
		
		empleado_seleccionado.setNombre(empleado.getNombre());
		empleado_seleccionado.setNombre(empleado.getApellidos());
		empleado_seleccionado.setDepartamento(empleado.getDepartamento());
		
		empleado_actualizado = empleadosServiceImpl.actualizarEmpleado(empleado_seleccionado);
		
		System.out.println("El empleado actualizado es: "+ empleado_actualizado);
		
		return empleado_actualizado;
	}
	
	@DeleteMapping("/empleado/{DNI}")
	public void eliminarArticulo(@PathVariable(name="DNI")String DNI) {
		empleadosServiceImpl.eliminarEmpleado(DNI);
	}
	
	
}