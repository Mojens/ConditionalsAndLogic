package OpgaveCardValueGuess;

import java.util.Random;
import java.util.Scanner;

public class CardValueGuess {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Random rand = new Random(); // Her laver vi random objektet ligesom i scanner
    int color = rand.nextInt(4) + 1; //Det samme her som for neden
    int number = rand.nextInt(13) + 1; //uden +1 så står der 0-12, med +1 står der 1-13

    // Denne kode forneden vider på forhånd hvad de random tal er, så kan jeg nemlig teste hvad systemet reagerer når
    // jeg skriver color eller number forkert

    //Her angiver jeg værdierne som false fra starten indtil andet er blevet angivet
    boolean correctNumber = false; // Samme sker her (det gir mening længere ned i koden)
    System.out.println("Gæt farven i tal");
    System.out.println("Klør = 1, Hjerter = 2, Spar = 3, Ruder = 4");
    System.out.print("Førsøg 1 af 2: "); //Her stiller vi første spørgsmål som brugeren kan svare på
    int guess = -1; //Her stiller vi guess = 1 for at give den en int værdi som den kan tage i betragtning længere
    // nede i koden
    if (scanner.hasNextInt()) { //Her laver vi en hasNextInt()==true, som sørger for at det brugeren indtaster er et heltal
      guess = scanner.nextInt(); //Her giver vi brugeren mulighed for at taste noget ind (heltal ellers fejler koden)
    }

    if (color == guess) { //Hvis color er == med gættet så skal den printe at farven er rigtigt
      System.out.println("Du gættede farven rigtigt i første forsøg, Du er NICE!\n");
    } else {//ellers skal den spørger brugeren om at prøve igen
      System.out.print("Du gættede forkert! Prøv igen\n"); //Her spørger den brugeren om at prøve igen
      if (color < guess) { //Her tilføjer jeg delen hvor hvis gættet er større eller mindre end tallet, så skal den give et hint
        System.out.println("Du skal gætte lavere");
      } else {
        System.out.println("Du skal gætte højere");
      }
      System.out.print("Forsøg 2 af 2: "); //Den fortæller det er brugerens sidste gæt.

      if (scanner.hasNextInt()) { //Her laver vi en hasNextInt()==true, som sørger for at det brugeren indtaster er et heltal
        guess = scanner.nextInt(); //Her giver vi brugeren mulighed for at taste noget ind (heltal ellers fejler koden)
      }
      if (color == guess) { //Her er det præcis samme måde som for oven, hvor sætter correctColor til true, hvis nu de fik
        System.out.println("Du gættede farven rigtigt!\n"); // det rigtigt i anden forsøg
      } else { //Ellers hvis man også svarede forkert anden gang vil den printe det forneden
        System.out.println("Du gættede forkert igen!");
        System.out.println("Så nu lukker jeg spillet ned :(");
        System.exit(1); //Her siger jeg hvis brugeren har gættet forkert 2 gange med farven så stopper spillet
      }
    }
    System.out.println("Her skal du gætte værdien mellem 1-13");
    System.out.println("es = 2, Knægt = 11, Dronning = 12, Konge = 13, resten er almindelige tal");
    System.out.print("Forsøg 1 af 3: "); //her er det præcis på samme procedure som foroven,
    // bare med værdi(Number) istedet for farve
    if (scanner.hasNextInt()) {
      guess = scanner.nextInt();
      if (number == guess) {
        System.out.println("Du gættede kortet i første forsøg, du er for COOL!");
        correctNumber = true;
      } else {
        System.out.println("Du gættede forkert!");
        if (number < guess) { //Her tilføjer jeg delen hvor hvis gættet er større eller mindre end tallet, så skal den give et hint
          System.out.println("Du skal gætte lavere");
        } else {
          System.out.println("Du skal gætte højere");
        }
        System.out.print("Forsøg 2 af 3: ");
        if (scanner.hasNextInt()) {
          guess = scanner.nextInt();
          if (number == guess) {
            System.out.println("Tillykke, du har gættet kortet!");
            correctNumber = true;
          } else {
            System.out.println("Du gættede forkert.");
            if (number < guess) { //Her tilføjer jeg delen hvor hvis gættet er større eller mindre end tallet, så skal den give et hint
              System.out.println("Du skal gætte lavere");
            } else {
              System.out.println("Du skal gætte højere");
            }
            System.out.print("Forsøg 3 af 3: ");
            if (scanner.hasNextInt()) {
              guess = scanner.nextInt();
              if (number == guess) {
                System.out.println("Tillyke, du har gættet kortet");
                correctNumber = true;
              } else {
                System.out.println("Det var nederen! Bedre held næste gang!");
              }
            }
          }
        }
      }
    }
    if (correctNumber) {
      //Her har jeg så lavet en kommando
      // til sidst som har betingelserne hvis brugeren svarede rigtigt begge gange vil den printe det forneden
      System.out.println("\nTillykke du har gættet begge rigtigt, så du VANDT!");
    }
    if (color==1){
      System.out.print("Kortet var Klør "+number);
    }
    if (color==2){
      System.out.print("Kortet var Hjerte "+number);
    }
    if (color==3){
      System.out.print("Kortet var Spar "+number);
    }
    if (color==4){
      System.out.print("Kortet var Ruder "+number);
    }
  }
}
