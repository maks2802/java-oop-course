package Lab10.task5;

abstract class Appliance {
    String brand;

    public Appliance(String brand) {
        this.brand = brand;
    }

    String getBrand() {
        return brand;
    }

    abstract void turnOn();
}
