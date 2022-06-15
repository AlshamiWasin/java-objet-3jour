package tp03.exo2;

public class Intervenant {

    String nom;
    double tauxHoraire;

    public Intervenant(String nom, double tauxHoraire) {
        this.nom = nom;
        this.tauxHoraire = tauxHoraire;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getTauxHoraire() {
        return tauxHoraire;
    }

    public void setTauxHoraire(double tauxHoraire) {
        this.tauxHoraire = tauxHoraire;
    }
}
