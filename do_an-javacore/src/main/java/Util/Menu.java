package Util;

public class Menu {
    public static void menuHome(){
        System.out.println("1 - Người dùng");
        System.out.println("2 - Admin");
        System.out.println("Lựa chọn của bạn là: ");

    }

    public static void menu(){
        System.out.println("1 - Xem toàn bộ sản phẩm");
        System.out.println("2 - Xem thông tin sản phẩm theo danh mục");
        System.out.println("3 - Xem thông tin sản phẩm theo hãng");
        System.out.println("4 - Xem sản phẩm theo mức giá");
        System.out.println("5 - Tìm kiếm sản phẩm bằng tên");
        System.out.println("6 - Top 5 các sản phẩm bán chạy nhất");
        System.out.println("0 - Thoát chương trình");
        System.out.println("Lựa chọn của bạn: ");
    }

    public static void creatCategoryMenu(){
        System.out.println("Chọn danh mục sản phẩm: ");
        System.out.println("1 - Điện thoại");
        System.out.println("2 - Máy tính xách tay");
        System.out.println("3 - Máy tính bảng");
        System.out.println("4 - Đồng hồ thông minh");
        System.out.println("5 - Phụ kiện");
    }

    public static void adminMenu(){
        System.out.println("1 - Xem toàn bộ sản phẩm");
        System.out.println("2 - Cập nhật Sản phẩm ");
        System.out.println("3 - Xoá sản phẩm khỏi danh sách");
        System.out.println("4 - Thêm 1 sản phẩm mới vào danh sách");
        System.out.println("0 - Thoát khỏi chương trình");
    }


}
