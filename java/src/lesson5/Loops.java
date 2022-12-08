package lesson5;

import java.util.Scanner;

public class Loops {

  public static void main(String[] args) {
//    int item = 0;
//    for (; ; ) {
//      if (item < 10) {
//        System.out.println("hello");
//        item++;
//      } else {
//        break;
//      }
//    }

    //=== while ===
    Scanner sc = new Scanner(System.in);
    System.out.println("проверь сколько раз ты отжмешься");
    System.out.println("Ты устал?");

//    while(sc.next().equals(answer)){
//      System.out.println("Отжимание");
//      System.out.println("Ты устал?");
//    }
    //System.out.println("Программа завершена");

    while (true) {
      String answer = sc.next();
      if (answer.equals("нет")) {
        System.out.println("Отжимание");
      } else if (answer.equals("да")) {
        break;
      } else {
        System.out.println("Давай отжимайся");
      }
      System.out.println("Ты устал?");
    }
    System.out.println("Программа завершена");

    //=== do while ===
    int num = 5;
    do {
      System.out.print(num + " do ");
      num++;
    } while (num < 3);

    System.out.println("num = " + num);
  }
}
