package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Medico;
import com.example.demo.repository.IMedicoRepository;

@Service
public class MedicoServiceImp implements IMedicoService {

	@Autowired
	private IMedicoRepository medicoRepository;

	@Override
	public void guardar(Medico medico) {
		// TODO Auto-generated method stub
		this.medicoRepository.insertar(medico);
	}

	@Override
	public void actualizar(Medico medico) {
		// TODO Auto-generated method stub
		this.medicoRepository.actualizar(medico);
	}

	@Override
	public void actualizarParcial(String apellido, String nombre, Integer id) {
		// TODO Auto-generated method stub
		this.actualizarParcial(apellido, apellido, id);
	}

	@Override
	public Medico buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.medicoRepository.seleccionar(id);
	}

	@Override
	public List<Medico> buscartodos() {
		// TODO Auto-generated method stub
		return this.medicoRepository.seleccionartodos();
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		this.medicoRepository.eliminar(id);
	}

	@Override
	public boolean verificarCedulaExistente(String cedula) {
		// TODO Auto-generated method stub
		return this.medicoRepository.verificarCedulaExistente(cedula);
	}

}
