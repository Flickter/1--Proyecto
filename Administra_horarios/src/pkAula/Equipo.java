package pkAula;

/**
 * Clase Equipo para definir el equipo que contiene una aula para efectos practicos
 * @author Alonso
 */
public class Equipo {

    private int cantidad;
    private String nombre;

    /**
     * Construtor para la clase Equipo
     * @param cant Un integer para definir la cantidad del equipo
     * @param nom Un String para el nombre del equipo
     */
    public Equipo (int cant, String nom) {
        cantidad = cant;
        nombre = nom;
    }

    /**
     * Metodo que obtiene la cantidad del equipo
     * @return un Integer con la cantidad del equipo
     */
    public int getCantidad () {
        return cantidad;
    }

    /**
     * Metodo que setea la cantidad del equipo
     * @param val Un integer con la cantidad del equipo
     */
    public void setCantidad (int val) {
        this.cantidad = val;
    }

    /**
     * Metodo que obtiene el nombre del equipo
     * @return Un String con el nombre del equipo
     */
    public String getNombre () {
        return nombre;
    }

    /**
     * Metodo que setea el nombre del equipo
     * @param val Un String con el nombre del equipo
     */
    public void setNombre (String val) {
        this.nombre = val;
    }

}

