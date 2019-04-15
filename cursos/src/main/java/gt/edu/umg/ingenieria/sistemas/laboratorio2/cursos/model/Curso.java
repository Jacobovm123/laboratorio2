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
@Table(name = "curso")


public class Curso {
    @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 @Column(name ="id")
 private long id;
 
 @Column(name ="nombre")
 private String  nombre;
  @Column(name ="descripcion")
 private String  descripcion;
   @Column(name ="creditos")
 private int creditos;
    @Column(name ="semestre")
 private int semestre;

    public Curso() {
    }

    public Curso(String nombre, String descripcion, int creditos, int semestre) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.creditos = creditos;
        this.semestre = semestre;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }
 
 
    
    
    
    
}
