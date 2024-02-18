package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.modelo.Paciente;
import com.example.demo.repository.IPacienteRepository;
import com.example.demo.service.to.PacienteTO;

@Service
public class PacienteServiceImp implements IPacienteService {

	@Autowired
	private IPacienteRepository pacienteRepository;

	@Override
	public void guardar(Paciente paciente) {
		// TODO Auto-generated method stub
		this.pacienteRepository.insertar(paciente);
	}

	@Override
	public void actualizar(Paciente paciente) {
		// TODO Auto-generated method stub
		this.pacienteRepository.actualizar(paciente);
	}

	@Override
	public void actualizarParcial(String apellido, String nombre, Integer id) {
		// TODO Auto-generated method stub
		this.actualizarParcial(apellido, nombre, id);
	}

	@Override
	public Paciente buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.pacienteRepository.seleccionar(id);
	}

	@Override
	public List<Paciente> buscartodos(String genero) {
		// TODO Auto-generated method stub
		return this.pacienteRepository.seleccionartodos(genero);
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		this.pacienteRepository.eliminar(id);
	}

	@Override
	public PacienteTO buscarTO(Integer id) {
		// TODO Auto-generated method stub
		return this.convertirTO(this.pacienteRepository.seleccionar(id));
	}

	private PacienteTO convertirTO(Paciente pac) {
		PacienteTO pacT = new PacienteTO();
		pacT.setId(pac.getId());
		pacT.setApellido(pac.getApellido());
		pacT.setNombre(pac.getNombre());
		pacT.setCedula(pac.getCedula());
		pacT.setDireccion(pac.getDireccion());
		pacT.setFechaNacimiento(pac.getFechaNacimiento());
		pacT.setRol(pac.getRol());
		pacT.setTelefono(pac.getTelefono());
		return pacT;
	}

	private Paciente convertir(PacienteTO pac) {
		Paciente pacT = new Paciente();
		pacT.setId(pac.getId());
		pacT.setApellido(pac.getApellido());
		pacT.setNombre(pac.getNombre());
		pacT.setCedula(pac.getCedula());
		pacT.setDireccion(pac.getDireccion());
		pacT.setFechaNacimiento(pac.getFechaNacimiento());
		pacT.setRol(pac.getRol());
		pacT.setTelefono(pac.getTelefono());
		return pacT;
	}

	@Override
	public void guardarTo(PacienteTO paciente) {
		// TODO Auto-generated method stub
		this.guardar(this.convertir(paciente));
	}

}
