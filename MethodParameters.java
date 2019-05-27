
class Robot{
	
	String name;
	
	public void speak(String text){
		System.out.println(text);
	}
	
	public void jump(int jumps){
		System.out.println("No of Jumpes are "+ jumps);
	}
	
	public void move(String direction, double distance){
		System.out.println("Moving "+ distance +" mtrs in the "+ direction +" direction.");
	}
}

public class MethodParameters {

	public static void main(String[] args) {

		Robot sam = new Robot();
		
		sam.name = "Sneha";
		
		sam.speak("My name is sam");
		sam.jump(7);
		sam.move("East", 12.5);
		
		sam.speak(sam.name);
		
		String greeting = "Hello world";
		sam.speak(greeting);
		
		int value = 14;
		sam.jump(value);
	}

}
