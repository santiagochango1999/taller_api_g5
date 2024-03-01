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

import com.example.demo.modelo.Medico;
import com.example.demo.service.IMedicoService;

@RestController
@RequestMapping(path = "/medicos")
@CrossOrigin
public class MedicoControllerRestFul {

	@Autowired
	private IMedicoService medicoService;

	@GetMapping(path = "/{cedula}")
	public Medico buscar(@PathVariable String cedula) {
		return this.medicoService.buscar(cedula);

	}

	@GetMapping(params = "cedula", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Boolean> verificarCedulaExistente(@RequestParam String cedula) {
		boolean cedulaExistente = this.medicoService.verificarCedulaExistente(cedula);
		System.out.println(ResponseEntity.ok(cedulaExistente));
		return ResponseEntity.ok(cedulaExistente);
	}

	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Medico> buscartodos() {
		System.out.println(this.medicoService.buscartodos());
		return this.medicoService.buscartodos();
	}

	@PostMapping
	public void guardar(@RequestBody Medico medico) {
		this.medicoService.guardar(medico);
	}

	@PutMapping(path = "/{id}")
	public void actualizar(@RequestBody Medico medico, @PathVariable Integer id) {
		medico.setId(id);
		this.medicoService.actualizar(medico);
	}

	@PatchMapping(path = "/{id}")
	public void actualizarParcial(@RequestBody Medico medico, @PathVariable Integer id) {
		this.medicoService.actualizarParcial(medico.getApellido(), medico.getNombre(), id);
	}

}
