package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IEmpleadosDAO;
import com.example.demo.dto.Empleados;

@Service
public class EmpleadosServiceImpl implements IEmpleadosService {

	@Autowired
	IEmpleadosDAO iEmpleadosDAO;
	
	
	@Override
	public List<Empleados> listarEmpleados() {
		// TODO Auto-generated method stub
		return iEmpleadosDAO.findAll();
	}

	@Override
	public Empleados guardarEmpleado(Empleados empleado) {
		// TODO Auto-generated method stub
		return iEmpleadosDAO.save(empleado);
	}

	@Override
	public Empleados empleado_x_id(String dni) {
		// TODO Auto-generated method stub
		return iEmpleadosDAO.findById(dni).get();
	}

	@Override
	public Empleados actualizarEmpleado(Empleados empleado) {
		// TODO Auto-generated method stub
		return iEmpleadosDAO.save(empleado);
	}

	@Override
	public void eliminarEmpleado(String dni) {
		// TODO Auto-generated method stub
		iEmpleadosDAO.deleteById(dni);
		
	}

}