package tp04.exo4;

public abstract class Emplacement {

    protected int dimension;
    protected int couleur;
    protected int xCentre;
    protected int yCentre;

    protected Emplacement(int couleur, int xCentre, int yCentre) {
        this.couleur = couleur;
        this.xCentre = xCentre;
        this.yCentre = yCentre;
    }

    abstract String affiche();


}
