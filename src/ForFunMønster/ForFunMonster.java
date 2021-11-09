package ForFunMønster;

public class ForFunMonster {
  public static void main(String[] args) {
    for (int kolonne = 1; kolonne <= 10; kolonne++) {
      for (int linje = 1; linje <= kolonne; linje++) {

        System.out.print("*");
      }
      System.out.println();
    }
  }
}


