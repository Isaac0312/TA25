package com.example.demo.service;
import java.util.List;

import com.example.demo.dto.Almacenes;

public interface IAlmacenesService {
	public List<Almacenes> listarAlmacenes();
	
	public Almacenes guardarAlmacen(Almacenes almacen);
	
	public Almacenes almacen_x_id(Long id);
	
	public Almacenes actualizarAlmacen(Almacenes departamento);
	
	public void eliminarAlmacen(Long id);
}
