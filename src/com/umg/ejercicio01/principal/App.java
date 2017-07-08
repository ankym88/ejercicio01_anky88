package com.umg.ejercicio01.principal;

import com.umg.ejercicio01.clases.Registro;
import com.umg.ejercicio01.clases.Docente;
import com.umg.ejercicio01.clases.personalOperativo;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 * Created by DELL on 06/07/2017.
 */
public class App {

    public static void main(String[] args) throws Exception {

        Registro registro = null;
        Scanner sn = new Scanner(System.in);
        boolean salir = false, regresar= false;
        int opcion, continuar;
        String nombre, codigo, direccion;

        System.out.println("BIEVENIDOS REGISTRO DE DOCENTES Y PERSONAL OPERATIVO");
        System.out.println("Ingrese los datos del establecimiento: ");
        System.out.println("Nombre: ");
        nombre = sn.next();
        System.out.println("Codigo: ");
        codigo = sn.next();
        System.out.println("Direccion: ");
        direccion = sn.next();
        registro= new Registro(nombre, codigo, direccion);

        System.out.println("ESTABLECIMEINTO "+registro.getEstablecimiento().getNombre()+":");

        while (!salir) {

            System.out.println("1. Ingresar Docentes");
            System.out.println("2. Listar Docentes");
            System.out.println("3. Ingresar Personal Operativo");
            System.out.println("4. Listar Personal Operativo");
            System.out.println("4. Salir");
            System.out.println("---------------------------------");
            try {
                System.out.println("Seleccione una de las opciones");
                opcion = sn.nextInt();

                switch (opcion) {
                    case 1:
                        Docente docente =new Docente();
                        System.out.println("INGRESO DE DOCENTES:");
                        System.out.println("Nombre: ");
                        docente.setNombre(sn.next());
                        System.out.println("Edad: ");
                        docente.setEdad(sn.nextInt());
                        System.out.println("Curso: ");
                        docente.setCurso(sn.next());
                        System.out.println("DESEA CONFIRMAR? : 1=si / 2=no: ");
                        continuar=sn.nextInt();
                        if (continuar == 0b1){
                            registro.setDocentes(docente);
                            System.out.println("OPERACION COMPLETADA");
                            System.out.println("--------------");
                            break;
                        }else
                        {
                            System.out.println("OPERACION CANCELADA");
                            System.out.println("--------------");
                            break;
                        }

                    case 2:
                        System.out.println("LISTADO DE DOCENTES:");
                        List<Docente> listadodocentes = registro.getDocentes();
                        for (int i = 0; i <= listadodocentes.size() - 1; i++) {
                            System.out.println("Nombre: "+listadodocentes.get(i).getNombre()+
                                    " Edad: "+listadodocentes.get(i).getEdad()+" Curso: "+listadodocentes.get(i).getNombre());
                        }
                        System.out.println("--------------");
                        break;
                    case 3:
                        personalOperativo personal =new personalOperativo();
                        System.out.println("INGRESO DE PERSONAL OPERATIVO:");
                        System.out.println("Nombre: ");
                        personal.setNombre(sn.next());
                        System.out.println("Edad: ");
                        personal.setEdad(sn.nextInt());
                        System.out.println("Puesto: ");
                        personal.setPuesto(sn.next());
                        System.out.println("Desea continuar: 1=si / 2=no: ");
                        continuar=sn.nextInt();
                        if (continuar == 0b1){
                            registro.setPersonaloperativo(personal);
                            System.out.println("OPERACION COMPLETADA");
                            System.out.println("--------------");
                            break;
                        }else
                        {
                            System.out.println("OPERACION CANCELADA");
                            System.out.println("--------------");
                            break;
                        }

                    case 4:
                        System.out.println("LISTADO DE PERSONAL OPERATIVO:");
                        List<personalOperativo> listadopersonal = registro.getPersonaloperativo();
                        for (int i = 0; i <= listadopersonal.size() - 1; i++) {
                            System.out.println("Nombre: "+listadopersonal.get(i).getNombre()+
                                    " Edad: "+listadopersonal.get(i).getEdad()+" Puesto: "+listadopersonal.get(i).getNombre());
                        }
                        System.out.println("--------------");
                        break;

                    case 5:
                        salir = true;
                        break;

                    default:
                        System.out.println("Solo números entre 1 y 5");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sn.next();
            }
        }
    }

}




