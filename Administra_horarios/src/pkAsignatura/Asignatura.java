package pkAsignatura;


/**
 * Calse Abstracta de Asignatura que sera heredada por ASig_Teoria y Asig_PRactica
 * @author Alonso
 */
public abstract class Asignatura {

    private String nombre;
    private String codigo;
    private int creditos;

    /**
     * Constructor para la Clase Asignatura
     * @param nom Un String con el nombre de la ASignatura
     * @param cred Un Integer con el numero de creditos
     * @param cod Un String con el codigo de la materia
     */
    public Asignatura (String nom, int cred, String cod) {
        nombre = nom;
        creditos = cred;
        codigo = cod;        
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

        /**
     * Medodo para obtener el codigo de la asignatura
     * @return Un String con el codigo
     */
    public String getCodigo () {
        return codigo;
    }

    /**
     * Metodo que setea el codigo de la signatura
     * @param val Un String con el codigo
     */
    public void setCodigo (String val) {
        this.codigo = val;
    }
}

