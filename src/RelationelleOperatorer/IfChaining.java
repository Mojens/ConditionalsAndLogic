package RelationelleOperatorer;

import java.util.Scanner;

public class IfChaining {
  public static boolean getBoolean(String msg) {//Her er metoden til at brugeren skal kunne taste noget ind i boolean samt
    //printe noget tekst
    Scanner in = new Scanner(System.in);//laver scanner objektet
    System.out.print(msg + ": ");
    return in.nextBoolean();//returner som mulighed for brugeren at kunne taste noget ind
  }

  public static void main(String[] args) {
    boolean klog = false; //declare variable to false indtil andet er sagt/gjort
    boolean sjov;
    boolean blond = false;

    klog = getBoolean("er du klog? "); //Her refferer jeg til metoden så folk kan taste noget ind og stille
    sjov = getBoolean("er du sjov? "); //Et spørgsmål. Her jeg skriver endelig bare spørgsmålet
    blond = getBoolean("er du blond? ");
    if (klog == true && sjov == true && blond == true) {// && = og, || = eller
      System.out.println("Her kommer en ultimativ lykønsking!!");
    } else if ((klog == true && sjov == true) || (klog == true && blond == true) || (sjov == true && blond == true)) {
      System.out.println("Her kommer en større lykønsking!!");
    } else if (klog == true || blond == true || sjov == true) {
      System.out.println("Her kommer en lykønsking!!");
    } else //else i dette tilfælde er hvis du siger false til alle 3 spørgsmål
      System.out.println("Du kraftedme ingen af delene");
  }

}


