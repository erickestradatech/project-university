package clases;

public class Parcial extends Docente {

    private int horas;

    public Parcial(int codp, String nomp, int aing, int grado, int horas) {
        super(codp, nomp, aing, grado);
        this.horas = horas;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public double pagoPacial() {

        if (super.getGrado() == 1) {

            return 25 * horas;

        } else if (super.getGrado() == 2) {

            return 30 * horas;

        } else {

            return 40 * horas;
        }
    }

}
