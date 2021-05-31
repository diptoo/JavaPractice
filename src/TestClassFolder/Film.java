package TestClassFolder;

public class Film extends Video { // when we extends video, by default it tries to call the default constructor of video
    private String type;
    private String star;


    public Film(String name, double duration, String type, String star) {
        super(name, duration);
        this.type = type;
        this.star = star;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStar() {
        return this.star;
    }

    public void setStar(String star) {
        this.star = star;
    }
    
    @Override
    public String toString() {
        return "{" +
            " type='" + getType() + "'" +
            ", star='" + getStar() + "'" +
            "}";
    }
    
}