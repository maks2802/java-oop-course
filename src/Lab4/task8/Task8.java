package Lab4.task8;

public class Task8 {
    static int counter = 0;

    static void increment() {
        counter += 1;
    }

    static void setCounter(int counter) {
        System.out.println("Передане значення: " + counter);
    }

    public static void main(String[] args) {
        System.out.println("Значення counter до setCounter: " + counter);

        setCounter(15);

        System.out.println("Значення counter після setCounter: " + counter);
        // counter не змінився бо counter у setCounter - це параметр, а counter у main це глобальна змінна
    }
}
