package administra_horarios;

import java.util.*;

public class aulaPractica extends Aulas {

    private List<Equipo> listaEquipo;

    public aulaPractica () {
    }

    public List<Equipo> getListaEquipo () {
        return listaEquipo;
    }

    public void setListaEquipo (List<Equipo> val) {
        this.listaEquipo = val;
    }

}

