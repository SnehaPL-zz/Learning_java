
class Human{
	String name;
	int age;
	
	void speak(){
		System.out.println("My name is "+ name +" and my age is "+ age +".");
	}
}	
	

public class MethodsOfClasses {

	public static void main(String[] args) {

		Human Person1 = new Human();
		Person1.name = "Sneha";
		Person1.age = 28;
		Person1.speak();
		
		Human Person2 = new Human();
		Person2.name = "Asmi";
		Person2.age = 2;
		Person2.speak();
	}

}
