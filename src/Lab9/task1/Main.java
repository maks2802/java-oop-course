package Lab9.task1;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("Сума двох цілих чисел: " + calc.add(5, 10));
        System.out.println("Сума двох чисел з плаваючою крапкою: " + calc.add(3.45, 7.89));
        System.out.println("Сума трьох цілих чисел: " + calc.add(6, 89, 23));
    }
}
