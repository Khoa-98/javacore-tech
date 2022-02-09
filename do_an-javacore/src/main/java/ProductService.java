public class ProductService {

    ProductInfor products = new ProductInfor();

    public void getAllProduct(){
        for (Product p:products.listProduct){
            System.out.println(p);
        }
    }

    public void getProductByCategory(){

    }

}
