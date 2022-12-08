package lesson4;

public class Ternar {

  public static void main(String[] args) {
    int num = 25;

    if (num < 30) {
      System.out.println("little");
    } else {
      System.out.println("bigger");
      if (num > 50) {
        System.out.println("very big");
      }
    }


    //=== тернарный оператор ===
    System.out.println("tern = " + (num < 30 ? "little" : num > 50 ? "very big" : "bigger"));

  }
}
