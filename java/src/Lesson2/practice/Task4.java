package Lesson2.practice;

import java.util.Scanner;

//Завдання 4: ЗАВДАННЯ Користувач вводить
// з клавіатури два числа.
// Перше число значення, друге число — відсоток,
// який необхідно — це обчислити.
// Наприклад, ми ввели з клавіатури 50 та 10.
// Потрібно вивести на екран 10% від 50. Результат: 5
public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        int num1 = sc.nextInt();
        System.out.println("Введите число чтоб узнать процент");
        int num2 = sc.nextInt();
        System.out.println(Math.round((double)num1 / 100 * num2)+ "%");


        int x = 154;
        int des = x/100;
        System.out.println("des = " + des);



    }
}
