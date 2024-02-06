package com.example.demo.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Medico;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class MedicoRepositoryImp implements IMedicoRepository {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Medico medico) {
		// TODO Auto-generated method stub
		this.entityManager.persist(medico);
	}

	@Override
	public void actualizar(Medico medico) {
		// TODO Auto-generated method stub
		this.entityManager.merge(medico);
	}

	@Override
	public void actualizarParcial(String apellido, String nombre, Integer id) {
		// TODO Auto-generated method stub

	}

	@Override
	public Medico seleccionar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Medico.class, id);
	}

	@Override
	public List<Medico> seleccionartodos(String genero) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.entityManager.remove(this.seleccionar(id));
	}

}
