package Lesson2;

import java.util.Scanner;

public class InputData {
    public static void main(String[] args) {
        System.out.println("Привет! Как тебя зовут?");
        //Объект сканер позволяет считывать данные с консоли
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();//nextLine() позволяет вводить строки с пробелами
        System.out.println("Мое имя = " + name);

        System.out.println("Сколько ты весишь?");
        int weight = scanner.nextInt();
        System.out.println("Мой вес = " + weight * 10);

        System.out.println("Цена за арбуз?");
        double waterMellow = scanner.nextDouble();
        System.out.println("Цена = " + waterMellow);

        System.out.println("курите??");
        boolean smoke = scanner.nextBoolean();
        System.out.println("Куриене = " + smoke);

        System.out.println("Введите строку");
        String str = scanner.next();//принимает данные до первого пробела
        System.out.println("str = " + str);
        System.out.println("next value = " + scanner.nextInt());
        System.out.println("next value = " + scanner.next());
    }
}
