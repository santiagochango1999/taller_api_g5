package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Consulta;
import com.example.demo.repository.IConsultaRepository;

@Service
public class ConsultaServiceImp implements IConsultaService {

	@Autowired
	private IConsultaRepository consultaRepository;

	@Override
	public void ingresar(Consulta consulta) {
		// TODO Auto-generated method stub
		this.consultaRepository.ingresar(consulta);
	}

	@Override
	public void actualizar(Consulta consulta) {
		// TODO Auto-generated method stub
		this.consultaRepository.actualizar(consulta);
	}

	// REALIZAR LOS PARAMETROS
	@Override
	public void actualizarParcial() {
		// TODO Auto-generated method stub
		this.consultaRepository.actualizarParcial();
	}

	@Override
	public Consulta buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.consultaRepository.seleccionar(id);
	}

	// PONER PARAMETROS SI NECESITAMOS
	@Override
	public List<Consulta> buscartodo() {
		// TODO Auto-generated method stub
		return this.consultaRepository.seleccionartodo();
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		this.consultaRepository.borrar(id);
	}

}
