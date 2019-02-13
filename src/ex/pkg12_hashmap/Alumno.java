/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex.pkg12_hashmap;

/**
 *
 * @author lvazquezdorna
 */
public class Alumno {

    private String nome;
    private int ref;
    private int nota;

    public Alumno() {
    }

    public Alumno(String nome, int nota) {
        this.nome = nome;
        this.nota = nota;
        ref = Secretaria.refe;
        Secretaria.refe++;
    }

    @Override
    public String toString() {
        return "\n*************************************************************"
                + "\nAlumno:" + "\nCodigo Alumno:" + ref + "\tNombre: " + nome + "\tsNota=" + nota
                + "\n*************************************************************\n";
    }

    void setNota(int entero) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
