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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.modelo.Medico;
import com.example.demo.service.IMedicoService;

@RestController
@RequestMapping(path = "/medicos")
public class MedicoControllerRestFul {

	@Autowired
	private IMedicoService medicoService;
	
	@GetMapping(path = "/{id}")
	public Medico buscar(@PathVariable Integer id) {
		System.out.println("dasdas"+id);
		System.out.println(this.medicoService.buscar(id).getApellido());
		return this.medicoService.buscar(id);
		
	}
	
	@GetMapping
	public List<Medico> buscartodos(@RequestParam(required = false, defaultValue = "M") String genero){
		return this.medicoService.buscartodos(genero);
	}
	
	
	@PostMapping
	public void guardar(@RequestBody Medico medico) {
		this.medicoService.guardar(medico);
	}
	
	
	@PutMapping(path = "/{id}")
	public void actualizar(@RequestBody Medico medico,@PathVariable Integer id) {
		medico.setId(id);
		this.medicoService.actualizar(medico);
	}
	
	@PatchMapping(path = "/{id}")
	public void actualizarParcial(@RequestBody Medico medico,@PathVariable Integer id) {
		this.medicoService.actualizarParcial(medico.getApellido(), medico.getNombre(), id);
	}
	
	@DeleteMapping(path = "/{id}")
	public void borrar(@PathVariable Integer id){
		this.medicoService.borrar(id);
	}
}
