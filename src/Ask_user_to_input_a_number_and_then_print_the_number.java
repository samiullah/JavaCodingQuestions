import java.util.Scanner;

public class Ask_user_to_input_a_number_and_then_print_the_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("Enter a number");
		
		Scanner s = new Scanner(System.in);
		
		int n =s.nextInt();
		
		System.out.println("entered number is "+ n);

	}

}
