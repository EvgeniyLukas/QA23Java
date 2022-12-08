package lesson4.practice;

import java.util.Scanner;

//Завдання 2:
// Користувач вводить з клавіатури два числа.
// Вкажіть усі парні числа у заданому діапазоні.
public class Task2 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("введите первое число");
    int first = sc.nextInt();
    System.out.println("введите второе число");
    int second = sc.nextInt();

    if (first % 2 != 0) {
      for (int i = first + 1; i <= second; i = i + 2) {
        System.out.print(i + " ");
      }
    }else {
      for (int i = first; i <= second; i = i + 2) {
        System.out.print(i + " ");
      }
    }

//    for (int i = first; i <= second; i++) {
//      if (i % 2 == 0) {
//        System.out.print(i + " ");
//      }
//    }

  }

}
