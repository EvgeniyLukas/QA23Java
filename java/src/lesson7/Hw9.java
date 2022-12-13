package lesson7;

import java.util.Arrays;
import java.util.Random;

public class Hw9 {

  public static void main(String[] args) {
//■■ Произведение элементов между минимальным и мак-
//симальным элементом;
    Random random = new Random();
    int[] arr = new int[random.nextInt(5, 10)];

    int max = -10;
    int min = 10;
    int maxIndex = 0;
    int minIndex = 0;

    for (int i = 0; i < arr.length; i++) {
      arr[i] = random.nextInt(-100, 100);
      System.out.print(arr[i] + " ");
      if(arr[i] > max){
        max = arr[i];
        maxIndex = i;
      }
      if(arr[i] < min){
        min = arr[i];
        minIndex = i;
      }
    }
    System.out.println("\nmaxIndex = " + maxIndex);
    System.out.println("minIndex = " + minIndex);

    System.out.println(Arrays.toString(arr));


    int mult = 1;
    int count = 0;

    if (minIndex > maxIndex){
      int tem = maxIndex;
      maxIndex = minIndex;
      minIndex = tem;
    }

    for (int i = minIndex + 1; i < maxIndex; i++) {
      mult = mult * arr[i];
      count++;
    }

    if(count != 0) {
      System.out.println("mult = " + mult);
    }else {
      System.out.println("нет элементов");
    }

    //■■ Сумму элементов, находящихся между первым и по-
    //следним положительными элементами.

    int firstPosIdx = -1;
    int lastPopsIdx = -1;


  }
}
