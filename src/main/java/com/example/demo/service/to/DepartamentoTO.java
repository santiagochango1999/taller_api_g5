package com.example.demo.service.to;

import java.io.Serializable;
import java.util.List;

import org.springframework.hateoas.RepresentationModel;

import com.example.demo.modelo.Medico;

public class DepartamentoTO extends RepresentationModel<DepartamentoTO> implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8400343335268860558L;

	private Integer id;
	private String nombre;
	private String telefono;
	private List<MedicoTO> medico;

	public Integer getId() {
		return id;
	}

	public List<MedicoTO> getMedico() {
		return medico;
	}

	public void setMedico(List<MedicoTO> medico) {
		this.medico = medico;
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
