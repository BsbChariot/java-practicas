import java.util.Scanner;
public class Parameters{
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("INput de length: "); 
        double  l = scan.nextDouble();
        System.out.print("INput de width: ");
        double  w = scan.nextDouble();       
        calculateArea(l,w);
    }
    public static void calculateArea(double length, double width){
        System.out.print("Area: "+length*width);
    }
}
