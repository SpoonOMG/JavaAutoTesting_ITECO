import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

 class HomeWork_25_12 {
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
        //Задаем произвольный лист листов
         List<List<Integer>> listOLists = new ArrayList<>();
         ArrayList<Integer> singleList = new ArrayList<Integer>();
         singleList.add(0, 1);
         singleList.add(1, 2);
         singleList.add(2, 3);
         listOLists.add(singleList);
         ArrayList<Integer> anotherList = new ArrayList<Integer>();
         anotherList.add(0, 1);
         anotherList.add(1, 2);
         anotherList.add(2, 3);
         anotherList.add(3, 4);
         anotherList.add(4, 5);
         anotherList.add(5, 6);
         listOLists.add(anotherList);
         //Вызываем функцию
         if (numbersAndElements(36, listOLists)) {
             System.out.println("Функция вернула 'True'");
         }else{
             System.out.println("Функция вернула 'False'");
         }
         System.out.println("");

         /*
         На вход в функцию подается массив и число N. Вернуть true, если в массиве есть любые 2 числа, сумма которых дает N.
         В противном случае вернуть false [1, 2, 3], 5 ⇒ true[2, 3, 3], 4 ⇒ false
          */
         System.out.println("Задание 4:");
         //Задаем произвольный массив
         int[] array = new int[]{5, 28, 7};
         //Вызываем функцию
         if (arrayAndNumber(35,array)){
             System.out.println("Функция вернула 'True'");
         }else{
             System.out.println("Функция вернула 'False'");
         }
         System.out.println("");

         /*
         Дана карта студентов (Фамилия ⇒ средний балл). Вывести на экран фамилию студента с наивысшим средним баллом.
         Если таких несколько, то вывести встречающегося в карте первым
          */
         System.out.println("Задание 5");
         //Задаем произвольную мапу:
         LinkedHashMap<String, Integer> studentsAndRaiting = new LinkedHashMap<>();
         studentsAndRaiting.put("Ivanov", 85);
         studentsAndRaiting.put("Petrov", 199);
         studentsAndRaiting.put("Sidorov", 199);
         studentsAndRaiting.put("Ivanova", 201);
         studentsAndRaiting.put("Ivano", 202);
         studentsAndRaiting.put("Ivanoqva", 202);
         studentsAndRaiting.put("Ivanowa", 111);
         studentsAndRaiting.put("Ivanota", 115);
         studentsAndRaiting.put("Ivanoya", 115);
        //Вызываем функцию, возвращающую студента с максимальным средним баллом
         System.out.println(studentName(studentsAndRaiting));
     }

     static int spaceNumber(String z) {
         String freeText = z;
         int n = 0;
         String str = freeText;
         char[] chArray = str.toCharArray();
         for (int i = 0; i < chArray.length; i++) {
             if (chArray[i] == ' ') {
                 n++;
             }
         }
         return n;
     }
     static String primeNumbers(int N) {
         int i, j;
         String k = "";
         boolean isprime;
         for (i = 2; i <= N; i++) {
             isprime = true;
             // проверить, делится ли число без остатка
             for (j = 2; j <= i / j; j++)
                 // если число делится без остатка, значит, оно не простое
                 if ((i % j) == 0) isprime = false;
             if (isprime)
                 k = k + " " + i;
         }
         return k;
     }

     static boolean numbersAndElements(int a, List<List<Integer>> listOLists) {
         int x = 0;
         boolean isTrue =false;
         String t = "" + a;
         int[] b = new int[t.length()];
         for (int i = (t.length() - 1); i >= 0; i--) {
             b[i] = a % 10;
             a = a / 10;
         }
         for (int i = 0; i < t.length(); i++) {
             if ((t.length() == listOLists.size() && (b[i] == listOLists.get(i).size()))) {
                 x++;
             }
         }
         if (x == t.length()) {
             isTrue=true;
         }
         return isTrue;
         }
         static boolean arrayAndNumber(int n, int[]array){
             int c = 0;
             int a = 0;
             boolean isTrue=false;
             for (int i = 0; i < array.length; i++) {
                 a = array[i];
                 for (int j = 0; j < array.length; j++) {
                     if (j != i) {
                         c = a + array[j];
                         if (c == n) {
                             isTrue=true;
                         }
                     }
                 }
             }return isTrue;
     }
     static String studentName (LinkedHashMap<String,Integer>studentsAndRaiting){
         int max = 0;
         String returnKey ="";
         String[] student = studentsAndRaiting.keySet().toArray(new String[studentsAndRaiting.size()]);
         for (int i = 0; i < studentsAndRaiting.size(); i++) {
             int raiting = studentsAndRaiting.get(student[i]);
             if (raiting > max) {
                 max = raiting;
             }
         }
         for (String key : studentsAndRaiting.keySet()) {
             if (studentsAndRaiting.get(key).equals(max)) {
                 returnKey= key;
                 break;
             }
         }return returnKey;
     }
 }


