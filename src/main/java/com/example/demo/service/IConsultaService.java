package com.example.demo.service;

import java.util.List;

import com.example.demo.modelo.Consulta;

public interface IConsultaService {

	public void ingresar(Consulta consulta);

	public void actualizar(Consulta consulta);

	// verificar por cuales parametros vamos actualizar parcialmente
	public void actualizarParcial();

	public Consulta buscar(Integer id);

	public List<Consulta> buscartodo();

	public void borrar(Integer id);
}
