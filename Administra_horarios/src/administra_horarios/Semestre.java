package administra_horarios;
import java.util.*;

public class Semestre {

    private int numero;
    private List<AsignaturaSemestre> ListaAsigSem;

    public Semestre (int nume, List<AsignaturaSemestre> lista) {
        numero = nume;
        ListaAsigSem = lista;
    }

    public List<AsignaturaSemestre> getListaAsigSem () {
        return ListaAsigSem;
    }

    public void setListaAsigSem (List<AsignaturaSemestre> val) {
        this.ListaAsigSem = val;
    }

    public int getNumero () {
        return numero;
    }

    public void setNumero (int val) {
        this.numero = val;
    }

}

