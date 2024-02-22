package com.example.demo.repository;

import java.util.List;

import com.example.demo.modelo.Consulta;
import com.example.demo.service.to.ConsultaTO;

public interface IConsultaRepository {

	public void ingresar(Consulta consulta);

	public void actualizar(Consulta consulta);
	
    public  List<ConsultaTO> obtenerC(Integer id);


	// verificar por cuales parametros vamos actualizar parcialmente
	public void actualizarParcial();

	public Consulta seleccionar(Integer id);

	public List<Consulta> seleccionartodo();

	public void borrar(Integer id);

}
