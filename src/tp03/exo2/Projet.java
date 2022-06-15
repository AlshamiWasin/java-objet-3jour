package tp03.exo2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Projet {

    String leNom;
    LocalDate leDebut;
    LocalDate laFin;
    Double lePrixFactureMo;
    List<Mission> lesMissions = new ArrayList<>();

    public Projet(String leNom, LocalDate leDebut, LocalDate laFin, Double lePrixFactureMo, List<Mission> lesMissions) {
        this.leNom = leNom;
        this.leDebut = leDebut;
        this.laFin = laFin;
        this.lePrixFactureMo = lePrixFactureMo;
        this.lesMissions = lesMissions;
    }

    public double cumulCoutMo()
    {
        double cumul = 0;

        for (Mission leMission : lesMissions) {
            cumul += leMission.nbHeuresEffectues()*leMission.executant.getTauxHoraire();
        }

        // calcul le cumul du coût en fonction de chacune des mission et du taux horaire
        // de l'intervenant de la mission
        //pour chaque mission = taux horaire intervenant * nbheuremission
        //retourne le cumul du coût

        return cumul;


    }

    public double margeBruteCourante()
    {
        // retourne le prix facture du projet - le cumul du coût des missions
        // le prix facture est une variable de la classe alors que le coût des missions
        // est une méthode de la classe

        return lePrixFactureMo - cumulCoutMo();

    }


}
