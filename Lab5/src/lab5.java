import java.util.*;
public class lab5 {
	public static void main(String[] args) {
		System.out.println("Welcome to the factorial calculator!");
		while (true) {
			Scanner JavaInput = new Scanner(System.in);
			factorial();
			System.out.println("Do you want to continue? (y/n)");
			String goAgain = JavaInput.nextLine();
			if (goAgain.equals("n")) {
				break;
			}
		}
		
}
	public static void factorial() {
		Scanner JavaInput = new Scanner (System.in);
		System.out.println("Please enter a number between 1 and 10: ");
		int number = JavaInput.nextInt();
		if (number < 1 || number > 10) {
			System.out.println("Invalid number");
			System.exit(0);
		}
		long factorial = 1;
        for(int i = 1; i <= number; ++i)
        {
            factorial *= i;
        }
        System.out.println(factorial);
		}
	}
