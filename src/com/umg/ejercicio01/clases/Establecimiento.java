package com.umg.ejercicio01.clases;

/**
 * Created by DELL on 06/07/2017.
 */
public class Establecimiento {

    private String nombre;
    private String codigo;
    private String direccion;

    public Establecimiento(String nombre,String codigo,String establecimiento) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
