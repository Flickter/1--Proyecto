package pkAula;

/**
 * Metodo Abstracto para la Creacion de Aulas
 * @author Alonso
 */
public abstract class Aulas {

    private String nombre;
    private String numAula;
    private String Ubicacion;
    private int capaciad;

    /**
     * constructor para la creacion de un aula
     * @param nomb Un String con el nombre del Aula
     * @param numAu Un String con el numero del Aula
     * @param Ubicac Un String con la ubicacion del Aula
     * @param cap Un Integer con la capacidad del Aula
     */
    public Aulas (String nomb, String numAu, String Ubicac, int cap) {
        nombre = nomb;
        numAula = numAu;
        Ubicacion = Ubicac;
        capaciad = cap;
    }
    
    /**
     * Metodo para obtener la ubicacion del aula
     * @return Un String con la ubicacion
     */
    public String getUbicacion () {
        return Ubicacion;
    }
    
    /**
     * Metodo para setear la ubicacion 
     * @param val Un String con la ubicacion
     */
    public void setUbicacion (String val) {
        this.Ubicacion = val;
    }

    /**
     * Metodo para obtener la capacidad del aula
     * @return Un Integer con la capacidad
     */
    public int getCapaciad () {
        return capaciad;
    }

    /**
     * Metodo para setear la capacidad 
     * @param val Un String con la capacidad
     */
    public void setCapaciad (int val) {
        this.capaciad = val;
    }

    /**
     * Metodo para obtener el nombre del aula
     * @return Un String con el nombre
     */
    public String getNombre () {
        return nombre;
    }

    /**
     * Metodo para setear el nombre 
     * @param val Un String con el nombre
     */
    public void setNombre (String val) {
        this.nombre = val;
    }

    /**
     * Metodo para obtener el numero del aula
     * @return Un String con el numero del aula
     */
    public String getNumAula () {
        return numAula;
    }

    /**
     * Metodo para setear la ubicacion 
     * @param val Un String con la ubicacion
     */
    public void setNumAula (String val) {
        this.numAula = val;
    }

}

