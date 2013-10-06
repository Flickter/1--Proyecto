package pkAula;

import java.util.*;

public class aulaPractica extends Aulas {

    private List<Equipo> listaEquipo;

    public aulaPractica (String nomb, String numAu, String Ubicac, int cap) {
        super(nomb, numAu, Ubicac, cap);
        listaEquipo = null;
    }

    public List<Equipo> getListaEquipo () {
        return listaEquipo;
    }

    public void setListaEquipo (List<Equipo> val) {
        this.listaEquipo = val;
    }

}

