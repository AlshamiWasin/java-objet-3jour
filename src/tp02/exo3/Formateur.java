package tp02.exo3;

import java.util.Date;

public class Formateur extends Personnne{

    Integer numeroIntervenant;

    Date datedeCreation;

    static int nombreIntervenant;


    public Formateur(String nom, String prenom, String telephone, Integer numeroIntervenant) {
        super(nom, prenom, telephone);
        this.numeroIntervenant = numeroIntervenant;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Formateur{");
        sb.append("numeroIntervenant=").append(numeroIntervenant);
        sb.append(", datedeCreation=").append(datedeCreation);
        sb.append(", nom='").append(nom).append('\'');
        sb.append(", prenom='").append(prenom).append('\'');
        sb.append(", telephone='").append(telephone).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
