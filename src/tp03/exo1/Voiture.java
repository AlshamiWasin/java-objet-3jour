package tp03.exo1;

import java.awt.*;

public class Voiture {

    int num_serie;
    String immatriculation;
    String marque;
    Color couleur;
    int annee;

    public void setImmatriculation(String immatriculation) {
        this.immatriculation = immatriculation;
    }

    Individu proprietaire;

    public void demarrer(){
        System.out.println("demarrer");
    }

    public void klaxonner(){
        System.out.println("klaxonner");
    }

    public void conduire(){
        System.out.println("conduire");
    }

    public void arreter(){
        System.out.println("arreter");
    }

    public Voiture(int num_serie, String immatriculation, String marque, Color couleur, int annee) {
        this.num_serie = num_serie;
        this.immatriculation = immatriculation;
        this.marque = marque;
        this.couleur = couleur;
        this.annee = annee;
    }

    public int getNum_serie() {
        return num_serie;
    }

    public void setNum_serie(int num_serie) {
        this.num_serie = num_serie;
    }


    public Individu getProprietaire() {
        return proprietaire;
    }

    public void setProprietaire(Individu proprietaire) {
        this.proprietaire = proprietaire;
    }

    public String getImmatriculation() {
        return immatriculation;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public Color getCouleur() {
        return couleur;
    }

    public void setCouleur(Color couleur) {
        this.couleur = couleur;
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Voiture{");
        sb.append("num_serie=").append(num_serie);
        sb.append(", immatriculation='").append(immatriculation).append('\'');
        sb.append(", marque='").append(marque).append('\'');
        sb.append(", couleur=").append(couleur);
        sb.append(", annee=").append(annee);
        sb.append(", proprietaire=").append(proprietaire);
        sb.append('}');
        return sb.toString();
    }
}
