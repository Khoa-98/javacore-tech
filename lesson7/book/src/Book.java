import java.util.Arrays;

public class Book {
    private int id;
    private String title;
    private String[] category;
    private String author;
    private int publishingyear;
    private String publishingcompany;

    public Book(int id, String title, String[] category, String author, int publishingyear, String publishingcompany) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.author = author;
        this.publishingyear = publishingyear;
        this.publishingcompany = publishingcompany;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String[] getCategory() {
        return category;
    }

    public void setCategory(String[] category) {
        this.category = category;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPublishingyear() {
        return publishingyear;
    }

    public void setPublishingyear(int publishingyear) {
        this.publishingyear = publishingyear;
    }

    public String getPublishingcompany() {
        return publishingcompany;
    }

    public void setPublishingcompany(String publishingcompany) {
        this.publishingcompany = publishingcompany;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", category=" + Arrays.toString(category) +
                ", author='" + author + '\'' +
                ", publishingyear=" + publishingyear +
                ", publishingcompany='" + publishingcompany + '\'' +
                '}';
    }


}
