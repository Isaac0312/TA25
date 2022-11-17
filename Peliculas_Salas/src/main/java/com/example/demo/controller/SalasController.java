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
import com.example.demo.dto.Salas;
import com.example.demo.service.SalasServiceImpl;

@RestController
@RequestMapping("/api")
public class SalasController {
	
	@Autowired
	SalasServiceImpl salasServiceImpl;
	
	@GetMapping("/salas")
	public List<Salas> listarCajas(){
		return salasServiceImpl.listarSalas();
	}
	
	@PostMapping("/salas")
	public Salas salvarSala(@RequestBody Salas sala) {
		
		return salasServiceImpl.guardarSala(sala);
	}
	
	@GetMapping("/salas/{id}")
	public Salas sala_x_ID(@PathVariable(name="id")Long id) {
		
		Salas sala_x_id= new Salas();
		
		sala_x_id=salasServiceImpl.sala_x_id(id);
		
		System.out.println("Sala XID: "+sala_x_id);
		
		return sala_x_id;
	}
	
	@PutMapping("/salas/{id}")
	public Salas actualizarSala(@PathVariable(name="id")Long id,@RequestBody Salas sala) {
		
		Salas sala_seleccionado= new Salas();
		Salas sala_actualizado= new Salas();
		
		sala_seleccionado= salasServiceImpl.sala_x_id(id);
		
		sala_seleccionado.setNombre(sala.getNombre());
		sala_seleccionado.setPelicula(sala.getPelicula());
		
		sala_actualizado = salasServiceImpl.actualizarSala(sala_seleccionado);
		
		System.out.println("El sala actualizado es: "+ sala_actualizado);
		
		return sala_actualizado;
	}
	
	@DeleteMapping("/salas/{id}")
	public void eliminarSala(@PathVariable(name="id")Long id) {
		salasServiceImpl.eliminarSala(id);
	}
	
	
}