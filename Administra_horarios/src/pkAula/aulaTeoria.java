package pkAula;


public class aulaTeoria extends Aulas {

    private boolean aireAcond;

    public aulaTeoria (String nomb, String numAu, String Ubicac, int cap) {
        super(nomb, numAu, Ubicac, cap);
        aireAcond = false;
    }

    public boolean getAireAcond () {
        return aireAcond;
    }

    public void setAireAcond (boolean val) {
        this.aireAcond = val;
    }

}

