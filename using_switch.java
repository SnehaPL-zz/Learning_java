import java.util.Scanner;

public class using_switch {

	public static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);

		System.out.println("Please enter a command: ");
		String text = input.nextLine();

		switch (text) {
		case "start":
			System.out.println("Machine Started");
			break;

		case "stop":
			System.out.println("Machine Stop.");
			break;

		default:
			System.out.println("Command not recognized");
			break;
		}
	}

}
