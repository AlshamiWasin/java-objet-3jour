package tp01.exo2;

public class Client {

    String nom;
    String prenom;
    String addrese;
    int cp;
    String ville;

    public Client(String nom, String prenom, String addrese, int cp, String ville) {
        this.nom = nom;
        this.prenom = prenom;
        this.addrese = addrese;
        this.cp = cp;
        this.ville = ville;
    }

    @Override
    public String toString() {
        return "Client{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", addrese='" + addrese + '\'' +
                ", cp=" + cp +
                ", ville='" + ville + '\'' +
                '}';
    }
}
