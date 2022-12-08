package lesson6.practice;
//Задание 1
// Пользователь вводит с клавиатуры строку.
// Произведите поворот строк и
// полученный результат выведите на экран.
public class Task1 {

  public static void main(String[] args) {


    int[] arr = {1, 2, 3, 4, 5, 6};
    for (int i = arr.length - 1; i >= 0 ; i--) {
      System.out.print(arr[i] + " ");
    }

    String str = "Hello, how are you?";
    System.out.println("\n" + str.charAt(0));//charAt() - получает символ по индексу
    System.out.println(str.charAt(str.length()-1));//length - размер строки

    String str1 = "";
    for (int i = str.length() - 1; i >= 0 ; i--) {
      str1 = str1 + str.charAt(i);//вариант2
      System.out.print(str.charAt(i));//вариант1
    }
    System.out.println("\nstr = " + str);
    System.out.println("str1 = " + str1);
  }
}
