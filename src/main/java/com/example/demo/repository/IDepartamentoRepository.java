package com.example.demo.repository;

import java.util.List;

import com.example.demo.modelo.Departamento;

public interface IDepartamentoRepository {

	public void ingresar(Departamento departamento);

	public void actualizar(Departamento departamento);

	public Departamento seleccionar(Integer id);

	public void borrar(Integer id);

	// ONER LOS PARAMETROS QUE NECESITEMOSs
	public List<Departamento> seleccionarTodo();

	public void actualizarParcial();
}
