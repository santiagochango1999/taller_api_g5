package com.example.demo.controller;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.modelo.Consulta;
import com.example.demo.service.IConsultaService;
import com.example.demo.service.to.ConsultaTO;
import com.example.demo.service.to.ConsultaTO2;

@RestController
@RequestMapping(path = "/consultas")
@CrossOrigin

public class ConsultaControllerRestFul {

	@Autowired
	private IConsultaService consultaService;

	@GetMapping(path = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Consulta buscar(@PathVariable Integer id) {
		System.out.println(this.consultaService.buscar(id));
		return this.consultaService.buscar(id);

	}

	@PostMapping
	public void guardar(@RequestBody Consulta consulta) {

		this.consultaService.ingresar(consulta);
	}

	// verificacion de fecha y idmedico

	@GetMapping(params = { "fecha", "idMedico" }, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Boolean> verificarCedulaExistente(@RequestParam LocalDateTime fecha,
			@RequestParam Integer idMedico) {
		boolean verificacion = this.consultaService.verificarFDExistente(fecha, idMedico);
		System.out.println(ResponseEntity.ok(verificacion));
		return ResponseEntity.ok(verificacion);
	}

	@GetMapping(path = "/otro/{id}")
	public ResponseEntity<List<ConsultaTO>> buscartodo(@PathVariable Integer id) {
		List<ConsultaTO> lis = this.consultaService.obtenerC(id);
		return ResponseEntity.status(200).body(lis);
	}

	@GetMapping(path = "/otro2/{id}/{cedula}")
	public ResponseEntity<List<ConsultaTO>> buscartodo2(@PathVariable Integer id, @PathVariable String cedula) {
		List<ConsultaTO> lis = this.consultaService.obtenerC2(id, cedula);
		return ResponseEntity.status(200).body(lis);
	}

	// Consultar todo

	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<ConsultaTO2>> buscartodos() {
		List<ConsultaTO2> listacon = this.consultaService.buscartodo();
		return ResponseEntity.status(HttpStatus.OK).body(listacon);
	}

	// Consultar todo FILTRO

	@GetMapping(path = "/filtro/{nombre}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<ConsultaTO2>> buscartodosfiltro(@PathVariable String nombre) {
		List<ConsultaTO2> listacon = this.consultaService.buscartodoFiltro(nombre);
		return ResponseEntity.status(HttpStatus.OK).body(listacon);
	}

	@GetMapping(path = "/filtro2/{nombre}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<ConsultaTO2>> buscartodosfiltro2(@PathVariable String nombre) {
		List<ConsultaTO2> listacon = this.consultaService.buscartodoFiltro2(nombre);
		return ResponseEntity.status(HttpStatus.OK).body(listacon);
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

	@PatchMapping(path = "/{id}")
	public void actualizarParcial() {
		this.consultaService.actualizarParcial();
	}
}
