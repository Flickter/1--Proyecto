package administra_horarios;


public class AsignaturaSemestre {

    private Asignatura asignaturaAsig;
    private Aulas AulaAsig;
    private Profesor ProfesorAsig;
    private int hora;
    private int minutos;
    private String dia;

    public AsignaturaSemestre (Asignatura Asig, Aulas Aul, Profesor Profe, int hor, int min, String day) {
        asignaturaAsig = Asig ;
        AulaAsig = Aul;
        ProfesorAsig = Profe;
        hora= hor;
        minutos= min;
        dia= day;
    }

    public Aulas getAulaAsig () {
        return AulaAsig;
    }

    public void setAulaAsig (Aulas val) {
        this.AulaAsig = val;
    }
    
    public Profesor getProfesorAsig () {
        return ProfesorAsig;
    }

    public void setProfesorAsig (Profesor val) {
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

