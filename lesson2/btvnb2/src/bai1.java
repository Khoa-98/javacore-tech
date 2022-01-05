import java.util.Scanner;

public class bai1 {
    public static void usingScanner(){
        Scanner sc =  new Scanner(System.in);

        System.out.println("Nhâp tên của bạn: ");
        String name = sc.nextLine();
        System.out.println("kich thước của chuỗi này là: " + name.length());


        System.out.println("\nNhập địa chỉ của bạn: ");
        String address = sc.nextLine();
        System.out.println("kich thước của chuỗi này là: " + address.length());

        String soSanh1 = name.equals(address) ? "\nkết quả: chuỗi bằng nhau" : "\nkết quả: chuỗi không bằng nhau";
        System.out.println(soSanh1);
        String soSanh2 = name.length() == address.length() ? "kích thước hai chuỗi bằng nhau" : "kích thước hai chuỗi khác nhau";
        System.out.println(soSanh2);

    }
}
