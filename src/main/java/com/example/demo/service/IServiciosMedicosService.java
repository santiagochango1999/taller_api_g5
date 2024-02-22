package com.example.demo.service;

import java.util.List;

import com.example.demo.modelo.ServiciosMedicos;

public interface IServiciosMedicosService {
	//C
    public void agregar(ServiciosMedicos serviciosMedicos);
    //R
    public ServiciosMedicos seleccionar(Integer id);
    public List<ServiciosMedicos> seleccionarTodo();
    //U
    public void actualizar(ServiciosMedicos serviciosMedicos);
    //D
    public void borrar(Integer id);
}