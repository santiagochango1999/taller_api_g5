package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.ServiciosMedicos;
import com.example.demo.repository.IServicioMedicosRepo;

@Service
public class ServiciosMedicosImpl implements IServiciosMedicosService {

    @Autowired
    private IServicioMedicosRepo iServicioMedicosRepo;

    @Override
    public void agregar(ServiciosMedicos serviciosMedicos) {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'agregar'");
        this.iServicioMedicosRepo.insertar(serviciosMedicos);
    }

    @Override
    public ServiciosMedicos seleccionar(Integer id) {
        // TODO Auto-generated method stub
       // throw new UnsupportedOperationException("Unimplemented method 'seleccionar'");
       return this.iServicioMedicosRepo.buscar(id);
    }

    @Override
    public List<ServiciosMedicos> seleccionarTodo() {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'seleccionarTodo'");
        return this.iServicioMedicosRepo.buscarTodo();
    }

    @Override
    public void actualizar(ServiciosMedicos serviciosMedicos) {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'actualizar'");
        this.iServicioMedicosRepo.actualizar(serviciosMedicos);
    }

    @Override
    public void borrar(Integer id) {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'borrar'");
        this.iServicioMedicosRepo.eliminar(id);
    }
}