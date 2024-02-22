package com.example.demo.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Paciente;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class PacienteRepositoryImp implements IPacienteRepository {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Paciente paciente) {
		// TODO Auto-generated method stub
		this.entityManager.persist(paciente);
	}

	@Override
	public void actualizar(Paciente paciente) {
		// TODO Auto-generated method stub
		this.entityManager.merge(paciente);
	}

	@Override
	public void actualizarParcial(String apellido, String nombre, Integer id) {
		// TODO Auto-generated method stub

	}

	@Override
	public Paciente seleccionar(String cedula) {
		// TODO Auto-generated method stub
		Query myquey = this.entityManager.createQuery("SELECT p FROM Paciente p WHERE p.cedula = :cedula");
		myquey.setParameter("cedula", cedula);
		return (Paciente) myquey.getSingleResult();
	}

	@Override
	public List<Paciente> seleccionartodos(String genero) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public boolean verificarCedulaExistente(String cedula) {
		// TODO Auto-generated method stub
		Query myquey = this.entityManager.createQuery("SELECT COUNT(p) FROM Paciente p WHERE p.cedula = :cedula",
				Long.class);
		myquey.setParameter("cedula", cedula);
		Long count = (Long) myquey.getSingleResult();
		return count > 0;
	}

}
