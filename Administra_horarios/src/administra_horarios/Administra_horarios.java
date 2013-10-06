/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package administra_horarios;

import pkSemestre.AsignaturaSemestre;
import pkSemestre.Semestre;
import pkAsignatura.Asig_Teorica;
import pkAsignatura.Asig_practica;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author José Daniel
 */
public class Administra_horarios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Se crea la lista de semetres 
        List<Semestre> ListaSemestres = new ArrayList<>();
        
      
        //Materias del primer semestre
        Asig_Teorica Asig11 = new Asig_Teorica("Tec-digital.ac.cr", "Ingles 1", 3);
        Asig_Teorica Asig12 = new Asig_Teorica("Tec-digital.ac.cr", "Comunicacion Tecnica", 2);
        Asig_Teorica Asig13 = new Asig_Teorica("Tec-digital.ac.cr", "Matematica Discreta", 4);
        Asig_Teorica Asig14 = new Asig_Teorica("Tec-digital.ac.cr", "Fundamentos de organizacion de computadores", 3);
        Asig_practica Asig15 = new Asig_practica("Libro de Introduccion", "Windows", "Introduccion a la programacion", 4);
        Asig_practica Asig16 = new Asig_practica("Libro de Scheme", "Windows", "Taller de programacion", 4);
        
        //Materias del segundo semestre
        Asig_Teorica Asig21 = new Asig_Teorica("Tec-digital.ac.cr", "Ingles 2", 3);
        Asig_Teorica Asig22 = new Asig_Teorica("Tec-digital.ac.cr", "Centros de formacion Humanistica", 0);
        Asig_Teorica Asig23 = new Asig_Teorica("Tec-digital.ac.cr", "Calculo", 4);
        Asig_practica Asig24 = new Asig_practica("Libro de Datos", "Windows", "Estructura de Datos", 4);
        Asig_practica Asig25 = new Asig_practica("Libro de Objetos Java", "Windows", "Programacion Orientada a Objetos", 4);
        Asig_practica Asig26 = new Asig_practica("Principios del Computador", "Windows", "Arquitectura de Computadores", 4);
        
        //Materias del tercer semestre
        Asig_Teorica Asig31 = new Asig_Teorica("Tec-digital.ac.cr", "Ingles 3", 3);
        Asig_Teorica Asig32 = new Asig_Teorica("Tec-digital.ac.cr", "Ambiente Humano", 2);
        Asig_Teorica Asig33 = new Asig_Teorica("Tec-digital.ac.cr", "Algebra Lineal", 4);
        Asig_practica Asig34 = new Asig_practica("Libro de Datos", "Windows", "Base de Datos 1", 4);
        Asig_practica Asig35 = new Asig_practica("Algoritmos y su teoria", "Windows", "Analisis de algoritmos", 4);
        
        //Materias del cuarto semestre
        Asig_Teorica Asig41 = new Asig_Teorica("Tec-digital.ac.cr", "Ingles 4", 3);
        Asig_Teorica Asig42 = new Asig_Teorica("Tec-digital.ac.cr", "Probabilidades", 4);
        Asig_practica Asig43 = new Asig_practica("Libro de Datos", "Windows", "Base de Datos 2", 4);
        Asig_practica Asig44 = new Asig_practica("Algoritmos y su teoria", "Windows", "Lenguajes de Programacion", 4);
        Asig_practica Asig45 = new Asig_practica("Rquerimientos de un buen Software", "Windows", "Requerimientos de Software", 4);
        
        
        //Materias del primer Semestre con los campos por asignar
        AsignaturaSemestre AsigSemes11 = new AsignaturaSemestre(Asig11, null, null);
        AsignaturaSemestre AsigSemes12 = new AsignaturaSemestre(Asig12, null, null);
        AsignaturaSemestre AsigSemes13 = new AsignaturaSemestre(Asig13, null, null);
        AsignaturaSemestre AsigSemes14 = new AsignaturaSemestre(Asig14, null, null);
        AsignaturaSemestre AsigSemes15 = new AsignaturaSemestre(Asig15, null, null);
        AsignaturaSemestre AsigSemes16 = new AsignaturaSemestre(Asig16, null, null);
        
        //Materias del segundo Semestre con los campos por asignar
        AsignaturaSemestre AsigSemes21 = new AsignaturaSemestre(Asig21, null, null);
        AsignaturaSemestre AsigSemes22 = new AsignaturaSemestre(Asig22, null, null);
        AsignaturaSemestre AsigSemes23 = new AsignaturaSemestre(Asig23, null, null);
        AsignaturaSemestre AsigSemes24 = new AsignaturaSemestre(Asig24, null, null);
        AsignaturaSemestre AsigSemes25 = new AsignaturaSemestre(Asig25, null, null);
        AsignaturaSemestre AsigSemes26 = new AsignaturaSemestre(Asig26, null, null);
        
        //Materias del tercer Semestre con los campos por asignar
        AsignaturaSemestre AsigSemes31 = new AsignaturaSemestre(Asig31, null, null);
        AsignaturaSemestre AsigSemes32 = new AsignaturaSemestre(Asig32, null, null);
        AsignaturaSemestre AsigSemes33 = new AsignaturaSemestre(Asig33, null, null);
        AsignaturaSemestre AsigSemes34 = new AsignaturaSemestre(Asig34, null, null);
        AsignaturaSemestre AsigSemes35 = new AsignaturaSemestre(Asig35, null, null);
        
        //Materias del cuarto Semestre con los campos por asignar
        AsignaturaSemestre AsigSemes41 = new AsignaturaSemestre(Asig41, null, null);
        AsignaturaSemestre AsigSemes42 = new AsignaturaSemestre(Asig42, null, null);
        AsignaturaSemestre AsigSemes43 = new AsignaturaSemestre(Asig43, null, null);
        AsignaturaSemestre AsigSemes44 = new AsignaturaSemestre(Asig44, null, null);
        AsignaturaSemestre AsigSemes45 = new AsignaturaSemestre(Asig45, null, null);
        
        //Se crea una lista de las asginaturas del semestre 1
        List<AsignaturaSemestre> ListaSemestre1 = new ArrayList<>();
        ListaSemestre1.add(AsigSemes11);
        ListaSemestre1.add(AsigSemes12);
        ListaSemestre1.add(AsigSemes13);
        ListaSemestre1.add(AsigSemes14);
        ListaSemestre1.add(AsigSemes15);
        ListaSemestre1.add(AsigSemes16);
        
        //Se crea una lista de las asginaturas del semestre 2
        List<AsignaturaSemestre> ListaSemestre2 = new ArrayList<>();
        ListaSemestre1.add(AsigSemes21);
        ListaSemestre1.add(AsigSemes22);
        ListaSemestre1.add(AsigSemes23);
        ListaSemestre1.add(AsigSemes24);
        ListaSemestre1.add(AsigSemes25);
        ListaSemestre1.add(AsigSemes26);
        
        //Se crea una lista de las asginaturas del semestre 3
        List<AsignaturaSemestre> ListaSemestre3 = new ArrayList<>();
        ListaSemestre1.add(AsigSemes31);
        ListaSemestre1.add(AsigSemes32);
        ListaSemestre1.add(AsigSemes33);
        ListaSemestre1.add(AsigSemes34);
        ListaSemestre1.add(AsigSemes35);
        
        //Se crea una lista de las asginaturas del semestre 4
        List<AsignaturaSemestre> ListaSemestre4 = new ArrayList<>();
        ListaSemestre1.add(AsigSemes41);
        ListaSemestre1.add(AsigSemes42);
        ListaSemestre1.add(AsigSemes43);
        ListaSemestre1.add(AsigSemes44);
        ListaSemestre1.add(AsigSemes45);
        
        //Se agrega semestre 1
        Semestre Semestre1 = new Semestre(1, ListaSemestre1);
        ListaSemestres.add(Semestre1);
        
        //Se agrega semestre 2
        Semestre Semestre2 = new Semestre(2, ListaSemestre2);
        ListaSemestres.add(Semestre2);
        
        //Se agrega semestre 3
        Semestre Semestre3 = new Semestre(3, ListaSemestre2);
        ListaSemestres.add(Semestre3);
        
        //Se agrega semestre 4
        Semestre Semestre4 = new Semestre(4, ListaSemestre2);
        ListaSemestres.add(Semestre4);
        
    }
}
