public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
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
}