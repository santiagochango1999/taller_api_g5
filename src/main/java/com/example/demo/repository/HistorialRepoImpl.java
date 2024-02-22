package com.example.demo.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.modelo.HistoriaClinica;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class HistorialRepoImpl implements IHistorialRepo {
	@Autowired
	private EntityManager entityManager;

	@Override
	public void insertar(HistoriaClinica historiaClinica) {
		// TODO Auto-generated method stub
		this.entityManager.persist(historiaClinica);
	}

	@Override
	public List<HistoriaClinica> buscarTodos() {
		// TODO Auto-generated method stub
		Query query = this.entityManager.createQuery("SELECT h FROM HistoriaClinica h");
		return query.getResultList();
	}

	@Override
	public List<HistoriaClinica> buscar(String cedula) {
		// TODO Auto-generated method stub
		Query query = this.entityManager.createQuery("SELECT h FROM HistoriaClinica h WHERE h.paciente.cedula=:cedula");
		query.setParameter("cedula", cedula);
		return query.getResultList();
	}

	@Override
	public void actualizar(HistoriaClinica historiaClinica) {
		// TODO Auto-generated method stub
		// La integridad de esta informacion no debe alterarse
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'eliminar'");
	}
}