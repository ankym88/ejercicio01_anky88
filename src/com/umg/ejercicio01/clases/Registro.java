package com.umg.ejercicio01.clases;

import java.util.ArrayList;
import java.util.List;

public class Registro {

    private List<Docente> docentes;
    private List<personalOperativo> personaloperativo;
    private Establecimiento establecimiento;

    public Registro(String nombre, String codigo, String direccion){
        establecimiento = new Establecimiento(nombre,codigo,direccion);
        docentes = new ArrayList<>();
        personaloperativo = new ArrayList<>();
    }

    public List<Docente> getDocentes() {
        return docentes;
    }

    public List<personalOperativo> getPersonaloperativo() {
        return personaloperativo;
    }

    public Establecimiento getEstablecimiento() {
        return establecimiento;
    }

    public void setDocentes(Docente doc) {
        docentes.add(doc);
    }

    public void setPersonaloperativo(personalOperativo personal) {
        personaloperativo.add(personal);
    }

    public void setEstablecimiento(Establecimiento establecimiento) {
        this.establecimiento = establecimiento;
    }
}