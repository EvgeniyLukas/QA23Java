package lesson3.practice;

import java.util.Scanner;

//Завдання 3:
//Користувач вводить з клавіатури три числа. Залежно від вибору
//користувача, програма виводить на екран максимум із трьох,
//мінімум із трьох або середнє арифметичне трьох чисел.
public class Task3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Выберете операцию MAX, MIN или AVG");
    String choice = sc.nextLine();
    System.out.println("Введите 3 числа");
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();
    int num3 = sc.nextInt();

    switch (choice) {
      case "max":
        if (num1 > num2 && num1 > num3) {
          System.out.println(num1 + " is biggest");
        } else if (num2 > num1 && num2 > num3) {
          System.out.println(num2 + " is biggest");
        } else if (num3 > num1 && num3 > num2) {
          System.out.println(num3 + " is biggest");
        } else {
          System.out.println("Нет наибольшего числа");
        }
        break;
      case "min":
        System.out.println(Math.min(Math.min(num1, num2), Math.min(num2, num3)));
        break;
      case "avg":
        System.out.println((num1 + num2 + num3) / 3);
        break;
    }
  }
}
