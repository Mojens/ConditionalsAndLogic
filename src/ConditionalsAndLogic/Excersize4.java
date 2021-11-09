package ConditionalsAndLogic;

import java.util.Scanner;

public class Excersize4 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Fermat's Last Theorem says that there are no " +
        "integers a, b,n and c such that a^n + b^n = c^n, except when n <= 2.");
    System.out.print("Indtast værdi af a: ");
    int a = scanner.nextInt();
    System.out.print("Indtast værdi af b: ");
    int b = scanner.nextInt();
    System.out.print("Indtast værdi af c: ");
    int c = scanner.nextInt();
    System.out.print("Indtast værdi af n: ");
    int n = scanner.nextInt();
    checkFermat(a,b,c,n);
  }
  public static void checkFermat(int a, int b, int c, int n){
    if (n<=2){
      System.out.println((int)Math.pow(a, n)+(int)Math.pow(b, n)!=(int)Math.pow(c, n));
      System.out.println("No, that doesn't work");
    }
    else if (n>=2){
      System.out.println((int)Math.pow(a, n)+(int)Math.pow(b, n)==(int)Math.pow(c, n));
      System.out.println("Holy smokes, Fermat was wrong!");
    }
  }
}

