public class Product {
    private int id;
    private String name;
    private int price;
    private String description;
    private int quantity;
    private int quantitySale;
    private String brand;
    private Category category;

    public Product(int id, String name, int price, String description, int quantity, int quantitySale, String brand, Category category) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
        this.quantity = quantity;
        this.quantitySale = quantitySale;
        this.brand = brand;
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantitySale() {
        return quantitySale;
    }

    public void setQuantitySale(int quantitySale) {
        this.quantitySale = quantitySale;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Category getCatogery() {
        return category;
    }

    public void setCatogery(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Product:  " +
                " - " + id +
                " - " + name +
                " - " + price +
                " - " + description +
                " - " + quantity +
                " - " + quantitySale +
                " - " + brand +
                " - " + category;
    }
}
