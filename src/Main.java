public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1() {
        byte humanAge = 10;
        if (humanAge >= 18) {
            System.out.println("Если возраст человека равен " + humanAge + ", то он совершеннолетний\n");
        } else {
            System.out.println("Если возраст человека равен " + humanAge + ", то он не достиг совершеннолетия, нужно немного подождать\n");
        }
    }

    public static void task2() {
        byte temperatureOutside = 6;
        if (temperatureOutside < 5) {
            System.out.println("На улице " + temperatureOutside + " градусов, нужно надеть шапку\n");
        } else {
            System.out.println("На улице " + temperatureOutside + " градусов, можно идти без шапки\n");
        }
    }

    public static void task3() {
        short speed = 120;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф\n");
        } else {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
        }
    }

    public static void task4() {
        short humanAge = 25;
        if (humanAge >= 2 && humanAge <= 6) {
            System.out.println("Если возраст человека равен " + humanAge + ", то ему нужно ходить в детский сад\n");
        } else if (humanAge >= 7 && humanAge <= 18) {
            System.out.println("Если возраст человека равен " + humanAge + ", то ему нужно ходить в школу\n");
        } else if (humanAge > 18 && humanAge < 24) {
            System.out.println("Если возраст человека равен " + humanAge + ", то ему нужно ходить в университет\n");
        } else if (humanAge >= 24) {
            System.out.println("Если возраст человека равен " + humanAge + ", то ему нужно ходить на работу\n");
        } else System.out.println("Если возраст человека равен " + humanAge + ", то ему нужно посидеть дома\n");
    }

    public static void task5() {
        short childAge = 15;
        boolean isAdultAvailable = true;
        if (childAge < 5) {
            System.out.println("Если возраст ребенка равен " + childAge + ", то ему нельзя кататься на аттракционе\n");
        } else if (childAge >= 5 && childAge < 14 && isAdultAvailable) {
            System.out.println("Если возраст ребенка равен " + childAge + ", то ему можно кататься на аттракционе в сопровождении взрослого\n");
        } else if (childAge >= 14) {
            System.out.println("Если возраст ребенка равен " + childAge + ", то ему можно кататься на аттракционе без сопровождения взрослого\n");
        } else System.out.println("У ребенка нет сопровождения. К сожалению он не может кататься\n");
    }

    public static void task6() {
        int passengers = 5;
        if (passengers <= 60) {
            System.out.println("Есть свободные сиденья\n");
        } else if (passengers > 60 && passengers <= 102) {
            System.out.println("К сожалению, сидячих мест нет, но есть стоячие места\n");
        } else System.out.println("Свободных мест нет\n");
    }

    public static void task7() {
        int one = 21;
        int two = 12;
        int three = 4;
        if (one > two && one > three) System.out.println("Число one = " + one + " больше всех");
        if (two > one && two > three) System.out.println("Число two = " + two + " больше всех");
        if (three > one && three > two) System.out.println("Число three = " + three + " больше всех");
    }
}