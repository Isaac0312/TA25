package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IAlmacenesDAO;
import com.example.demo.dto.Almacenes;

@Service
public class AlmacenesServiceImpl implements IAlmacenesService {

	@Autowired
	IAlmacenesDAO iAlmacenesDAO;
	
	
	@Override
	public List<Almacenes> listarAlmacenes() {
		// TODO Auto-generated method stub
		return iAlmacenesDAO.findAll();
	}

	@Override
	public Almacenes guardarAlmacen(Almacenes almacen) {
		// TODO Auto-generated method stub
		return iAlmacenesDAO.save(almacen);
	}

	@Override
	public Almacenes almacen_x_id(Long id) {
		// TODO Auto-generated method stub
		return iAlmacenesDAO.findById(id).get();
	}

	@Override
	public Almacenes actualizarAlmacen(Almacenes almacen) {
		// TODO Auto-generated method stub
		return iAlmacenesDAO.save(almacen);
	}

	@Override
	public void eliminarAlmacen(Long id) {
		// TODO Auto-generated method stub
		iAlmacenesDAO.deleteById(id);
		
	}

}
