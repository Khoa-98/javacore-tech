import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.Scanner;

public class main {


    public static void main(String[] args) {

//        System.out.println("xin chao");

        //Bộ định dạng có sẵn trong printf
//        System.out.printf("kí tu %c, chuoi %s, so nguyen %d", 'a', "chuoi", 21);
//        System.out.println();

//        System.out.printf("%s%5d%s\n", "khoa", 23, "nam dinh");
//        System.out.printf("%s%d%s\n", "hương", 23, "ha noi");
//        System.out.printf("%s%d%s\n", "sang", 23, "nam dinh");
//        System.out.printf("%s%d%s\n", "thao", 21, "ha noi");

//        scannerExample.usingscanner();

//        LocalDate toDay = LocalDate.now();
//        System.out.println(toDay);
//
//        System.out.println(toDay.getDayOfYear());
//        System.out.println(toDay.getMonth());
//        System.out.println("ngay mai: "+ toDay.plusDays(1));
//        System.out.println("Hom qua: "+ toDay.minusDays(1));
//        System.out.println("thang tiep theo: "+ toDay.plusMonths(1));
//        System.out.println(toDay.getYear());

//        LocalTime time = LocalTime.now();
//        System.out.println(time);
//
//        LocalTime time2 = LocalTime.of(20, 30, 59);
//        System.out.println(time2);
//
//        System.out.println(time.getHour()); // muon lay cai gi thi dung "get"
//        System.out.println(time.getMinute());
//        System.out.println(time.getSecond());
//        System.out.println(time.plusMinutes(100));
//        System.out.println(time.plusHours(20)); // cong them hours
//        LocalDate Date = LocalDate.of(2021, 12, 18);
//        System.out.println(Date);
//
//        LocalDateTime dateTime = LocalDateTime.now();
//        System.out.println(dateTime);
//                                            // dd: ngay, MM: thang, yyyy: nam , mm: phut
//        DateTimeFormatter myFormat = DateTimeFormatter.ofPattern(" hh:mm, dd/MM/yyyy");
//        System.out.println(dateTime.format(myFormat));

        // hằng số:
        // nên khai bảo luôn từ đầu vì hằng số ko thể thay đổi
        // thường khai báo luôn trong hàm main
        // giá trị của hằng số sẽ xuyên suốt chương trình của mình

        System.out.println("\" xin \n chao \"");

        //ép kiểu:
        // khi ep kiểu theo kieur tường minh sẽ gây ra mất mát dữ liệu
        //class wrapper : các kiểu Integer, long , float, double -> các kiểu này sẽ là class
        // Integer i = Integer.parseInt(s);
        // -----------Double.parseDouble(s);
//        System.out.println(div(9, 4));

        //Nhập xuất DL từ bàn phím:
        // class scanner: có thể đọc dữ liệu từ bàn phím or từ file

            // lop Math:
            //Math.

        //Toán tử:

//        int i = 5;
//        int j = i++;
//        System.out.println(j);
//        System.out.println(i);

        //toán tử logic:
        //a=5, b=6 , c=7
        // &&: và
        // a==b && a==c
        // || : hoặc

        // toán tử đa ngôi / điều kiện

        Scanner sc = new Scanner(System.in);
//        System.out.println("nhap so bat ky: ");
//        int number = sc.nextInt();
//
//        Random rd = new Random();// sinh so ngau nhien
//        int rdNumber = rd.nextInt(100-98);
//        System.out.println("so ngau nhien: " + rdNumber);
//
//
//        String rs = rdNumber==number ? rdNumber + " Giong voi so nhap tu ban phim" : rdNumber+ " khong giong voi so nhap tu ban phim";
//        System.out.println(rs);

        // bai tap: tinh canh huyen cuar tam giac vuong:

        System.out.println("nhap gia tri cua a");
        System.out.println("nhap gia tri cua b");
        double
        double c = Math.sqrt(9)





    }
//    public static double div(int a, int b){
//        return double ((a*a)+(b*b));
//    }

}
