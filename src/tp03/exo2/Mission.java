package tp03.exo2;

import java.time.LocalDate;
import java.util.Hashtable;

public class Mission {

    String nom;
    String description;
    int nbHeuresPrevues;
    Intervenant executant;
    Hashtable<LocalDate, Integer> releveHoraire = new Hashtable<LocalDate, Integer>();


    public Mission(String nom, String description, int nbHeuresPrevues,Intervenant executant) {
        this.nom = nom;
        this.description = description;
        this.nbHeuresPrevues = nbHeuresPrevues;
        this.executant = executant;
    }

    public Hashtable<LocalDate, Integer> getReleveHoraire() {
        return releveHoraire;
    }

    public Intervenant getExecutant() {
        return executant;
    }

    public void ajoutReleve(LocalDate laDate, int nbreHeures){
        releveHoraire.put(laDate , nbreHeures);
    }

    public double nbHeuresEffectues()
    {
        /* grâce au tableau releve horaire additionne les nombres d'heures effectuées et
        retourne le total */

        int total = 0;

        for (Integer value : releveHoraire.values()) {
            total += value;
        }

        return total;

    }

}
