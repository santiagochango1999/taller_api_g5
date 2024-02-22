package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.modelo.ServiciosMedicos;
import com.example.demo.service.IServiciosMedicosService;

@RestController
@CrossOrigin
@RequestMapping(path = "/serviciosMedicos")
public class ServicioMedicoControllerRestFul {
	@Autowired
	private IServiciosMedicosService iServiciosMedicosService;

	@GetMapping(path = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ServiciosMedicos buscar(@PathVariable Integer id) {
		return this.iServiciosMedicosService.seleccionar(id);
	}

	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public List<ServiciosMedicos> buscarTodos() {
		return this.iServiciosMedicosService.seleccionarTodo();
	}
}