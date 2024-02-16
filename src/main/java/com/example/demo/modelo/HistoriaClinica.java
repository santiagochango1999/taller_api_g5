package com.example.demo.modelo;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "historiaClinica")
public class HistoriaClinica {
	
	@Id
	@GeneratedValue(generator = "seq_hicl", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "seq_hicl", sequenceName = "seq_hicl", allocationSize = 1)
	@Column(name = "hicl_id")
	private Integer id;
	@Column(name = "hicl_fecha")
	private LocalDateTime fecha;
	@Column(name = "hicl_diagnostico")
	private String diagnostico;
	@Column(name = "hicl_tratamiento")
	private String tratamiento;
	@Column(name = "hicl_observaciones")
	private String observaciones;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public LocalDateTime getFecha() {
		return fecha;
	}
	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}
	public String getDiagnostico() {
		return diagnostico;
	}
	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}
	public String getTratamiento() {
		return tratamiento;
	}
	public void setTratamiento(String tratamiento) {
		this.tratamiento = tratamiento;
	}
	public String getObservaciones() {
		return observaciones;
	}
	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}
	
	

}
