package RelationelleOperatorer;

import java.util.Scanner;

public class IfNesting {
  public static boolean getBoolean(String msg) {//Her er metoden til at brugeren skal kunne taste noget ind i boolean samt
    //printe noget tekst
    Scanner in = new Scanner(System.in);//laver scanner objektet
    System.out.print(msg + ": ");
    return in.nextBoolean();//returner som mulighed for brugeren at kunne taste noget ind
  }

  public static void main(String[] args) {

    boolean klog = false; //declare variable to false indtil andet er sagt/gjort
    boolean sjov = false;
    boolean blond = false;

    System.out.println("Lad os lege TRUE eller FALSE.\n");
    System.out.println("Du skal skrive true eller false til hver udtalelse.");
    System.out.println("Hvor true = ja og false = nej.\n\n");

    klog = getBoolean("er du klog? "); //Her refferer jeg til metoden så folk kan taste noget ind og stille
    sjov = getBoolean("er du sjov? "); //Et spørgsmål. Her jeg skriver endelig bare spørgsmålet
    blond = getBoolean("er du blond? ");
    System.out.println("\nSå tjekker vi lige en gang...\n\n");
    if (klog) { //Hvis variablen bare står der uden nogle == så betyder det f.eks. klog==true
      System.out.println("De klogeste er de mest intelligente!");
      if (sjov) {
        System.out.println("De sjoveste er de morsomste!");
        if (blond) {
          System.out.println("De blonde er de smukkeste!");
        }
      }
    } else {
      System.out.println("Hvis du ikke er klog, er de andre ting ligegyldige!");
    }

  }
}

