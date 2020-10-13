import java.util.Scanner;

public class Lab4 {

	public static void main(String[] args) {
		System.out.println("Learn your squares and cubes!");
		squareAndCube();
		Scanner JavaInput = new Scanner(System.in);
		System.out.println("\nDo you want to continue? y/n");
		boolean response = JavaInput.next().equals("y");
		while(response){
			squareAndCube();
			System.out.println("\nDo you want to continue? y/n");
		    response = JavaInput.next().equals("y");
		    
		        }
		    }

	public static void squareAndCube() {
		Scanner JavaInput = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		int number = JavaInput.nextInt();
		System.out.println("Number     Squared     Cubed");
		System.out.println("======     =======     ======");
		int squared = number * number;
		int cubed = number * number * number;
		System.out.format("%-10s %-10d %-10d", number, squared, cubed);
	}
}
