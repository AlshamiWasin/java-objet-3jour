package tp02.exo4.mesMachines;

import java.time.LocalDate;

public class BassinADecanter  extends Machine{

    int capaciteHL;

    public BassinADecanter(LocalDate dateAchat, String marque, String modele, int capaciteHL) {
        super(dateAchat, marque, modele);
        this.capaciteHL = capaciteHL;
    }

    @Override
    public String toString() {
        return "(" + capaciteHL + "W) " + super.toString();
    }

}
