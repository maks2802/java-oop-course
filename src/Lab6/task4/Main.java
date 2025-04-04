package Lab6.task4;

public class Main {
    public static void main(String[] args) {
        Counter counter1 = new Counter();
        counter1.count = 0;
        counter1.increment(5);
        counter1.getCount();

        Counter counter2 = new Counter();
        counter2.count = 10;
        counter2.increment(33);
        counter2.getCount();

        Counter counter3 = new Counter();
        counter3.count = 21;
        counter3.increment(17);
        counter3.getCount();

        StaticCounter.count = 5;
        StaticCounter.increment(7);
        StaticCounter.increment(9);
        StaticCounter.getCount();
    }
}
