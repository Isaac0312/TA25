package com.example.demo.service;
import java.util.List;

import com.example.demo.dto.Fabricantes;

public interface IFabricantesService {
	public List<Fabricantes> listarFabricantes();
	
	public Fabricantes guardarFabricante(Fabricantes fabricante);
	
	public Fabricantes fabricante_x_id(Long codigo);
	
	public Fabricantes actualizarFabricante(Fabricantes fabricante);
	
	public void eliminarFabricante(Long codigo);
}
