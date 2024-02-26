package com.example.demo.modelo;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "medico")
@JsonIgnoreProperties(value = {"consulta", "departamento"})

public class Medico {

	@Id
	@GeneratedValue(generator = "seq_med", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "seq_med", sequenceName = "seq_med", allocationSize = 1)
	@Column(name = "medi_id")
	private Integer id;
	@Column(name = "medi_nombre")
	private String nombre;
	@Column(name = "medi_apellido")
	private String apellido;
	@Column(name = "medi_Cedula")
	private String cedula;
	@Column(name = "medi_telefono")
	private String telefono;
	@Column(name = "medi_especialidad")
	private String especialidad;
	@Column(name = "medi_formacion")
	private String formacion;
	@Column(name = "medi_horario_atencion")
	private String horarioAtencion;
	@Column(name = "medi_codigo_medico")
	private String codigoMedico;
	@Column(name = "medi_contraseña")
	private String contraseña;

	@OneToMany(mappedBy = "medico")
	private List<Consulta> consulta;

	@ManyToOne
	@JoinColumn(name = "medi_departamento_id")
	public Departamento departamento;

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

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	public List<Consulta> getConsulta() {
		return consulta;
	}

	public void setConsulta(List<Consulta> consulta) {
		this.consulta = consulta;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	public String getFormacion() {
		return formacion;
	}

	public void setFormacion(String formacion) {
		this.formacion = formacion;
	}

	public String getHorarioAtencion() {
		return horarioAtencion;
	}

	public void setHorarioAtencion(String horarioAtencion) {
		this.horarioAtencion = horarioAtencion;
	}

	public String getCodigoMedico() {
		return codigoMedico;
	}

	public void setCodigoMedico(String codigoMedico) {
		this.codigoMedico = codigoMedico;
	}

}
