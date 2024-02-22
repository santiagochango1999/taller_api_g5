package com.example.demo.service.to;

import java.time.LocalDateTime;


public class ConsultaTO {
	
	private Integer id;
	private LocalDateTime fechaConsulta;
	private String motivo;
	private String nombreMedico;
	private String nombreServicio;

	// Constructor, getters y setters

	public ConsultaTO(Integer id, LocalDateTime fechaConsulta, String motivo, String nombreMedico,
			String nombreServicio) {
		this.id = id;
		this.fechaConsulta = fechaConsulta;
		this.motivo = motivo;
		this.nombreMedico = nombreMedico;
		this.nombreServicio = nombreServicio;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalDateTime getFechaConsulta() {
		return fechaConsulta;
	}

	public void setFechaConsulta(LocalDateTime fechaConsulta) {
		this.fechaConsulta = fechaConsulta;
	}

	public String getMotivo() {
		return motivo;
	}

	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}

	public String getNombreMedico() {
		return nombreMedico;
	}

	public void setNombreMedico(String nombreMedico) {
		this.nombreMedico = nombreMedico;
	}

	public String getNombreServicio() {
		return nombreServicio;
	}

	public void setNombreServicio(String nombreServicio) {
		this.nombreServicio = nombreServicio;
	}
	
	
}
