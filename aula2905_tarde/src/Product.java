import java.util.ArrayList;
import java.util.Arrays;

public class Product {
    private String productName;
    private String productCode;
    private double price;
    private String category;
    private int quantitySold;

    public static final ArrayList<String> categorias = new ArrayList<>(
            Arrays.asList("Eletrônicos", "Alimentos", "Vestuário", "Livros")
    );

    public Product(String productName, String productCode, double price, String category) {
        this.productName = productName;
        this.productCode = productCode;
        setPrice(price);
        setCategory(category);
        this.quantitySold = 0;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String name) {
        this.productName = name;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String code) {
        this.productCode = code;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0) {
            System.out.println("Preço não pode ser negativo. Definido como 0.");
            this.price = 0;
        } else {
            this.price = price;
        }
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        if (categorias.contains(category)) {
            this.category = category;
        } else {
            System.out.println("Categoria inválida. Categoria definida como 'Indefinida'.");
            this.category = "Indefinida";
        }
    }

    public int getQuantitySold() {
        return quantitySold;
    }

    public void sell(int quantity) {
        if (quantity > 0) {
            this.quantitySold += quantity;
        }
    }

    public void applyDiscount(double percent) {
        if (percent >= 0 && percent <= 100) {
            double discount = price * (percent / 100);
            price -= discount;
        } else {
            System.out.println("Porcentagem de desconto inválida.");
        }
    }

    public double calcularReceitaTotal() {
        return price * quantitySold;
    }

    public String getProductDetails() {
        return String.format("Produto: %s\nCódigo: %s\nPreço: R$%.2f\nCategoria: %s\nVendidos: %d",
                productName, productCode, price, category, quantitySold);
    }

    public static void aplicarDescontoEmMassa(Product[] produtos, double porcentagem) {
        for (Product p : produtos) {
            p.applyDiscount(porcentagem);
        }
    }
}