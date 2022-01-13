import java.awt.Menu;
import java.util.ArrayList;
import java.util.Scanner;


public class MovieController {
        ArrayList<Movie> movies;
        MovieService service;
        Scanner sc;

        public MovieController(){
            service = new MovieService();
            movies = service.getAllMovie();
            sc = new Scanner(System.in);
        }

        public void mainMenu(){
            boolean isContinue = true;
            while (isContinue){
                Menu1.menu();
                int choose = Integer.parseInt(sc.nextLine());
                switch (choose){
                    case 1:
                        System.out.println("Danh sách phim ban đầu là: ");
                        service.show(movies);
                        break;
                    case 2:
                        System.out.println("Danh sách phim sau khi sắp xếp theo năm XB: ");
                        service.sortYear(movies);
                        service.show(movies);
                        break;
                    case 3:
                        System.out.println("Danh sách phim sau khi sắp xếp theo tên: ");
                        service.sortTitle(movies);
                        service.show(movies);
                        break;
                    case 4:
                        System.out.println("Nhập tên phim: ");
                        String title = sc.nextLine();
                        System.out.println("Danh sách phim tìm được là: ");
                        service.searchByTitle(movies, title);
                        break;
                    case 5:
                        System.out.println("3 phim có lượt xem cao nhất");
                        service.sortView(movies);
                        service.threeMaxView(movies);
                       break;
                    case 6:
                        System.out.println("Nhập thể loại: ");
                        String category = sc.nextLine();
                        System.out.println("Danh sách phim tìm được là: ");
                        service.searchByCategory(movies, category);
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