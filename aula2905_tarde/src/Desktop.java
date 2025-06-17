import java.util.List;

public class Desktop {
    private String company;
    private String processor;
    private int ramSize;

    private static final int MAX_RAM = 64;
    private static final List<String> processadores = List.of(
        "Intel i5", "Intel i7", "Intel i9", "Ryzen 5", "Ryzen 7", "Ryzen 9"
    );

    // Construtor
    public Desktop(String company, String processor, int ramSize) {
        this.company = company;
        setProcessor(processor);
        setRamSize(ramSize);
    }

    public String getCompany() { return company; }
    public void setCompany(String company) { this.company = company; }

    public String getProcessor() { return processor; }
    public void setProcessor(String processor) {
        if (processadores.contains(processor)) {
            this.processor = processor;
        } else {
            throw new IllegalArgumentException("Processador não suportado: " + processor);
        }
    }

    public int getRamSize() { return ramSize; }
    public void setRamSize(int ramSize) {
        if (ramSize < 0 || ramSize > MAX_RAM) {
            throw new IllegalArgumentException("Tamanho de RAM inválido. Máximo: " + MAX_RAM + " GB.");
        }
        this.ramSize = ramSize;
    }

    public void upgradeRam(int extraRam) {
        if (extraRam < 0) {
            throw new IllegalArgumentException("Valor de upgrade inválido.");
        }
        if (ramSize + extraRam > MAX_RAM) {
            System.out.println("RAM excederia o máximo permitido. Definindo RAM para " + MAX_RAM + " GB.");
            ramSize = MAX_RAM;
        } else {
            ramSize += extraRam;
        }
    }

    public boolean isCompatible(String requiredProcessor, int requiredRam) {
        return processor.equals(requiredProcessor) && ramSize >= requiredRam;
    }

    public int estimatePowerConsumption() {
        int cpuPower = 65;
        return (ramSize * 10) + cpuPower;
    }
 
    public void displaySpecs() {
        System.out.println("Marca: " + company);
        System.out.println("Processador: " + processor);
        System.out.println("RAM: " + ramSize + " GB");
        System.out.println("Consumo estimado de energia: " + estimatePowerConsumption() + " W");
    }
}