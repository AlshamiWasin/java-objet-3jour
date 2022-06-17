package Architecture_modulaire_en_Java.exo2;

import Architecture_modulaire_en_Java.exo1.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestVoiture {

    static Scanner scanner = new Scanner(System.in);
    static List<Voiture> listVoiture = new ArrayList<>();

    static boolean exit = false;

    public static void main(String[] args) {

        do {
            menu();

            int answer = scanner.nextInt();

            switch (answer) {
                case 1 :
                    ajouterVoiture();
                    break;
                case 2:
                    listerVoitures();
                    break;
                case 3:
                    listerVoitures();
                    System.out.println("write the car numer to modify it ");
                    modifierVoiture(scanner.nextInt());
                    break;
                case 4 :
                    listerVoitures();
                    supprimerVoiture(scanner.nextInt());
                    break;
                case 5 :
                    listerVoitures();
                    System.out.println("write the car numer to modify it ");
                    modifierVoiture(scanner.nextInt());
                    break;
                case 8 :
                    System.out.println("good bye");
                    exit = true;
                    break;
                default :
                    System.err.println("number inconnue");
                    break;
            }



        }while (exit == false);



    }

    public static void menu() {
        System.out.println("********************");
        System.out.println("1-Ajouter une voiture");
        System.out.println("2-Lister les voitures");
        System.out.println("3-Modifier une voiture");
        System.out.println("4-Supprimer une voiture");
        System.out.println("5-Ajouter un propriétaire à une voiture");
        System.out.println("8-Quitter l'application");
        System.out.println("********************");

    }

    public static void ajouterProprietaire(int voiture_numero ){
        Voiture chosenvoiture = null;

        for (Voiture voiture : listVoiture) {
            if (voiture.num_serie == voiture_numero){
                chosenvoiture= voiture;
            }
        }

        if (chosenvoiture == null){
            System.out.println("voiture non trouver");
        }else {
            chosenvoiture = listVoiture.get(listVoiture.indexOf(chosenvoiture));

            System.out.println("Entrez la nom");
            String nom = scanner.next();
            System.out.println("Entrez la prenom");
            String prenom = scanner.next();

            Individu individu = new Individu(nom,prenom);

            chosenvoiture.setProprietaire(individu);
        }
    }

    public static void ajouterVoiture(){
        System.out.println("Entrez la numer de serie");
        int num_serie = scanner.nextInt();
        System.out.println("Entrez la immatriculation");
        int immatriculation = scanner.nextInt();
        System.out.println("Entrez la marque");
        String marque = scanner.next();
        System.out.println("Entrez la couleur");
        String couleur = scanner.next();
        System.out.println("Entrez la annee");
        String annee = scanner.next();
        Voiture voiture = new Voiture(num_serie,immatriculation,marque,couleur,annee);
        listVoiture.add(voiture);
    }

    public static void listerVoitures(){

        if(listVoiture.isEmpty()){
            System.out.println("there are no cars");
        }else {
            for (Voiture voiture : listVoiture) {
                System.out.println(voiture.getNum_serie());
                System.out.println(voiture.toString());

            }
        }
    }

    public static void modifierVoiture(int voiture_numero ){

        Voiture chosenvoiture = null;

        for (Voiture voiture : listVoiture) {
            if (voiture.num_serie == voiture_numero){
                chosenvoiture= voiture;
            }
        }

        if (chosenvoiture == null){
            System.out.println("voiture non trouver");
        }else {
            chosenvoiture = listVoiture.get(listVoiture.indexOf(chosenvoiture));

        }

    }

    public static void supprimerVoiture(int voiture_numero ){

        Voiture chosenvoiture = null;

        for (Voiture voiture : listVoiture) {
            if (voiture.num_serie == voiture_numero){
                chosenvoiture= voiture;
            }
        }

        if (chosenvoiture == null){
            System.out.println("voiture non trouver");
        }else {
            chosenvoiture = listVoiture.get(listVoiture.indexOf(chosenvoiture));
            listVoiture.remove(chosenvoiture);
        }

    }


}
