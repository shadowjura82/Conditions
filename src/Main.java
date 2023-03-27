public class Main {
    public static void main(String[] args) {
        task1();
    }

    public static void task1() {
        byte humanAge = 10;
        if (humanAge >= 18) {
            System.out.println("Если возраст человека равен " + humanAge + ", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + humanAge + ", то он не достиг совершеннолетия, нужно немного подождать");
        }
    }
}