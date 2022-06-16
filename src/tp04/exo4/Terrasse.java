package tp04.exo4;

public class Terrasse extends Emplacement{

    public Terrasse( int couleur, int xCentre, int yCentre) {
        super( couleur, xCentre, yCentre);
    }

    @Override
    String affiche() {
        return "Terrasse";
    }
}
