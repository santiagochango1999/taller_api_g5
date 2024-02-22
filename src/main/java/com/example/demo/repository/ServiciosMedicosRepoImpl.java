package com.example.demo.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.ServiciosMedicos;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class ServiciosMedicosRepoImpl implements IServicioMedicosRepo {
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(ServiciosMedicos serviciosMedicos) {
		// TODO Auto-generated method stub
		// throw new UnsupportedOperationException("Unimplemented method 'insertar'");
		this.entityManager.persist(serviciosMedicos);
	}

	@Override
	public ServiciosMedicos buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(ServiciosMedicos.class, id);

	}

	@Override
	public List<ServiciosMedicos> buscarTodo() {
		// TODO Auto-generated method stub
		// throw new UnsupportedOperationException("Unimplemented method 'buscarTodo'");
		Query query = entityManager.createQuery("SELECT sm FROM ServiciosMedicos sm");
		return query.getResultList();
	}

	@Override
	public void actualizar(ServiciosMedicos serviciosMedicos) {
		// TODO Auto-generated method stub
		// throw new UnsupportedOperationException("Unimplemented method 'actualizar'");
		this.entityManager.merge(serviciosMedicos);
	}

	@Override
	public void eliminar(Integer id) {
		this.entityManager.remove(this.buscar(id));
	}
}