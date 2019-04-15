/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.umg.ingenieria.sistemas.laboratorio2.estudiantes.controller;

import gt.edu.umg.ingenieria.sistemas.laboratorio2.estudiantes.model.Estudiante;
import gt.edu.umg.ingenieria.sistemas.laboratorio2.estudiantes.service.EstudiantesServices;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author jacobo
 */

@RestController
@RequestMapping("/estudiantes")
public class EstudianteController {
    @Autowired
    private EstudiantesServices servicioestudiante;
    @GetMapping("/buscarTodos")
    public List<Estudiante> buscarTodos(){
    return this.servicioestudiante.buscarTodos();
    }
    
    
    @PostMapping("/registrar")
public Estudiante registrar(@RequestBody(required = true) Estudiante variableestudiante)
{
return this.servicioestudiante.registrar(variableestudiante)  ;  

}
    
    }