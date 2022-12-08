package lesson5.practice;

import java.util.Scanner;

public class Task7Arrays {
//Завдання 7:
//Користувач вводить з клавіатури елементи списку цілих і деяке
//число. Підрахуйте, скільки разів це число зустрічається в масиві.
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Введите размер массива");
    int size = s.nextInt();
    int[] nums = new int[size];
    System.out.println("Введите какое-то число");
    int someNumber = s.nextInt();
    int count = 0;

    for (int i = 0; i < nums.length; i++) {
      System.out.println("Введите " + i + " элемент");
      nums[i] = s.nextInt();
      if(nums[i] == someNumber){
        count++;
      }
    }
    for (int i = 0; i < nums.length; i++) {
      System.out.println("nums = " + nums[i]);
    }

    System.out.println("someNumber = " + someNumber + " встречается " + count + " раз");
  }
}
