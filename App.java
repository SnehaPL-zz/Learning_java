
public class App {

	public static void main(String[] args) {
		Machine mach1 = new Machine();
		mach1.start();
		
		Person person1 = new Person();
		person1.greet();
		
		Info info1 = new Machine();
		info1.showInfo();
		
		Info info2 = (Info) person1;
		info2.showInfo();
	}

}
