public class Ebook extends Book{
    private int yearPublish;
    private double capacity;
    private String image;
    private int download;

    public Ebook(int id, String name, String category, String NXB, int yearPublish, double capacity, String image, int download) {
        super(id, name, category, NXB);
        this.yearPublish = yearPublish;
        this.capacity = capacity;
        this.image = image;
        this.download = download;
    }

    public int getYearPublish() {
        return yearPublish;
    }

    public void setYearPublish(int yearPublish) {
        this.yearPublish = yearPublish;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getDownload() {
        return download;
    }

    public void setDownload(int download) {
        this.download = download;
    }

    @Override
    public String toString() {
        return  "Ebook: " + super.toString() + " - " + yearPublish +" - "
                + capacity + " - " + image + " - " + download;
    }
}
