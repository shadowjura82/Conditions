public class Main {
    public static void main(String[] args) {
        task1();
        task2();
    }

    public static void task1() {
        byte humanAge = 10;
        if (humanAge >= 18) {
            System.out.println("Если возраст человека равен " + humanAge + ", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + humanAge + ", то он не достиг совершеннолетия, нужно немного подождать");
        }
    }

    public static void task2() {
        byte temperatureOutside = 6;
        if (temperatureOutside < 5) {
            System.out.println("На улице " + temperatureOutside + " градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице " + temperatureOutside + " градусов, можно идти без шапки");
        }
    }
}