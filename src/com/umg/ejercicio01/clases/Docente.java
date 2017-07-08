package com.umg.ejercicio01.clases;

/**
 * Created by DELL on 06/07/2017.
 */
public class Docente {

    private String nombre;
    private int edad;
    private String curso;

    public Docente() {

    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getCurso() {
        return curso;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
