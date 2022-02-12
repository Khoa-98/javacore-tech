import java.util.*;

public class ProductService {

    ProductInfor products = new ProductInfor();
    ArrayList<Product> products1 = products.listProduct;
    Scanner sc = new Scanner(System.in);

    // lấy ra tất cả sản phẩm
    public void getAllProduct(){
        for (Product p: products.listProduct){
            System.out.println(p);
        }
    }
        // lấy sp bằng danh mục sp
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
        // sắp xếp só lượng sp đc bán ra từ cao -> thấp
  public void sortQuantitySale(){
      Collections.sort(products.listProduct, new Comparator<Product>() {
          @Override
          public int compare(Product o1, Product o2) {
              return o2.getQuantitySale() - o1.getQuantitySale();
          }
      });
  }

            // lấy 5 sp bán chạy nhất
  public void getTop5Product(){
        int count =0;
        for (Product p:products.listProduct){
            if(count < 5){
                System.out.println(p);
                count++;
            }
        }
  }
    //lấy các sp bằng thương hiệu
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
        // Xem các sản phẩm bằng giá
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
        //Tìm sản phẩm bằng tên
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
    //tìm sp theo ID
    public Product searchProductByID(int id){

        for(Product p:products.listProduct){
            if(p.getId() == id ){
                return p;

            }
        }
       return null;
    }
        // Cập nhật sp
    public void updateProduct(Product product,  String newName, int newPrice ){
        product.setName(newName);
        product.setPrice(newPrice);
        System.out.println("Danh sách sản phẩm sau khi cập nhật:  ");

    }

    public void deleteProduct(){
        System.out.println("Nhập id sản phẩm cần xoá: ");
        int id = Integer.parseInt(sc.nextLine());
        Product deleteProduct = searchProductByID(id);
        if(products1.remove(deleteProduct)){
            System.out.println("Xoá thành công");
        }else {
            System.out.println(" Xoá Thất bại");
        }
    }



  // Thêm sp mới
    public Product addNewProduct(){
        Scanner sc  = new Scanner(System.in);
        System.out.println("Nhập id: ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập tên sản phẩm:  ");
        String name = sc.nextLine();
        System.out.println("Nhập giá: ");
        int price = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập mô tả: ");
        String description = sc.nextLine();
        System.out.println("Nhập số lượng: ");
        int quantity = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập số lượng bán ra: ");
        int quantitySale = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập thương hiệu: ");
        String brand = sc.nextLine();

        Category category = chooseCategory();
        return new Product(id , name, price, description, quantity, quantitySale, brand, category);

    }
    // kiểm tra xem sp đã được thêm hay chưa
    public void createNewProduct(){
        Product newProduct = addNewProduct();
        if(products1.add(newProduct)){
            System.out.println("Thêm thành công");
        }else {
            System.out.println("Thêm thất bại");
        }

    }
        // Lựa chọn loại/danh mục sản phẩm
    public Category chooseCategory(){
        Category category = null;
        Scanner sc = new Scanner(System.in);
        Menu.creatCategoryMenu();
        int choose = Integer.parseInt(sc.nextLine());
        boolean isContinue = false;
        while(!isContinue){
            switch (choose){
                case 1:
                    category = Category.PHONE;
                    isContinue = true;
                    break;
                case 2:
                    category = Category.LAPTOP;
                    isContinue = true;
                    break;
                case 3:
                    category = Category.TABLET;
                    isContinue = true;
                    break;
                case 4:
                    category = Category.SMARTWATCH;
                    isContinue = true;
                    break;
                case 5:
                    category = Category.ACCESSORY;
                    isContinue = true;
                    break;
                default:
                    System.out.println("Không có lựa chọn này, Vui lòng chọn lại");
            }
        }
        return category;
    }

}
