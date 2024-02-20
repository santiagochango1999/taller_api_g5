package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.modelo.Departamento;
import com.example.demo.service.IDepartamentoService;
import com.example.demo.service.to.DepartamentoTO;

@RestController
@RequestMapping(path = "/departamentos")
@CrossOrigin
public class DepartamentoControllerRestFul {

	@Autowired
	private IDepartamentoService departamentoService;

	@GetMapping(path = "/{id}")
	public Departamento buscar(@PathVariable Integer id) {
		return this.departamentoService.buscar(id);
	}

	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<DepartamentoTO>> buscarTodo() {
		List<DepartamentoTO> lista = this.departamentoService.buscarTodo();
		return ResponseEntity.status(HttpStatus.OK).body(lista);
	}

	@PostMapping
	public void guardar(@RequestBody Departamento departamento) {
		this.departamentoService.crear(departamento);
	}

	@PutMapping(path = "/{id}")
	public void actualizar(@RequestBody Departamento departamento, @PathVariable Integer id) {
		departamento.setId(id);
		this.departamentoService.actualizar(departamento);
	}

	@DeleteMapping(path = "/{id}")
	public void borrar(@PathVariable Integer id) {
		this.departamentoService.borrar(id);
	}

	// PONER BUSCAR TODO Y ACTUALIZAR PARCIAL SI SE NECESITA
}
