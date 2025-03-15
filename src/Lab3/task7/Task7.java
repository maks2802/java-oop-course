package Lab3.task7;

import java.util.Arrays;
import java.util.Random;

public class Task7 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1, 100);
        }

        System.out.println("Початковий масив: " + Arrays.toString(array));

        Arrays.sort(array);

        System.out.println("Відсортований масив: " + Arrays.toString(array));
    }
}