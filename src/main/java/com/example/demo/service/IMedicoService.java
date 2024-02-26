package com.example.demo.service;

import java.util.List;

import com.example.demo.modelo.Medico;

public interface IMedicoService {
	public void guardar(Medico medico);

	public boolean verificarCedulaExistente(String cedula);

	public void actualizar(Medico medico);

	public void actualizarParcial(String apellido, String nombre, Integer id);

	public Medico buscar(Integer id);

	public List<Medico> buscartodos();

	public void borrar(Integer id);

}
