package tp02.exo3;

public abstract class Personnne {

    String nom;
    String prenom;
    String telephone;

    public Personnne(String nom, String prenom, String telephone) {
        this.nom = nom;
        this.prenom = prenom;
        this.telephone = telephone;
    }

    @Override
    public abstract String toString();
}
