public class task2{
    public static void main(String [] args){
        Circle2D circle1 = new Circle2D();
        Circle2D circle2 = new Circle2D(5,2,8);

        System.out.printf("\n\tCircle 1\nWidth: %.2f \nHeight: %.2f \nRadius: %.2f \nArea: %.2f \nPerimeter: %.2f\n", circle1.x, circle1.y, circle1.radius, circle1.getArea(), circle1.getPerimeter());
        System.out.printf("\n\tCircle 2\nWidth: %.2f \nHeight: %.2f \nRadius: %.2f \nArea: %.2f \nPerimeter: %.2f\n", circle2.x, circle2.y, circle2.radius, circle2.getArea(), circle2.getPerimeter());

    
    }
}


class Circle2D {
    double x = 0, y = 0, radius = 1;
    
    Circle2D(){
    }
    
    Circle2D(double x, double y, double r){
        this.x = x;
        this.y = y;
        this.radius = r;
    }
    
    double getx() {
        return x;
    }	
    
    double gety() {
        return y;
    }	
    
    double getrad() {
        return radius;
    }

    double getArea(){
        return (Math.PI*Math.pow(radius,2));
    }
    
    double getPerimeter(){
        return (2*Math.PI*radius);}}
