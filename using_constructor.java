
class Machine{
	private String name;
	private int age;
	
	public Machine(){
		this("sneha", 28);
		System.out.println("Constructor is running");
	}
	
	public Machine(String name){
		this.name = name;
		System.out.println(name);
	}
	
	public Machine(String name, int age){
		this.name = name;
		this.age = age;
		System.out.println("My name is "+ name +" and age is "+age);
	}
}

public class using_constructor {

	public static void main(String[] args) {
		Machine machine1 = new Machine();
		new Machine("Sneha");
		new Machine("Asmi", 2);
	}

}
