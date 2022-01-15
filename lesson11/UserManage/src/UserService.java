

import java.util.Scanner;

public class UserService {
    static Scanner sc = new Scanner(System.in);
    public void checkUser(){
        String username = "admin";
        String guessUser;
        String password = "admin123";
        String  guessPass;


        System.out.println("Nhập username");
        guessUser = sc.nextLine();
        System.out.println("Nhập password");
        guessPass = sc.nextLine();

        if (username.equals(guessUser)) {
            if(password.equals(guessPass)){
                System.out.println("Chào mừng: " + username + " bạn có thể thực hiện các công việc sau");
                Menu.successSignIN();
            }
            else {
                Menu.errorPass();
                int choose = Integer.parseInt(sc.nextLine());
                switch (choose){
                    case 1:
                        System.out.println("Nhập username");
                        guessUser = sc.nextLine();
                        System.out.println("Nhập password");
                        guessPass = sc.nextLine();
                        if(username.equals(guessUser) && password.equals(guessPass)){
                            System.out.println("Chào mừng: " + username + " bạn có thể thực hiện các công việc sau");
                            Menu.successSignIN();
                        }
                        else{
                            System.out.println("Chưa đúng đăng nhập lại");
                        }
                        break;
                    case  2:
                        forgetPass();

                        break;
                    default:
                        System.out.println("Không có lựa chọn này");
                }

            }
        }else {
            System.out.println("Kiểm tra lại user");
            System.out.println("Đăng nhập lại");
            System.out.println("Nhập username");
            guessUser = sc.nextLine();
            System.out.println("Nhập password");
            guessPass = sc.nextLine();
            if(username.equals(guessUser) && password.equals(guessPass)){
                System.out.println("Chào mừng: " + username + " bạn có thể thực hiện các công việc sau");
                Menu.successSignIN();
            }
        }

    }

    public void forgetPass(){
        String email = "anhkhoa98nd@gmail.com";
        String guessmail;
        String newpass;
        System.out.println("Nhập Email: ");
        guessmail = sc.nextLine();

        if(email.equals(guessmail)){
            System.out.println("Đổi mật khẩu");
            System.out.println("Mật khẩu mới: ");
            newpass = sc.nextLine();
            System.out.println("Nhập lại mật khẩu mới:");
            newpass = sc.nextLine();

        }
        else{
            System.out.println("chưa tồn tại tài khoản");
        }
    }
}

