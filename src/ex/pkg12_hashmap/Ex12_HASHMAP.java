/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex.pkg12_hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Lara Vazquez Dorna
 */
public class Ex12_HASHMAP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HashMap<String, Alumno> lAlumnos = new HashMap<>();
        ArrayList<Alumno> listaA = new ArrayList<>();
        Secretaria obx = new Secretaria();
        String dni = null;

        int opcion = 0;
        do {
            opcion = menu();
            switch (opcion) {
                case 1://engadir
                    dni = JOptionPane.showInputDialog("dni; ");
                    obx.crear(lAlumnos, dni);
                    break;
                case 2://amosar
                    obx.mostrar(lAlumnos);
                    break;
                case 3://mostrar it + get
                    obx.mostrarIt(lAlumnos);
                    break;
                case 4:// mostrar con values
                    obx.mostrarValues(lAlumnos);
                    break;
                case 5: //mostrar lista guardada
                    obx.mostrarLista(lAlumnos);
                    break;
                case 6:
                    dni = JOptionPane.showInputDialog("dni; ");
                    obx.borrar(lAlumnos, dni);
                    break;
                case 7:
                      dni = JOptionPane.showInputDialog("dni; ");
                      

            }

        } while (opcion != 0);
    }

    private static int menu() {
        int op = 0;
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("****** GESTOR DE ALUMNOS ******"
                    + "\n1=> Añadir un nuevo alumno."
                    + "\n2=> Mostrar."
                    + "\n3=> Modificar"
                    + "\n4=> ."
                    + "\n5=> mostrar lista de alumnos"
                    + "\n6=> eliminar alumno por dni"
                    +"\n7=> modificar dato de un alummo"
                    + "\n0=>SALIR.");
            try {
                op = Integer.parseInt(teclado.nextLine());
            } catch (NumberFormatException ex) {
                System.out.println("Debes escoger un valor entre 0 y 4.");
                op = -1;
            }

        } while (op < 0 || op > 4);
        return op;
    }

}
