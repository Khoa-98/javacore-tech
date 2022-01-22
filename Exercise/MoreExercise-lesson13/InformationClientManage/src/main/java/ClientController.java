import java.util.ArrayList;
import java.util.Scanner;

public class ClientController {
    ArrayList<InforClient> clients;
    ClientService service;
    Scanner sc;

    public ClientController(){
        service = new ClientService();
        clients = service.getInforClient();
        sc = new Scanner(System.in);
    }

    public void mainMenu(){
        boolean isContinue = true;
        while (isContinue){
            Menu.menu();
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    System.out.println("Thông tin toàn bộ khách hàng: ");
                    service.show(clients);
                    break;
                case 2:
                    System.out.println("Bạn muốn tìm thông tin khách hàng: ");
                    Menu.selectGenderClient();
                    switch (choice){
                        case 1:

                            break;

                    }
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Không có lựa chọn này");
            }
        }
    }
}
