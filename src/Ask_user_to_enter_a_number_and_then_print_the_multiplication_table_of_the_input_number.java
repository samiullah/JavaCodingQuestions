import java.util.Scanner;

public class Ask_user_to_enter_a_number_and_then_print_the_multiplication_table_of_the_input_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

		Scanner s = new Scanner(System.in);
		System.out.print("Enter number for which u want to print table");
		int number =s.nextInt();
		
		for(int i =1;i<=10;i++) {
			
			int product = number*i;
			System.out.println(number+"*"+i+" = "+product);
			
		}
		
		
	}

}
