package clases;

public class Principal extends Docente {

    private int dias;

    public Principal(int codp, String nomp, int aing, int grado, int dias) {
        super(codp, nomp, aing, grado);
        this.dias = dias;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public double neto() {

        if (super.getGrado() == 1) {

            return 140 * dias;

        } else if (super.getGrado() == 2) {

            return 180 * dias;

        } else {

            return 200 * dias;

        }
    }

    public double bonificacion() {

        return (2020 - super.getAing()) / 2 * 0.05 * neto();
    }

    public double pagoPrincipal() {

        return neto() + bonificacion();
    }

}
