package pkAula;


public class Equipo {

    private int cantidad;
    private String nombre;

    public Equipo (int cant, String nom) {
        cantidad = cant;
        nombre = nom;
    }

    public int getCantidad () {
        return cantidad;
    }

    public void setCantidad (int val) {
        this.cantidad = val;
    }

    public String getNombre () {
        return nombre;
    }

    public void setNombre (String val) {
        this.nombre = val;
    }

}

