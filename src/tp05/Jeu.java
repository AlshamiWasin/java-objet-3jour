package tp05;

import java.util.Scanner;

public class Jeu {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int generatedNumber = 1 + (int)(Math.random()*100);

        int tries = 0;

        int answer = 0;

        while (tries < 10){

            System.out.println("find the number between 1 and 10 in 10 or less tries");

            answer = scanner.nextInt();

            if (answer < 100 || answer >1){
                if ( answer == generatedNumber){{
                    System.out.println("you found the anwser");
                    break;
                }}

                if (answer < generatedNumber){
                    System.out.println("the generated number is higher");
                }else {
                    System.out.println("the generated number is lower");
                }
                tries++;

                System.out.println("you have " + (10 - tries)  + " tries left");
            }else {
                System.out.println("you have to choice an answer between 1 and 100");
            }
        }

        if (tries == 10){
            System.out.println("the answer was :" + generatedNumber);
        }


    }

}
