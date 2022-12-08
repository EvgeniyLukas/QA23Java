package lesson3.practice;


import java.util.Scanner;

//Завдання 1: Користувач вводить з клавіатури число.
// Перевірте його на парність і непарність.
// Якщо число парне, виведіть на екран число з написом «Even number».
// Якщо число непарне, виведіть на екран число з написом «Odd number».
public class Task1 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Введите число");

    if(sc.hasNextInt()) {
      int num = sc.nextInt();
      if (num % 2 == 0) {
        System.out.println("«Even number»");
      } else {
        System.out.println("«Odd number»");
      }
    }else {
      System.out.println("Нужно вводить целое число");
    }
  }
}
