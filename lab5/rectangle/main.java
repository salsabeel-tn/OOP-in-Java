/*
rectangle */
import java.util.Scanner;

public class main{
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    rectangle recArray[] = {new rectangle(), new rectangle()};
    double height, width;
    System.out.println("Enter the dimensions of the rec consecutively, height width:");
    for (int i = 0; i < recArray.length; i++) {
         height = input.nextDouble();
         recArray[i].setHeight(height);
         width = input.nextDouble();
         recArray[i].setWidth(width);
    }
    for (int i = 0; i < recArray.length; i++) {
        System.out.println("Attributes of rectangle " + (i+1));
        System.out.println("height: " + recArray[i].getHeight() + " width: " + recArray[i].getWidth() + " Area: " + recArray[i].getArea() + " Perimeter: " + recArray[i].getPerimeter() );
    }
}
}
class rectangle {

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