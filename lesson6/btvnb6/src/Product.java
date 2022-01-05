public class Product {
    
    public int id;
    public String name ;
    public int quantily;
    public String unit;
    public double inprice;
    public double outprice;
    public int outquantily;

    public Product(int id, String name, int quantily, String unit, double inprice, double outprice, int outquantily) {
        this.id = id;
        this.name = name;
        this.quantily = quantily;
        this.unit = unit;
        this.inprice = inprice;
        this.outprice = outprice;
        this.outquantily = outquantily;
    }


    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", quantily=" + quantily +
                ", unit='" + unit + '\'' +
                ", inprice=" + inprice +
                ", outprice=" + outprice +
                ", outquantily=" + outquantily +
                '}';
    }
}
