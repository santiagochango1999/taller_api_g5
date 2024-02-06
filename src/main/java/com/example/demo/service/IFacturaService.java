package com.example.demo.service;

import java.util.List;

import com.example.demo.modelo.Factura;

public interface IFacturaService {

	public void crear(Factura factura);

	public void actualizar(Factura factura);

	public Factura buscar(Integer id);

	public void borrar(Integer id);

	// PONER LOS PARAMETROS DE LA CONSULTA
	public List<Factura> buscarTodo();

	public void actualizarParcial();
}
