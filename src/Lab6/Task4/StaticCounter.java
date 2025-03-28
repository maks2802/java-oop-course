package Lab6.Task4;

public class StaticCounter {
    static int count;

    static public void increment(int increment) {
        count += increment;
    }

    static public void getCount() {
        System.out.println(count);
    }
}
