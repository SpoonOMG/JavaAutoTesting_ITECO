package HW.OOP_task1;

public class Phone {

    String number;
    double weight;
    String model;

    public Phone(String number, double weight, String model) {
        this.number = number;
        this.weight = weight;
        this.model = model;

    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {
    }

    void recieveCall(String caller) {
        System.out.println("Звонит " + caller);
    }

    void recieveCall(String caller, String number) {
        System.out.println("Звонит " + caller);
        System.out.println("Номер абонента: " + number);
    }

    String getNumber() {
        return number;
    }

    public static void sendMessage(String...array){
           for (String x:array) {
               System.out.println("Сообщение будет отправлено номеру: "+x);
        }
        System.out.println();
        }
    }

