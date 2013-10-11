package pkPersona;
import pkAsignatura.Asignatura;
import java.util.*;

/**
 * Clase Departamento a el cual pertenece un cordinador
 * @author Alonso
 */
public class Departamento {


    private String nombre;
    private List<Asignatura> listaAsig;

    /**
     * Constructor de Departamento
     * @param nom Recibe un String con el nombre del departamento
     */
    public Departamento (String nom) {
        nombre = nom;
        listaAsig = null;
    }

    /**
     * Metodo para obtener la lista de asignaturas de un departamento
     * @return Devuelve una Lista de objetos Asignatura
     */
    public List<Asignatura> getListaAsig () {
        return listaAsig;
    }

    /**
     * Setea la lista de Asignaturas
     * @param val Recibe un List de objetos Asignatura
     */
    public void setListaAsig (List<Asignatura> val) {
        this.listaAsig = val;
    }

    /**
     * Devuelve el nombre del deparmento
     * @return Devuelve un String con el nombre del departamento
     */
    public String getNombre () {
        return nombre;
    }

    /**
     * Setea el nombre del departamento
     * @param val Recibe un String con el nombre
     */
    public void setNombre (String val) {
        this.nombre = val;
    }

}

