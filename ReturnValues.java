import java.util.Scanner;
public class ReturnValues{
    public static void main(String[] args ){
        Scanner scan = new Scanner(System.in);
        System.out.print("Input de length: "); 
        double  l = scan.nextDouble();
        System.out.print("Input de width: ");
        double  w = scan.nextDouble();       
        double area = calculateArea(l,w);
        System.out.print(area+"\n");
        System.out.print("Enter de languaje: ");
        scan.nextLine();
        String  languaje = scan.nextLine();; 
        String Explanation=explainArea(languaje);
        System.out.println(Explanation+"\n");
    }
    public static double calculateArea(double length, double width){
        if(length < 0 || width<0 ){
        	System.out.print("Invalid dimentions.\n");
        	System.exit(0);
        }
        double area = length * width;
        return area;
    }
    public static String explainArea(String languaje){
    	switch (languaje){
    		case "english":return "Area equals length * width";
    		case "french":return "La surface est egale a la longueur * la largeur";
    		case "spanish":return "area es igual a largo * ancho";
    		default :return "not supported";
    	}
    }
    public static void printArea(double length, double width, double area){
    	System.out.print("A rectangle with a lenght of "+lenght+" and a width of "+width+" has an area of "+area+);
    }    
}
//English "Area equals length * width"

//French "La surface est egale a la longueur * la largeur"

//Spanish "area es igual a largo * ancho"
