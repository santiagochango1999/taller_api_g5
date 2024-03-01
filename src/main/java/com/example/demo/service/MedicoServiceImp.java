package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Medico;
import com.example.demo.repository.IMedicoRepository;
import com.example.demo.service.to.MedicoTO;

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
	public Medico buscar(String cedula) {
		// TODO Auto-generated method stub
		return this.medicoRepository.seleccionar(cedula);
	}

	@Override
	public List<Medico> buscartodos() {
		// TODO Auto-generated method stub
		return this.medicoRepository.seleccionartodos();
	}

	@Override
	public boolean verificarCedulaExistente(String cedula) {
		// TODO Auto-generated method stub
		return this.medicoRepository.verificarCedulaExistente(cedula);
	}

	@Override
	public List<MedicoTO> seleccionarMedicoDepartamento(Integer id) {
		// TODO Auto-generated method stub
		List<Medico> list = this.medicoRepository.seleccionarMedicoDepartamento(id);
		List<MedicoTO> list2 = new ArrayList<>();
		for (Medico medico : list) {
			MedicoTO medicoTO = this.convertir(medico);
			list2.add(medicoTO);
		}
		return list2;
	}

	private MedicoTO convertir(Medico medico) {
		MedicoTO to = new MedicoTO();
		to.setNombre(medico.getNombre());
		to.setApellido(medico.getApellido());
		return to;
	}

}
