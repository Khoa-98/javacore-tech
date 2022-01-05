import com.sun.source.tree.ReturnTree;

import java.util.Scanner;

public class ExcerciseArray {

    public static String[] inputArray(){

        Scanner sc = new Scanner(System.in);  // nhập DL từ bàn phím
        System.out.println("nhập số phần tử của mảng: ");
        int n = sc.nextInt();   // nhập DL kiểu số nguyên

        sc.nextLine(); // sử dụng khi bị bỏ qua lệnh
        String [] strArray = new String[n]; // cấp phát bộ nhớ cho mảng

            // duyệt từng phần tử trong mảng
        for (int i=0; i<n; i++){
            System.out.printf("Nhập phần tử strArray[%s]: ", i);
            strArray [i]= sc.nextLine();
        }
        System.out.println("Mảng vừa nhập là: ");
        return strArray;


    }

    public static void printArray (String[] strArray){
        for (int i=0; i<strArray.length; i++){
            System.out.print( strArray[i]+ "\t");
        }
        System.out.println();

    }

    public static String[] countArray(String[] strArray){
        String str = "java";
        int count = 0;

        for (int i=0; i<strArray.length; i++){
            // so sánh từng phần tử của mảng với chuỗi
            if(strArray[i].equals(str) ){
                // nếu thoả mãn điều kiện thì biến đếm tăng lên 1
                count++;
            }
        }

        System.out.println("Số lần " + str + " xuất hiện trong mảng là: " + count);

        return strArray;

    }

    public static void stringToArray(String[] strArray){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập 1 chuỗi bất kì trong mảng: ");
        String str1 = sc.nextLine();

        for (int i=0; i< strArray.length; i++ ){
            if (strArray[i].equals(str1)){
                System.out.println("Vị trí: " + i);
            }
        }

    }
}
