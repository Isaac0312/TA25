package com.example.demo.service;
import java.util.List;

import com.example.demo.dto.Pelicula;

public interface IPeliculasService {
	public List<Pelicula> listarPeliculas();
	
	public Pelicula guardarPelicula(Pelicula pelicula);
	
	public Pelicula pelicula_x_id(Long id);
	
	public Pelicula actualizarPelicula(Pelicula pelicula);
	
	public void eliminarPelicula(Long id);
}
