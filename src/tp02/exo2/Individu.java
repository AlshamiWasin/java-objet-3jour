package tp02.exo2;

public class Individu {
    private String prenom;
    private String nom;

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Individu(String prenom, String nom) { //
        this.nom = nom;
        this.prenom = prenom;
    }
    @Override
    public String toString() {
        return "prénom=" + getPrenom()+", nom=" + getNom();
    }


}
