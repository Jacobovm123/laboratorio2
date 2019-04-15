/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.umg.ingenieria.sistemas.laboratorio2.cursos.service;

import gt.edu.umg.ingenieria.sistemas.laboratorio2.cursos.dao.CatedraticoRepository;
import gt.edu.umg.ingenieria.sistemas.laboratorio2.cursos.model.Catedratico;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author jacobo
 */
@Service
public class CatedraticoService {
    @Autowired
   private CatedraticoRepository  repositoriocatedratico; 
    
     public List<Catedratico> buscarTodos()
   {
   return (List<Catedratico>) this.repositoriocatedratico.findAll();
   
   }
    public Catedratico registrar(Catedratico variablecatedratico){
    return this.repositoriocatedratico.save(variablecatedratico);
    } 
    
    
}
