import java.util.Random;
import java.util.Scanner;
public class DiceJack {
	static Random r= new Random();
	public static void main (String[] args){
		Scanner scan = new Scanner(System.in);
		int n1 = rollingDice();
		int n2 = rollingDice();
		int n3 = rollingDice();
		System.out.print("Enter 3 numbers: \n");
		System.out.print("Number1: ");
		int number1 = scan.nextInt();
		System.out.print("Number2: ");
		int number2 = scan.nextInt();
		System.out.print("Number3: ");
		int number3 = scan.nextInt();
		boolean ver = verify(n1,n2,n3,number1,number2,number3);
		System.out.print("The numbers that rolled are: "+n1+", "+n2+", "+n3+"\n");
		System.out.println(ver);
		scan.close();
	}
	public static int rollingDice(){
		int r1 = r.nextInt(5) + 1;
		return r1;
	}
	public static boolean verify(int n1, int n2,int n3, int number1,int number2, int number3){
		int sum1= n1+n2+n3;
		int sum2= number1+number2+number3;
		int diff = sum1 - sum2;
		boolean st;
		if (sum2>sum1 && diff<5){
			st = true;
		}else{
			st= false;
		}
		return st;
	}
}
