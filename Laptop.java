public class Laptop extends Computer {
    private final int batteryLife;

    public Laptop(String cpu, int ram, int storage, int batteryLife) {
        super(cpu, ram, storage);
        this.batteryLife = batteryLife;
    }

    @Override
    public void displaySpecs() {
        super.displaySpecs();
        System.out.println("Batarya Ömrü: " + batteryLife + " saat");
    }
}
