package com.example.demo.service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Consulta;
import com.example.demo.repository.IConsultaRepository;
import com.example.demo.service.to.ConsultaTO;
import com.example.demo.service.to.ConsultaTO2;

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
	public List<ConsultaTO2> buscartodo() {
		// TODO Auto-generated method stub
		List<Consulta> listaconsulta = this.consultaRepository.seleccionartodo();
		List<ConsultaTO2> list = new ArrayList<>();
		for (Consulta cons : listaconsulta) {
			ConsultaTO2 consultaTO2 = this.convertir(cons);
			list.add(consultaTO2);
		}

		return list;
	}

	@Override
	public List<ConsultaTO2> buscartodoFiltro(String nombre) {
		// TODO Auto-generated method stub
		List<Consulta> listaconsulta = this.consultaRepository.seleccionartodoFiltro(nombre);
		List<ConsultaTO2> list = new ArrayList<>();
		for (Consulta cons : listaconsulta) {
			ConsultaTO2 consultaTO2 = this.convertir(cons);
			list.add(consultaTO2);
		}

		return list;
	}

	@Override
	public List<ConsultaTO2> buscartodoFiltro2(String nombre) {
		// TODO Auto-generated method stub
		List<Consulta> listaconsulta = this.consultaRepository.seleccionartodoFiltro(nombre);
		List<ConsultaTO2> list = new ArrayList<>();
		for (Consulta cons : listaconsulta) {
			ConsultaTO2 consultaTO2 = this.convertir2(cons);
			list.add(consultaTO2);
		}

		return list;
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		this.consultaRepository.borrar(id);
	}

	@Override
	public List<ConsultaTO> obtenerC(Integer id) {
		// TODO Auto-generated method stub
		return this.consultaRepository.obtenerC(id);
	}

	public List<ConsultaTO> obtenerC2(Integer id, String cedula) {
		// TODO Auto-generated method stub
		return this.consultaRepository.obtenerC2(id, cedula);
	}

	@Override
	public boolean verificarFDExistente(LocalDateTime fecha, Integer idMedico) {
		return this.consultaRepository.verificarFDExistente(fecha, idMedico);
	}

	private ConsultaTO2 convertir(Consulta consulta) {
		ConsultaTO2 to2 = new ConsultaTO2();
		to2.setId(consulta.getId());
		to2.setPaciente(consulta.getPaciente());
		to2.setStart(consulta.getFechaConsulta());
		to2.setTitle("RESERVADO");

		return to2;
	}

	private ConsultaTO2 convertir2(Consulta consulta) {
		ConsultaTO2 to2 = new ConsultaTO2();
		to2.setId(consulta.getId());
		to2.setPaciente(consulta.getPaciente());
		to2.setStart(consulta.getFechaConsulta());
		to2.setTitle(consulta.getMotivo());

		return to2;
	}

}
