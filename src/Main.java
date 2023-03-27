public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
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
}