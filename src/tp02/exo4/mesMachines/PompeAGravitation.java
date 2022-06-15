package tp02.exo4.mesMachines;

import java.time.LocalDate;

public class PompeAGravitation extends Machine {
    int debit;
    boolean eauOperationelle;

    public PompeAGravitation(LocalDate dateAchat, String marque, String modele, int debit, boolean eauOperationelle) {
        super(dateAchat, marque, modele);
        this.debit = debit;
        this.eauOperationelle = eauOperationelle;
    }
}
