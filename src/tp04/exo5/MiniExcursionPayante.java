package tp04.exo5;

import java.util.List;

public class MiniExcursionPayante extends MiniExcursion {

    String libelleMiniExcursion;
    int nbrePlace;
    List<Etape> lesEtapes;
    float tarif;

    public MiniExcursionPayante(String libelleMiniExcursion, int nbrePlace, List lesEtapes, float tarif) {
        super(libelleMiniExcursion, nbrePlace, lesEtapes);
        this.setTarif(tarif);
    }


    public float getTarif() {
        return tarif;
    }

    public void setTarif(float tarif) {
        this.tarif = tarif;
    }
}
