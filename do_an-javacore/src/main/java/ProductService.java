import java.util.ArrayList;
import java.util.Locale;

public class ProductService {

    ProductInfor products = new ProductInfor();

    public void getAllProduct(){
        for (Product p: products.listProduct){
            System.out.println(p);
        }
    }

    public void getProductByCategory(Category category ){
        int count = 0;
        for (Product p: products.listProduct){
            if(p.getCatogery() == category){
                System.out.println(p);
                count++;
            }
        }
        if(count == 0 ){
            System.out.println("Không có sản phẩm nào");
        }
    }

    public void getProductByBrand(String brand){
        int count =0;
        for (Product p:products.listProduct){
            if(p.getBrand().toLowerCase().contains(brand.toLowerCase())){
                System.out.println(p);
                count++;
            }
        }
        if(count == 0) {
            System.out.println("Không có sản phẩm nào");
        }

    }

    public void getProductByPrice(int choose){
        int count = 0;
        switch (choose){
            case 1:
                for (Product p:products.listProduct){
                    if(p.getPrice() < 2000000){
                        System.out.println(p);
                        count++;
                    }
                }
                break;
            case 2:
                for (Product p:products.listProduct){
                    if(p.getPrice() >= 2000000 && p.getPrice() < 4000000){
                        System.out.println(p);
                        count++;
                    }
                }
                break;
            case 3:
                for (Product p:products.listProduct){
                    if(p.getPrice() >= 4000000 && p.getPrice() < 7000000){
                        System.out.println(p);
                        count++;
                    }
                }
                break;
            case 4:
                for (Product p:products.listProduct){
                    if(p.getPrice() >= 7000000 && p.getPrice() < 12000000){
                        System.out.println(p);
                        count++;
                    }
                }
                break;
            case 5:
                for (Product p:products.listProduct){
                    if(p.getPrice() >= 12000000 ){
                        System.out.println(p);
                        count++;
                    }
                }
                break;
            default:
                System.out.println("Không có lựa chọn này");
        }
        if ( count == 0){
            System.out.println("Không có sản phẩm này ");
        }
    }

    public void searchProductByName(String name){
        int count = 0;
        for (Product p:products.listProduct){
            if(p.getName().toLowerCase().contains(name.toLowerCase())){
                System.out.println(p);
                count++;
            }
        }
        if(count == 0) {
            System.out.println("Không có sản phẩm nào");
        }
    }

}
