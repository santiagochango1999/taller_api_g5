package com.example.demo.repository;

import java.util.List;

import com.example.demo.modelo.Medico;

public interface IMedicoRepository {
	public void insertar(Medico medico);

	public void actualizar(Medico medico);

	public void actualizarParcial(String apellido, String nombre, Integer id);

	public Medico seleccionar(String cedula);

	public List<Medico> seleccionartodos();

	public boolean verificarCedulaExistente(String cedula);

	public List<Medico> seleccionarMedicoDepartamento(Integer id);

}
