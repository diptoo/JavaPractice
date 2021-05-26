package TestClassFolder;

public abstract class GeoObject { //italic means abstract
    private boolean isFilled;
    private String color;

    // # means protected in uml diagram 
    protected GeoObject() { //Protected because the class is abstract. So instance won't be created. But can be inherited by sub class
        
    }

    protected GeoObject(boolean isFilled, String color) {
        this.isFilled = isFilled;
        this.color = color;
    }

    public abstract double getArea();

    public boolean isIsFilled() {
        return this.isFilled;
    }

    public boolean getIsFilled() {
        return this.isFilled;
    }

    public void setIsFilled(boolean isFilled) {
        this.isFilled = isFilled;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }


}