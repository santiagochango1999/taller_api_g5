package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Departamento;
import com.example.demo.repository.IDepartamentoRepository;
import com.example.demo.service.to.DepartamentoTO;

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
	public List<DepartamentoTO> buscarTodo() {
		List<Departamento> lista = this.departamentoRepository.seleccionarTodo();
		List<DepartamentoTO> listaFinal = new ArrayList<>();
		for (Departamento d : lista) {
			listaFinal.add(convertir(d));
		}
		return listaFinal;
	}

	public DepartamentoTO convertir(Departamento dep) {
		DepartamentoTO dto = new DepartamentoTO();
		dto.setId(dep.getId());
		dto.setNombre(dep.getNombre());
		dto.setTelefono(dep.getTelefono());
		return dto;
	}

	@Override
	public void actualizarParcial() {
		// TODO Auto-generated method stub
		this.departamentoRepository.actualizarParcial();
	}

}
