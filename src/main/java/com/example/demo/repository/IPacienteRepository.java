package com.example.demo.repository;

import java.util.List;

import com.example.demo.modelo.Paciente;

public interface IPacienteRepository {

	public void insertar(Paciente paciente);

	public void actualizar(Paciente paciente);

	public void actualizarParcial(String apellido, String nombre, Integer id);

	public Paciente seleccionar(Integer id);

	public List<Paciente> seleccionartodos(String genero);

	public void eliminar(Integer id);

}
