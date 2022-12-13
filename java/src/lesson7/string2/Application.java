package lesson7.string2;

import java.util.Arrays;

public class Application {

  public static void main(String[] args) {

    String lorem = "Lorem ipsu3m dolor sit ametnemo, cons1ecnemotetur adipisicing elit.\n"
        + "At consectetur conse2quatur culpa dese56runt dolores dolorum,\n"
        + "id iste natus necessi8tatibus nemo nesciunt nisi\n"
        + "numquam optio recusandae0 rem rerum sed sunt, nemovoluptates1.nemo         nemo";

    //получить цифры способ1
    for (int i = 0; i < lorem.length(); i++) {
      if (lorem.charAt(i) >= '0' && lorem.charAt(i) <= '9') {
        System.out.print(lorem.charAt(i) + " ");
      }
    }
    System.out.println();
    //получить цифры способ 2
    char[] chars = lorem.toCharArray();//получить массив символов
    for (int i = 0; i < chars.length; i++) {
      if (chars[i] >= '0' && chars[i] <= '9') {
        System.out.print(chars[i] + ".");
      }
    }
    System.out.println();

    //=== getBytes ===
    String str = "Привет";
    byte[] bytes = str.getBytes();
    System.out.println(Arrays.toString(bytes));
    System.out.println(new String(bytes));

    //=== String pool ===
    String str1 = "Привет";
    String str2 = new String("Привет");
    System.out.println(str == str1);
    System.out.println(str == str2);// == сравнивает ссылки на область памяти
    System.out.println(str.equals(str2));


    //найти сколько раз встречается слово
    int index = 0;
//    System.out.println(index = lorem.indexOf("nemo", index + 1));
//    System.out.println(index = lorem.indexOf("nemo", index + 1));
//    System.out.println(index = lorem.indexOf("nemo", index + 1));
//    System.out.println(index = lorem.indexOf("nemo", index + 1));

    while (index != -1) {
      System.out.println(index = lorem.indexOf("nemo", index + 1));
    }



    //выход за диапазон значений...
    //System.out.println((byte)257);
    // |-------0-------||-------0-------|

  }
}
