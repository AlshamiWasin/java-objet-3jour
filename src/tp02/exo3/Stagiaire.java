package tp02.exo3;

public class Stagiaire extends Personnne{

    String dateNaissance;
    String addresse;
    String codePostal;
    String ville;

    public Stagiaire(String nom, String prenom, String telephone, String dateNaissance, String addresse, String codePostal, String ville) {
        super(nom, prenom, telephone);
        this.dateNaissance = dateNaissance;
        this.addresse = addresse;
        this.codePostal = codePostal;
        this.ville = ville;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Stagiaire{");
        sb.append("dateNaissance='").append(dateNaissance).append('\'');
        sb.append(", addresse='").append(addresse).append('\'');
        sb.append(", codePostal='").append(codePostal).append('\'');
        sb.append(", ville='").append(ville).append('\'');
        sb.append(", nom='").append(nom).append('\'');
        sb.append(", prenom='").append(prenom).append('\'');
        sb.append(", telephone='").append(telephone).append('\'');
        sb.append('}');
        return sb.toString();
    }

}
