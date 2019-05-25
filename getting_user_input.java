import java.util.Scanner;

public class getting_user_input {

	public static Scanner input;
	public static void main(String[] args) {

		input = new Scanner(System.in);
		
		System.out.println("Eneter your name: ");
		String name = input.nextLine();
		
		System.out.println("Enter your age: ");
		int age = input.nextInt();
		
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
	}

}
