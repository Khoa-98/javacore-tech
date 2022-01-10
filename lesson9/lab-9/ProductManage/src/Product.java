public class Product {
    private int id;
    private String name;
    private int price;
    private int number;
    private String typeProduct;
    private int outNumber;


    public Product(int id, String name, int price, int number, String typeProduct, int outNumber) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.number = number;
        this.typeProduct = typeProduct;
        this.outNumber = outNumber;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getTypeProduct() {
        return typeProduct;
    }

    public void setTypeProduct(String typeProduct) {
        this.typeProduct = typeProduct;
    }

    public int getOutNumber() {
        return outNumber;
    }

    public void setOutNumber(int outNumber) {
        this.outNumber = outNumber;
    }

    @Override
    public String toString() {
        return "Product:  " +
                "id=" + id +
                " - name='" + name + '\'' +
                " -  price=" + price +
                " -  number=" + number +
                " -  typeProduct=" + typeProduct +
                " -  outNumber=" + outNumber ;
    }
}
