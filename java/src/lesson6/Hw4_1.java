package lesson6;

import java.util.Scanner;

//Задание 4
//Пользователь вводит с клавиатуры два числа. Нужно
//посчитать сумму чисел в указанном диапазоне, а также
//среднеарифметическое.

public class Hw4_1 {
  static int sum;//инициализируется по умолчанию для чисел это 0

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter first num");
    int first = scanner.nextInt();
    System.out.println("Enter second num");
    int second = scanner.nextInt();
    //int sum = 0;
    int count1 = second - first;
    int count2 = 0;

    for (int i = first; i <= second; i++) {
      sum = sum + i;
      count2++;
    }

    System.out.println("sum = " + sum);
    System.out.println("count1 = " + count1);
    System.out.println("count2 = " + count2);
    System.out.println("avg = " + (double)sum/count1);
  }

  {//область инициализации
    sum = 10 * 2;
  }
}
