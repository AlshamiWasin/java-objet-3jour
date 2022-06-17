package Architecture_modulaire_en_Java.exo1;

public class Losange{

    double grandeDiagonale;
    double petiteDiagonale;
    double aire;

    public Losange(double grandeDiagonale, double petiteDiagonale) {
        this.grandeDiagonale = grandeDiagonale;
        this.petiteDiagonale = petiteDiagonale;
        this.setAire(grandeDiagonale , petiteDiagonale);
    }

    public double getGrandeDiagonale() {
        return grandeDiagonale;
    }

    public void setGrandeDiagonale(double grandeDiagonale) {
        this.grandeDiagonale = grandeDiagonale;
    }

    public double getPetiteDiagonale() {
        return petiteDiagonale;
    }

    public void setPetiteDiagonale(double petiteDiagonale) {
        this.petiteDiagonale = petiteDiagonale;
    }

    public double getAire() {
        return aire;
    }

    public void setAire(double grandeDiagonale , double petiteDiagonale) {
        this.aire = (grandeDiagonale*petiteDiagonale)/2;
    }
}
