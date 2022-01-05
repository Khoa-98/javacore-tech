import java.util.Scanner;

public class Cau4 {

    public static void cau4a(){

        int n =10;

        System.out.printf("%d số nguyên tố đầu tiên là: \n", n);
        int demsnt = 0; // đếm số số nguyên tố
        int i = 2;   // tìm số nguyên tố bắt dầu từ số 2
        while (demsnt < n) {
            if (isPrimeNumber(i)) {
                System.out.print(i + " ");
                demsnt ++;
            }
            i++;
        }
    }

    public static void cau4b(){
        int n = 10;
        System.out.println();
        System.out.printf("Tất cả các số nguyên tố nhỏ hơn %d là: \n", n);
        if (n >= 2) {
            System.out.print(2);
        }
        for (int i = 3; i < n; i+=2) {
            if (isPrimeNumber(i)) {
                System.out.print(" " + i);
            }
        }
        System.out.println();
    }


    public static boolean isPrimeNumber(int n) {
        if (n < 2) {
            return false;
        }
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

}
