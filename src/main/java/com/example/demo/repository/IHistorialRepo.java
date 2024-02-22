package com.example.demo.repository;

import java.util.List;

import com.example.demo.modelo.HistoriaClinica;

public interface IHistorialRepo {
	// c
	public void insertar(HistoriaClinica historiaClinica);

	// r
	public List<HistoriaClinica> buscarTodos();

	public List<HistoriaClinica> buscar(String cedula);

	// u
	public void actualizar(HistoriaClinica historiaClinica);

	// d
	public void eliminar(Integer id);
}
