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
    public static int deliveryTime (int deliveryDistance)  {
        {
            if (deliveryDistance <= 20) {
                return 1;
            } else if (deliveryDistance <= 60) {
                return 2;
            } else if (deliveryDistance <= 100) {
                return 3;
            } else {
                return -1;
            }
        }

        }

    public static void main ( String[] args) {
        int year = 2024;
        printYear ( year );

        int clientOS = 0;
        int deviseYear = 2020;
        printOS (clientOS, deviseYear);


        int deliveryDistance = 77;
        int days = deliveryTime (deliveryDistance);
        if (days > 0 ) {
            System.out.println ("Доставка составит " + days + " дня" );}
            else { System.out.println ("Доставка не осуществляется" );}



    }
}