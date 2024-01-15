public class Main {
    public static void printYear(int yearType) {
        if ( yearType >= 1584 && yearType % 4 == 0 && (yearType % 100 != 0 || yearType % 400 == 0) ) {
            System.out.println ( yearType + " год является високосным " );
        } else {
            System.out.println ( yearType + " год НЕ является високосным " );
        }
    }
    public static void printOS (int clientOS , int deviseYear) {
        int currientYear = 2024;
        if (deviseYear < currientYear && clientOS == 0) {
            System.out.println ("Установите облегченную версию приложения для iOS по ссылке");
        } else if (deviseYear < currientYear && clientOS == 1) {
            System.out.println ("Установите облегченную версию приложения для Android по ссылке");
        }
    }
    public static void printDeliveryTime (int distance) {
        int deliveryTime = 1;
        if (distance < 20) {System.out.println ("Потребуется дней " + deliveryTime);}
        if (distance >= 20 && distance < 60 ) {
            deliveryTime = deliveryTime + 1;
            System.out.println ("Потребуется дней " +deliveryTime);}
        if (distance >= 60 && distance<= 100) {
            deliveryTime = deliveryTime + 2;
            System.out.println ("Потребуется дней " + deliveryTime);}
        if (distance > 100 ) {
            System.out.println (" Доставка в ваш район не осущствляется");
        }
    }
    public static void main ( String[] args) {

        int year = 2024;
        printYear ( year );

        int clientOS = 0;
        int deviseYear = 2020;
        printOS (clientOS, deviseYear);

        int deliveryDistance = 56;
        printDeliveryTime ( deliveryDistance );
    }
}