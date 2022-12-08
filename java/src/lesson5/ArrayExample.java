package lesson5;

import java.util.Scanner;

public class ArrayExample {

  public static void main(String[] args) {

    String[] strArray = {"first", "second", "third", "test1", "test2", "test3", "test4", "test5"};
    System.out.println("длина массива = " + strArray.length);

    for (int i = 0; i < strArray.length; i++) {
      System.out.print(strArray[i] + " ");
    }

    System.out.println();

    for (int i = 0; i < strArray.length; i++) {
      if (strArray[i].startsWith("t")) {
        System.out.println(strArray[i]);
      }
    }

    //=== каждое второе слово заменить на hello ===
    for (int i = 0; i < strArray.length; i++) {
      if (i % 2 != 0) {
        strArray[i] = "hello";
      }
      System.out.print(strArray[i] + " ");
    }

    System.out.println();

    //=== заполнение массива через цикл ===
    Scanner s = new Scanner(System.in);
    System.out.println("Введите размер массива");
    int size = s.nextInt();

    String[] cars = new String[size];//массив заполнен значениями null

    for (int i = 0; i < cars.length; i++) {
      System.out.println("Введите " + i + " элемент");
      cars[i] = s.next();
    }

    for (int i = 0; i < cars.length; i++) {
      System.out.println("cars = " + cars[i]);
    }

  }
}
