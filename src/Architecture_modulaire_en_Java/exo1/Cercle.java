package Architecture_modulaire_en_Java.exo1;

public class Cercle {

    double rayon;
    double aire;

    public Cercle(double rayon) {
        this.rayon = rayon;
        this.setAire(rayon);
    }

    public double getRayon() {
        return rayon;
    }

    public void setRayon(double rayon) {
        this.rayon = rayon;
    }

    public double getAire() {
        return aire;
    }

    public void setAire(double rayon) {
        this.aire = Math.PI * Math.pow(rayon,2);
    }
}

