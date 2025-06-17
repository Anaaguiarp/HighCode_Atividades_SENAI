public class Smartphone {
    private String company;
    private String model;
    private int storageCapacity;
    private int batteryUsage;

    private static final int MAX_STORAGE = 512;

    public Smartphone(String company, String model, int storageCapacity) {
        this.company = company;
        this.model = model;
        setStorageCapacity(storageCapacity);
        this.batteryUsage = 100;
    }

    public String getCompany() { return company; }
    public void setCompany(String company) { this.company = company; }

    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }

    public int getStorageCapacity() { return storageCapacity; }
    public void setStorageCapacity(int storageCapacity) {
        if (storageCapacity < 0 || storageCapacity > MAX_STORAGE) {
            throw new IllegalArgumentException("Capacidade de armazenamento inválida. O limite máximo é " + MAX_STORAGE + " GB.");
        }
        this.storageCapacity = storageCapacity;
    }

    public void boostStorage(int increase) {
        if (increase < 0) {
            throw new IllegalArgumentException("O aumento de armazenamento não pode ser negativo.");
        }
        int newStorage = storageCapacity + increase;
        if (newStorage > MAX_STORAGE) {
            storageCapacity = MAX_STORAGE;
        } else {
            storageCapacity = newStorage;
        }
    }

    public void useBattery(int percent) {
        if (percent < 0 || percent > 100) {
            throw new IllegalArgumentException("Percentual de uso da bateria deve ser entre 0 e 100.");
        }
        batteryUsage = percent;
    }

    public void displaySpecifications() {
        System.out.println("Especificações do Smartphone:");
        System.out.println("Marca: " + company);
        System.out.println("Modelo: " + model);
        System.out.println("Armazenamento: " + storageCapacity + " GB");
        System.out.println("Uso da bateria: " + batteryUsage + "%");
    }
}
