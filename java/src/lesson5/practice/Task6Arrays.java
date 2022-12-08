package lesson5.practice;

import java.util.Scanner;

public class Task6Arrays {
//Завдання 6:
//Користувач вводить з клавіатури елементи одновимірного
//масиву. Обчисліть суму елементів масиву та їх середнє
//арифметичне. Виведіть на екран всі елементи масиву.
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Введите размер массива");
    int size = s.nextInt();
    int[] nums = new int[size];
    int sum = 0;

    for (int i = 0; i < nums.length; i++) {
      System.out.println("Введите " + i + " элемент");
      nums[i] = s.nextInt();
      sum = sum + nums[i];//sum += nums[i]
    }

    for (int i = 0; i < nums.length; i++) {
      System.out.println("nums = " + nums[i]);
    }

    System.out.println("sum = " + sum);
    System.out.println("avg = " + sum/ nums.length);



  }
}
