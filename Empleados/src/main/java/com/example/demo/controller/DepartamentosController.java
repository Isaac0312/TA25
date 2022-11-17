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
import com.example.demo.dto.Departamentos;
import com.example.demo.service.DepartamentosServiceImpl;

@RestController
@RequestMapping("/api")
public class DepartamentosController {
	
	@Autowired
	DepartamentosServiceImpl departamentosServiceImpl;
	
	@GetMapping("/departamento")
	public List<Departamentos> listarDepartamentos(){
		return departamentosServiceImpl.listarDepartamentos();
	}
	
	@PostMapping("/departamento")
	public Departamentos salvarDepartamento(@RequestBody Departamentos departamento) {
		
		return departamentosServiceImpl.guardarDepartamento(departamento);
	}
	
	@GetMapping("/departamento/{id}")
	public Departamentos departamento_x_ID(@PathVariable(name="id") Long id) {
		
		Departamentos departamentos_x_id= new Departamentos();
		
		departamentos_x_id=departamentosServiceImpl.departamento_x_id(id);
		
		System.out.println("Departamentos XID: "+departamentos_x_id);
		
		return departamentos_x_id;
	}
	
	@PutMapping("/departamentos/{id}")
	public Departamentos actualizarDepartamento(@PathVariable(name="id")Long id,@RequestBody Departamentos departamento) {
		
		Departamentos departamento_seleccionado= new Departamentos();
		Departamentos departamento_actualizado= new Departamentos();
		
		departamento_seleccionado= departamentosServiceImpl.departamento_x_id(id);
		
		departamento_seleccionado.setNombre(departamento.getNombre());
		departamento_seleccionado.setPresupuesto(departamento.getPresupuesto());
		
		departamento_actualizado = departamentosServiceImpl.actualizarDepartamento(departamento_seleccionado);
		
		System.out.println("El departamento actualizado es: "+ departamento_actualizado);
		
		return departamento_actualizado;
	}
	
	@DeleteMapping("/departamento/{id}")
	public void eliminarDepartamento(@PathVariable(name="id")Long id) {
		departamentosServiceImpl.eliminarDepartamento(id);
	}
	
	
}