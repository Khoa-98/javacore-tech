import java.util.Random;
import java.util.Scanner;

public class Cau3 {

    public static void randomNumber(){

        System.out.println();
        Random rd = new Random();// sinh so ngau nhien
        int rdNumber = rd.nextInt(100);
        System.out.println("Số ngẫu nhiên: " + rdNumber);
        if (isPrimeNumber(rdNumber)){
            System.out.println("Số   " + rdNumber + " là số nguyên tố");
        }else{
            System.out.println("Số   " + rdNumber + " không là số nguyên tố ");
        }
        System.out.println();

    }
    public static boolean isPrimeNumber(int rdNumber) {
        if ( rdNumber < 2) {
            return false;
        }
        int squareRoot = (int) Math.sqrt(rdNumber);
        for (int i = 2; i <= squareRoot; i++) {
            if (rdNumber % i == 0) {
                return false;
            }
        }

        return true;
    }
}
