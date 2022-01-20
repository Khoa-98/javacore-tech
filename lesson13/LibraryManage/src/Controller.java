import java.util.ArrayList;
import java.util.Scanner;

public class Controller {
    ArrayList<Book> books;
    BookService service;
    Scanner sc;

    public Controller (){
        service = new BookService();
        books = service.getBook();
        sc = new Scanner(System.in);
    }

    public void mainMenu(){
        boolean isContinue = true;
        while(isContinue){
            Menu.menu();
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    System.out.println("Danh sách tất cả sách trong thư viện là: ");
                    service.show(books);

                    break;
                case 2:
                    System.out.println("Nhập tên: ");
                    String name = sc.nextLine();
                    System.out.println("Danh sách sách tìm được là:");
                    service.searchByName(books, name);

                    break;
                case 3:
                    System.out.println("Nhập thể loại: ");
                    String category = sc.nextLine();
                    System.out.println("Danh sách tìm được là: ");
                    service.searchByCategory(books, category);
                    break;
                case 4:
                    System.out.println("Ebook có lượt tải nhiều nhất là: ");
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
