package administra_horarios;


public class Asig_Teorica extends Asignatura {

    private String paginaWeb;

    public Asig_Teorica (String pgWeb, String nom, int cred) {
        super(nom, cred);
        paginaWeb = pgWeb;
    }

    public String getPaginaWeb () {
        return paginaWeb;
    }

    public void setPaginaWeb (String val) {
        this.paginaWeb = val;
    }

}

