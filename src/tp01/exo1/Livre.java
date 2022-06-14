package tp01.exo1;

public class Livre {

    String titre;
    String auteur;
    double prix;
    int nbpages;
    long isbn;
    String annee;

    public Livre() {
    }


    public Livre(String titre, int nbpages, long isbn) {
        this.titre = titre;
        this.nbpages = nbpages;
        this.isbn = isbn;
    }

    public Livre(String titre, String auteur, int nbpages, long isbn) {
        this.titre = titre;
        this.auteur = auteur;
        this.nbpages = nbpages;
        this.isbn = isbn;
    }

    public Livre(String titre, String auteur, double prix, int nbpages, long isbn) {
        this.titre = titre;
        this.auteur = auteur;
        this.prix = prix;
        this.nbpages = nbpages;
        this.isbn = isbn;
    }

    public Livre(String titre, String auteur, double prix, int nbpages, long isbn, String annee) {
        this.titre = titre;
        this.auteur = auteur;
        this.prix = prix;
        this.nbpages = nbpages;
        this.isbn = isbn;
        this.annee = annee;
    }

    public Livre(Livre livre){
        this.titre = livre.titre;
        this.auteur = livre.auteur;
        this.prix = livre.prix;
        this.nbpages = livre.nbpages;
        this.isbn = livre.isbn;
        this.annee = livre.annee;
    }


    @Override
    public String toString() {
        return "Livre{" +
                "titre='" + titre + '\'' +
                ", auteur='" + auteur + '\'' +
                ", prix=" + prix +
                ", nbpages=" + nbpages +
                ", isbn=" + isbn +
                ", annee='" + annee + '\'' +
                '}';
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public int getNbpages() {
        return nbpages;
    }

    public void setNbpages(int nbpages) {
        this.nbpages = nbpages;
    }

    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    public String getAnnee() {
        return annee;
    }

    public void setAnnee(String annee) {
        this.annee = annee;
    }
}
