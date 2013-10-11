package pkAsignatura;


/**
 * Calse Abstracta de Asignatura que sera heredada por ASig_Teoria y Asig_PRactica
 * @author Alonso
 */
public abstract class Asignatura {

    private String nombre;
    private int creditos;

    /**
     * Constructor para la Clase Asignatura
     * @param nom Un String con el nombre de la ASignatura
     * @param cred Un Integer con el numero de creditos
     */
    public Asignatura (String nom, int cred) {
        nombre = nom;
        creditos = cred;
    }

    /**
     * Medodo para obtener los creditos de la asignatura
     * @return Un Integer con el numero de los creditos
     */
    public int getCreditos () {
        return creditos;
    }

    /**
     * Metodo que setea los creditos de la signatura
     * @param val Un Integer con numero de creditos
     */
    public void setCreditos (int val) {
        this.creditos = val;
    }

    /**
     * Medodo para obtener el nombre de la asignatura
     * @return Un String con el nombre
     */
    public String getNombre () {
        return nombre;
    }

    /**
     * Metodo que setea el nombre de la signatura
     * @param val Un String con el nombre
     */
    public void setNombre (String val) {
        this.nombre = val;
    }

}

