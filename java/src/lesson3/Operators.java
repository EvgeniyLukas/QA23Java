package lesson3;

import java.util.Scanner;

public class Operators {

  public static void main(String[] args) {
    //=== условные и логические операторы ===
    System.out.println(10 > 20);
    System.out.println(10 < 20);
    System.out.println(10 <= 20);
    System.out.println(10 >= 20);
    System.out.println(10 == 20);
    System.out.println(10 != 20);

    //=== оператор ветвления if else ===
    int num1 = 10, num2 = 20;

    if (num1 < num2) {
      System.out.println("Yes num1 < num2");
    }

    if (num1 > num2) {
      System.out.println("Yes num1 > num2");
    }

    Scanner sc = new Scanner(System.in);
    String color = "red";
    System.out.println("Программа загадала один из 3х цветов (red green blue)");
    String answer = sc.nextLine();

    // оператор ИЛИ  ||
    if (answer.equals("red") || answer.equals("green") || answer.equals("blue")) {
      if (answer.equals(color)) { //в строках == не используют, нужно equals()
        System.out.println("Ты угадал это = " + color);
      } else {
        System.out.println("Ты не угадал");
      }
    } else {
      System.out.println("Не тот цвет, должен быть (red green blue) ");
    }

    //оператор И && // оператор НЕ ! меняет условие наоборот

    double salary = 0;

    if(salary < 0){
      System.out.println("Значение должно быть больше 0");
    }else {
      if(salary >= 500 && salary <= 1500){
        System.out.println("Вы JUNIOR");
      }else if(salary > 1500 && salary < 2500){
        System.out.println("Вы MIDDLE");
      } else if (salary > 2500 && salary < 5000) {
        System.out.println("Вы SENIOR");
      }else {
        System.out.println("Ваша зарплата не в диапазоне");
      }
    }
  }
}
