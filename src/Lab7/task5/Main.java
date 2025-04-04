package Lab7.task5;

public class Main {
    public static void main(String[] args) {
        Clock clock1 = new Clock();

        clock1.setHours(23);
        clock1.setMinutes(59);
        clock1.setSeconds(58);

        clock1.displayTime();

        clock1.tick();
        clock1.displayTime();

        clock1.tick();
        clock1.displayTime();
    }
}
