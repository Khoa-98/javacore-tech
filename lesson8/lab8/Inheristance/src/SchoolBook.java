public class SchoolBook extends Library{
    private int page;
    private String status;
    private int quantilyOfborrow;

    public SchoolBook(int id, String nameBook, String publishing, int yearPublishing, int quantily, int page, String status, int quantilyOfborrow) {
        super(id, nameBook, publishing, yearPublishing, quantily);
        this.page = page;
        this.status = status;
        this.quantilyOfborrow = quantilyOfborrow;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getQuantilyOfborrow() {
        return quantilyOfborrow;
    }

    public void setQuantilyOfborrow(int quantilyOfborrow) {
        this.quantilyOfborrow = quantilyOfborrow;
    }

    @Override
    public String toString() {
        return  super.toString() +
                "page=" + page +
                ", status='" + status + '\'' +
                ", quantilyOfborrow=" + quantilyOfborrow ;
    }
}
