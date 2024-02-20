package com.example.demo.service.to;

import java.io.Serializable;

import org.springframework.hateoas.RepresentationModel;

public class DepartamentoTO extends RepresentationModel<DepartamentoTO> implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8400343335268860558L;
	
	private Integer id;
	private String nombre;
	private String telefono;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

}
