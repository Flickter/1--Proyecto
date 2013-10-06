package pkSemestre;

import pkPersona.Profesor;
import pkAsignatura.Asignatura;
import pkAula.Aulas;
import java.util.*;

/**
 * Clase que administra el profesor que se le asigna y el horario que tiene la materia
 * @author Alonso
 */
public class AsignaturaSemestre {

    private Asignatura asignaturaAsig;
    private Profesor ProfesorAsig;
    private List<HorarioAsig> Horario;
    
    /**
     *Constructor de la clase AsignaturaSemestre 
     * @param Asig La asignatura a la que se va a asignar
     * @param Profe El profesor que se le asigna la asignatura
     * @param hrrio La lista de los horarios que tiene esa asignatura
     */
    public AsignaturaSemestre (Asignatura Asig, Profesor Profe, List<HorarioAsig> hrrio) {
        asignaturaAsig = Asig ;
        ProfesorAsig = Profe;
        Horario = hrrio;
    }
        
    /**
     * Devuelve el profesor que se le asigno la asignatura
     * @return Un objeto de tipo profesor
     */
    public Profesor getProfesorAsig () {
        return ProfesorAsig;
    }
    
    /**
     * Setea el profesor de la asignatura
     * @param val el profesor que se desea setear
     */
    public void setProfesorAsig (Profesor val) {
        this.ProfesorAsig = val;
    }
    
    /**
     * Devuelve la asignatura
     * @return Un objeto tipo asignatura
     */
    public Asignatura getAsignaturaAsig () {
        return asignaturaAsig;
    }
    
    /**
     * Setea la asignatura que se asigno
     * @param val la asignatura que se desea setear
     */
    public void setAsignaturaAsig (Asignatura val) {
        this.asignaturaAsig = val;
    }

}

