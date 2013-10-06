package pkPersona;


public abstract class Persona{

    private String nombre;
    private String cedula;

    public Persona (String nomb, String ced) {
        nombre = nomb;
        cedula = ced;
    }
    
    public String getCedula () {
        return cedula;
    }

    public void setCedula (String val) {
        this.cedula = val;
    }

    public String getNombre () {
        return nombre;
    }

    public void setNombre (String val) {
        this.nombre = val;
    }

}

