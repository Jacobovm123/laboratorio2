/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.umg.ingenieria.sistemas.laboratorio2.estudiantes.service;

import gt.edu.umg.ingenieria.sistemas.laboratorio2.estudiantes.dao.EstudianteRepository;
import gt.edu.umg.ingenieria.sistemas.laboratorio2.estudiantes.model.Estudiante;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author jacobo
 */
@Service

public class EstudiantesServices {
   @Autowired
   private EstudianteRepository  repositorioestudiante;
   
   public List<Estudiante> buscarTodos()
   {
   return (List<Estudiante>) this.repositorioestudiante.findAll();
   
   }
    public Estudiante registrar(Estudiante estudiantevariable){
    return this.repositorioestudiante.save(estudiantevariable);
    } 
   
    
}