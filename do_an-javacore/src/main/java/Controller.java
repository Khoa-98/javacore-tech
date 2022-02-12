import java.util.ArrayList;
import java.util.Scanner;

public class Controller {
    AccountService accountService = new AccountService();
    ArrayList<Account> accounts = accountService.getAllAccount();
    ProductService service = new ProductService();
    Scanner sc = new Scanner(System.in);

    public void mainMenu(){
        Menu.menuHome();
        boolean isCheck = true;
        while (isCheck){

            int choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    System.out.println(" -> Đăng nhập");
                    login();
                    System.out.println("Bạn  đăng nhập thành công");
                    System.out.println("Bạn có thể thực hiện: ");
                    userMenu();
                    break;
                case 2:
                    boolean isKeep = true;
                    while (isKeep){
                        Menu.adminMenu();
                        int choose1 = Integer.parseInt(sc.nextLine());
                        switch(choose1){
                            case 1:
                                System.out.println("Danh sách sản phẩm: ");
                                service.getAllProduct();
                                break;
                            case 2:
                                updateproduct();
                                service.getAllProduct();
                                break;
                            case 3:
                                service.deleteProduct();
                                service.getAllProduct();
                                break;
                            case 4:
                                service.createNewProduct();
                                break;
                            case 0:
                                System.exit(0);
                                break;
                            default:
                                System.out.println("Không có lựa chọn này");

                        }
                    }

                    break;
                default:
                    System.out.println("Không có lựa chọn này");
            }
        }


    }

    public Account login(){
        Account account = null;
        while (account == null){
            System.out.println("Nhập số điện thoại: ");
            String mobile = sc. nextLine();
            System.out.println("Nhập mật khẩu: ");
            String password = sc.nextLine();
            account = accountService.checkLogin(accounts, mobile, password);


            if (account == null){
                System.out.println("Sai số điện thoại hoặc password");
                System.out.println("Vui lòng đăng nhập lại");
            }
        }
        return account;
    }

    public void userMenu(){
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
                    System.out.println("Danh sách sản phẩm tìm được là:  ");
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
                case 6:
                    System.out.println("Top 5 sp bán chạy nhất");
                    service.sortQuantitySale();
                    service.getTop5Product();
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
                    userMenu();
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
                userMenu();
            }

            service.getProductByPrice(choose);
        }
    }
    public void updateproduct(){
        System.out.println("Nhập id sản phẩm bạn muốn cập nhật thông tin: ");
        int id = Integer.parseInt(sc.nextLine());
        Product searchProduct = service.searchProductByID(id);
        System.out.println("Sản phẩm tìm được là: ");
        System.out.println(searchProduct);

        System.out.println("Nhập tên sản phẩm mới: ");
        String name = sc.nextLine();
        System.out.println("Nhập giá sản phẩm mới: ");
        int price = Integer.parseInt(sc.nextLine());
        service.updateProduct(searchProduct, name, price);
    }


}
