import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // If , if else, ....

//        System.out.println("Cân nặng của bạn là: ");
//        double cannang = sc.nextDouble();
//
//        System.out.println("chiều cao của bạn là: ");
//        double chieucao = sc.nextDouble();
//
//        double bmi = bmiCalcu(cannang, chieucao);
//        if(bmi<18.5){
//            System.out.println("Thieu can");
//        }else if(bmi>=18.5 && bmi <= 24.9){
//            System.out.println("binh thuong");
//        }else{
//            System.out.println("thua can, beo phi");
//        }

//        System.out.println("canh a");
//        int a = sc.nextInt();
//
//        System.out.println("canh b");
//        int b = sc.nextInt();
//
//        System.out.println("canh c");
//        int c = sc.nextInt();
//        if(a+b>c && a+c>b && c+b>a){
//            System.out.println("hinh tam giac");
//        }

        // swich case: kiểm tra giá trị của biến để xét các trường hợp.
        // default: thực hiện các trường hợp ko có trong case
        // break: để kết thúc 1 case và chuyển sang case khác.
        // sử dụng để làm menu nhiều

        System.out.println("nhap so bat ki:");
//        int num = sc.nextInt(); // ví dụ

//        switch (num){
//            case 2:
//                System.out.println("thu 2");
//                break;
//            case 3:
//                System.out.println("thu 3");
//                break;
//            case 4:
//                System.out.println("thu 4");
//                break;
//            case 5:
//                System.out.println("thu 5");
//                break;
//            case 6:
//                System.out.println("thu 6");
//                break;
//            case 7:
//                System.out.println("thu 7");
//                break;
//            default:
//                System.out.println("khong co truong hop nay");
//        }

//        int month = sc.nextInt();
//
//        switch (month){
//            case 1, 3, 5, 7, 8, 10, 12:
//                System.out.println("có 31 ngày");
//                break;
//            case 2:
//                System.out.println("có 28 hoặc 29 ngày");
//                break;
//            case 4, 6, 9, 11:
//                System.out.println("có 30 ngày");
//        }

        // vòng lặp For:

        // EXercise 2:

//        for (int i = 1; i<=100; i++){           //thực hiện 1 lần, biến i chỉ dùng đc trong vòng lặp for này
//            if (i%3==0) {
//                if (i % 5 == 0) {
//                    System.out.println("FizzBuzz"); //trường hợp true thì in FizzBuzz
//                } else {
//                    System.out.println("Fizz"); //trường hợp chia hết cho 3 nhưng ko chia hết cho 5 thì in ra Fizz
//                }
//            }else {    //trường hợp ko chia hết cho 3
//                if(i%5==0){  // trường hợp chia hết cho 5 thì in ra Buzz
//                    System.out.println("Buzz");
//                }else{
//                    System.out.println(i);
//                }
//            }
//
//        }

        // vòng lặp while: kiểm tra kiều kiện trước rồi thực hiện khối lệnh
        // điều kiện thực hiện trong while luôn true.

//        System.out.println("Số ngẫu nhiên");
//        Random rd = new Random();
//         int number = 0;
//         int count = 0;
//        while (number <=11){
//            number = rd.nextInt(15);
//            System.out.println(number);
//            count++;
//        }
//        System.out.println("so lan lap:" + count);




        // Do while: thực hiện khối lệnh trước khi xét điều kiện trong while

//        int age = 0;
//        do{
//            System.out.println("nhap tuoi: ");
//            age = sc.nextInt();
//        }while (age <=0 || age >200);
//
//        System.out.println(age);

        // Excercise BMI
//        double height = 1;
//        double weight = 0.1;
//        do {
//
//            System.out.println("nhap chieu cao");
//             height = sc.nextDouble();
//
//        }while(height >=2.5 || height <0.1);
//
//        System.out.println(height);
//
//        do {
//
//            System.out.println("nhap can nang: ");
//            weight = sc.nextDouble();
//        }while(weight < 1 || weight >= 100 );
//
//        System.out.println(weight);


        // Excercise

        boolean isContinue = true ;
        Random rd = new Random();
        int rdNumber = rd.nextInt(100);

        while(isContinue){
            System.out.println("Doan so:");
            int number = sc.nextInt();

            if( number == rdNumber){
                System.out.println("ban doan dung roi");
                isContinue = false;
            }else if(number > rdNumber){
                System.out.println("doan lon hon mat roi");
            }
            else{
                System.out.println("ban doan nho hon mat roi");
            }

        }

    }








//    public static double bmiCalcu(double cannang, double chieucao){
//        return cannang/(chieucao*chieucao);
//
//    }
}
