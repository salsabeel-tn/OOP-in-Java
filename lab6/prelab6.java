public class prelab6 {
    public static void main (String[] args) {
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(5, 10);
        circle.setCenter(0, 0);
        rectangle.setLocation(10, 15);
        circle.setColor("Black");
        circle.Print();
        rectangle.Print();
        
    }

}

class Point {
        private double x;
        private double y;
        
        public double getX() {
            return x;
        }
        public void setX(double x) {
            this.x = x;
        }
        public double getY() {
            return y;
        }
        public void setY(double y) {
            this.y = y;
        }
        public void Print() {
    System.out.println("x-coordinate is "+this.x+" and y-coordinate is "+this.y);
        }
    }
    

class Shape {
        private String color ;
        private Point location=new Point() ;
            public Shape(String color) {
            this.color = color;
        }
        public double getX() {
            return location.getX();
        }
        public double getY() {
            return location.getY();
        }
        public void setLocation(double x, double y) {
            location.setX(x);
            location.setY(y);
        }
        public String getColor() {
            return color;
        }
        public void setColor(String color) {
            this.color = color;
        }
        public void Print() {
            System.out.println(color);
        }
}
    

 

class Circle extends Shape {
        public double radius;
        
        public Circle(double radius) {
            super("White");
            this.radius = radius;
        }
        public double getArea() {
            return Math.PI*radius*radius;
        }
        public void setCenter(double x, double y) {
            super.setLocation(x, y);
        }
        public Point getCenter() {
            Point my_point = new Point();
            my_point.setX(super.getX());
            my_point.setY(super.getY());
            return my_point;
        }
        public void setColor(String color) {
            super.setColor(color);
        }
        public String getColor() {
            return super.getColor();
        }
        public void Print() {
            super.Print();
            System.out.println("the area is " + getArea());
        }
}
    

 

class Rectangle extends Shape {
        public double width;
        public double height;
        public Rectangle(double width, double height) {
            super("White");
            this.width = width;
            this.height = height;
        }
        public Point getCornerLeftLow() {
            Point my_point = new Point();
            my_point.setX(super.getX());
            my_point.setY(super.getY());
            return my_point;
        }
        public Point getCornerLeftUpp() {
            Point my_point = new Point();
            my_point.setX(super.getX());
            my_point.setY(super.getY() + this.height);
            return my_point;
        }
        public Point getCornerRightLow() {
            Point my_point = new Point();
            my_point.setX(super.getX() + this.width);
            my_point.setY(super.getY());
            return my_point;
        }
        public Point getCornerRightUpp() {
            Point my_point = new Point();
            my_point.setX(super.getX() + this.width);
            my_point.setY(super.getY() + this.height);
            return my_point;
        }
        public void setLocation(double x, double y) {
            super.setLocation(x, y);
        }
        public void setColor(String color) {
            super.setColor(color);
        }
        public String getColor() {
            return super.getColor();
        }
        public double getArea() {
            return this.width*this.height;
        }
        public void Print() {
            super.Print();
            System.out.println("the width and height are "+ this.width+ ", "+ this.height);
        }
}

 

