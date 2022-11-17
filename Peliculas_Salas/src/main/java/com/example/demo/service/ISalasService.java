package com.example.demo.service;
import java.util.List;

import com.example.demo.dto.Salas;

public interface ISalasService {
	public List<Salas> listarSalas();
	
	public Salas guardarSala(Salas sala);
	
	public Salas sala_x_id(Long id);
	
	public Salas actualizarSala(Salas sala);
	
	public void eliminarSala(Long id);
}