package TestClassFolder;

public class GeoObject {
    private boolean isFilled;
    private String color;

    public GeoObject() {
        
    }

    public GeoObject(boolean isFilled, String color) {
        this.isFilled = isFilled;
        this.color = color;
    }


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