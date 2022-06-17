package tp04.exo4;

import java.util.ArrayList;

public class Plan {

    Integer echelle;
    String nomFichier;
    ArrayList<Emplacement> lesEmplacements = new ArrayList<>();

    public Plan(String nomFichier) {
        this.nomFichier = nomFichier;
    }

    public void ajouteEmplacement(Emplacement emplacement){
        lesEmplacements.add(emplacement);
        System.out.println("Added "+emplacement +"to the list");
    }

    public void supprimeEmplacement(Emplacement emplacement){
        if (lesEmplacements.contains(emplacement)){
            lesEmplacements.add(emplacement);
            System.out.println("Emplacement removed .");
        }
        else {
            System.out.println("Cant remove emplacement because this emplacement is not in the list .");
        }
    }

    public void affiche(){
        for (Emplacement leEmplacement : lesEmplacements) {
            System.out.println(leEmplacement.affiche());
        }
    }


/*    public ArrayList<Emplacement> affiche(){
        return lesEmplacements;
    }
    */



}
