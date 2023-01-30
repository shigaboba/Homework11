import java.time.LocalDate;
public class Main {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static String isYearLeap (int year) {
        String result = " ";
        if ( year%4 == 0 && year%100 != 0) {
            result = " год — високосный год";
        }
        else if ( year%400 == 0 ) {
            result = " год — високосный год";
        }
        else {
            result = " год — невисокосный год";
        }
        return result;
    }

    public static void task1 () {
        System.out.println("Задача 1");
        int year = 1995;
        System.out.println(year +  isYearLeap(year));
    }

    public static String chooseVersion (int clientOS, int clientDeviceYear) {
        String result;
        int currentYear = LocalDate.now().getYear();
        if (clientOS == 0) {
            result = "Установите версию приложения для iOS по ссылке";
            if (clientDeviceYear < currentYear) {
                result = "Установите облегченную версию приложения для iOS по ссылке";
            }
        } else {
            result = "Установите версию приложения для Android по ссылке";
            if (clientDeviceYear < currentYear) {
                result = "Установите облегченную версию приложения для Android по ссылке";
            }
        }
        return result;
    }

    public static void task2 () {
        System.out.println("Задача 2");
        int clientOS = 0;
        int clientDeviceYear = 2014;
        System.out.println(chooseVersion(clientOS, clientDeviceYear));
    }

    public static int countDays (int deliveryDistance) {
        int daysOfDelivery = 0;
        if ( deliveryDistance < 20 ) {
            daysOfDelivery = 1;
        }
        if ( deliveryDistance >= 20 && deliveryDistance < 60 ) {
            daysOfDelivery = 2;
        }
        if ( deliveryDistance >= 60 && deliveryDistance < 100 ) {
            daysOfDelivery = 3;
        }
        return daysOfDelivery;
    }

    public static void task3 () {
        System.out.println("Задача 3");
        int deliveryDistance = 95;
        if ( deliveryDistance >= 100) {
            System.out.println("Доставки нет");
        }
        else {
            System.out.println("Потребуется дней: " + countDays(deliveryDistance));
        }
    }

}