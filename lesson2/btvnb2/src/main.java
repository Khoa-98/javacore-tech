import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        System.out.println("bài 1");
        bai1.usingScanner();

        Scanner sc = new Scanner(System.in);

        System.out.println("\nbài 2");
        System.out.println("\nĐiểm thực hành: ");
        double diemThuchanh = sc.nextDouble();

        System.out.println("\nĐiểm lý thuyết: ");
        double diemLythuyet = sc.nextDouble();

        double diemTb = bai2.diemTrungbinh(diemThuchanh, diemLythuyet);
        System.out.println("Điểm trung bình là: " + diemTb);

        String result = diemTb >= 6 ? diemTb +" đạt" : diemTb + "trượt";
        System.out.println(result);
    }
}
