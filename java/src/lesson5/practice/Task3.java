package lesson5.practice;

//Завдання 3:
//Користувач вводить з клавіатури два числа. Вкажіть усі непарні
//числа у заданому діапазоні. Якщо межі діапазону вказані
//неправильно, потрібно провести нормалізацію меж. Наприклад,
//користувач ввів 20 і 11. Потрібно провести нормалізацію, після
//якої початок діапазону дорівнюватиме 11, а кінець
//дорівнюватиме 20.
public class Task3 {

  public static void main(String[] args) {

    int num1 = 60;//30
    int num2 = 30;//60

    System.out.println("num1 = " + num1);
    System.out.println("num2 = " + num2);

    //=== поменять местами переменные  ===
    if(num1 > num2){
      int temp = num1;//60
      num1 = num2;//30
      num2 = temp;//60
    }
    System.out.println("after");
    System.out.println("num1 = " + num1);
    System.out.println("num2 = " + num2);


    if (num1 > num2) {
      for (int i = num2; i < num1; i++) {
        if (i % 2 != 0) {
          System.out.print(i + "=");
        }
      }
    }else {
      for (int i = num1; i < num2; i++) {
        if (i % 2 != 0) {
          System.out.print(i + ":");
        }
      }
    }

    System.out.println();

//    int item = num1;
//    while (item < num2) {
//      if (item % 2 != 0) {
//        System.out.print(item + " ");
//      }
//      item++;
//    }

  }
}
