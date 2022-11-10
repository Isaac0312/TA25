package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IArticulosDAO;
import com.example.demo.dto.Articulos;

@Service
public class ArticulosServiceImpl implements IArticulosService {

	@Autowired
	IArticulosDAO iArticulosDAO;
	
	
	@Override
	public List<Articulos> listarArticulo() {
		// TODO Auto-generated method stub
		return iArticulosDAO.findAll();
	}

	@Override
	public Articulos guardarArticulo(Articulos articulo) {
		// TODO Auto-generated method stub
		return iArticulosDAO.save(articulo);
	}

	@Override
	public Articulos articulo_x_id(Long id) {
		// TODO Auto-generated method stub
		return iArticulosDAO.findById(id).get();
	}

	@Override
	public Articulos actualizarArticulo(Articulos articulo) {
		// TODO Auto-generated method stub
		return iArticulosDAO.save(articulo);
	}

	@Override
	public void eliminarArticulo(Long id) {
		// TODO Auto-generated method stub
		iArticulosDAO.deleteById(id);
		
	}

}