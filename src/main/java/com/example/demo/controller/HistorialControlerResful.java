package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.modelo.HistoriaClinica;
import com.example.demo.service.IHistorialService;

@RestController
@CrossOrigin
@RequestMapping(path = "/historial")
public class HistorialControlerResful {

    @Autowired 
    private IHistorialService iHistorialService;

    @GetMapping
    public List<HistoriaClinica> historiaTotal(){
        return this.iHistorialService.buscarTodo();
    }
    @GetMapping(path = "/{cedula}")
    public List<HistoriaClinica> historiaCedula(@PathVariable String cedula){
        return this.iHistorialService.buscarCedula(cedula);
    }
}