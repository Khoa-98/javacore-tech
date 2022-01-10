import java.util.ArrayList;
import java.util.Scanner;

public class ProductService {
    static Scanner sc = new Scanner(System.in);

    public ArrayList<Product> getallProduct(){
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product(1, "Quạt điện", 5000000, 20, "đồ gia dụng", 5));
        products.add(new Product(2, "bánh mì ", 10000, 20, "Thực phẩm", 12));
        products.add(new Product(3, "mũ", 20000, 30, "thời trang", 12));

        return products;

    }

    public void show(ArrayList<Product> products){
        for (Product p: products){
            System.out.println(p);
        }
    }

    public Product searchById(ArrayList<Product> products, int id){
        for (Product p:products){
            if(p.getId()== id){
                return p;
            }
        }
        return null;
    }

    public static void searchByName(ArrayList<Product> products, String searchName){
        for (Product p: products){
            if(p.getName().toLowerCase().contains(searchName.toLowerCase())){
                System.out.println(p);
            }
        }
    }

   public void updateProduct(Product product, String newName){
        product.setName(newName);
       System.out.println(product);
   }

   public void updateProduct(Product product, int newPrice){
        product.setPrice(newPrice);
       System.out.println(product);
   }

   public void deleteProduct(ArrayList<Product> products, Product product){
        products.remove(product);
   }

   public Product createNewProduct(){
        Scanner sc = new Scanner(System.in);
       System.out.println("Nhập id: ");
       int id = Integer.parseInt(sc.nextLine());
       System.out.println("Nhập tên: ");
       String name = sc.nextLine();
       System.out.println("Nhập giá: ");
       int price = Integer.parseInt(sc.nextLine());
       System.out.println("Nhập số lượng: ");
       int number = Integer.parseInt(sc.nextLine());
       System.out.println("Nhập loại sản phẩm");
       String typeProduct = sc.nextLine();
       System.out.println("Nhập số lượng bán ra: ");
       int outNumber = Integer.parseInt(sc.nextLine());

       Product newproduct = new Product(id, name, price, number, typeProduct, outNumber);
       return newproduct;
   }

   public void addNewProduct(Product product, ArrayList<Product> products){
        products.add(product);
   }


}
