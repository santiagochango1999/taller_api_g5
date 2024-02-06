package com.example.demo.service;

import java.util.List;

import com.example.demo.modelo.Departamento;

public interface IDepartamentoService {

	public void crear(Departamento departamento);

	public void actualizar(Departamento departamento);

	public Departamento buscar(Integer id);

	public void borrar(Integer id);

	// LLENAR CON LOS PARAMETROS QUE NECESITEMOS
	public List<Departamento> buscarTodo();

	public void actualizarParcial();
}
