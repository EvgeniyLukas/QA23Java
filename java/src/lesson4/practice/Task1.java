package lesson4.practice;

import java.util.Scanner;

//Завдання 1:
// Користувач вводить з клавіатури два числа.
// Вкажіть усі числа у заданому діапазоні.
public class Task1 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("введите первое число");
    int first = sc.nextInt();
    System.out.println("введите второе число");
    int second = sc.nextInt();

    for (int i = first; i < second; i++){
      System.out.print(i + " ");
    }


  }
}
