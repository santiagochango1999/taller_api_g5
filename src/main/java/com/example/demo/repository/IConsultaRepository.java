package com.example.demo.repository;

import java.time.LocalDateTime;
import java.util.List;

import com.example.demo.modelo.Consulta;
import com.example.demo.service.to.ConsultaTO;

public interface IConsultaRepository {

	public void ingresar(Consulta consulta);

	public void actualizar(Consulta consulta);

	public List<ConsultaTO> obtenerC(Integer id);

	public List<ConsultaTO> obtenerC2(Integer id, String cedula);

	public boolean verificarFDExistente(LocalDateTime fecha, Integer idMedico);

	// verificar por cuales parametros vamos actualizar parcialmente
	public void actualizarParcial();

	public Consulta seleccionar(Integer id);

	public List<Consulta> seleccionartodo();

	public List<Consulta> seleccionartodoFiltro(String nombre);

	public void borrar(Integer id);

}
