/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.umg.ingenieria.sistemas.laboratorio2.cursos.controller;

import gt.edu.umg.ingenieria.sistemas.laboratorio2.cursos.model.Catedratico;
import gt.edu.umg.ingenieria.sistemas.laboratorio2.cursos.service.CatedraticoService;
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
@RequestMapping("/catedratico")
public class CatedraticoController {
      @Autowired
    private CatedraticoService serviciocatedratico;
    @GetMapping("/buscarTodos")
    public List<Catedratico> buscarTodos(){
    return this.serviciocatedratico.buscarTodos();
    
    
    }
    
    
        
    
    @PostMapping("/registrar")
public Catedratico registrar(@RequestBody(required = true) Catedratico variablecatedratico)
{
return this.serviciocatedratico.registrar(variablecatedratico)  ;  

}
    
}
