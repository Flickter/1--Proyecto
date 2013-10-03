package administra_horarios;


public class Profesor extends Persona {

    private String horario;
    private Departamento departament;

    public Profesor (String horari, Departamento depart, String nomb, String ced) {
        super(nomb, ced);
        horario = horari;
        departament =depart;
    }

    public Departamento getDepartament () {
        return departament;
    }

    public void setDepartament (Departamento val) {
        this.departament = val;
    }

    public String getHorario () {
        return horario;
    }

    public void setHorario (String val) {
        this.horario = val;
    }

}

