package lesson3;

import java.util.Scanner;

public class SwitchExample {

  public static void main(String[] args) {
    //Завдання 2:
    //Користувач вводить з клавіатури три числа. Залежно від вибору
    //користувача, програма виводить на екран суму трьох чисел або
    //добуток трьох чисел.

    Scanner sc = new Scanner(System.in);
    System.out.println("Выберете операцию + или *");
    String choice = sc.nextLine();
    System.out.println("Введите 3 числа");
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();
    int num3 = sc.nextInt();

    //решение через if-else
    if (choice.equals("+")){
      System.out.println(num1 + num2 + num3);
    } else if (choice.equals("*")) {
      System.out.println(num1 * num2 * num3);
    } else if (choice.equals("-")) {
      System.out.println(num1 - num2 - num3);
    } else {
      System.out.println("Нет такой операции");
    }

    //решение через switch
    switch (choice) {
      case "+" -> System.out.println(num1 + num2 + num3);
      case "*" -> System.out.println(num1 * num2 * num3);
      case "-" -> System.out.println(num1 - num2 - num3);
      default -> System.out.println("Нет такой операции");
    }
  }
}
