package pkPersona;

/**
 * Clase Abstracta de Persona que se va a heredar a Profesor, Estudiante y cordinador
 * @author Alonso
 */
public abstract class Persona{

    private String nombre;
    private String cedula;

    /**
     * Contructor de la clase persona
     * @param nomb Recibe un String con el nombre de la persona
     * @param ced Recibe un String con el cedula de la persona
     */
    public Persona (String nomb, String ced) {
        nombre = nomb;
        cedula = ced;
    }
    
    /**
     * Devuelve la cedula de la persona
     * @return Un String con la cedula
     */
    public String getCedula () {
        return cedula;
    }

    /**
     * Setea la cedula de la persona
     * @param val recibe un String con la cedula a modificar
     */
    public void setCedula (String val) {
        this.cedula = val;
    }

    /**
     * Devuelve el nombre de la persona
     * @return Un String con el nombre
     */
    public String getNombre () {
        return nombre;
    }

    /**
     * Setea el nombre de la persona
     * @param val recibe un String con el nombre a modificar
     */
    public void setNombre (String val) {
        this.nombre = val;
    }

}

