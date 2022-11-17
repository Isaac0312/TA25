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
import com.example.demo.dto.Pelicula;
import com.example.demo.service.PeliculasServiceImpl;

@RestController
@RequestMapping("/api")
public class PeliculaController {
	
	@Autowired
	PeliculasServiceImpl peliculasServiceImpl;
	
	@GetMapping("/peliculas")
	public List<Pelicula> listarPeliculas(){
		return peliculasServiceImpl.listarPeliculas();
	}
	
	@PostMapping("/peliculas")
	public Pelicula salvarPelicula(@RequestBody Pelicula pelicula) {
		
		return peliculasServiceImpl.guardarPelicula(pelicula);
	}
	
	@GetMapping("/peliculas/{id}")
	public Pelicula pelicula_x_ID(@PathVariable(name="id") Long id) {
		
		Pelicula pelicula_x_id= new Pelicula();
		
		pelicula_x_id=peliculasServiceImpl.pelicula_x_id(id);
		
		System.out.println("Pelicula XID: "+pelicula_x_id);
		
		return pelicula_x_id;
	}
	
	@PutMapping("/peliculas/{id}")
	public Pelicula actualizarPelicula(@PathVariable(name="id") Long id,@RequestBody Pelicula pelicula) {
		
		Pelicula pelicula_seleccionado= new Pelicula();
		Pelicula pelicula_actualizado= new Pelicula();
		
		pelicula_seleccionado= peliculasServiceImpl.pelicula_x_id(id);
		
		pelicula_seleccionado.setNombre(pelicula.getNombre());
		pelicula_seleccionado.setEdad(pelicula.getEdad());
		
		pelicula_actualizado = peliculasServiceImpl.actualizarPelicula(pelicula_seleccionado);
		
		System.out.println("La pelicula actualizada es: "+ pelicula_actualizado);
		
		return pelicula_actualizado;
	}
	
	@DeleteMapping("/peliculas/{id}")
	public void eliminarPelicula(@PathVariable(name="id")Long id) {
		peliculasServiceImpl.eliminarPelicula(id);
	}
	
	
}