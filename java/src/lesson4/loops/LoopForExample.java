package lesson4.loops;

public class LoopForExample {

  public static void main(String[] args) {

    for (int i = 0; i < 5; i = i + 1) {
      System.out.println("шаг - " + (i + 1));
    }

    for (int i = 10; i < 100; i = i + 20) {
      System.out.println("проехали - " + i + " км");
    }

    // == инкремент++ и декремент-- ==
    int num = 3;
    System.out.println("num = " + (num = num + 1));
    System.out.println("num = " + num);

    int num1 = 7;
    System.out.println("num1 = " + num1++); // num1--
    System.out.println("num1 = " + num1);


    for (int i = 0, j = 0; i < 5 && j < 10; i++, j++) { // i = i + 1 и i++ в циклах работаю одинаково
      System.out.println("i = " + i);
      System.out.println("j = " + j);
    }

    System.out.println();

    //вывести числа от 1 - 10 в обратном порядке

    for (int i = 10; i > 0; i--){
      System.out.println("i = " + i);
    }
  }
}
