package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Factura;
import com.example.demo.repository.IFacturaRepository;

@Service
public class FacturaServiceImp implements IFacturaService {

	@Autowired
	private IFacturaRepository facturaRepository;

	@Override
	public void crear(Factura factura) {
		// TODO Auto-generated method stub
		this.facturaRepository.ingresar(factura);
	}

	@Override
	public void actualizar(Factura factura) {
		// TODO Auto-generated method stub
		this.facturaRepository.actualizar(factura);
	}

	@Override
	public Factura buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.facturaRepository.seleccionar(id);
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		this.facturaRepository.eliminar(id);
	}

	// Rellenar con los parametros
	@Override
	public List<Factura> buscarTodo() {
		// TODO Auto-generated method stub
		return this.facturaRepository.seleccionartodo();
	}

	@Override
	public void actualizarParcial() {
		// TODO Auto-generated method stub
		this.facturaRepository.actualizarParcial();
	}

}
