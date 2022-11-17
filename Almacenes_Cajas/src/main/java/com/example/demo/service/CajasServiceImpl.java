package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ICajasDAO;
import com.example.demo.dto.Cajas;

@Service
public class CajasServiceImpl implements ICajasService {

	@Autowired
	ICajasDAO iCajasDAO;
	
	
	@Override
	public List<Cajas> listarCajas() {
		// TODO Auto-generated method stub
		return iCajasDAO.findAll();
	}

	@Override
	public Cajas guardarCaja(Cajas caja) {
		// TODO Auto-generated method stub
		return iCajasDAO.save(caja);
	}

	@Override
	public Cajas caja_x_id(String num_referencia) {
		// TODO Auto-generated method stub
		return iCajasDAO.findById(num_referencia).get();
	}

	@Override
	public Cajas actualizarCaja(Cajas caja) {
		// TODO Auto-generated method stub
		return iCajasDAO.save(caja);
	}

	@Override
	public void eliminarCaja(String num_referencia) {
		// TODO Auto-generated method stub
		iCajasDAO.deleteById(num_referencia);
		
	}

}