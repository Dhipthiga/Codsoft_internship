package numberguess;
import java.util.*;
public class Guess_number {
	public static void main(String[] args) {
		System.out.println("      WELCOME TO THE GUESSING GAME      ");
		System.out.println("Remember: \n  1.You have maximum of 3 attempts only. \n  2.Guess any numbers between 0 to 100. \nBest of luck !    ");
		System.out.print("Do you need clue ? ");
		Scanner sc = new Scanner(System.in);
		String clue = sc.nextLine();
		
		
		Random rand = new Random();
		int randomNum = rand.nextInt(100)+1;
		int count =1;
		while (true) {
			System.out.println("Enter the guess (1 to 100)");
			int playerGuess = sc.nextInt();
			count++;
			if (count <=3) {
				if(clue.equalsIgnoreCase("yes")) {
					if(playerGuess== randomNum) {
						System.out.println("Congratulations!! You got it CORRECT !!");
						System.out.println("Hurrayy!! It took you  "+ count+ "tries");
						break;
					}
					else if (playerGuess > randomNum){
						System.out.println("Guess number is lower than entered number ! \n");
					}
					else if (playerGuess < randomNum){
						System.out.println("Guess number is higher than entered number ! \n");
					}
				}
				else{
					if(playerGuess== randomNum) {
						System.out.println("Congratulations!! You got it CORRECT !!");
						break;
					}
					else {
						System.out.println("Oops!! Try again \n");
					}
				}
			}
			else {
				System.out.println("OH NOO !! You are out of attempts :( ");
				System.out.println("Nice Try !! \nAnswer is :"+ randomNum);
				break;
			}
		}
		sc.close();
	}
}
	