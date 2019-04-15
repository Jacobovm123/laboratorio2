/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.umg.ingenieria.sistemas.laboratorio2.cursos.controller;

import gt.edu.umg.ingenieria.sistemas.laboratorio2.cursos.model.Curso;
import gt.edu.umg.ingenieria.sistemas.laboratorio2.cursos.service.CursoService;
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
@RequestMapping("/cursos")
public class CursoController {
     @Autowired
    private CursoService serviciocurso;
    @GetMapping("/buscarTodos")
    public List<Curso> buscarTodos(){
    return this.serviciocurso.buscarTodos();
    
    
    }
    
    
        
    
    @PostMapping("/crear")
public Curso crear(@RequestBody(required = true) Curso variablecurso)
{
return this.serviciocurso.crear(variablecurso)  ;  

}
    
    
}
