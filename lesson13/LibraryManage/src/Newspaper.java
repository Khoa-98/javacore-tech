import java.time.LocalDate;

public class Newspaper extends Book{
    private LocalDate date;
    private int quantity;
    private int page;

    public Newspaper(int id, String name, String category, String NXB, LocalDate date, int quantity, int page) {
        super(id, name, category, NXB);
        this.date = date;
        this.quantity = quantity;
        this.page = page;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    @Override
    public String toString() {
        return  "Newspaper:  "+  super.toString() + " - " + date
                + " - "+ quantity + " - " + page;
    }
}
