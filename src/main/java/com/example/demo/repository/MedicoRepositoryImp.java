package com.example.demo.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Medico;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
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
	public List<Medico> seleccionartodos() {
		// TODO Auto-generated method stub
		TypedQuery<Medico> query = entityManager.createQuery("SELECT m FROM Medico m", Medico.class);
		return query.getResultList();
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.entityManager.remove(this.seleccionar(id));
	}

	@Override
	public boolean verificarCedulaExistente(String cedula) {
		// TODO Auto-generated method stub
		Query myquey = this.entityManager.createQuery("SELECT COUNT(p) FROM Medico p WHERE p.cedula = :cedula",
				Long.class);
		myquey.setParameter("cedula", cedula);
		Long count = (Long) myquey.getSingleResult();
		return count > 0;
	}

}
