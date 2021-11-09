package ConditionalsAndLogic;

import java.util.Random;
import java.util.Scanner;

public class Excersize7 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in); //Her laver jeg scanner objektet
    Random random = new Random(); //Her laver jeg random objektet
    System.out.println("Jeg har nu tænker på et heltal mellem 1-100"); // Fortæller at der er tænkt på et tal
    int tal2 = random.nextInt(100); //her fortæller jeg hvad tallet skal være 1-100
    int gæt;
    do {
      System.out.print("gæt på et tal: "); // siger til brugeren de kan gætte
      gæt = scanner.nextInt(); // Giver brugeren muliged for at gætte

      if (gæt == tal2) {//Hvis der er gættet rigtigt
        System.out.println("Du har gættet rigtigt!!");
      }
      if (gæt < tal2) { //Laver en if kommando, som siger hvis indtastede tal er større end det auto generede tal så skal den sige
        System.out.println("tallet er større end: " + gæt); // Dette
      }
      if (gæt > tal2) { // Ellers skal den sige at tallet er mindre end.
        System.out.println("tallet er mindre end: " + gæt);
      }
    } while(gæt != tal2);
  }
}

