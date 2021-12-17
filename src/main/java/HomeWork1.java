import java.util.Scanner;

public class HomeWork1 {
    public static void main(String[] args) {
        // Задание 1: Hello world
        System.out.println("Задание 1:");
        System.out.println("Hello world");
        System.out.println("");

        // Задание 2: результат деления переменной а на b
        /*
        Возможные кейсы:
        1) a = 0, b = 1 ==> 1
        2) a = 1, b = 0 ==> error
        3) a = 1, b = 3 ==> 1/3
        4) a = 25, b = 5 ==> 5
        5) a = -10, b = -3 ==> 3.3333
        6) a = -9, b = 3 ==> -3
         */
        System.out.println("Задание 2:");
        System.out.println("a = 0, b = 1 ==>"+ division(0,1));
        //System.out.println(division(1,0));
        System.out.println("a = 1, b = 3 ==>"+ division( 1,3));
        System.out.println("a = 25, b = 5 ==>"+ division(25,5));
        System.out.println("a = -10, b = -3 ==>"+ division(-10,-3));
        System.out.println("a = -9, b = 3 ==>"+ division(-9,3));
        System.out.println("");

        //Задание 3: Четные числа
        System.out.println("Задание 3:");
        Scanner input = new Scanner(System.in);
        System.out.println("Введите произвольное число");
        int a = input.nextInt();
        if (a%2==0) {
            System.out.println("Число "+a+" четное");
        }else {
            System.out.println("Число "+a+" нечетное."+" Перезапустите программу и введите другое число");
            System.out.println("");
        }
        // Задание 4: Таймер
        System.out.println("Задание 4:");
        /* Сценарии:
        1. Если время от 5 до 12 -> "Доброе утро, {username}"
        2. Если время от 12 до 16 -> "Добрый день, {username}"
        3. Если время от 16 до 23 -> "Добрый вечер, {username}"
        4. Если время от 23 до 5 -> "Доброй ночи, {username}"
         */
        greeting(5, 0, 0, "Андрей, 5 часов");
        greeting(11, 0, 0, "Андрей, 11 часов");
        greeting(15, 0, 0, "Андрей, 15 часов");
        greeting(23, 0, 0, "Андрей, 23 часа");
    }
    private static double division(double a, double b) {return a/b; }
    private static void greeting(int h, int m, int s, String username){
        String dayTime = "Доброй ночи, ";
        if (h>=5 && h<12) dayTime = "Доброе утро, ";
        if (h>=12 && h<16) dayTime = "Добрый день, ";
        if (h>=16 && h<23) dayTime = "Добрый вечер, ";
        System.out.println(dayTime + username);
    }
}


