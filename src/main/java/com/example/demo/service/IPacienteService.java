package com.example.demo.service;

import java.util.List;

import com.example.demo.modelo.Paciente;


public interface IPacienteService {
	public void guardar(Paciente paciente);

	public void actualizar(Paciente paciente);

	public void actualizarParcial(String apellido, String nombre, Integer id);

	public Paciente buscar(Integer id);

	public List<Paciente> buscartodos(String genero);

	public void borrar(Integer id);
}
