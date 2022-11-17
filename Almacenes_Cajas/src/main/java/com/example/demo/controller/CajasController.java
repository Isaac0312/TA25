package com.example.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.dto.Cajas;
import com.example.demo.service.CajasServiceImpl;

@RestController
@RequestMapping("/api")
public class CajasController {
	
	@Autowired
	CajasServiceImpl cajasServiceImpl;
	
	@GetMapping("/cajas")
	public List<Cajas> listarCajas(){
		return cajasServiceImpl.listarCajas();
	}
	
	@PostMapping("/cajas")
	public Cajas salvarCaja(@RequestBody Cajas caja) {
		
		return cajasServiceImpl.guardarCaja(caja);
	}
	
	@GetMapping("/cajas/{num_referencia}")
	public Cajas caja_x_ID(@PathVariable(name="num_referencia") String num_referencia) {
		
		Cajas caja_x_id= new Cajas();
		
		caja_x_id=cajasServiceImpl.caja_x_id(num_referencia);
		
		System.out.println("Caja XID: "+caja_x_id);
		
		return caja_x_id;
	}
	
	@PutMapping("/cajas/{num_referencia}")
	public Cajas actualizarCaja(@PathVariable(name="num_referencia")String num_referencia,@RequestBody Cajas caja) {
		
		Cajas caja_seleccionado= new Cajas();
		Cajas caja_actualizado= new Cajas();
		
		caja_seleccionado= cajasServiceImpl.caja_x_id(num_referencia);
		
		caja_seleccionado.setContenido(caja.getContenido());
		caja_seleccionado.setValor(caja.getValor());
		caja_seleccionado.setAlmacen(caja.getAlmacen());
		
		caja_actualizado = cajasServiceImpl.actualizarCaja(caja_seleccionado);
		
		System.out.println("El caja actualizado es: "+ caja_actualizado);
		
		return caja_actualizado;
	}
	
	@DeleteMapping("/cajas/{num_referencia}")
	public void eliminarCaja(@PathVariable(name="num_referencia")String num_referencia) {
		cajasServiceImpl.eliminarCaja(num_referencia);
	}
	
	
}