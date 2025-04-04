package Lab6.task3;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Animal();
        dog.name = "Lex";
        dog.sound = "bark";

        Animal cat = new Animal();
        cat.name = "Twix";
        cat.sound = "myao";

        Animal cow = new Animal();
        cow.name = "Otis";
        cow.sound = "mu";

        Animal[] animals = {dog, cat, cow};

        for (Animal animal : animals) {
            animal.makeSound();
        }
    }
}
