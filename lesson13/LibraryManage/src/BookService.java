import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class BookService{
    public ArrayList<Book> getBook(){
        ArrayList<TextBook> textbook = new ArrayList<>();
        textbook.add(new TextBook(1, "Ngữ pháp TA","Ngoại ngữ", "Giáo dục Việt Nam", 1999, 12, 150, "Khoa" ));
        textbook.add(new TextBook(2, "Văn mẫu ","Ngữ Văn", "Giáo dục Việt Nam", 2000, 15, 160, "Hương" ));

        ArrayList<Newspaper> newspaper = new ArrayList<>();
        newspaper.add(new Newspaper(1, "Thanh Niên", "Tin tức", "TP.HCM", LocalDate.of(1998, 10, 16), 20, 15));
        newspaper.add(new Newspaper(2, "Xã Hội", "tin tức, Phản ánh", "Bách khoa HN", LocalDate.now(), 25, 18));

        ArrayList<Ebook> ebook = new ArrayList<>();
        ebook.add(new Ebook(1,"Con cáo và chùm nho", "Truyện ngụ ngôn", "Nhi đồng", 1990, 192, "abc", 3555));
        ebook.add(new Ebook(2,"Danh sách từ vựng TA", "Tài liệu tham khảo", "HCM", 2022, 190, "abc", 5555));

        ArrayList<Book> books = new ArrayList<>();
        books.addAll(textbook);
        books.addAll(newspaper);
        books.addAll(ebook);


        return books;

    }

    public void show(ArrayList<?> list){
        for (Object o:list){
            System.out.println(o);
        }
    }

    public void searchByName(ArrayList<Book> books, String searchName){
        for (Book b: books){
            if(b.getName().toLowerCase().contains(searchName.toLowerCase())){
                System.out.println(b);
            }
        }
    }

    public void searchByCategory(ArrayList<Book> books, String searchCatogery){
        for (Book b:books){
            if(b.getCategory().toLowerCase().contains(searchCatogery.toLowerCase())){
                System.out.println(b);
            }
        }
    }

}
