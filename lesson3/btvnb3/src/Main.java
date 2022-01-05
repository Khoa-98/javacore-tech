import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Bài 1
        System.out.println("bài 1 ");
        char kytu = 'o';
        int count = 0;

        String str = "You only live once, but if you do it right, once is enough";
        System.out.println(str);
      // duyet tu dau den cuoi chuoi
        for (int i =0; i < str.length(); i++){
            if ( str.charAt(i) == kytu ){
                System.out.println("vị trí:" + i);
                count++;
            }
        }
        System.out.println("\nSố kí tự " + kytu +  " trong chuỗi là:" + count);


        //bài 2:
        System.out.println("bài 2 \n");

        Scanner sc = new Scanner(System.in);

        double nghiem;
        System.out.println("Nhập a: ");
        int a = sc.nextInt();

        System.out.println("Nhập b: ");
        int b = sc.nextInt();

        System.out.println("phương trình của bạn vừa nhập là: " + a + "x + " + b + "= 0.");

        if (a==0){
            if (b==0){
                System.out.println("Phương trình có vô số nghiệm ");
            }else{
                System.out.println("Phương trình vô nghiệm ");
            }
        }else {
            nghiem = (double) -b/a;
            System.out.printf(" \n Nghiệm của phương trình là %.2f  " , nghiem);
        }

    }
}
