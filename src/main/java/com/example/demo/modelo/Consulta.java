package com.example.demo.modelo;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "consulta")

public class Consulta {

	@Id
	@Column(name = "cons_id")
	private Integer id;
	@Column(name = "cons_fecha")
	private LocalDateTime fechaConsulta;
	@Column(name = "cons_motivo")
	private String motivo;

	@ManyToOne
	@JoinColumn(name = "cons_paciente_id")
	private Paciente paciente;

	@ManyToOne
	@JoinColumn(name = "cons_medico_id")
	private Medico medico;

	@ManyToOne
	@JoinColumn(name = "cons_factura_id")
	private Factura factura;

	@OneToOne
	@JoinColumn(name = "cons_serviciomedico_id")
	private ServiciosMedicos serviciosMedicos;

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

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public Medico getMedico() {
		return medico;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}

	public Factura getFactura() {
		return factura;
	}

	public void setFactura(Factura factura) {
		this.factura = factura;
	}

}
