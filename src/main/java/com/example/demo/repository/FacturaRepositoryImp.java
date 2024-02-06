package com.example.demo.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Factura;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class FacturaRepositoryImp implements IFacturaRepository {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void ingresar(Factura factura) {
		// TODO Auto-generated method stub
		this.entityManager.persist(factura);
	}

	@Override
	public void actualizar(Factura factura) {
		// TODO Auto-generated method stub
		this.entityManager.merge(factura);
	}

	@Override
	public Factura seleccionar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Factura.class, id);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.entityManager.remove(this.seleccionar(id));
	}

	// PONER LOS PARAMETROS QUE NECESITEN
	@Override
	public List<Factura> seleccionartodo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void actualizarParcial() {
		// TODO Auto-generated method stub

	}

}
