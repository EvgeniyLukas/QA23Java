package lesson6.string;

public class Application {
  public static void main(String[] args) {
    //            01234
    String str = "Hello Jack, my jack name is Jack JACK jacK";

    System.out.println("length = " + str.length());
    System.out.print(str.charAt(0));
    System.out.print(str.charAt(1));
    System.out.print(str.charAt(2));
    System.out.print(str.charAt(3));
    System.out.print(str.charAt(4) + "\n");

    System.out.println(str);
    System.out.println(str.toLowerCase());
    System.out.println(str.toUpperCase());
    System.out.println("str = " + str);
    String str1 = str.toUpperCase();//методы в-ют новую строку
    //str = str.toUpperCase();//так можно изменить исходную строку
    System.out.println("str = " + str);
    System.out.println("str1 = " + str1);

    System.out.println(str.replace("Jack", "Max"));
    System.out.println(str.toLowerCase().replace("jack", "Max"));

    //пример вызова методов по цепочке
    byte[] bytes = str.toLowerCase().replace("jack", "max").trim().getBytes();

    String str2 = "    test space string      ";
    System.out.println(str2);
    System.out.println(str2.trim());//убирает пробелы в начале и конце


    String lorem = "Lorem ipsum dolor sit amet, consectetur adipisicing elit. "
        + "At consectetur consequatur culpa deserunt dolores dolorum, id iste natus necessitatibus."
        + " Nemo nesciunt nisi numquam optio recusandae "
        + "rem rerum sed sunt, voluptates.    ";

    //получение подстроки из строки
    System.out.println(lorem.substring(0, 58));
    System.out.println(lorem.substring(58, 146));
    System.out.println(lorem.substring(146).trim());












  }
}
