package HW.OOP_task1;

public class mobilePhone {
    public static void main(String[] args) {
        //параметризированный конструктор с тремя аргументами
    Phone Iphone = new Phone("905-777-98-52",155.55,"Iphone XR");
    Phone Xiaomi = new Phone("909-868-13-33", 211.00,"Xiaomi Redmi Note 9");
    Phone Samsung = new Phone("911-565-89-55",189.13,"Samsung Galaxy S21");
        //параметризированный конструктор с двумя аргументами
    Phone IphoneSE= new Phone("911-557-18-37","Iphone SE");
    Phone XiaomiNEW = new Phone("915-556-34-48", "RedmiA");
        //конструктор по умолчанию
    Phone SamsungNew =new Phone();

        // Выводим на консоль параметры телефонов из конструктора
        System.out.println("Iphone number: "+Iphone.number+", Iphone weight: "+Iphone.weight+
                ", Iphone model: "+Iphone.model);
        System.out.println("Xiaomi number: "+Xiaomi.number+", Xiaomi weight: "+Xiaomi.weight+
                ", Xiaomi model: "+Xiaomi.model);
        System.out.println("Samsung number: "+Samsung.number+", Samsung weight: "+Samsung.weight+
                ", Samsung model: "+Samsung.model);
        //Выводим на консоль, кто звонит (имя)
        Iphone.recieveCall("Иван");
        Xiaomi.recieveCall("Петр");
        Samsung.recieveCall("Елена");
        //Выводим на консоль номер телефона
        System.out.println(Iphone.getNumber());
        System.out.println(Xiaomi.getNumber());
        System.out.println(Samsung.getNumber());
        //Выводим на консоль кто звонит и номер телефона
        Samsung.recieveCall("Евгений", "993-911-75-45");
        //Спамим смски по введенным номерам
       Samsung.sendMessage("915","555","464","123");




    }
}