package lesson3.practice;

//Задание 9
//Проверить, имеет ли число вещественную часть. Напри-
//мер, числа 3.14 и 2.5 – имеют вещественную часть, а числа 5.0
//и 10.0 – нет.
public class Task9 {
  public static void main(String[] args) {
    double num = 5.25;
    System.out.println("Если мы получили 0 значит вещественной части нет = " + (int)(num * 100 % 100));
  }
}
