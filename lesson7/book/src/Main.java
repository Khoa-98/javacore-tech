public class Main {
    public static void main(String[] args) {
        Book[] books = BookService.getAllBook();
        System.out.println("Danh sách: ");
        BookService.printBook(books);

        System.out.println("sách có thể loại Phiêu lưu");
        BookService.getBookcatetory(books, "phiêu lưu");
    }
}
