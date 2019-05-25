import java.util.Scanner;


public class using_do_while {

	public static Scanner ip;
	
	public static void main(String[] args) {
	 ip = new Scanner(System.in);
		int value;
		
		do
		{
			System.out.println("Enter a number: ");
			value = ip.nextInt();
		}
		while(value != 5);
			
		System.out.println("Got 5!");
	}

}
