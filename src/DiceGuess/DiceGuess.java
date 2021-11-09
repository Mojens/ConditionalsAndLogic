package DiceGuess;

import java.util.Random;
import java.util.Scanner;

public class DiceGuess {
  public static void main(String[] args) {
    int dice = diceRoll(); //Her laver jeg en integer der henviser til diceroll så den laver en random tal mellem 1-6
    boolean guessTrue = guessTrue(); // laver en boolean som henviser til metoden hvor bruger indtaster true eller false
    System.out.print("the dice rolled a " + dice + " and "); //Her printer jeg hvor mange øjne der på terningen som er slået

    if (guessTrue && (dice == 2 || dice == 4 || dice == 6)) {
      System.out.println("so you was right!"); //den printer dette ud hvis du har sagt true og terningen har slået 2,4 eller 6
    }
    if (guessTrue && (dice == 1 || dice == 3 || dice == 5)) {
      System.out.println("so you was wrong!"); //den printer dette ud hvis du har sagt true og terningen har slået 1,3 eller 5
    }
    if (!guessTrue && (dice == 1 || dice == 3 || dice == 5)) {
      System.out.println("so you was right!");//den printer dette ud hvis du har sagt false og terningen har slået 1,3 eller 5
    }
    if (!guessTrue && (dice == 2 || dice == 4 || dice == 6)) {
      System.out.println("so you was wrong!");//den printer dette ud hvis du har sagt false og terningen har slået 2,4 eller 6
    }

  }

  public static int diceRoll() { //Her laver jeg random metoden som skal return tallen fra kastet
    Random random = new Random(); //Her laver jeg random objektet
    return random.nextInt(6) + 1;//Her siger jeg den skal returne et tal mellem 1-6
  }

  public static boolean guessTrue() { //Her laver jeg en metode til input og hvor den fortæller hvad brugeren har indtastet
    Scanner scanner = new Scanner(System.in); //Her laver jeg scanner objektet
    System.out.println("Welcome the the Guess game");
    System.out.println("There is a virtual dice which rolls between 1-6");
    System.out.print("You have to guess if the number is odd(false) or even(true): "); //Her stiller jeg spørgsmålet
    if (scanner.hasNextBoolean()) { //Den bliver ved med at spørger indtil der er kommet en boolean ind som svar (true eller false)
      boolean inputGuess = scanner.nextBoolean(); //Her laver jeg boolean der hedder inputGuess som gør brugeren kan indtaste true eller false
      if (inputGuess) { //Hvis den er true
        System.out.println("you guessed even"); //Skal den skrive at du har "gættet lige"
        return true;
      } else
        System.out.println("you guessed odd"); //Skal den skrive du har "gættet ulige"
      return false;
    }
    return guessTrue();
  }
}





