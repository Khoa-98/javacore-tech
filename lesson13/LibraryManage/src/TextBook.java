public class TextBook extends Book{

    private int yearPublish;
    private int quantity;
    private int page;
    private String author;

    public TextBook(int id, String name, String category, String NXB, int yearPublish, int quantity, int page, String author) {
        super(id, name, category, NXB);
        this.yearPublish = yearPublish;
        this.quantity = quantity;
        this.page = page;
        this.author = author;
    }

    public int getYearPublish() {
        return yearPublish;
    }

    public void setYearPublish(int yearPublish) {
        this.yearPublish = yearPublish;
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

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "TextBook:  " +  super.toString() + " - " + yearPublish + " - " + quantity +" - " + page
                + " - " + author;
    }
}
