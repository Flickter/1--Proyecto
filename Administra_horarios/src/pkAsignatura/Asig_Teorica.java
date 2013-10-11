package pkAsignatura;

/**
 * Clase para la Asignacion de tipo Teorica
 * @author Alonso
 */
public class Asig_Teorica extends Asignatura {

    private String paginaWeb;

    /**
     * Constructor para la clase de Asignacion Teorica
     * @param pgWeb Un String para la pagina Web
     * @param nom Un String para el nombre de la asignacion
     * @param cred Un Integer para el numero de creditos de esa asignacion
     */
    public Asig_Teorica (String pgWeb, String nom, int cred) {
        super(nom, cred);
        paginaWeb = pgWeb;
    }

    /**
     * Metodo que devuelve la pagina Web de la Asignacion
     * @return Un String con la pagina Web
     */
    public String getPaginaWeb () {
        return paginaWeb;
    }

    /**
     * Metodo para setear el valor de la pagina Web
     * @param val Un String con la pagina Web
     */
    public void setPaginaWeb (String val) {
        this.paginaWeb = val;
    }

}

