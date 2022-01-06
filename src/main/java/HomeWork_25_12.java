import java.util.Scanner;

public class HomeWork_25_12 {
    public static void main(String[] args) {
        /*
        Задание 1: На вход в функцию подается строка. Посчитать количество пробелов в этой строке
        Возможные кейсы:
        1) Произвольное количество пробелов
        2) Пробелы отсутствуют
        3) Два пробела в тексте подряд
        4) Много пробелов в предложении (больше 10)
         */
        System.out.println("Задание 1");
        System.out.println("Произвольное количество пробелов(3) ==> " + spaceNumber("Свободный для ввода текст"));
        System.out.println("Ноль пробелов (0) ==> " + spaceNumber("Безпробелов"));
        System.out.println("Более одного пробела между словами (7) ==> " + spaceNumber("Много       пробелов"));
        System.out.println("Много пробелов в предложении (больше 10) ==>" + spaceNumber("В тексте больше десяти пробелов       "));
        System.out.println("");
        /*
        Задание 2: На вход в функцию подается положительное число N. Вывести все простые числа от 1 до N
        Возможные кейсы:
        N=0
        N=1
        N=87
         */
        System.out.println("Задание 2:");
        System.out.println("N=0 ==>" + primeNumbers(0));
        System.out.println("N=1 ==>" + primeNumbers(1));
        System.out.println("N=15 ==>" + primeNumbers(88));
        System.out.println("");

        /*
        На вход в функцию подается целое число и лист листов.
        Вернуть true, если в листе содержится столько элементов, сколько цифр в числе и каждый элемент листа содержит количество элементов равное цифре соответствующей цифре числа.
        Сами значения внутри листа роли не играют, важно количество.
        Например: число 35 и лист: { 0 ⇒ {1, 2, 3}, 1 ⇒ {1, 2, 3, 4, 5}} ⇒ true число 2 и лист: { 0 ⇒ {1, 2, 3}} ⇒ false
         */
        System.out.println("Задание 3:");
        System.out.println();
    }
    static int spaceNumber( String z){
        String freeText = z;
       int n=0;
       String str = freeText;
       char[] chArray = str.toCharArray();
       for(int i = 0; i<chArray.length; i++){
           if (chArray[i] ==' '){ n++;
           }
       }
       return n;
    }
    static String primeNumbers(int N) {
        int i, j;
        String k = "";
        boolean isprime;
        for (i = 1; i <= N; i++) {
            isprime = true;
            // проверить, делится ли число без остатка
            for (j = 2; j <= i / j; j++)
                // если число делится без остатка, значит, оно не простое
                if ((i % j) == 0) isprime = false;
            if (isprime)
                k = k + " " + i;}
        return k;
    }
}
