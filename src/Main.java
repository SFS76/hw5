//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)
    {
        //task1
        int age = 48;
        if (age < 18) {
            System.out.println("Если возраст человека равен " + age +", то он не достиг совершеннолетия, нужно немного подождать");
        } else {
            System.out.println("Если возраст человека равен " + age +", то он совершеннолетний");
        }
        //task2
        float teperature = 4;
        if (teperature < 5) {
            System.out.println("На улице холодно, нужно надеть шапку");
        }
        if (teperature > 5)
        {System.out.println("Сегодня тепло, можно идти без шапки");
        }
        //task3
        float speed = 60;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + " км/ч, то придется платить штраф");
        } else { System.out.println("Если скорость " + speed + " км/ч, то можно ездить спокойно");

        }
        //task4
        float age2 = 30;
        if (age2 >= 2 && age2 < 7) {
            System.out.println("Если возраст человека равен " + age2 + ", то ему нужно ходить в детский сад");
        }
        if (age2 >= 7 && age2 < 18) {
            System.out.println("Если возраст человека равен " + age2 + ", то ему нужно ходить в школу");
        }
        if (age2 >= 18 && age2 < 24) {
            System.out.println("Если возраст человека равен " + age2 + ", то ему нужно ходить в университет");
        }
        if (age2 >= 24) {
            System.out.println("Если возраст человека равен " + age2 + ", то ему нужно ходить на работу");
        }
        //task5
        float age3 = 13;
        if (age3 < 5) {
            System.out.println("Если возраст ребенка равен " + age3 + ", то ему нельзя кататься на аттракционе");
        }
        if (age3 >= 5 && age3 < 14) {
            System.out.println("Если возраст ребенка равен " + age3 + ", то ему можно кататься на аттракционе в сопровождении взрослого");
        }
        if (age3 >= 14) {
            System.out.println("Если возраст ребенка равен " + age3 + ", то ему можно кататься на аттракционе без сопровождения взрослого");
        }
        //task6
        int passengers = 50;
        int allPlace = 102;
        int sitePlace = 60;
        if (passengers > allPlace) {
            System.out.println("Вагон полностью забит");
        } else
        if (passengers < allPlace && passengers >= sitePlace) {
            System.out.println("В вагоне осталось " + (allPlace - passengers) + " стоячих мест");
        } else {
            System.out.println("В вагоне осталось " + (sitePlace - passengers) + " сидячих мест и 42 стоячих места");
        }
        //task7
        int one = 150;
        int two = 102;
        int three = 160;
        if (one > two && one > three) {
            System.out.println("Первое число максимальное");
        } else
        if (two > one && two > three) {
            System.out.println("Второе число максимальное");
        } else {
            System.out.println("Третье число максимальное");
        }
    }
}