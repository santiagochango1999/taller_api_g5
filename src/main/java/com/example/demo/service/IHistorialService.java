package com.example.demo.service;

import java.util.List;

import com.example.demo.modelo.HistoriaClinica;

public interface IHistorialService {
	 //C
    public void insertar(HistoriaClinica historiaClinica);

    //R
    public List<HistoriaClinica> buscarCedula(String cedula);

    public List<HistoriaClinica> buscarTodo();

    //D    
    public void eliminar(Integer id);

}