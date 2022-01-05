public abstract class Geometry {
    public abstract double getAera();
    public abstract double getPrimeter();

    @Override
    public String toString() {
        return   getAera()+ " - " + getPrimeter();
    }
}
