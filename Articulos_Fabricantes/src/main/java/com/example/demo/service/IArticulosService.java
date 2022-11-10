package com.example.demo.service;
import java.util.List;

import com.example.demo.dto.Articulos;

public interface IArticulosService {
	public List<Articulos> listarArticulo();
	
	public Articulos guardarArticulo(Articulos articulos);
	
	public Articulos articulo_x_id(Long id);
	
	public Articulos actualizarArticulo(Articulos articulos);
	
	public void eliminarArticulo(Long id);
}