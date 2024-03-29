package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.modelo.Factura;
import com.example.demo.service.IFacturaService;

@RestController
@RequestMapping(path = "/facturas")
public class FacturaControllerRestFul {

	@Autowired
	private IFacturaService facturaService;

	@GetMapping(path = "/{id}")
	public Factura buscar(@PathVariable Integer id) {
		return this.facturaService.buscar(id);
	}

	@PostMapping
	public void guardar(@RequestBody Factura factura) {
		this.facturaService.crear(factura);
	}

	@PutMapping(path = "/{id}")
	public void actualizar(@RequestBody Factura factura, @PathVariable Integer id) {
		factura.setId(id);
		this.facturaService.actualizar(factura);
	}

	@DeleteMapping(path = "/{id}")
	public void borrar(@PathVariable Integer id) {
		this.facturaService.borrar(id);
	}

	// PONER BUSCAR TODO Y ACTUALIZAR PARCIAL SI SE NECESITA
}
