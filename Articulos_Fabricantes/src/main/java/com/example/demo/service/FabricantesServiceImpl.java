package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IFabricantesDAO;
import com.example.demo.dto.Fabricantes;

@Service
public class FabricantesServiceImpl implements IFabricantesService {

	@Autowired
	IFabricantesDAO iFabricantesDAO;
	
	
	@Override
	public List<Fabricantes> listarFabricantes() {
		// TODO Auto-generated method stub
		return iFabricantesDAO.findAll();
	}

	@Override
	public Fabricantes guardarFabricante(Fabricantes fabricante) {
		// TODO Auto-generated method stub
		return iFabricantesDAO.save(fabricante);
	}

	@Override
	public Fabricantes fabricante_x_id(Long codigo) {
		// TODO Auto-generated method stub
		return iFabricantesDAO.findById(codigo).get();
	}

	@Override
	public Fabricantes actualizarFabricante(Fabricantes fabricante) {
		// TODO Auto-generated method stub
		return iFabricantesDAO.save(fabricante);
	}

	@Override
	public void eliminarFabricante(Long codigo) {
		// TODO Auto-generated method stub
		iFabricantesDAO.deleteById(codigo);
		
	}

}
