package com.example.demo.service;
import java.util.List;

import com.example.demo.dto.Cajas;

public interface ICajasService {
	public List<Cajas> listarCajas();
	
	public Cajas guardarCaja(Cajas caja);
	
	public Cajas caja_x_id(String num_referencia);
	
	public Cajas actualizarCaja(Cajas caja);
	
	public void eliminarCaja(String num_referencia);
}