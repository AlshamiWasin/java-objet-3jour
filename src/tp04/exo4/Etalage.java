package tp04.exo4;

public class Etalage extends Emplacement{

    public Etalage( Integer couleur, Integer xCentre, Integer yCentre) {
        super(couleur, xCentre, yCentre);
    }

    @Override
    String affiche() {
        return "Etalage";
    }


}
