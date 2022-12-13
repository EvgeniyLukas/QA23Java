package lesson7;

import java.util.Arrays;
import java.util.Random;

//Задание 10
//Есть одномерный массив, заполненный случайными
//числами. На основании данных этого массива нужно:
//■■ Создать одномерный массив, содержащий только
//четные числа из первого массива;
public class Hw10 {

  public static void main(String[] args) {
    Random random = new Random();
    int[] arr = new int[random.nextInt(5, 10)];

    int evenCount = 0;
    for (int i = 0; i < arr.length; i++) {
      arr[i] = random.nextInt(-100, 100);
      System.out.print(arr[i] + " ");
      if(arr[i] % 2 == 0){
        evenCount++;
      }
    }

    int[]evens = new int[evenCount];
    System.out.println("events = " + evenCount);

    int k = 0;
    for (int i = 0; i < arr.length; i++) {
      if(arr[i] % 2 == 0){
        evens[k] = arr[i];
        k++;
      }
    }
    System.out.println(Arrays.toString(evens));
  }
}
