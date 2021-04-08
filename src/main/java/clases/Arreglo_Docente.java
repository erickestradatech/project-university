package clases;

import java.util.ArrayList;

public class Arreglo_Docente {

    private ArrayList<Docente> lista;

    public Arreglo_Docente() {

        lista = new ArrayList();

        lista.add(new Principal(1001, "Erick", 2012, 1, 200));
        lista.add(new Parcial(1002, "Kristel", 2015, 1, 4));
        lista.add(new Principal(1003, "Juan", 2016, 2, 200));
        lista.add(new Principal(1004, "Albert", 2018, 1, 200));
        lista.add(new Parcial(1005, "Carla", 2013, 2, 4));
        lista.add(new Principal(1006, "Alejandra", 2015, 2, 200));

    }

    public void adi_Principal(Principal pr) {

        lista.add(pr);
    }

    public void adi_Parcial(Parcial pa) {

        lista.add(pa);
    }

    public ArrayList<Docente> listado() {

        return lista;
    }

    public Docente busca(int nro) {

        for (Docente x : lista) {

            if (x.getCodp() == nro) {

                return x;
            }

        }

        return null;
    }

    public void borra(Docente doc) {

        lista.remove(doc);
    }

}
