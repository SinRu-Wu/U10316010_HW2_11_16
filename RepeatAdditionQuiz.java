import java.util.Scanner;
import java.util.ArrayList;

public class RepeatAdditionQuiz {
	public static void main(String[] args) {
		
		int number1 = (int)(Math.random() * 10);
		int number2 = (int)(Math.random() * 10);
		
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> storeAnswers = new ArrayList<>();
		
		System.out.print("What is " + number1 + " + " + number2 + "? ");
		int answer = input.nextInt();
			
		while (number1 + number2 != answer) {
			if(storeAnswers.contains(answer)){
				System.out.println("You already answer " + answer);
			}
			System.out.print("Wrong answer. Try again. What is " + number1 + " + " + number2 + "? ");
			storeAnswers.add(answer);
			answer = input.nextInt();
		}
		System.out.println("You got it!");
	}
}