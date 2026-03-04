import java.util.Scanner;
public class BreakAndContinueExamples {

    public static void main(String[] args) {
        // Example 1: Print numbers from 1 to 10, but stop when the number 5 is reached (using break)
        // TODO: Write a loop that prints numbers from 1 to 10, but stops when the number 5 is reached using the 'break' statement

        // Example 2: Print numbers from 1 to 10, but skip the number 5 (using continue)
        // TODO: Write a loop that prints numbers from 1 to 10, but skips the number 5 using the 'continue' statement

        // Example 3: Find the smallest number greater than 20 that is divisible by 3 (using break)
        // TODO: Write a loop that finds the smallest number greater than 20 that is divisible by 3 using the 'break' statement

        // Example 4: Print all even numbers from 1 to 20, and skip odd numbers (using continue)
        // TODO: Write a loop that prints all even numbers from 1 to 20, skipping odd numbers using the 'continue' statement
		int diceRoll=0;
		int score=0;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Let's play Rolling Java. Type anything to start.");
		String an = scanner.nextLine();
		System.out.print("Great, here are the rules:\n");
		System.out.println("If you roll a 6, the game stops.");
		System.out.println("If you roll a 4, nothing happens.");
		System.out.println("Otherwise, you get 1 point.\n ");
		while(true){
			diceRoll = rollingDice();
			System.out.println("You rolled a: "+diceRoll);
			if(diceRoll == 6 ){
				System.out.println("End of game ");
				break;
			}else if(diceRoll == 4 ){
				System.out.println("Zero points. Keep rolling. ");
			}else{
				score++;
			}
		}
		if(score>=3){
			System.out.println("Wow, that's lucky. You win! "+score);
		}else{
			System.out.println("You lose! "+score);
		}
    }
    public static int rollingDice(){
		int r1 = (int)(Math.random()*6) + 1 ;
		return r1;
	}
}
