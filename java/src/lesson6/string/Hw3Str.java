package lesson6.string;

//Задание 3
//Подсчитать среднюю длину слова, во введенном с
//клавиатуры предложении.
public class Hw3Str {

  public static void main(String[] args) {
    String str = "Подсчитать среднюю длину слова, во введенном с клавиатуры предложении.";

    //разделяет строку на массив строк, нужно указать разделительный знак для слов
    String[]strings = str.split("[ ,.]");

    for (int i = 0; i < strings.length; i++) {
      System.out.println(strings[i]);
      //создать переменную для подсчета суммы
      //создать переменную для подсчета кол-ва слов
      //длина слова должна быть > 0

    }
  }
}
