package com.umg.ejercicio01.clases;

/**
 * Created by DELL on 06/07/2017.
 */
public class personalOperativo {

    private String nombre;
    private int edad;
    private String puesto;

    public personalOperativo(String nombre, int edad, String puesto, boolean activo) {
        this.nombre = nombre;
        this.edad = edad;
        this.puesto = puesto;

    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getPuesto() {
        return puesto;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    private boolean activo;

    public personalOperativo(){

    }














}
