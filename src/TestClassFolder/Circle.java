package TestClassFolder;

 public class Circle extends GeoObject implements Drawable {
    Point center;
    double radius;

    public Circle()
    {

    }

    public Circle(Point center, double radius)
    {
        this.center = center;
        this.radius = radius;
    }

    public double getPerimeter()
    {
        return 2 * Math.PI * radius;
    }

    @Override
    public double getArea()
    {
        return Math.PI * radius * radius;
    }

    void setCenter(Point center)
    {
        this.center = center;
    }

    void setRadius(double radius)
    {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing circle");

    }
}