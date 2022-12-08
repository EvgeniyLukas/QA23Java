import java.util.Scanner;

public class Hw {

  public static void main(String[] args) {
    Scanner t = new Scanner(System.in);
    System.out.println("Введите номер билета");
    int number = t.nextInt();

    int step = 1;
    int count = 0;
    int sum = 0;
    while (number != 0) {
      sum += step * (number % 10);
      number /= 10;
      if (++count == 3) {
        step = -step;
      }
      if (count == 6 && sum == 0) {
        System.out.println("Счастливый билет;");
      } else if (count != 6) {
        System.out.println("Неверный ввод;");
      } else {
        System.out.println("билет не счастливый;");
      }
    }
  }
}

