package lesson5.practice;

import java.util.Random;

//Завдання 8:
//В одновимірному масиві, заповненому випадковими числами,
//визначте мінімальний та максимальний елементи, підрахуйте
//кількість від'ємних та додатних елементів, підрахуйте кількість
//нулів. Результати виведіть на екран.
public class Task8Arrays {

  public static void main(String[] args) {
    Random random = new Random();
    int[] arr = new int[random.nextInt(5, 10)];

    int max = -10;
    int min = 10;

    for (int i = 0; i < arr.length; i++) {
      arr[i] = random.nextInt(-10, 10);
      System.out.print(arr[i] + " ");
      if(arr[i] > max){
        max = arr[i];
      }
      if(arr[i] < min){
        min = arr[i];
      }
    }
    System.out.println("\nmax = " + max);
    System.out.println("min = " + min);
  }
}
