import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Developer d = new Developer(1, "khoa", LocalDate.of(1998, 10, 16), 150000000, 20);
        System.out.println(d);

        Tester t = new Tester(2, "Hương", LocalDate.of(1998, 8, 8), 60000000, 15);
        System.out.println(t);

        Circle c = new Circle(3.5);
        System.out.println(c);
    }
}
