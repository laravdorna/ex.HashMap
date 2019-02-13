/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex.pkg12_hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import utilidades.PedirDatos;

/**
 *
 * @author lvazquezdorna
 */
public class Secretaria {

    public static int refe = 6000;
    Alumno al;

    //metodo que crea un alumno con los datos si el dni no existe, 
    //ya que dni es la clave valor que utilizamos para listar
    public void crear(HashMap<String, Alumno> alum, String dni) {
        if (alum.containsKey(dni)) {
            System.out.println("El alumno ya existe");
        } else {
            alum.put(dni, new Alumno(PedirDatos.cadena("Nombre: "), PedirDatos.entero("nota: ")));
        }
    }

    //muestra la coleccion de alumnos con clave y valor
    public void mostrar(HashMap<String, Alumno> alum) {
        System.out.println(alum);
    }

    public void mostrarIt(HashMap<String, Alumno> alum) {
        Iterator it = alum.keySet().iterator();
        while (it.hasNext()) {
            System.out.println(alum.get(it.next()));
        }
    }

    public void mostrarValues(HashMap<String, Alumno> alum) {
        alum.values();
    }

    public ArrayList guardarLista(HashMap<String, Alumno> alum, ArrayList<Alumno> listaAlumnos) {
        //ArrayList<Alumno> listaAlumnos = new ArrayList<>();
        listaAlumnos.addAll(alum.values());
        return listaAlumnos;
    }

    public void mostrarLista(HashMap<String, Alumno> alum, ArrayList<Alumno> listaAlumnos) {
        guardarLista(alum, listaAlumnos);
        listaAlumnos.forEach((_item) -> {
            System.out.println(listaAlumnos);
        });
        for (Alumno alumno : listaAlumnos) {
            System.out.println(listaAlumnos);
        }
    }

    public void borrar(HashMap<String, Alumno> alum, String dni) {

        if (!alum.containsKey(dni)) {
            System.out.println("El alumno no está dado de alta");
        } else {
            alum.remove(dni);
            System.out.println("El alumno con dni" + dni + "ha sido borrado.");
        }
    }

    public void modificarNota(HashMap<String, Alumno> alum, String dni) {
        if (!alum.containsKey(dni)) {
            System.out.println("El alumno no está dado de alta");
        } else {
            Alumno a = alum.get(dni);
            a.setNota(PedirDatos.entero("nueva nota:"));
            // alum.put(dni,a);
            alum.replace(dni, a);
            System.out.println("El alumno con dni" + dni + "ha sido modificado.");
        }
    }

    public void consultarAlumno(HashMap<String, Alumno> alum, String dni) {
        if (!alum.containsKey(dni)) {
            System.out.println("El alumno no está dado de alta");
        } else {
            Alumno a = alum.get(dni);
            System.out.println(a.toString());
        }
    }
    
    public void ordenarNombre()
}
