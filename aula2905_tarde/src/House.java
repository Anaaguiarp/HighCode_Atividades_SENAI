public class House {
    private String address;
    private int numberOfRooms;
    private double area;

    private boolean hasGarage;
    private boolean hasPool;
    private boolean hasGarden;

    public House(String address, int numberOfRooms, double area) {
        this.address = address;
        setNumberOfRooms(numberOfRooms);
        setArea(area);
    }

    public House() {}

    public String getAddress() {
        return address; 
    }

    public void setAddress(String address) { 
        this.address = address; 
    }

    public int getNumberOfRooms() { 
        return numberOfRooms; 
    }

    public void setNumberOfRooms(int numberOfRooms) {
        if (numberOfRooms < 0) {
            throw new IllegalArgumentException("Número de quartos não pode ser negativo.");
        }
        this.numberOfRooms = numberOfRooms;
    }

    public double getArea() {
        return area; 
    }

    public void setArea(double area) {
        if (area < 0) {
            throw new IllegalArgumentException("Área não pode ser negativa.");
        }
        this.area = area;
    }

    public boolean hasGarage() { 
        return hasGarage; 
    }

    public void setGarage(boolean hasGarage) { 
        this.hasGarage = hasGarage; 
    }

    public boolean hasPool() { 
        return hasPool; 
    }

    public void setPool(boolean hasPool) { 
        this.hasPool = hasPool; 
    }

    public boolean hasGarden() { 
        return hasGarden; 
    }
    public void setGarden(boolean hasGarden) { 
        this.hasGarden = hasGarden; 
    }

    public double calculaPrice(double precoPorMetro) {
        return precoPorMetro * area;
    }

    public double estimaCustoReforma(double precoPorMetroReforma) {
        return area * precoPorMetroReforma;
    }

    public double calculaPrecoTotalComExtras(double precoPorMetro) {
        double precoBase = calculaPrice(precoPorMetro);
        if (hasGarage) precoBase += 15000;
        if (hasPool) precoBase += 30000;
        if (hasGarden) precoBase += 10000;
        return precoBase;
    }

    public void exibirInformacoes() {
        System.out.println("Endereço: " + address);
        System.out.println("Quartos: " + numberOfRooms);
        System.out.println("Área: " + area + " m²");
        System.out.println("Garagem: " + (hasGarage ? "Sim" : "Não"));
        System.out.println("Piscina: " + (hasPool ? "Sim" : "Não"));
        System.out.println("Jardim: " + (hasGarden ? "Sim" : "Não"));
    }
}