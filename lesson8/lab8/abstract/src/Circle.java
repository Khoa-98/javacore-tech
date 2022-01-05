public class Circle extends Geometry {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return  "radius=" + radius + " - " + getAera() + " - " + getPrimeter();
    }

    @Override
    public double getAera() {
        return radius*radius* Math.PI;
    }

    @Override
    public double getPrimeter() {
        return 2*radius*Math.PI;
    }
}
