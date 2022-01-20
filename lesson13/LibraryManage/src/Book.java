public class Book {

    private int id;
    private String name;
    private String category;
    private String NXB;

    public Book(int id, String name, String category, String NXB) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.NXB = NXB;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getNXB() {
        return NXB;
    }

    public void setNXB(String NXB) {
        this.NXB = NXB;
    }

    @Override
    public String toString() {
        return  id +
                " - " + name +
                " - " + category + " - " + NXB;
    }
}
