package Architecture_modulaire_en_Java.exo1;

public class Triangle{

    double base;
    double hauteur;
    double aire;

    public Triangle(double base, double hauteur) {
        this.setBase(base);
        this.setHauteur(hauteur);
        this.setAire(base,hauteur);

    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHauteur() {
        return hauteur;
    }

    public void setHauteur(double hauteur) {
        this.hauteur = hauteur;
    }

    public double getAire() {
        return aire;
    }

    public void setAire(double base ,double hauteur) {
        this.aire = (base * hauteur)/2;
    }

}
