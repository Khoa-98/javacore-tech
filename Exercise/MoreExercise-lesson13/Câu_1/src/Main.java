import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean isContinue = true;
        do {
            System.out.println("Nhập 1 số bất kì: ");
            int a = input();
            if(checkPrimeNumber(a)){
                System.out.println(a + " Là số nguyên tố");
            }else {
                System.out.println(a + " Không phải là số nguyên");
            }
        }while (isContinue);



    }

    public static boolean checkPrimeNumber(int A){
        if (A < 2){
            return false;
        }else {
            for (int i = 2; i<= Math.sqrt(A); i++){
                if(A % i == 0){
                    return false;
                }
            }
        }
        return true;
    }

    public static int input(){
        Scanner sc = new Scanner(System.in);
        int a = 0;
        boolean isContinue = true;
        while(isContinue){
            try{
                a = Integer.parseInt(sc.nextLine());
                if(a <= 0){
                    throw new MyException("Không hợp lệ");
                }
                isContinue = false;
            } catch (MyException e) {
                System.out.println(e.getMessage());
                System.out.println("Vui lòng nhập lại: ");
            }
            catch (NumberFormatException e){
                System.out.println("Vui lòng nhập số");
            }
        }
        return a;
    }
}
