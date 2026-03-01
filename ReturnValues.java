import java.util.Scanner;
public class ReturnValues{
    public static void main(String[] args ){
        Scanner scan = new Scanner(System.in);
        System.out.print("INput de length: "); 
        double  l = scan.nextDouble();
        System.out.print("INput de width: ");
        double  w = scan.nextDouble();       
        double area = calculateArea(l,w);
        System.out.print(area);
    }
    public static double calculateArea(double length, double width){
        double area = length * width;
        return area;
    }
}
