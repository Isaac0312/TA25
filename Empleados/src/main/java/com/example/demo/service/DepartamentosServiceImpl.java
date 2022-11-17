package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IDepartamentosDAO;
import com.example.demo.dto.Departamentos;

@Service
public class DepartamentosServiceImpl implements IDepartamentosService {

	@Autowired
	IDepartamentosDAO iDepartamentossDAO;
	
	
	@Override
	public List<Departamentos> listarDepartamentos() {
		// TODO Auto-generated method stub
		return iDepartamentossDAO.findAll();
	}

	@Override
	public Departamentos guardarDepartamento(Departamentos departamento) {
		// TODO Auto-generated method stub
		return iDepartamentossDAO.save(departamento);
	}

	@Override
	public Departamentos departamento_x_id(Long id) {
		// TODO Auto-generated method stub
		return iDepartamentossDAO.findById(id).get();
	}

	@Override
	public Departamentos actualizarDepartamento(Departamentos departamento) {
		// TODO Auto-generated method stub
		return iDepartamentossDAO.save(departamento);
	}

	@Override
	public void eliminarDepartamento(Long id) {
		// TODO Auto-generated method stub
		iDepartamentossDAO.deleteById(id);
		
	}

}
