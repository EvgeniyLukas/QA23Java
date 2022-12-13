package lesson7.practice;


import java.util.Scanner;

//Задание 2
// Пользователь вводит с клавиатуры
// строку и слово для поиска.
// Посчитайте сколько раз в строке
// встречается искомое слово.
// Полученное число выведите на экран.
public class Task2 {
  public static void main(String[] args) {
    String lorem = "Lorem ipsu3m dolor sit ametnemoJAva, cons1ecnemotetur pythonadipisicing elit.\n"
        + "At consectetur conse2quatur culpa dese56runt dolores dolorum,\n"
        + "id iste natuspython necc#essi8tatibus nemo nesciunjavat nisi\n"
        + "numquam optio rerubycusandae0 rem rerum pythonsed sunt, nemovoluptates1.nemo Java";

    System.out.println(lorem);

    Scanner sc = new Scanner(System.in);
    System.out.println("Введите слово для поиска");
    String str = sc.nextLine();

    int index = 0;
    int count = 0;
    index = lorem.toLowerCase().indexOf(str.toLowerCase());
    while (index != -1) {
      index = lorem.toLowerCase().indexOf(str.toLowerCase(), index + 1);
      count++;
    }
    System.out.println("count = " + count);


    //======= для дз =======
    System.out.println(Character.toUpperCase('a'));
    System.out.println(Character.isUpperCase('A'));
    System.out.println(Character.isDigit('7'));
    System.out.println(Character.isAlphabetic('G'));
  }
}
