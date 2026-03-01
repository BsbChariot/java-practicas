public class Scope {
    
    // Global variables to store the rectangle's length and width (accessible within the whole class)
     static double length = 2;
     static double width = 4;

    public static void main(String[] args) {

       

        calculateArea();
        calculatePerimeter();

    }

    public static void calculateArea() {
        double area = length * width;
        System.out.println("Area of the rectangle: " + area);
    }

    public static void calculatePerimeter() {
        double perimeter = 2 * (length + width);
        System.out.println("Perimeter of the rectangle: " + perimeter);
    }
}
