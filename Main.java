public class Main {
    public static void main(String[] args) {
        Laptop laptop = new Laptop("Intel i7", 16, 512, 10);
        Desktop desktop = new Desktop("AMD Ryzen 7", 32, 1024, true);

        System.out.println("Laptop Bilgi:");
        laptop.displaySpecs();
        
        System.out.println("\nMasaüstü Bilgi:");
        desktop.displaySpecs();
    }
}

