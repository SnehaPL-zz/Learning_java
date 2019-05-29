
public class Machine implements Info {
	
	private int id = 1;
	
	public void start(){
		System.out.println("Machine Started");
	}
	
	public void showInfo(){
		System.out.println("Machine id : "+ id);
	}
}
