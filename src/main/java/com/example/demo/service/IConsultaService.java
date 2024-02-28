package com.example.demo.service;

import java.time.LocalDateTime;
import java.util.List;

import com.example.demo.modelo.Consulta;
import com.example.demo.service.to.ConsultaTO;
import com.example.demo.service.to.ConsultaTO2;

public interface IConsultaService {

	public void ingresar(Consulta consulta);

	public void actualizar(Consulta consulta);

	public List<ConsultaTO> obtenerC(Integer id);

	public boolean verificarFDExistente(LocalDateTime fecha, Integer idMedico);

	// verificar por cuales parametros vamos actualizar parcialmente
	public void actualizarParcial();

	public Consulta buscar(Integer id);

	public List<ConsultaTO2> buscartodo();

	public List<ConsultaTO2> buscartodoFiltro(String nombre);

	public void borrar(Integer id);
}
