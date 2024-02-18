package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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

import com.example.demo.modelo.Paciente;
import com.example.demo.service.IPacienteService;
import com.example.demo.service.to.PacienteTO;

@RestController
@RequestMapping(path = "/pacientes")
@CrossOrigin
public class PacienteControllerRestFul {

	@Autowired
	private IPacienteService pacienteService;
	
	@GetMapping(path = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<PacienteTO> buscar(@PathVariable Integer id) {
		PacienteTO pacienteto=this.pacienteService.buscarTO(id);
		return ResponseEntity.status(200).body(pacienteto);
	}
	
	
	@GetMapping
	public List<Paciente> buscartodos(@RequestParam(required = false, defaultValue = "M") String genero){
		return this.pacienteService.buscartodos(genero);
	}
	
	
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
	public void guardar(@RequestBody PacienteTO pacienteTO) {
		this.pacienteService.guardarTo(pacienteTO);
	}
	
	// http://localhost:8080/API/v1.0/Registro/pacientes
	
	@PutMapping(path = "/{id}")
	public void actualizar(@RequestBody Paciente paciente,@PathVariable Integer id) {
		paciente.setId(id);
		this.pacienteService.actualizar(paciente);
	}
	
	@PatchMapping(path = "/{id}")
	public void actualizarParcial(@RequestBody Paciente paciente,@PathVariable Integer id) {
		this.pacienteService.actualizarParcial(paciente.getApellido(), paciente.getNombre(), id);
	}
	
	@DeleteMapping(path = "/{id}")
	public void borrar(@PathVariable Integer id){
		this.pacienteService.borrar(id);
	}
}
