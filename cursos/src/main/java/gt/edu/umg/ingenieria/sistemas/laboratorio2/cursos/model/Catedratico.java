/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.umg.ingenieria.sistemas.laboratorio2.cursos.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author jacobo
 */
@Entity
@Table(name = "catedratico")


public class Catedratico {
     @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 @Column(name ="id")
 private long id;
 
 @Column(name ="nombres")
 private String  nombres;
 
 @Column(name ="apellidos")
 private String  apellidos;
 
 @Column(name ="codigo_catedratico")
 private String  codigoCatedratico;

    public Catedratico() {
    }

    public Catedratico(String nombres, String apellidos, String codigoCatedratico) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.codigoCatedratico = codigoCatedratico;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCodigoCatedratico() {
        return codigoCatedratico;
    }

    public void setCodigoCatedratico(String codigoCatedratico) {
        this.codigoCatedratico = codigoCatedratico;
    }
 
 
 
}
