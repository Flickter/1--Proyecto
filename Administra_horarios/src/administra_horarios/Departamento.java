package administra_horarios;
import java.util.*;

public class Departamento {


    private String nombre;
    private List<Asignatura> listaAsig;


    public Departamento (String nom) {
        nombre = nom;
        listaAsig = null;
    }

    public List<Asignatura> getListaAsig () {
        return listaAsig;
    }

    public void setListaAsig (List<Asignatura> val) {
        this.listaAsig = val;
    }

    public String getNombre () {
        return nombre;
    }

    public void setNombre (String val) {
        this.nombre = val;
    }

}

