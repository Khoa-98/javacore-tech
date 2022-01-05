import java.util.Arrays;

public class BookService {

    public static Book[] getAllBook(){
        Book[] books = new Book[2];

        String[] category = new String[]{"tình cảm", "kinh dị"};
        books[0] =  new Book(1, "cuốn theo chiều gió", category, "abc", 1990, "kim Đồng");
        books[1] = new Book(2,
                "dế mèn phiêu lưu kí",
                new String[]{"phiêu lưu", "viễn tưởng", "tình cảm"},
                "abc", 1990, "kim đồng"
                );

//        for(Book b: books){
//            System.out.println(b);
//        }
//        String str = "phiêu lưu";
//        for (Book b:books){
//            if(Arrays.toString(b.getCategory()).contains(str)){
//                System.out.println(b);
//            }
//        }

//        for (Book b: books){
//            for (String gender : b.getCategory()){
//                if(gender.equals("phiêu lưu")){
//                    System.out.println(b);
//                }
//            }
//        }

        return books;
    }

    public static void printBook(Book[] arrBook){
        for(Book book :arrBook){
            System.out.println(book);
        }
    }

    public static void getBookcatetory(Book[] books, String catetory){

        for(Book b: books){
            for(String gender : b.getCategory()){
                if(gender.equals(catetory)){
                    System.out.println(b);
                }
            }

        }
    }
}
