
class Frogs{
	private int id;
	private String name;
	
	public Frogs(int id, String name){
		this.id = id;
		this.name = name;
	}
	
	public String toString(){
		StringBuilder sd = new StringBuilder();
		sd.append(id).append(" : ").append(name);
		return sd.toString();
	}
}

public class toString_Method {

	public static void main(String[] args) {

		Frogs frog1 = new Frogs(1, "Sneha");
		Frogs frog2 = new Frogs(2, "Asmi");
		
		System.out.println(frog1);
		System.out.println(frog2);
	}

}
