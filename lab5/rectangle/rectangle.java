/**
 * rectangle
 */
public class rectangle {

    private double width;
    private double height;

    rectangle(){
        this(1.0, 1.0); //initializing the values to 1 by calling the other constructor but with different code
                        //(the second constroctor)
    };
    rectangle( double width, double height){
        setWidth(width);
        setHeight(height);
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getHeight() {
        return height;
    }
    public double getWidth() {
        return width;
    }
    
    public double getArea() {
        return height * width;
    }

    public double getPerimeter() {
        return height*2 + width*2;
    }
}