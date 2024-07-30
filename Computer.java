public class Computer {
    protected String cpu;
    protected int ram; 
    protected int storage;

    public Computer(String cpu, int ram, int storage) {
        this.cpu = cpu;
        this.ram = ram;
        this.storage = storage;
    }

    public void displaySpecs() {
        System.out.println("CPU: " + cpu + ", RAM: " + ram + "GB, Depolama: " + storage + "GB");
    }
}
