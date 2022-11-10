package com.example.demo.service;
import java.util.List;

import com.example.demo.dto.Departamentos;

public interface IDepartamentosService {
	public List<Departamentos> listarDepartamentos();
	
	public Departamentos guardarDepartamento(Departamentos departamento);
	
	public Departamentos departamento_x_id(Long id);
	
	public Departamentos actualizarDepartamento(Departamentos departamento);
	
	public void eliminarDepartamento(Long id);
}
