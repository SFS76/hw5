//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)
    {
        //task1
        byte clientOS = 0;
        if (clientOS < 0 || clientOS > 1) {
            System.out.println ("Признак OS вне диапазона");
        } else
            {
            switch (clientOS) {
                case 0:
                    System.out.println("Установите версию приложения для iOS по ссылке");
                    break;
                default:
                    System.out.println("Установите версию приложения для Android по ссылке");
            }
        }

        //task2
        byte clientOS2 = 1;
        int phoneYear = 2015;
        if (clientOS2 =0 && phoneYear > 2015) {
            System.out.println ("Признак OS вне диапазона");
            } else if (clientOS2 == 0) {
                    if (phoneYear < 2015) {
                        System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                    } else {
                        System.out.println("Установите версию приложения для iOS по ссылке");
                    }
                } else {
                    if (phoneYear < 2015) {
                        System.out.println("Установите облегченную версию приложения для Android по ссылке");
                    } else {
                        System.out.println("Установите версию приложения для Android по ссылке");
                    }
                }
            }


        //task3
        int year = 1700;
        boolean year4 = year % 4 == 0;
        boolean year100 = year % 100 != 0;
        boolean year400 = year % 400 == 0;
            if (year >= 1584) {
                if (year100 && year4 || year400) {
                    System.out.println(year + " год является високосным");
                } else {
                    System.out.println(year + " год НЕ является високосным");
                }
            } else{
                    System.out.println(year + " год високосность не определели");
                }

        //task4
        int deliveryDistance = 95;
        byte deliveryDay = (byte) (1 + (deliveryDistance + 20) / 40f);
        if (deliveryDistance < 100) {
            System.out.println ("Потребуется дней: " + deliveryDay);
        } else {
            System.out.println ("Доставка не осуществляется!");
        }

        //task5
        byte month = 13;
        //if (month < 1 || month > 12) {
        //    System.out.println ("Значение месяца за пределом допустимого диапазона!");
        //} else {
        switch (month) {
            case 1, 2, 12:
                System.out.println("Это зимний месяц");
                break;
            case 3, 4, 5:
                System.out.println("Это весенний месяц");
                break;
            case 6, 7, 8:
                System.out.println("Это летний месяц");
                break;
            case 9, 10, 11:
                System.out.println("Это осенний месяц");
                break;
            default:
                System.out.println("Значение месяца за пределом допустимого диапазона!");
            //}
        }
    }
}