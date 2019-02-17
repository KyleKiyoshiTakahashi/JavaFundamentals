import java.util.Scanner;

public class FizzBuzzTest {
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Enter a number: ");
		int num = keyboard.nextInt();

		FizzBuzz test = new FizzBuzz();

		String answer = test.printFizzBuzz(num);

		keyboard.close();
	}
}