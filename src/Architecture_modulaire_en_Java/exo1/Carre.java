package Architecture_modulaire_en_Java.exo1;

public class Carre {

    double cote ;
    double aire;

    public Carre(double cote ) {
        this.setCote(cote);
        this.setAire(cote);
    }

    public double getCote() {
        return cote;
    }

    public void setCote(double cote) {
        this.cote = cote;
    }

    public double getAire() {
        return aire;
    }

    public void setAire(double cote) {
        this.aire = cote * cote;
    }
}
