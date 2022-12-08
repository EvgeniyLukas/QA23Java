package lesson6;

public class Hw1 {
//Задание 1
//Числа Фибоначчи – это последовательность чисел, в ко-
//торой два первых числа последовательности равны 0 и 1, а
//каждое последующее число равно сумме двух предыдущих.
//Показать на экране все числа Фибоначчи в диапазоне от
//0 до 10 000 000.

  public static void main(String[] args) {
    int fib = 0;
    int num1 = 0;
    int num2 = 1;

    System.out.print(num1 +" ");
    System.out.print(num2 + " ");
    while (fib < 1000) {
      fib = num1 + num2;
      num1 = num2;
      num2 = fib;
      System.out.print(fib + " ");
    }
  }
}
