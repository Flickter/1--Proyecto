package pkSemestre;
import java.util.*;

/**
 *Clase para definir un semestre  
 * @author Alonso
 */
public class Semestre {

    private int numero;
    private List<AsignaturaSemestre> ListaAsigSem;

    /**
     * Constructor de la instancia Semestre
     * @param nume Integer con el numero de semestre
     * @param lista Una List de Objetos AsignaturaSemestre con la lista de materias
     */
    public Semestre (int nume, List<AsignaturaSemestre> lista) {
        numero = nume;
        ListaAsigSem = lista;
    }

    /**
     * Devuelve la lista de materias
     * @return Una lista de objetos AsignaturaSemestre
     */
    public List<AsignaturaSemestre> getListaAsigSem () {
        return ListaAsigSem;
    }

    /**
     * Setea la lista de Materias
     * @param val Una lista de  objetos tipo AsignaturaSemestre
     */
    public void setListaAsigSem (List<AsignaturaSemestre> val) {
        this.ListaAsigSem = val;
    }

    /**
     * Devuelve el numero de semestre
     * @return un Integer con el numero de semestre
     */
    public int getNumero () {
        return numero;
    }

    /**
     * Setea el numero de semetre
     * @param val Un integer con el numero de semestre
     */
    public void setNumero (int val) {
        this.numero = val;
    }

}

