package pkAsignatura;


public class Asig_practica extends Asignatura {

    private String materialApoyo;
    private String sistemaOperativo;

    public Asig_practica (String ma, String so, String nom, int cred) {
        super(nom, cred);
        materialApoyo = ma;
        sistemaOperativo = so;
    }

    public Object getMaterial () {
        return null;
    }

    public void setMaterial (Object ma) {
    }

    public String getSistema () {
        return null;
    }
    
    public void setSistema (String si) {
    }

}

