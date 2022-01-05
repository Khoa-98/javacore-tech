import java.util.Scanner;

public class Cau6 {

    public static void MutilArray(){
        int soDong, soCot;
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập vào số dòng của mảng: ");
        soDong = sc.nextInt();
        System.out.println("Nhập vào số cột của mảng: ");
        soCot = sc.nextInt();

        // khai báo và cấp phát bộ nhớ cho mảng
        int[][] arr = new int[soDong][soCot];

        for (int i = 0; i < soDong; i++) {
            for (int j = 0; j < soCot; j++) {
                System.out.print("Nhập phần tử thứ [" + i + ", " + j + "]: ");
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Mảng vừa nhập: ");
        for (int i = 0; i < soDong; i++) {
            for (int j = 0; j < soCot; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            // sau khi viết xong 1 dòng thi xuống hàng
            System.out.println("\n");
        }
        System.out.println("Các phần tử trên đường chéo chính là: ");
        for (int i = 0; i < soDong; i++) {
            for (int j = 0; j < soCot; j++) {

                if (i == j) {
                    System.out.println( arr[i][j] + "\t");
                }
            }
        }

    }
}
