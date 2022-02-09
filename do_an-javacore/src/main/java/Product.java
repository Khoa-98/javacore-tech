public class Product {
    private int id;
    private String name;
    private int price;
    private String description;
    private int quantity;
    private int quantitySale;
    private String brand;
    private Catogery catogery;

    public Product(int id, String name, int price, String description, int quantity, int quantitySale, String brand, Catogery catogery) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
        this.quantity = quantity;
        this.quantitySale = quantitySale;
        this.brand = brand;
        this.catogery = catogery;
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

    public Catogery getCatogery() {
        return catogery;
    }

    public void setCatogery(Catogery catogery) {
        this.catogery = catogery;
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
                " - " + catogery ;
    }
}
