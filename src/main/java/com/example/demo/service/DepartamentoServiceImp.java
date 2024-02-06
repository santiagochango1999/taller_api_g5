package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Departamento;
import com.example.demo.repository.IDepartamentoRepository;

@Service
public class DepartamentoServiceImp implements IDepartamentoService {

	@Autowired
	private IDepartamentoRepository departamentoRepository;

	@Override
	public void crear(Departamento departamento) {
		// TODO Auto-generated method stub
		this.departamentoRepository.ingresar(departamento);
	}

	@Override
	public void actualizar(Departamento departamento) {
		// TODO Auto-generated method stub
		this.departamentoRepository.actualizar(departamento);
	}

	@Override
	public Departamento buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.departamentoRepository.seleccionar(id);
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		this.departamentoRepository.borrar(id);
	}

	// PONER LOS PARAMETROS QUE NECESITEMOS
	@Override
	public List<Departamento> buscarTodo() {
		// TODO Auto-generated method stub
		return this.departamentoRepository.seleccionarTodo();
	}

	@Override
	public void actualizarParcial() {
		// TODO Auto-generated method stub
		this.departamentoRepository.actualizarParcial();
	}

}
