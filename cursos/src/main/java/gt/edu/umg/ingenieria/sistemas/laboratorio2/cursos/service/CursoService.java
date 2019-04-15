/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.umg.ingenieria.sistemas.laboratorio2.cursos.service;

import gt.edu.umg.ingenieria.sistemas.laboratorio2.cursos.dao.CursoRepository;
import gt.edu.umg.ingenieria.sistemas.laboratorio2.cursos.model.Curso;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author jacobo
 */
@Service
public class CursoService {
   @Autowired
   private CursoRepository  repositoriocurso; 
    
     public List<Curso> buscarTodos()
   {
   return (List<Curso>) this.repositoriocurso.findAll();
   
   }
    public Curso crear(Curso variablecurso){
    return this.repositoriocurso.save(variablecurso);
    } 
    
}
