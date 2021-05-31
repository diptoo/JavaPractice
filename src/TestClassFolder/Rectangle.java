/*
    Name: Dipto
    Date: 05/10/2021
    Neso Academy Lec-16
*/
/*
    Name: Dipto
    Date: 05/10/2021
    Neso Academy inheritence Lec-03
*/

package TestClassFolder;

public class Rectangle extends GeoObject implements Drawable {
    private double width;
    private double height;

    public Rectangle()
    {
        this(1, 1); // calls second ctor
    }

    public Rectangle(double width, double height)
    {
        this(true, "black", width, height); // calls third ctor
    }

    public Rectangle(boolean isFilled, String color, double width, double height)
    {
        // calls the empty ctor
        //super();

        //calls the parameter ctor
        super(isFilled, color);
        
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea()
    {
        return width * height;
    }

    public double getPerimeter()
    {
        return Math.PI * height * width;
    }

    public double getWidth() {
        return this.width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Drawing rectangle");

    }

}