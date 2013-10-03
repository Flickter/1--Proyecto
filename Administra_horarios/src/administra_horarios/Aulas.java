package administra_horarios;


public abstract class Aulas {

    private String nombre;
    private String numAula;
    private String Ubicacion;
    private int capaciad;

    public Aulas (String nomb, String numAu, String Ubicac, int cap) {
        nombre = nomb;
        numAula = numAu;
        Ubicacion = Ubicac;
        capaciad = cap;
    }
    public String getUbicacion () {
        return Ubicacion;
    }
    public void setUbicacion (String val) {
        this.Ubicacion = val;
    }

    public int getCapaciad () {
        return capaciad;
    }

    public void setCapaciad (int val) {
        this.capaciad = val;
    }

    public String getNombre () {
        return nombre;
    }

    public void setNombre (String val) {
        this.nombre = val;
    }

    public String getNumAula () {
        return numAula;
    }

    public void setNumAula (String val) {
        this.numAula = val;
    }

}
