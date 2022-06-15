package tp03.exo1;

public class Individu {

    String nom;
    String prenom;

    public Individu(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Individu{");
        sb.append("nom='").append(nom).append('\'');
        sb.append(", prenom='").append(prenom).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
