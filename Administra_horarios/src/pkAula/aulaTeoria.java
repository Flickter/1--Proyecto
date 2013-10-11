package pkAula;

/**
 * Clase para Definir un Aula para fines Teoricos
 * @author Alonso
 */
public class aulaTeoria extends Aulas {

    private boolean aireAcond;

    /**
     * Constructor de la clase AulaTeoria
     * @param nomb Un String con el nombre del Aula
     * @param numAu Un String con el numero del Aula
     * @param Ubicac Un String con la ubicacion del Aula
     * @param cap Un Integer con la capacidad del Aula
     */
    public aulaTeoria (String nomb, String numAu, String Ubicac, int cap) {
        super(nomb, numAu, Ubicac, cap);
        aireAcond = false;
    }

    /**
     * Metodo para saber si contiene Aire Acondicionado
     * @return Un Boolean True si tiene aire acondicionado o un false si no
     */
    public boolean getAireAcond () {
        return aireAcond;
    }

    /**
     * Metodo para setear el estado del aire acondicionado
     * @param val Un Boolean, true para indicar que hay aire acondicionado o false si no
     */
    public void setAireAcond (boolean val) {
        this.aireAcond = val;
    }

}

