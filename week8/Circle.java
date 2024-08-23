package Shape;

public class Circle implements Shape, Resizable {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    //Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    //Override
    public void resize(double percentage) {
        radius *= (1 + percentage / 100);
    }

    public double getRadius() {
        return radius;
    }
}

