public class Main {
    public static void main(String[] args) {
        System.out.println("Thông tin nhân viên: ");
        Emlpoyee[] employee = new Emlpoyee[2];

        Waiter waiter = new Waiter(1, "Nam", 23, 5000000, 3000000);
        System.out.println(waiter);

        Kitchen kitchen = new Kitchen(2, "Thái Bảo", 40, 6000000, 5000000);
        System.out.println(kitchen);


    }
}
