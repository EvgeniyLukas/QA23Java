package lesson4;

import java.util.Scanner;

public class Hw {


  public static void main(String[] args) {

    System.out.println(Math.PI);

    int age = 18;
    int height = 180;
    String myDogsFriendName = "Fuffy";
    System.out.println(myDogsFriendName);

    //округление
    double num = 2.49;
    int num1 = (int)(num + 0.5);//2.49 + 0.5 = 2  потеря данных
    System.out.println("num1 = " + num1);


    //Задание 7
    //Пользователь вводит с клавиатуры букву. Программа
    //должна определить, в какой раскладке введена буква – в ла-
    //тинской или кирилице. Вывести в консоль: «латиница», если
    //буква введена латиницей или «кирилица», если буква отно-
    //сится к кирилическому алфавиту. Если введена цифра, а не
    //буква, вывести «цифра». Если символ не относится ни к бук-
    //вам, ни к цифрам, вывести «невозможно определить».

    Scanner sc = new Scanner(System.in);
    System.out.println("Введите букву");
    String liter = sc.next();
    char ch = liter.charAt(0);//получаем букву, 0 - индекс первого символа
    System.out.println(ch);

    if (ch >= 65 && ch <= 'Z' || ch >= 'a' && ch <= 'z'){
      System.out.println("Это латинская буква");
    }

    System.out.println("Собачка = " + (char)64);
    System.out.println("символ = " + (char)105);

    System.out.println((int) 'А');
    System.out.println((int) 'Я');
    System.out.println((int) 'Я');
    System.out.println((int) 'Ї');
    System.out.println((int) '嘿');
  }
}
