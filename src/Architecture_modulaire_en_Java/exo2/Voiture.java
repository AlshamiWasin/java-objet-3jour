package Architecture_modulaire_en_Java.exo2;

public class Voiture {

    int num_serie;
    int immatriculation;
    String marque;
    String couleur;
    String annee;
    Individu proprietaire;


    public Voiture(int num_serie, int immatriculation, String marque, String couleur, String annee, Individu proprietaire) {
        this.num_serie = num_serie;
        this.immatriculation = immatriculation;
        this.marque = marque;
        this.couleur = couleur;
        this.annee = annee;
        this.proprietaire = proprietaire;
    }

    public Voiture(int num_serie, int immatriculation, String marque, String couleur, String annee) {
        this.num_serie = num_serie;
        this.immatriculation = immatriculation;
        this.marque = marque;
        this.couleur = couleur;
        this.annee = annee;
    }

    public Individu getProprietaire() {
        return proprietaire;
    }

    public void setProprietaire(Individu proprietaire) {
        this.proprietaire = proprietaire;
    }

    public void demarrer() {
        System.out.println("demarrer");
    }
    public void klaxonner() {
        System.out.println("klaxonner");
    }
    public void conduire() {
        System.out.println("conduire");
    }
    public void arreter() {
        System.out.println("arreter");
    }


    public int getNum_serie() {
        return num_serie;
    }

    public void setNum_serie(int num_serie) {
        this.num_serie = num_serie;
    }

    public int getImmatriculation() {
        return immatriculation;
    }

    public void setImmatriculation(int immatriculation) {
        this.immatriculation = immatriculation;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public String getAnnee() {
        return annee;
    }

    public void setAnnee(String annee) {
        this.annee = annee;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Voiture{");
        sb.append("num_serie=").append(num_serie);
        sb.append(", immatriculation=").append(immatriculation);
        sb.append(", marque='").append(marque).append('\'');
        sb.append(", couleur='").append(couleur).append('\'');
        sb.append(", annee='").append(annee).append('\'');
        sb.append(", proprietaire=").append(proprietaire);
        sb.append('}');
        return sb.toString();
    }
}
