package com.example.demo.repository;

import java.util.List;

import com.example.demo.modelo.Factura;

public interface IFacturaRepository {
	public void ingresar(Factura factura);

	public void actualizar(Factura factura);

	public Factura seleccionar(Integer id);

	public void eliminar(Integer id);

	public List<Factura> seleccionartodo();

	public void actualizarParcial();

}
