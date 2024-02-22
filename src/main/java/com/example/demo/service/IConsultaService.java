package com.example.demo.service;

import java.util.List;

import com.example.demo.modelo.Consulta;
import com.example.demo.service.to.ConsultaTO;

public interface IConsultaService {

	public void ingresar(Consulta consulta);

	public void actualizar(Consulta consulta);

	public List<ConsultaTO> obtenerC(Integer id);

	// verificar por cuales parametros vamos actualizar parcialmente
	public void actualizarParcial();

	public Consulta buscar(Integer id);

	public List<Consulta> buscartodo();

	public void borrar(Integer id);
}
