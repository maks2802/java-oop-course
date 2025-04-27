package Lab10.task5;

public class Main {
    public static void main(String[] args) {
        WasherDryer washerDryer = new WasherDryer("LG");

        System.out.println("Бренд: " + washerDryer.getBrand());
        washerDryer.turnOn();
        washerDryer.wash();
        washerDryer.dry();

        Appliance appliance = washerDryer;
        Washable washable = washerDryer;
        Dryable dryable = washerDryer;

        System.out.println(" ");
        appliance.turnOn();
        washable.wash();
        dryable.dry();
    }
}
