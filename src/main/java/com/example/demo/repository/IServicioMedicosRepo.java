package com.example.demo.repository;

import java.util.List;

import com.example.demo.modelo.ServiciosMedicos;

public interface IServicioMedicosRepo {
	// CRUD
	// C
	public void insertar(ServiciosMedicos serviciosMedicos);

	// R
	public ServiciosMedicos buscar(Integer id);

	// RA
	public List<ServiciosMedicos> buscarTodo();

	// U
	public void actualizar(ServiciosMedicos serviciosMedicos);

	// D
	public void eliminar(Integer id);
}