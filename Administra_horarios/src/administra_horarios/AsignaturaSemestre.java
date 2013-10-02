package administra_horarios;


public class AsignaturaSemestre {

    private Asignatura asignaturaAsig;
    private Aulas AulaAsig;
    private int ProfesorAsig;
    private int hora;
    private int minutos;
    private String dia;

    public AsignaturaSemestre () {
    }

    public Aulas getAulaAsig () {
        return AulaAsig;
    }

    public void setAulaAsig (Aulas val) {
        this.AulaAsig = val;
    }
    
    public int getProfesorAsig () {
        return ProfesorAsig;
    }

    public void setProfesorAsig (int val) {
        this.ProfesorAsig = val;
    }

    public Asignatura getAsignaturaAsig () {
        return asignaturaAsig;
    }

    public void setAsignaturaAsig (Asignatura val) {
        this.asignaturaAsig = val;
    }

    public String getDia () {
        return dia;
    }

    public void setDia (String val) {
        this.dia = val;
    }

    public int getHora () {
        return hora;
    }

    public void setHora (int val) {
        this.hora = val;
    }

    public int getMinutos () {
        return minutos;
    }

    public void setMinutos (int val) {
        this.minutos = val;
    }

}

