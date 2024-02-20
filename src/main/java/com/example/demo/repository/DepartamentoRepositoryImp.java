package com.example.demo.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Departamento;
import jakarta.persistence.Query;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class DepartamentoRepositoryImp implements IDepartamentoRepository {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void ingresar(Departamento departamento) {
		// TODO Auto-generated method stub
		this.entityManager.persist(departamento);
	}

	@Override
	public void actualizar(Departamento departamento) {
		// TODO Auto-generated method stub
		this.entityManager.merge(departamento);
	}

	@Override
	public Departamento seleccionar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Departamento.class, id);
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		this.entityManager.remove(this.seleccionar(id));
	}

	// LLENAR CON LA CONSULTA QUE SE NECESITE
	@Override
	public List<Departamento> seleccionarTodo() {
		// TODO Auto-generated method stub
		Query query = entityManager.createQuery("SELECT d FROM Departamento d");
		return query.getResultList();
	}

	@Override
	public void actualizarParcial() {
		// TODO Auto-generated method stub

	}

}
