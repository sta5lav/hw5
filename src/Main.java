import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int clientOS = 0;
        switch (clientOS) {
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке");
                break;
        }
        int clientAndroid = 1;
        switch (clientAndroid) {

            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке");
                break;
        }


    }

    public static void task2() {
        System.out.println("Задача 2");
        int clientDeviceYear = 2015;
        int clientIOS = 1;
        if (clientDeviceYear < 2015) {
            switch (clientIOS) {
                case 1:
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                    break;
                case 0:
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                    break;
            }
        } else if (clientDeviceYear >= 2015) {
            switch (clientIOS) {
                case 1:
                    System.out.println("Установите версию приложения для iOS по ссылке");
                    break;
                case 0:
                    System.out.println("Установите версию приложения для Android по ссылке");
                    break;
            }
        }
    }
    public static void task3() {
        System.out.println("Задача 3");
        int year = 2021;
        if ((year%4) == 0 && (year%100) == 0){
            if(year%400 == 0)
                System.out.println(year +  " год является високосным");
        }
        else
            System.out.println(year + " год не является високосным");
    }
    public static void task4() {
        System.out.println("Задача 4");
        int deliveryDistance = 95;
        int deliveryDay = 1;
        if (deliveryDistance <= 20)
            System.out.println("Потребуется дней: " + deliveryDay);
        else if (deliveryDistance > 20 && deliveryDistance <= 60)
            System.out.println("Потребуется дней: " + deliveryDay*2 );
        else if (deliveryDistance > 60 && deliveryDistance <= 100)
            System.out.println("Потребуется дней: " + deliveryDay*3 );
        else
            System.out.println("Доставки нет");
    }
    public static void task5() {
        System.out.println("Задача 5");
        int monthNumber = 11;
        switch (monthNumber){
            case 1: System.out.println("Сезон: Зима");
            break;
            case 2: System.out.println("Сезон: Зима");
                break;
            case 3: System.out.println("Сезон: Весна");
                break;
            case 4: System.out.println("Сезон: Весна");
                break;
            case 5: System.out.println("Сезон: Весна");
                break;
            case 6: System.out.println("Сезон: Лето");
                break;
            case 7: System.out.println("Сезон: Лето");
                break;
            case 8: System.out.println("Сезон: Лето");
                break;
            case 9: System.out.println("Сезон: Осень");
                break;
            case 10: System.out.println("Сезон: Осень");
                break;
            case 11: System.out.println("Сезон: Осень");
                break;
            case 12: System.out.println("Сезон: Зима");
                break;
            default:
                System.out.println("Ошибка");
                break;
        }

    }
}