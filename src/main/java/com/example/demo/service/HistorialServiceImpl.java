package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.HistoriaClinica;
import com.example.demo.repository.IHistorialRepo;

@Service
public class HistorialServiceImpl implements IHistorialService {

    @Autowired
    private IHistorialRepo iHistorialRepo;

    @Override
    public void insertar(HistoriaClinica historiaClinica) {
        // TODO Auto-generated method stub
       this.iHistorialRepo.insertar(historiaClinica);
    }

    @Override
    public List<HistoriaClinica> buscarCedula(String cedula) {
        // TODO Auto-generated method stub
        return this.iHistorialRepo.buscar(cedula);
    }

    @Override
    public List<HistoriaClinica> buscarTodo() {
        // TODO Auto-generated method stub
       return this.iHistorialRepo.buscarTodos();
    }

    @Override
    public void eliminar(Integer id) {
        // TODO Auto-generated method stub
      this.iHistorialRepo.eliminar(id);
    }

}