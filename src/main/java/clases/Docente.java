package clases;

public class Docente {

    private int codp;
    private String nomp;
    private int aing;
    private int grado;

    public Docente(int codp, String nomp, int aing, int grado) {
        this.codp = codp;
        this.nomp = nomp;
        this.aing = aing;
        this.grado = grado;
    }

    public int getCodp() {
        return codp;
    }

    public void setCodp(int codp) {
        this.codp = codp;
    }

    public String getNomp() {
        return nomp;
    }

    public void setNomp(String nomp) {
        this.nomp = nomp;
    }

    public int getAing() {
        return aing;
    }

    public void setAing(int aing) {
        this.aing = aing;
    }

    public int getGrado() {
        return grado;
    }

    public void setGrado(int grado) {
        this.grado = grado;
    }

}
