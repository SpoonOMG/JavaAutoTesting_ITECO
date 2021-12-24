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
        System.out.println("Произвольное количество пробелов(3) ==> " + spaceNumber("Свободный для ввода текст"));
        System.out.println("Ноль пробелов (0) ==> " + spaceNumber("Безпробелов"));
        System.out.println("Более одного пробела между словами (7) ==> " + spaceNumber("Много       пробелов"));
        System.out.println("Много пробелов в предложении (больше 10) ==>" + spaceNumber("В тексте больше десяти пробелов       "));

        /*
        Задание 2: На вход в функцию подается положительное число N. Вывести все простые числа от 1 до N
         */

    }
   public static int spaceNumber( String z){
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
}
