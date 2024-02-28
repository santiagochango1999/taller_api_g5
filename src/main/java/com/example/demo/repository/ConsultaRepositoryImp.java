package com.example.demo.repository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Consulta;
import com.example.demo.service.to.ConsultaTO;
import com.example.demo.service.to.ConsultaTO2;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
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
		TypedQuery<Consulta> query = entityManager.createQuery("SELECT c FROM Consulta c", Consulta.class);

		return query.getResultList();
	}

	// REALIZAR LA CONSULTA FILTRO

	@Override
	public List<Consulta> seleccionartodoFiltro(String nombre) {
		// TODO Auto-generated method stub
		TypedQuery<Consulta> query = entityManager.createQuery("SELECT c FROM Consulta c WHERE c.medico.nombre=:nombre",
				Consulta.class);
		query.setParameter("nombre", nombre);
		return query.getResultList();
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

	@Override
	public List<ConsultaTO> obtenerC(Integer id) {
		TypedQuery<ConsultaTO> query = entityManager.createQuery(
				"SELECT c.id, c.fechaConsulta, c.motivo, m.nombre AS nombreMedico, s.nombre AS nombreServicio "
						+ "FROM Consulta c " + "JOIN c.medico m " + "JOIN c.serviciosMedicos s "
						+ "WHERE c.paciente.id = :idPaciente",
				ConsultaTO.class);

		query.setParameter("idPaciente", id);
		List<ConsultaTO> resultados = query.getResultList();
		System.out.println("valores ");
		System.out.println("OTRO:" + resultados);
		return resultados;
		/*
		 * return resultados.stream().map(row -> new ConsultaTO((Integer) row[0],
		 * (LocalDateTime) row[1], (String) row[2], (String) row[3], (String)
		 * row[4])).collect(Collectors.toList());
		 */
	}

	@Override
	public boolean verificarFDExistente(LocalDateTime fecha, Integer idMedico) {
		// TODO Auto-generated method stub
		Query myquey = this.entityManager.createQuery(
				"SELECT COUNT(c) FROM Consulta c WHERE c.fechaConsulta = :fecha AND c.medico.id = :idMedico",
				Long.class);
		myquey.setParameter("fecha", fecha);
		myquey.setParameter("idMedico", idMedico);
		Long count = (Long) myquey.getSingleResult();
		return count > 0;
	}

}
