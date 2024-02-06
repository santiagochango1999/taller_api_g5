package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.modelo.Consulta;
import com.example.demo.service.IConsultaService;

@RestController
@RequestMapping(path = "/consultas")
public class ConsultaControllerRestFul {

	@Autowired
	private IConsultaService consultaService;

	@GetMapping(path = "/{id}")
	public Consulta buscar(@PathVariable Integer id) {
		return this.consultaService.buscar(id);
	}

	@PostMapping
	public void guardar(@RequestBody Consulta consulta) {
		this.consultaService.ingresar(consulta);
	}

	@PutMapping(path = "/{id}")
	public void actualizar(@RequestBody Consulta consulta, @PathVariable Integer id) {
		consulta.setId(id);
		this.consultaService.actualizar(consulta);
	}

	@DeleteMapping(path = "/{id}")
	public void borrar(@PathVariable Integer id) {
		this.consultaService.borrar(id);
	}

	// REALIZAR CAMBIOS

	@GetMapping
	public List<Consulta> buscartodo() {
		return this.consultaService.buscartodo();
	}

	@PatchMapping(path = "/{id}")
	public void actualizarParcial() {
		this.consultaService.actualizarParcial();
	}
}
