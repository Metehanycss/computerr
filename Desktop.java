public class Desktop extends Computer {
    private final boolean isCustomizable; 

    public Desktop(String cpu, int ram, int storage, boolean isCustomizable) {
        super(cpu, ram, storage);
        this.isCustomizable = isCustomizable;
    }

    @Override
    public void displaySpecs() {
        super.displaySpecs();
        System.out.println("Özelleştirilebilir: " + (isCustomizable ? "Yes" : "No"));
    }
}
