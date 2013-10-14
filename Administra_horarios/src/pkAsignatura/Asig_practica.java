package pkAsignatura;

/**
 * Clase para crear una Asignatura Practica
 * @author Alonso
 */
public class Asig_practica extends Asignatura {

    private String materialApoyo;
    private String sistemaOperativo;

    /**
     * Contructor para la clase Asig_Practica
     * @param ma String para definir el material de apoyo
     * @param so String para definir el Sistema Operativo que se va a usar
     * @param nom String para definir el nombre de la asignatura
     * @param cred Integer para definir la cantidad de creditos
     * @param cod Un String con el codigo de la materia
     */
    public Asig_practica (String ma, String so, String nom, int cred, String cod) {
        super(nom, cred, cod);
        materialApoyo = ma;
        sistemaOperativo = so;
    }

    /**
     * Metodo para devolver el material de apoyo
     * @return String con el material de apoyo
     */
    public String getMaterial () {
        return materialApoyo;
    }

    /**
     * Metodo para setear el material de apoyo
     * @param ma String con el material de apoyo
     */
    public void setMaterial (String ma) {
        this.materialApoyo = ma;
    }

    /**
     * Metodo para devolver con el sistema operativo
     * @return  String con el sistema operativo
     */
    public String getSistemaOperativo () {
        return sistemaOperativo;
    }
    
    /**
     * Metodo para setear el sistema operativo
     * @param si String con el sistema operativo
     */
    public void setSistema (String si) {
        this.sistemaOperativo = si;
    }

}

