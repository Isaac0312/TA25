package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IPeliculaDAO;
import com.example.demo.dto.Pelicula;

@Service
public class PeliculasServiceImpl implements IPeliculasService {

	@Autowired
	IPeliculaDAO iPeliculaDAO;
	
	
	@Override
	public List<Pelicula> listarPeliculas() {
		// TODO Auto-generated method stub
		return iPeliculaDAO.findAll();
	}

	@Override
	public Pelicula guardarPelicula(Pelicula pelicula) {
		// TODO Auto-generated method stub
		return iPeliculaDAO.save(pelicula);
	}

	@Override
	public Pelicula pelicula_x_id(Long id) {
		// TODO Auto-generated method stub
		return iPeliculaDAO.findById(id).get();
	}

	@Override
	public Pelicula actualizarPelicula(Pelicula pelicula) {
		// TODO Auto-generated method stub
		return iPeliculaDAO.save(pelicula);
	}

	@Override
	public void eliminarPelicula(Long id) {
		// TODO Auto-generated method stub
		iPeliculaDAO.deleteById(id);
		
	}

}
