package tp02.exo4.mesMachines;

import java.time.LocalDate;

public class MachineEssence extends Machine{

    int puissanceCV;

    public MachineEssence(LocalDate dateAchat, String marque, String modele, int puissanceCV) {
        super(dateAchat, marque, modele);
        this.puissanceCV = puissanceCV;
    }

    @Override
    public String toString() {
        return "(" + puissanceCV + "W) " + super.toString();
    }

}
