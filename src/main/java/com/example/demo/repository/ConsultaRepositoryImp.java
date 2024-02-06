package com.example.demo.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Consulta;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class ConsultaRepositoryImp implements IConsultaRepository {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void ingresar(Consulta consulta) {
		// TODO Auto-generated method stub
		this.entityManager.persist(consulta);
	}

	@Override
	public void actualizar(Consulta consulta) {
		// TODO Auto-generated method stub
		this.entityManager.merge(consulta);
	}

	@Override
	public Consulta seleccionar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Consulta.class, id);
	}

	// REALIZAR LA CONSULTA
	@Override
	public List<Consulta> seleccionartodo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		this.entityManager.remove(this.seleccionar(id));
	}

	// REALIZAR LA CONSULTA
	@Override
	public void actualizarParcial() {
		// TODO Auto-generated method stub

	}

}
