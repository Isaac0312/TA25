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
import com.example.demo.dto.Articulos;
import com.example.demo.service.ArticulosServiceImpl;

@RestController
@RequestMapping("/api")
public class ArticulosController {
	
	@Autowired
	ArticulosServiceImpl articulosServiceImpl;
	
	@GetMapping("/articulo")
	public List<Articulos> listarArticulos(){
		return articulosServiceImpl.listarArticulo();
	}
	
	@PostMapping("/articulo")
	public Articulos salvarArticulo(@RequestBody Articulos articulo) {
		
		return articulosServiceImpl.guardarArticulo(articulo);
	}
	
	@GetMapping("/articulo/{id}")
	public Articulos articulos_x_ID(@PathVariable(name="id") Long id) {
		
		Articulos articulos_x_id= new Articulos();
		
		articulos_x_id=articulosServiceImpl.articulo_x_id(id);
		
		System.out.println("Articulos XID: "+articulos_x_id);
		
		return articulos_x_id;
	}
	
	@PutMapping("/articulo/{id}")
	public Articulos actualizarArticulo(@PathVariable(name="id")Long id,@RequestBody Articulos articulo) {
		
		Articulos articulo_seleccionado= new Articulos();
		Articulos articulo_actualizado= new Articulos();
		
		articulo_seleccionado= articulosServiceImpl.articulo_x_id(id);
		
		articulo_seleccionado.setNombre(articulo.getNombre());
		articulo_seleccionado.setPrecio(articulo.getPrecio());
		
		articulo_actualizado = articulosServiceImpl.actualizarArticulo(articulo_seleccionado);
		
		System.out.println("El articulo actualizado es: "+ articulo_actualizado);
		
		return articulo_actualizado;
	}
	
	@DeleteMapping("/articulo/{id}")
	public void eliminarArticulo(@PathVariable(name="id")Long id) {
		articulosServiceImpl.eliminarArticulo(id);
	}
	
	
}