public class Product {
    private String id;
    private String name;
    private double price;
    private int quantity;
    public static int totalProduct;
    public static double totalInventoryValue;
   public static String storeName;

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", totalInventoryValue=" + totalInventoryValue +
                ", storeName='" + storeName + '\'' +
                '}';
    }

    public Product(String id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        totalProduct++;
        totalInventoryValue += getTotalInventoryValue();
    }

    public double getTotalInventoryValue() {

        return quantity * price;
    }
    public static double getAveragePrice(){
        return totalInventoryValue / totalProduct;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }
}
