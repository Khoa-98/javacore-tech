import java.time.LocalDate;
// trong lập trình java ko hỗ trợ đa kế thừa mà được hỗ trợ thông qua interface

public class Main {

    public static void main(String[] args) {
        Student students = new Student(1, "khoa", 1998, "java-08", 8.0);
        System.out.println(students);

        Teacher t = new Teacher(2, "Ba", 1992, "HTML/CSS", 800000);
        System.out.println(t);

        SchoolBook book = new SchoolBook(3, "Tắt đèn","kim đồng", 1960, 50, 200, "new", 10 );
        System.out.println(book);
//        SchoolBookService ss = new SchoolBookService();
//        System.out.println(ss);

        Calculator.sum(3, 4);
        Calculator.sum(5.5, 6.6);
        Calculator.sum(3,4,5);
    }
}
