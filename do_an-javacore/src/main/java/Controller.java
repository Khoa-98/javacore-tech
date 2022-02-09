import java.util.Scanner;

public class Controller {

    ProductService service = new ProductService();
    Scanner sc = new Scanner(System.in);

    public void mainMenu(){
        boolean isContinue = true;
        while(isContinue){
            Menu.menu();
            int choose = Integer.parseInt(sc.nextLine());
            switch (choose){
                case 1:
                    System.out.println("Danh sách sản phẩm:  ");
                    service.getAllProduct();
                    break;
                case 2:
                    categoryMenu();
                    break;
                case 3:
                    System.out.println("Nhập thương hiệu bạn muốn tìm: ");
                    String brand = sc.nextLine();
                    service.getProductByBrand(brand);
                    break;
                case 4:
                    priceMenu();
                    break;
                case 5:
                    System.out.println("Nhập tên sản phẩm:  ");
                    String name = sc.nextLine();
                    service.searchProductByName(name);
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Không có lựa chọn này");
            }
        }
    }

    public void categoryMenu(){
        boolean isContinue = true;
        while(isContinue){
            System.out.println("Lựa chọn danh mục bạn muốn xem sản phẩm: ");
            System.out.println("1 - Điện thoại");
            System.out.println("2 - Laptop");
            System.out.println("3 - Máy tính bảng");
            System.out.println("4 - Đồng hồ thông minh");
            System.out.println("5 - Phụ kiện");
            System.out.println("0 - Quay về trang chủ");
            System.out.println("Lựa chọn của bạn là: ");

            int choose = Integer.parseInt(sc.nextLine());
            switch (choose){
                case 1:
                    service.getProductByCategory(Category.PHONE);
                    break;
                case 2:
                    service.getProductByCategory(Category.LAPTOP);
                    break;
                case 3:
                    service.getProductByCategory(Category.TABLET);
                    break;
                case 4:
                    service.getProductByCategory(Category.SMARTWATCH);
                    break;
                case 5:
                    service.getProductByCategory(Category.ACCESSORY);
                    break;
                case 0:
                    mainMenu();
                    break;
                default:
                    System.out.println("Không có lựa chọn này");
            }
        }
    }


    public void priceMenu(){
        boolean isContinue = true;
        while (isContinue){
            System.out.println("Chọn mức giá");
            System.out.println("1 - Dưới 2.000.000");
            System.out.println("2 - Từ 2.000.000 đến 4.000.000");
            System.out.println("3 - Từ 4.000.000 đến 7.000.000");
            System.out.println("4 - Từ 7.000.000 đến 12.000.000");
            System.out.println("5 - Từ 12.000.000 trở lên");
            System.out.println("0 - Về trang chủ");
            System.out.println("Lựa chọn của bạn: ");

            int choose = Integer.parseInt(sc.nextLine());
            if(choose == 0){
                mainMenu();
            }

            service.getProductByPrice(choose);
        }
    }
}
