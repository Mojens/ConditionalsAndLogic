package Switch;

import java.util.Scanner;

public class Switch {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    String playerInput = input.nextLine();
    boolean checkAnswer=false;
    do {
      if (playerInput.equalsIgnoreCase("go north") || playerInput.equalsIgnoreCase("north")) {
        System.out.println("you are going north");
        checkAnswer = true;

        if (playerInput.equalsIgnoreCase("go south") || playerInput.equalsIgnoreCase("south")) {
          System.out.println("you are going south");
          checkAnswer = true;
        } else {
          System.out.println("wrong answer");
          playerInput = input.nextLine();
          checkAnswer = false;
        }
      }
    }while(!checkAnswer);

   /*do {
      switch (playerInput) {
        case "go north", "north", "n":
          System.out.println("going north");
          checkAnswer = true;
          break;
        case "go south", "south", "s":
          System.out.println("going south");
          checkAnswer = true;
          break;
        default:
          System.out.println("wrong answer, it has to be south or north");
          playerInput = input.nextLine();
          checkAnswer = false;
      }
    } while (!checkAnswer);
  }

    */
  }
}

