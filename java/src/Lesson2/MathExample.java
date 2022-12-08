package Lesson2;


import java.util.Random;

public class MathExample {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 52;

        System.out.println("сумма = " + (num1 + num2));
        System.out.println("разница = " + (num1 - num2));
        System.out.println("умножение = " + num1 * num2);
        System.out.println("Деление = " + (double) num1 / num2);

        //=== остаток от деления ===
        System.out.println("остаток 18 = " + 18 % 5);//15
        System.out.println("остаток 19 = " + 19 % 2);

        //=== Math ===
        double powRes = Math.pow(9, 3);
        System.out.println("res 2^3 = " + powRes);

        double sq = Math.sqrt(81);
        System.out.println("sq = " + sq);

        double sin = Math.sin(120);
        System.out.println("sin = " + sin);

        double cos = Math.cos(1);
        System.out.println("cos = " + cos);

        System.out.println("round = " + Math.round(5.5));
        System.out.println("ceil = " + Math.ceil(5.00000001));
        System.out.println("floor = " + Math.floor(5.9999999));
        System.out.println("(int) = " + (int)5.9999999);

        System.out.println("max = " + Math.max(15, 12));
        System.out.println("min = " + Math.min(15, 12));

        //пример использования методов в Java
        System.out.println(Math.pow(Math.max(Math.cbrt(120), Math.ceil(12.5)), Math.min(Math.floor(56.3), Math.round(5.5))));

        //=== random ===
        double r = Math.random();// 0 - 1
        System.out.println(r);
        System.out.println("random = " + (Math.round(r * 15) + 5));


        Random random = new Random();
        int rand = random.nextInt(10, 30);
        System.out.println("rand = " + rand);

    }
}
