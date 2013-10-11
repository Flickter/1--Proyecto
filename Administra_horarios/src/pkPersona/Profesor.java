package pkPersona;

/**
 * Clase para crear un profesor
 * @author Alonso
 */
public class Profesor extends Persona {

    private String horario;
    private Departamento departament;

    /**
     * Constructor para crear un profesor
     * @param horari Un String espeficicando el horario que el profesor desea
     * @param depart El departamento al que pertenece el profesor de tipo Departamento
     * @param nomb Un String con el nombre del profesor
     * @param ced Un String ocn la cedula del profesor
     */
    public Profesor (String horari, Departamento depart, String nomb, String ced) {
        super(nomb, ced);
        horario = horari;
        departament =depart;
    }

    /**
     * Metodo para devolver el departamento al cual pertenece el profesor
     * @return Un departametno tipo Departamento
     */
    public Departamento getDepartament () {
        return departament;
    }

    /**
     * Metodo para setear un departemento
     * @param val Un departamento tipo Departamento
     */
    public void setDepartament (Departamento val) {
        this.departament = val;
    }

    /**
     * Metodo para obtener el horario
     * @return Un String con el horario
     */
    public String getHorario () {
        return horario;
    }

    /**
     * Metodo para setear el horario
     * @param val Un String con el horario
     */
    public void setHorario (String val) {
        this.horario = val;
    }

}

