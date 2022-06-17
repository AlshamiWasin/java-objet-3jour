package Architecture_modulaire_en_Java.exo1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestForme {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        List<Object> listForme =new ArrayList<>();

        do {
            System.out.println("Quelle forme voulez-vous (triangle, carré, rectangle, cercle, losange) ?");

            String answer = scanner.next();

            switch (answer) {
                case "triangle" -> {
                    System.out.println("Entrez la base du triangle :");
                    double base = scanner.nextDouble();
                    System.out.println("Entrez la hauteur du triangle :");
                    double hauteur = scanner.nextDouble();
                    Triangle triangle = new Triangle(base, hauteur);
                    listForme.add(triangle);
                }
                case "carre" -> {
                    System.out.println("Quelle est la cote du carré ?");
                    double cote = scanner.nextDouble();
                    Carre carre = new Carre(cote);
                    listForme.add(carre);
                }
                case "rectangle" -> {
                    System.out.println("Quelle est la largeur du rectangle ?");
                    double largeur = scanner.nextDouble();
                    System.out.println("Quelle est la hauteur du rectangle ?");
                    double hauteurRect = scanner.nextDouble();
                    Rectangle rectangle = new Rectangle(largeur, hauteurRect);
                    listForme.add(rectangle);
                }
                case "losange" -> {
                    System.out.println("Quelle est la base du losange ?");
                    double baseLosange = scanner.nextDouble();
                    System.out.println("Quelle est la hauteur du losange ?");
                    double hauteurLosange = scanner.nextDouble();
                    Losange losange = new Losange(baseLosange, hauteurLosange);
                    listForme.add(losange);
                }
                case "cercle" -> {
                    System.out.println("Quelle est la rayon du cercle ?");
                    double rayon = scanner.nextDouble();
                    Cercle cercle = new Cercle(rayon);
                    listForme.add(cercle);
                }
                default -> {
                    System.err.println("Forme inconnue");
                    continue;
                }
            }
            System.out.println("Une autre forme (oui/non) ?");

            if (scanner.next().equals("non")) {
                break;
            }

        }while (true);

        for (Object o : listForme) {
            System.out.println(o.toString());
        }

    }
}
