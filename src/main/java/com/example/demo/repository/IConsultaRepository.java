package com.example.demo.repository;

import java.util.List;

import com.example.demo.modelo.Consulta;

public interface IConsultaRepository {

	public void ingresar(Consulta consulta);

	public void actualizar(Consulta consulta);

	// verificar por cuales parametros vamos actualizar parcialmente
	public void actualizarParcial();

	public Consulta seleccionar(Integer id);

	public List<Consulta> seleccionartodo();

	public void borrar(Integer id);

}
