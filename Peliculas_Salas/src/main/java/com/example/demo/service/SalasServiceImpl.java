package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ISalasDAO;
import com.example.demo.dto.Salas;

@Service
public class SalasServiceImpl implements ISalasService {

	@Autowired
	ISalasDAO iSalasDAO;
	
	
	@Override
	public List<Salas> listarSalas() {
		// TODO Auto-generated method stub
		return iSalasDAO.findAll();
	}

	@Override
	public Salas guardarSala(Salas sala) {
		// TODO Auto-generated method stub
		return iSalasDAO.save(sala);
	}

	@Override
	public Salas sala_x_id(Long id) {
		// TODO Auto-generated method stub
		return iSalasDAO.findById(id).get();
	}

	@Override
	public Salas actualizarSala(Salas sala) {
		// TODO Auto-generated method stub
		return iSalasDAO.save(sala);
	}

	@Override
	public void eliminarSala(Long id) {
		// TODO Auto-generated method stub
		iSalasDAO.deleteById(id);
		
	}

}