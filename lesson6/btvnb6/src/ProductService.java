import java.util.Scanner;

public class ProductService {

    public Product createProduct() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập id: ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập tên sp: ");
        String name = sc.nextLine();
        System.out.println("Nhập số lượng: ");
        int quantily = Integer.parseInt(sc.nextLine());
        System.out.println("Đơn vị: ");
        String unit = sc.nextLine();
        System.out.println("Giá nhập: ");
        double inprice = Double.parseDouble(sc.nextLine());
        System.out.println("Giá bán: ");
        double outprice = Double.parseDouble(sc.nextLine());
        System.out.println("Số lượng bán: ");
        int outquantily = sc.nextInt();

        Product newProduct = new Product(id, name, quantily, unit, inprice, outprice, outquantily);
        return newProduct;

    }

    public  double benerfitOfone(double outprice, double inprice,int outquantily){
        return (outprice-inprice)*outquantily;
    }


    public Product[] addProduct(int size){
        Product[] products = new Product[size];
        for (int i = 0; i < size; i++){
            products[i] = createProduct();
        }
        return products;
    }

    public void show(Product[] products){
        for(Product s : products){
            System.out.println(s + " Lãi " +
                    benerfitOfone(s.outprice, s.inprice, s.outquantily));
        }
    }
}
