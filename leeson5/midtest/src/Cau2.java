public class Cau2 {

    public static void testString(){

        String str = "You only live once, but if you do it right, once is enough";
        System.out.println("Số từ trong chuỗi là: " + str.length());

        System.out.println();
        char kytu = 'o';
        int count = 0;

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == kytu ){
                System.out.println("Vị trí của kí tự  "+ kytu+ " là: " + i);
                count++;
            }
        }
        System.out.println("Số kí tự " + kytu + " là: " + count);

    }
}
