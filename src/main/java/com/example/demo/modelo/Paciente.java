package com.example.demo.modelo;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "paciente")
public class Paciente {

	@Id
	@GeneratedValue(generator = "seq_pac", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "seq_pac", sequenceName = "seq_pac", allocationSize = 1)
	@Column(name = "pcte_id")
	private Integer id;
	@Column(name = "pcte_nombre")
	private String nombre;
	@Column(name = "pcte_apellido")
	private String apellido;
	@Column(name = "pcte_cedula")
	private String cedula;
	@Column(name = "pcte_direccion")
	private String direccion;
	@Column(name = "pcte_telefono")
	private String telefono;
	@Column(name = "pcte_fecha_nacimiento")
	private LocalDateTime fechaNacimiento;
	@Column(name = "pcte_rol")
	private String rol;

	@OneToMany(mappedBy = "paciente")
	private List<Consulta> consulta;

	@OneToOne(mappedBy = "paciente", cascade = CascadeType.ALL)
	@JoinColumn(name = "paciente_id")
	private HistoriaClinica historiaClinica;

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

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public LocalDateTime getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDateTime fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}

	// GET Y SET

}
