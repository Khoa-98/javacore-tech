import java.util.Scanner;

public class Cau1 {

    public static void inTamgiac(){
        Scanner sc = new Scanner(System.in);
        int hight;
        System.out.printf("\n\nNhập vào chiều cao của tam giác: ");
        hight = sc.nextInt();
        for (int i = 1; i <= hight; ++i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print("* ");
            }
            System.out.println();
        }


    }
    public static void inHinhvuong(){
        Scanner sc = new Scanner(System.in);
        int hight;
        System.out.printf("\n\nNhập vào chiều cao của hình vuông: ");
        hight = sc.nextInt();
        for (int i = 1; i <= hight; ++i) {
            for (int j = 1; j <= hight; ++j) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
