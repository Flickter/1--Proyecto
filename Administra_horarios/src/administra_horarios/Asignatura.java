package administra_horarios;



public class Asignatura {

    private String nombre;
    private int creditos;

    public Asignatura () {
    }

    public int getCreditos () {
        return creditos;
    }

    public void setCreditos (int val) {
        this.creditos = val;
    }

    public String getNombre () {
        return nombre;
    }

    public void setNombre (String val) {
        this.nombre = val;
    }

}

