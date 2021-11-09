package RelationelleOperatorer;

import java.util.Scanner;

public class IfOgRelOper {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Indtast værdi af a: ");
    double a = scanner.nextDouble();
    System.out.print("Indtast værdi af b: ");
    double b = scanner.nextDouble();
    //System.out.println(Math.max(a,b));
    printLargest(a, b);
  }

  public static double printLargest(double a, double b) {
    if (a > b) {
      System.out.println(a);
    } else if (a < b) {
      System.out.println(b);
    } else if (a == b) {
      System.out.println(a + ", " + b);
    }
    return Math.max(a, b);
  }
}
