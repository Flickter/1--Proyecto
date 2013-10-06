package pkAsignatura;



public abstract class Asignatura {

    private String nombre;
    private int creditos;

    public Asignatura (String nom, int cred) {
        nombre = nom;
        creditos = cred;
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

