
public class Person implements Info{

	private String name = "Sneha";
	
	public void greet(){
		System.out.println("Hello");
	}
	
	public void showInfo(){
		System.out.println("My name is "+ name);
	}
}
