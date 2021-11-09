package DaysOfMonth;

import java.util.Scanner;

public class DaysOfMonth {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in); //Scanner objektet
    System.out.print("tast et tal mellem 1-12, som betyder hvilken måned: "); //Stiller spørgsmål til brugeren
    int numberOfMonth = scanner.nextInt(); //Beder om at taste nummer in
    switch (numberOfMonth){ //Her laver jeg switchen som fungerer lidt ligesom en if, bare med begrænsninger.
      case 4,6,9,11: //Når der står case og numre bagefter referer den til inputtet fra scanner
        System.out.print("Der er 30 dage i denne måned: "+numberOfMonth); //Her foræller den hvad den skal gøre efter, hvis en af de input er tastet ind
        break; //Husk break før en ny case
      case 2:
        System.out.println("Der er 28 dage i denne måned: "+numberOfMonth);
        break;
      default: //default er ligesom kommandoen else
        System.out.println("Der er 31 dage i denne måned: "+numberOfMonth);
    }
  }
}

