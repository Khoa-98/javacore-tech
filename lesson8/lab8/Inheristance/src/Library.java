public class Library {
    private int id;
    private String nameBook;
    private String publishing;
    private int yearPublishing;
    private int quantily;

    public Library(int id, String nameBook, String publishing, int yearPublishing, int quantily) {
        this.id = id;
        this.nameBook = nameBook;
        this.publishing = publishing;
        this.yearPublishing = yearPublishing;
        this.quantily = quantily;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public String getPublishing() {
        return publishing;
    }

    public void setPublishing(String publishing) {
        this.publishing = publishing;
    }

    public int getYearPublishing() {
        return yearPublishing;
    }

    public void setYearPublishing(int yearPublishing) {
        this.yearPublishing = yearPublishing;
    }

    public int getQuantily() {
        return quantily;
    }

    public void setQuantily(int quantily) {
        this.quantily = quantily;
    }

    @Override
    public String toString() {
        return "id=" + id +
                ", nameBook='" + nameBook + '\'' +
                ", publishing='" + publishing + '\'' +
                ", yearPublishing=" + yearPublishing +
                ", quantily=" + quantily;
    }
}