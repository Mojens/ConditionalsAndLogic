package ConditionalsAndLogic;

public class Excersize6 {
  public static void baffle(String blimp) {
    System.out.println(blimp);
    zippo("ping", -5);
  }
  public static void zippo(String quince, int flag) {
    if (flag < 0) {
      System.out.println(quince + " zoop"); // 3 / 4
    } else {
      System.out.println("ik");//(1) den starter her fordi -5<0
      baffle(quince);//2 fordi den står i else
      System.out.println("boo-wa-ha-ha"); // 3 / 4
    }
  }
  public static void main(String[] args) {
    zippo("rattle", 13);
  }
}

