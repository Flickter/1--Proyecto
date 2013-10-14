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
import pkAula.Aulas;
import pkAula.Equipo;
import pkAula.aulaPractica;
import pkAula.aulaTeoria;
import administra_horarios.metodos;
import pkPersona.*;
import pkSemestre.HorarioAsig;


/**
 *
 * @author José Daniel
 */
public class Administra_horarios {

    //Se crea la lista de semetres 
        public static List<Semestre> ListaSemestres = new ArrayList<>();
        public static Semestre SemestreActual;
        public static List<Aulas> ListaAulas;
        public static List<Profesor> ListaProfesores;
        public metodos mtdos = new metodos();
        public static AsignaturaSemestre AsignaturaSemetreActual;
        public static List<HorarioAsig> horarioAatual;
        public static Aulas AulaActual;
        public static List<Equipo> ListEquipoActual;
        public static List<Semestre> ListaCalendarioSemestre= new ArrayList<>();
       
        
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Administra_horarios nose = new Administra_horarios();
        nose.cargarProfesores();
        nose.CargarAulas();
        nose.cargarAsignaturas();
        
        new Vistas.Cordinador.viewCordPrincipal().setVisible(true);
    }
    
    public void cargarAsignaturas(){
        
         //Materias del primer semestre
        Asig_Teorica Asig11 = new Asig_Teorica("Tec-digital.ac.cr", "Ingles 1", 3, "CI1311");
        Asig_Teorica Asig12 = new Asig_Teorica("Tec-digital.ac.cr", "Comunicacion Tecnica", 2, "CI1403");
        Asig_Teorica Asig13 = new Asig_Teorica("Tec-digital.ac.cr", "Matematica Discreta", 4, "EM1601");
        Asig_practica Asig14 = new Asig_practica("Fundamentos Computacion", "Windows", "Fundamentos de organizacion de computadores", 3, "IC1400");
        Asig_practica Asig15 = new Asig_practica("Libro de Introduccion", "Windows", "Introduccion a la programacion", 4, "IC1802");
        Asig_practica Asig16 = new Asig_practica("Libro de Scheme", "Windows", "Taller de programacion", 4, "IC1803");
        
        //Materias del segundo semestre
        Asig_Teorica Asig21 = new Asig_Teorica("Tec-digital.ac.cr", "Ingles 2", 3, "CI1311");
        Asig_Teorica Asig22 = new Asig_Teorica("Tec-digital.ac.cr", "Centros de formacion Humanistica", 0, "FH1000");
        Asig_Teorica Asig23 = new Asig_Teorica("Tec-digital.ac.cr", "Calculo", 4, "MA1404");
        Asig_practica Asig24 = new Asig_practica("Libro de Datos", "Windows", "Estructura de Datos", 4, "IC2001");
        Asig_practica Asig25 = new Asig_practica("Libro de Objetos Java", "Windows", "Programacion Orientada a Objetos", 4, "IC2101");
        Asig_practica Asig26 = new Asig_practica("Principios del Computador", "Windows", "Arquitectura de Computadores", 4, "IC3101");
        
        //Materias del tercer semestre
        Asig_Teorica Asig31 = new Asig_Teorica("Tec-digital.ac.cr", "Ingles 3", 3, "CI1313");
        Asig_Teorica Asig32 = new Asig_Teorica("Tec-digital.ac.cr", "Ambiente Humano", 2, "CS2101");
        Asig_Teorica Asig33 = new Asig_Teorica("Tec-digital.ac.cr", "Algebra Lineal", 4, "MA2405");
        Asig_practica Asig34 = new Asig_practica("Libro de Datos", "Windows", "Base de Datos 1", 4, "IC4301");
        Asig_practica Asig35 = new Asig_practica("Algoritmos y su teoria", "Windows", "Analisis de algoritmos", 4, "IC3002");
        
        //Materias del cuarto semestre
        Asig_Teorica Asig41 = new Asig_Teorica("Tec-digital.ac.cr", "Ingles 4", 3, "CI1314");
        Asig_Teorica Asig42 = new Asig_Teorica("Tec-digital.ac.cr", "Probabilidades", 4, "MA2404");
        Asig_practica Asig43 = new Asig_practica("Libro de Datos", "Windows", "Base de Datos 2", 4, "IC4302");
        Asig_practica Asig44 = new Asig_practica("Algoritmos y su teoria", "Windows", "Lenguajes de Programacion", 4, "IC4700");
        Asig_practica Asig45 = new Asig_practica("Rquerimientos de un buen Software", "Windows", "Requerimientos de Software", 4, "IC5821");
        
        //Creacion de horarios para asignaturas
        HorarioAsig horario11 = new HorarioAsig(ListaAulas.get(0), 7, 55, 9, 30, "Lunes");
        List<HorarioAsig> Lihorario11 = new ArrayList<>();
        Lihorario11.add(horario11);
        
        HorarioAsig horario12 = new HorarioAsig(ListaAulas.get(1), 8, 55, 11, 30, "Lunes");
        List<HorarioAsig> Lihorario12 = new ArrayList<>();
        Lihorario12.add(horario12);
        
        HorarioAsig horario13 = new HorarioAsig(ListaAulas.get(2), 9, 55, 11, 30, "Martes");
        HorarioAsig horario132 = new HorarioAsig(ListaAulas.get(2), 9, 55, 11, 30, "Miercoles");
        List<HorarioAsig> Lihorario13 = new ArrayList<>();
        Lihorario13.add(horario13);
        Lihorario13.add(horario132);
        
        HorarioAsig horario14 = new HorarioAsig(ListaAulas.get(4), 7, 55, 9, 30, "Martes");
        HorarioAsig horario142 = new HorarioAsig(ListaAulas.get(4), 7, 55, 9, 30, "Miercoles");
        List<HorarioAsig> Lihorario14 = new ArrayList<>();
        Lihorario14.add(horario14);
        Lihorario14.add(horario142);
        
        HorarioAsig horario15 = new HorarioAsig(ListaAulas.get(5), 12, 30, 16, 0, "Martes");
        List<HorarioAsig> Lihorario15 = new ArrayList<>();
        Lihorario15.add(horario15);
        
        HorarioAsig horario16 = new HorarioAsig(ListaAulas.get(5), 7, 15, 11, 30, "Jueves");
        List<HorarioAsig> Lihorario16 = new ArrayList<>();
        Lihorario16.add(horario16);
        
        
        
        //Materias del primer Semestre con los campos por asignar
        AsignaturaSemestre AsigSemes11 = new AsignaturaSemestre(Asig11, ListaProfesores.get(4), Lihorario11);
        AsignaturaSemestre AsigSemes12 = new AsignaturaSemestre(Asig12, ListaProfesores.get(7), Lihorario12);
        AsignaturaSemestre AsigSemes13 = new AsignaturaSemestre(Asig13, ListaProfesores.get(2), Lihorario13);
        AsignaturaSemestre AsigSemes14 = new AsignaturaSemestre(Asig14, ListaProfesores.get(0), Lihorario14);
        AsignaturaSemestre AsigSemes15 = new AsignaturaSemestre(Asig15, ListaProfesores.get(6), Lihorario15);
        AsignaturaSemestre AsigSemes16 = new AsignaturaSemestre(Asig16, ListaProfesores.get(6), Lihorario16);
        
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
        ListaSemestre2.add(AsigSemes21);
        ListaSemestre2.add(AsigSemes22);
        ListaSemestre2.add(AsigSemes23);
        ListaSemestre2.add(AsigSemes24);
        ListaSemestre2.add(AsigSemes25);
        ListaSemestre2.add(AsigSemes26);
        
        //Se crea una lista de las asginaturas del semestre 3
        List<AsignaturaSemestre> ListaSemestre3 = new ArrayList<>();
        ListaSemestre3.add(AsigSemes31);
        ListaSemestre3.add(AsigSemes32);
        ListaSemestre3.add(AsigSemes33);
        ListaSemestre3.add(AsigSemes34);
        ListaSemestre3.add(AsigSemes35);
       
        //Se crea una lista de las asginaturas del semestre 4
        List<AsignaturaSemestre> ListaSemestre4 = new ArrayList<>();
        ListaSemestre4.add(AsigSemes41);
        ListaSemestre4.add(AsigSemes42);
        ListaSemestre4.add(AsigSemes43);
        ListaSemestre4.add(AsigSemes44);
        ListaSemestre4.add(AsigSemes45);
       
        //Se agrega semestre 1
        Semestre Semestre1 = new Semestre(1, ListaSemestre1);
        ListaSemestres.add(Semestre1);
        
        //Se agrega semestre 2
        Semestre Semestre2 = new Semestre(2, ListaSemestre2);
        ListaSemestres.add(Semestre2);
        
        //Se agrega semestre 3
        Semestre Semestre3 = new Semestre(3, ListaSemestre3);
        ListaSemestres.add(Semestre3);
        
        //Se agrega semestre 4
        Semestre Semestre4 = new Semestre(4, ListaSemestre4);
        ListaSemestres.add(Semestre4);
        
        
        
    }
    
    public void CargarAulas(){
        //Aulas Creadas
        Aulas AulaAsig1 = new aulaTeoria("Aula Teorica 1", "A-01", "Pabellon de Ciencias", 25);
        Aulas AulaAsig2 = new aulaTeoria("Aula Teorica 2", "A-02", "Pabellon de Ciencias", 27);
        Aulas AulaAsig3 = new aulaTeoria("Aula Teorica 3", "A-03", "Pabellon de Ciencias", 30);
        Aulas AulaAsig4 = new aulaTeoria("Aula Teorica 4", "A-04", "Pabellon de Ciencias", 32);
        Aulas AulaAsig5 = new aulaPractica("Laboratorio 1", "Lab-01", "Laboratorio de Computacion", 24);
        Aulas AulaAsig6 = new aulaPractica("Laboratorio 2", "Lab-02", "Laboratorio de Computacion", 24);
        Aulas AulaAsig7 = new aulaPractica("Laboratorio 3", "Lab-03", "Laboratorio de Computacion", 24);
        Aulas AulaAsig8 = new aulaPractica("Laboratorio 4", "Lab-04", "Laboratorio de Computacion", 24);
        Aulas AulaAsig9 = new aulaPractica("Laboratorio 1 Laimi", "Laimi-01", "Laboratorio de contiguo al comedor", 24);
        Aulas AulaAsig10 = new aulaPractica("Laboratorio 2 Laimi", "Laimi-02", "Laboratorio de de contiguo al comedor", 24);
        
        //Agregar a lista de aulas
        ListaAulas = new ArrayList<>();
        ListaAulas.add(AulaAsig1);
        ListaAulas.add(AulaAsig2);
        ListaAulas.add(AulaAsig3);
        ListaAulas.add(AulaAsig4);
        ListaAulas.add(AulaAsig5);
        ListaAulas.add(AulaAsig6);
        ListaAulas.add(AulaAsig7);
        ListaAulas.add(AulaAsig8);
        ListaAulas.add(AulaAsig9);
        ListaAulas.add(AulaAsig10);
        
        
        
        //Asignar Equipo a AulasPracticas
        Equipo EquipoAula5 = new Equipo(25, "Computadoras");
        Equipo EquipoAula51 = new Equipo(1, "Proyector");
        List<Equipo> ListaEquiAula5 = new ArrayList<>();
        ListaEquiAula5.add(EquipoAula5);
        ListaEquiAula5.add(EquipoAula51);
        mtdos.SetearEquipoAula(ListaAulas, "Lab-01", ListaEquiAula5);
        
        Equipo EquipoAula6 = new Equipo(25, "Computadoras");
        Equipo EquipoAula61 = new Equipo(1, "Proyector");
        List<Equipo> ListaEquiAula6 = new ArrayList<>();
        ListaEquiAula6.add(EquipoAula6);
        ListaEquiAula6.add(EquipoAula61);
        mtdos.SetearEquipoAula(ListaAulas, "Lab-02", ListaEquiAula6);
        
        Equipo EquipoAula7 = new Equipo(25, "Computadoras");
        Equipo EquipoAula71 = new Equipo(1, "Proyector");
        List<Equipo> ListaEquiAula7 = new ArrayList<>();
        ListaEquiAula7.add(EquipoAula7);
        ListaEquiAula7.add(EquipoAula71);
        mtdos.SetearEquipoAula(ListaAulas, "Lab-03", ListaEquiAula7);
        
        Equipo EquipoAula8 = new Equipo(25, "Computadoras");
        Equipo EquipoAula81 = new Equipo(1, "Proyector");
        List<Equipo> ListaEquiAula8 = new ArrayList<>();
        ListaEquiAula8.add(EquipoAula8);
        ListaEquiAula8.add(EquipoAula81);
        mtdos.SetearEquipoAula(ListaAulas, "Lab-04", ListaEquiAula8);
        
        Equipo EquipoAula9 = new Equipo(25, "Computadoras");
        List<Equipo> ListaEquiAula9 = new ArrayList<>();
        ListaEquiAula9.add(EquipoAula9);
        mtdos.SetearEquipoAula(ListaAulas, "Laimi-01", ListaEquiAula9);
        
        Equipo EquipoAula10 = new Equipo(25, "Computadoras");
        List<Equipo> ListaEquiAula10 = new ArrayList<>();
        ListaEquiAula10.add(EquipoAula10);
        mtdos.SetearEquipoAula(ListaAulas, "Laimi-02", ListaEquiAula10);
        
        
    }
    
    public void cargarProfesores(){
        ListaProfesores = new ArrayList<>();
        
        Departamento depart1 = new Departamento("Computacion");
        Departamento depart2 = new Departamento("Ciencias y Letras");
        
        Profesor Profe1 = new Profesor("Lunes en la mañana, Martes y Miercoles completo, jueves en la tarde", depart1, "Oscar Viquez", "2-365-985");
        Profesor Profe2 = new Profesor("Lunes completo, Martes en la tarde, Miercoles, Jueves y Viernes completos",depart1, "Lorena Valerio", "2-547-874");
        Profesor Profe3 = new Profesor("", depart2, "Esteban Ballestero", "2-165-934");
        Profesor Profe4 = new Profesor("", depart2, "Rodolfo Araya", "1-6589-0254");
        Profesor Profe5 = new Profesor("", depart2, "Marlon Blanco", "2-871-248");
        Profesor Profe6 = new Profesor("", depart1, "Vera Gamboa", "2-631-123");
        Profesor Profe7 = new Profesor("", depart1, "Abel Mendez", "2-651-972");
        Profesor Profe8 = new Profesor("", depart2, "Critina Teranchi", "2-651-972");
        
        ListaProfesores.add(Profe1);
        ListaProfesores.add(Profe2);
        ListaProfesores.add(Profe3);
        ListaProfesores.add(Profe4);
        ListaProfesores.add(Profe5);
        ListaProfesores.add(Profe6);
        ListaProfesores.add(Profe7);
        ListaProfesores.add(Profe8);
    }
    
}
