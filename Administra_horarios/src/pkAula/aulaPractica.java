package pkAula;

import java.util.*;

/**
 * Clase para definir un Aula para efectos practicos
 * @author Alonso
 */
public class aulaPractica extends Aulas {

    private List<Equipo> listaEquipo;

    /**
     * Constructor para el Aula practica
     * @param nomb Un String que define el nombre del aula
     * @param numAu Un String que define el nombre del aula
     * @param Ubicac Un String que define la ubicacion del aula
     * @param cap Un Integer que define la capacidad del aula
     */
    public aulaPractica (String nomb, String numAu, String Ubicac, int cap) {
        super(nomb, numAu, Ubicac, cap);
        listaEquipo = null;
    }

    /**
     * Metodo para obtener la lista del equipo del Aula
     * @return una List de tipo  Equipo
     */
    public List<Equipo> getListaEquipo () {
        return listaEquipo;
    }

    /**
     * Metodo para setear la lista del equipo
     * @param val Una List de objetos Equipo
     */
    public void setListaEquipo (List<Equipo> val) {
        this.listaEquipo = val;
    }

}

