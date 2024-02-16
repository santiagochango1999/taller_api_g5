package com.example.demo.modelo;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "serviciomedico")
public class ServiciosMedicos {

	@Id
	@GeneratedValue(generator = "seq_srmd", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "seq_srmd", sequenceName = "seq_srmd", allocationSize = 1)
	@Column(name = "srmd_id")
	private Integer id;
	@Column(name = "srmd_nombre")
	private String nombre;
	@Column(name = "srmd_costo")
	private BigDecimal costo;

	// GET Y SET
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

	public BigDecimal getCosto() {
		return costo;
	}

	public void setCosto(BigDecimal costo) {
		this.costo = costo;
	}

}
