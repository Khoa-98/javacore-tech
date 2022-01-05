import java.util.Scanner;

public class Cau5 {

    public static void  chuanHoaChuoi(){
        System.out.println();
        String chString = " tran   dang    khoa ";
        chString = chString.trim();
        chString = chString.replaceAll("\\s+ ", " ");
        String[] chStr = chString.split(" ");
        chString ="";

        for(int i=0;i<chStr.length;i++) {
            chString+=String.valueOf(chStr[i].charAt(0)).toUpperCase() + chStr[i].substring(1);
            if(i<chStr.length-1) // nếu chStr[i] không phải từ cuối cùng
                chString+=" ";   // cộng thêm một khoảng trắng
        }

        System.out.println(chString);
    }

    public static void ChuoiDoixung(){

        String ktString="";
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào chuỗi bạn muốn kiểm tra: ");
        String inputStr = sc.nextLine();
        int length = inputStr.length();
        for ( int i = length - 1 ; i >= 0 ; i-- ){
            ktString = ktString + inputStr.charAt(i);
        }
        if (inputStr.equals(ktString)){
            System.out.println("Đây là chuỗi đối xứng!");
        }
        else{
            System.out.println("Đây không phải là chuỗi đối xứng!");
        }
        System.out.println();
}
}
