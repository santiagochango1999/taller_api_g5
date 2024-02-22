package com.example.demo.service;

import java.util.List;

import com.example.demo.modelo.Paciente;
import com.example.demo.service.to.PacienteTO;

public interface IPacienteService {
	public void guardar(Paciente paciente);

	public void guardarTo(PacienteTO paciente);

	public boolean verificarCedulaExistente(String cedula);

	public void actualizar(Paciente paciente);

	public void actualizarParcial(String apellido, String nombre, Integer id);

	public Paciente buscar(String cedula);

	public PacienteTO buscarTO(String cedula);

	public List<Paciente> buscartodos(String genero);

}
