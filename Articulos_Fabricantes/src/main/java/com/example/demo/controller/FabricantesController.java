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
import com.example.demo.dto.Fabricantes;
import com.example.demo.service.FabricantesServiceImpl;

@RestController
@RequestMapping("/api")
public class FabricantesController {
	
	@Autowired
	FabricantesServiceImpl fabricantesServiceImpl;
	
	@GetMapping("/fabricante")
	public List<Fabricantes> listarFabricantes(){
		return fabricantesServiceImpl.listarFabricantes();
	}
	
	@PostMapping("/fabricante")
	public Fabricantes salvarFabricante(@RequestBody Fabricantes fabricante) {
		
		return fabricantesServiceImpl.guardarFabricante(fabricante);
	}
	
	@GetMapping("/fabricante/{id}")
	public Fabricantes fabricante_x_ID(@PathVariable(name="id") Long id) {
		
		Fabricantes fabricante_x_id= new Fabricantes();
		
		fabricante_x_id=fabricantesServiceImpl.fabricante_x_id(id);
		
		System.out.println("Fabricante XID: "+fabricante_x_id);
		
		return fabricante_x_id;
	}
	
	@PutMapping("/fabricante/{id}")
	public Fabricantes actualizarFabricante(@PathVariable(name="id")Long id,@RequestBody Fabricantes fabricante) {
		
		Fabricantes fabricante_seleccionado= new Fabricantes();
		Fabricantes fabricante_actualizado= new Fabricantes();
		
		fabricante_seleccionado= fabricantesServiceImpl.fabricante_x_id(id);
		
		fabricante_seleccionado.setNombre(fabricante.getNombre());
		
		fabricante_actualizado = fabricantesServiceImpl.actualizarFabricante(fabricante_seleccionado);
		
		System.out.println("El fabricante actualizado es: "+ fabricante_actualizado);
		
		return fabricante_actualizado;
	}
	
	@DeleteMapping("/fabricante/{id}")
	public void eliminarFabricante(@PathVariable(name="id")Long id) {
		fabricantesServiceImpl.eliminarFabricante(id);
	}
	
	
}