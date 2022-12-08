package lesson6;

public class Hw7 {

  //Задание 7
//Пользователь вводит с клавиатуры два числа (начало и
//конец диапазона). Требуется проанализировать все числа
//в этом диапазоне. Вывод на экран должен проходить по
//правилам, указанным ниже.
// Если число кратно 3 (делится на 3 без остатка) нужно
//вывести слово «Fizz». Если число кратно 5 нужно вывести
//слово «Buzz». Если число кратно 3 и 5 нужно вывести
//«Fizz Buzz». Если число не кратно не 3 и 5 нужно вывести
//само число.
  public static void main(String[] args) {
    int num1 = 10, num2 = 30;
    for (int i = num1; i < num2; i++) {
      if (i % 3 == 0 && i % 5 == 0) {
        System.out.println(i + "FizzBuzz");
      }else if (i % 5 == 0) {
        System.out.println(i + "buzz");
      }else if (i % 3 == 0) {
        System.out.println(i + "fizz");
      } else {
        System.out.println(i);
      }
    }
  }
}
