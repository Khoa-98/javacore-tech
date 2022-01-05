public class main {
    public static double point; // day la bien toan cuc
    public static void main(String[] args) {
//
//        double canNang = 70;
//        double chieuCao = 1.72;
//        double b = person.BMI(canNang, chieuCao);
//        System.out.printf("ket qua BMI cua ban la %.1f " , b);
//        System.out.printf("can nang %s, chieu cao %d, ket qua BMI cua ban la %s" , b);
        String name = "Khoa";
        System.out.println(name.length());
        System.out.println(name.indexOf('K')); // tra ve chi muc
        System.out.println(name.charAt(2));// tra ve ki tu
        System.out.println(name.lastIndexOf('a'));
        String address = "   HN";
        System.out.println(address.trim());

        week thuhai = week.MONDAY;
        System.out.println(thuhai);



    }

    public static void myMethod(){
        System.out.println("xin chao toi ten la khoa");
    }

    public static void introduce (String name, int age, String address){
        System.out.println("Ten toi la" + name);
        System.out.println("nam nay toi" + age +"tuoi");
        System.out.println("toi dang o" + address);
    }
}
