package lesson1;

public class Application {
    //метод main
    public static void main(String[] args){
     System.out.println("Привет Java");
     System.out.println("Новая строка");
     System.out.print("\tТа же строка = ");
     System.out.print(" мня зовут Женя\n");
     System.out.println("текст ниже");
     //System.err.print("Error = " + 10.5);

     //=== Переменные и типы данных ===
        String massage = "Привет Java";//тип данных для строк
        System.out.print(massage);//ctrl+d
        System.out.println(" с маленькой буквы = " + massage.toLowerCase());

        //примитивные типы данных
        //хранят целые числа
        byte b = 127; //256 -128 до 127 =  2^8
        short s = 12;//2^16
        int  i = 30;//2^32   -2^31 до 2^31-1
        long l = 30L;//2^64

        //дробные числа
        float f = 10.45F;
        double d = 20.36;

        char ch = 'A';//ASCII
        boolean bool = true;

        //System.out.println((int)ch);

        String name = "Женя";
        System.out.println("Всем привет, меня зовут " + name);
        System.out.println("Моему коту " + s + " лет");

    }
}
